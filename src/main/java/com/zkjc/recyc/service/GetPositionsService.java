package com.zkjc.recyc.service;


import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetPositionsService {
    private String URL="http://61.190.61.78:3600/api/GpsData/GetGpsData?sn=&kind=";
    public String getPositions() {
        RestTemplate restTemplate=new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        //定义请求参数类型，这里用json所以是MediaType.APPLICATION_JSON
        headers.setContentType(MediaType.APPLICATION_JSON);
        //RestTemplate带参传的时候要用HttpEntity<?>对象传递

        ResponseEntity<String> entity = restTemplate.getForEntity(URL, String.class);
        //获取3方接口返回的数据通过entity.getBody();它返回的是一个字符串；
        String body = entity.getBody();
        //然后把str转换成JSON再通过getJSONObject()方法获取到里面的result对象，因为我想要的数据都在result里面
        //下面的strToJson只是一个str转JSON的一个共用方法；
        return  body;
    }
}
