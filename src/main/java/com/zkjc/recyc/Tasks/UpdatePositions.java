package com.zkjc.recyc.Tasks;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zkjc.recyc.entity.PositionEntity;
import com.zkjc.recyc.enums.EmployeeKindEnum;
import com.zkjc.recyc.enums.EmployeeStatusEnum;
import com.zkjc.recyc.mapper.PositionsMapper;
import com.zkjc.recyc.service.GetPositionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UpdatePositions {
    @Autowired
    private GetPositionsService getPositionsService;
    @Autowired
    private PositionsMapper positionsMapper;
//    @Scheduled(cron = "0 0/1 * * * ?")
    @Scheduled(cron ="0/10 * * * * ?")
    public void doTask(){
        System.out.println("执行了MyStaticTask,时间为:"+new Date(System.currentTimeMillis()));
        List<PositionEntity> list=parseJson(getPositionsService.getPositions());
        for(int i=0;i<list.size();i++)
        {
            PositionEntity positionEntity=list.get(i);
            if(positionsMapper.getOne(positionEntity.getEmployeeId())!=null)
            {
                positionsMapper.update(positionEntity);
            }else{
                positionsMapper.insert(positionEntity);
            }
        }
    }
    private List<PositionEntity> parseJson(String json) {
        JSONObject jsonObject = JSONObject.parseObject(json);
//                    System.out.println(jsonObject.get("message"));
        JSONArray jsonArray = JSONArray.parseArray(jsonObject.getString("message"));//先将对象转成json数组
        List<PositionEntity> positions = new ArrayList<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject job = jsonArray.getJSONObject(i);
            String employeeId = job.getString("SN");
            String updateTime = job.getString("GTime").replace('T', ' ');
//                        String[] strings=updateTime.split("T");
//                        updateTime=strings[0]+"%20"+strings[1];
            double longitude = job.getDouble("Longitude");
            double latitude = job.getDouble("Latitude");
            EmployeeStatusEnum workStatus;
            if(job.getString("ACC")==null){
                workStatus = EmployeeStatusEnum.off;
            }else{
                workStatus=EmployeeStatusEnum.on;
            }
            EmployeeKindEnum kind;
            if (job.getString("Kind").equals("1")) {
                kind = EmployeeKindEnum.car;
            } else if (job.getString("Kind").equals("2")) {
                kind = EmployeeKindEnum.person;
            } else {
                kind = EmployeeKindEnum.bin;
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = new Date();
            try {
                d = sdf.parse(updateTime);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            positions.add(new PositionEntity(employeeId, d, longitude, latitude, workStatus, kind));
        }
        return positions;
    }
}
