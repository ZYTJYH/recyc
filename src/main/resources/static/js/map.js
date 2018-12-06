// var url="http://47.105.166.205:8080/information"
var url="http://localhost:8080/information"
//



var objPositionArray=new Array();



//Cars表
var employeeIdCarsArray=new Array();
var carNameCarsArray=new Array();
var phoneCarsArray=new Array();
var carNumberCarsArray=new Array();
var carTypeCarsArray=new Array();
var kindCarsArray=new Array();
var genderCarsArray=new Array();
var ageCarsArray=new Array();
var areaCarsArray=new Array();
var numOfCarsTable;


// Persons表
var employeeIdPersonsArray=new Array();
var personNamePersonArray=new Array();
var phonePersonArray=new Array();
// var carNumberCarsArray=new Array();
// var carTypeCarsArray=new Array();
var kindPersonArray=new Array();
// var genderCarsArray=new Array();
// var ageCarsArray=new Array();
var jobPersonsArray=new Array();
var numOfPersonTable;

//Bins表
var employeeIdBinsArray=new Array();
var binNameBinsArray=new Array();
var currentVBinsArray=new Array();
var areaBinsArray=new Array();
var maxVBinsArray=new Array();
var temperatureBinsArray=new Array();
var numOfBinsTable;

var carIcon = new BMap.Icon("/images/car.png", new BMap.Size(25, 25)) ;
var binIcon = new BMap.Icon("/images/bin.png", new BMap.Size(25, 25)) ;
var personIcon = new BMap.Icon("/images/person.png", new BMap.Size(25, 25)) ;

  // 创建Map实例
var map = new BMap.Map("allmap");    // 创建Map实例
var gc = new BMap.Geocoder();

// updateAll();
// setInterval("updateAll()",5000);

function initMap(){
    // getPositions();
    // getCars();
    // getBins();
    // 百度地图API功能
    map.centerAndZoom(new BMap.Point(114.987,32.754), 16);  // 初始化地图,设置中心点坐标和地图级别
    // map.centerAndZoom(new BMap.Point(117.193267, 31.77408), 16);
    //添加控件和比例尺
    var top_left_control = new BMap.ScaleControl({anchor: BMAP_ANCHOR_TOP_LEFT});
    var top_left_navigation = new BMap.NavigationControl();
    map.addControl(top_left_control);
    map.addControl(top_left_navigation);


    var overViewOpen = new BMap.OverviewMapControl({isOpen:true, anchor: BMAP_ANCHOR_BOTTOM_RIGHT});
    map.addControl(overViewOpen);

    //添加地图类型控件
    map.addControl(new BMap.MapTypeControl({
        mapTypes:[
            BMAP_NORMAL_MAP,
            BMAP_HYBRID_MAP
        ]}));
    map.setCurrentCity("新蔡县");          // 设置地图显示的城市 此项是必须设置的
    map.enableScrollWheelZoom(false);     //开启鼠标滚轮缩放
}

// function getBoss() {
//     $.ajaxSettings.async = false;
//     $.getJSON(url + "/Bosses/" + bossIdArray[i], {}, function (data) {
//             temp = "<p><font size='2'>负责人：" + data['data']['name'] + "</font></p>" + "<p><font size='2'>手机号：" + data['data']['phone'] + "</font></p>";
//         }
//     );
//     $.ajaxSettings.async = true;
// }

function getBins(){
    $.ajaxSettings.async = false;
    $.getJSON( url + "/Bins",{},function (data) {
        for (var i = 0; i < data['data'].length; i++) {
            employeeIdBinsArray[i]=data['data'][i]['employeeId']
            binNameBinsArray[i]=data['data'][i]['binName'];
            currentVBinsArray[i]=data['data'][i]['currentV'];
            maxVBinsArray[i]=data['data'][i]['maxV'];
            temperatureBinsArray[i]=data['data'][i]['temperature'];
            areaBinsArray[i]=data['data'][i]['area']
        }
        numOfBinsTable=data['data'].length;
    });
    $.ajaxSettings.async = true;
}

function getPersons(){
    $.ajaxSettings.async = false;
    $.getJSON( url + "/Persons",{},function (data) {
        for (var i = 0; i < data['data'].length; i++) {
            employeeIdPersonsArray[i]=data['data'][i]['employeeId']
            personNamePersonArray[i] = data['data'][i]['personName'];
            phonePersonArray[i] = data['data'][i]['phone'];
            kindPersonArray[i]=data['data'][i]['kind'];
            jobPersonsArray[i]=data['data'][i]['job'];
        }
        numOfPersonTable=data['data'].length;
    });
    $.ajaxSettings.async = true;
}

function getCars(){
    $.ajaxSettings.async = false;
    $.getJSON( url + "/Cars",{},function (data) {
        for (var i = 0; i < data['data'].length; i++) {
            employeeIdCarsArray[i] = data['data'][i]['employeeId'];
            carNameCarsArray[i] = data['data'][i]['carName'];
            phoneCarsArray[i] = data['data'][i]['phone'];
            carNumberCarsArray[i] = data['data'][i]['carNumber'];
            carTypeCarsArray[i] = data['data'][i]['carType'];
            kindCarsArray[i] = data['data'][i]['kind'];
            genderCarsArray[i] = data['data'][i]['gender'];
            ageCarsArray[i] = data['data'][i]['age'];
            areaCarsArray[i] = data['data'][i]['area'];
        }
        numOfCarsTable=data['data'].length;
    });
    $.ajaxSettings.async = true;
}

function updateCarsTable() {
    getCars();
    var tableBody=document.getElementById("carsTableBody");
    $("#carsTableBody").children().remove();
    for(var i=0;i<numOfCarsTable;i++){
        var row = document.createElement('tr');
        // 创建td单元格
        var carName = document.createElement('td');
        var phone = document.createElement('td');
        var carNumber = document.createElement('td');
        carName.innerHTML=carNameCarsArray[i];
        phone.innerHTML=phoneCarsArray[i];
        carNumber.innerHTML=carNumberCarsArray[i];
        row.index=i;
        row.addEventListener("click",function () {
            var location = getPosition(employeeIdCarsArray[this.index]);
            if (location == "") {
                alert("本条记录地图上没有")
            } else {
                var marker = new BMap.Marker(new BMap.Point(location[0], location[1]));  // 创建标注
                map.addOverlay(marker);
            }
        })
        row.appendChild(carName);
        row.appendChild(phone);
        row.appendChild(carNumber);
        tableBody.appendChild(row);
    }
}

function updatePersonsTable() {
    getPersons();
    var tableBody=document.getElementById("personsTableBody");
    $("#personsTableBody").children().remove();
    for(var i=0;i<numOfPersonTable;i++){
        var row = document.createElement('tr');
        // 创建td单元格
        var personName = document.createElement('td');
        var phone = document.createElement('td');
        var job =document.createElement('td');
        personName.innerHTML=personNamePersonArray[i];
        phone.innerHTML=phonePersonArray[i];
        job.innerHTML=jobPersonsArray[i];
        row.index=i;
        row.addEventListener("click",function () {
            var location = getPosition(employeeIdPersonsArray[this.index]);
            if (location == "") {
                alert("本条记录地图上没有")
            } else {
                var marker = new BMap.Marker(new BMap.Point(location[0], location[1]));  // 创建标注
                map.addOverlay(marker);
            }
        })
        row.appendChild(personName);
        row.appendChild(phone);
        row.appendChild(job);
        tableBody.appendChild(row);
    }
}

function updateBinsTable() {
    getBins();
    var tableBody=document.getElementById("binsTableBody");

    $("#binsTableBody").children().remove();

    for(var i=0;i<numOfBinsTable;i++){

        var row = document.createElement('tr');
        // 创建td单元格
        var area = document.createElement('td');
        var status = document.createElement('td');
        var temperature = document.createElement('td');
        area.innerHTML=areaBinsArray[i];
        if(maxVBinsArray[i]-currentVBinsArray[i]<10)
        {
            status.innerHTML="满";
        }else{
            status.innerHTML="未满";
        }
        temperature.innerHTML=temperatureBinsArray[i];
        row.index=i;
        row.addEventListener("click",function () {
            var location = getPosition(employeeIdBinsArray[this.index]);
            if (location == "") {
                alert("本条记录地图上没有")
            } else {
                var marker = new BMap.Marker(new BMap.Point(location[0], location[1]));  // 创建标注
                map.addOverlay(marker);
            }
        })
        row.appendChild(area);
        row.appendChild(status);
        row.appendChild(temperature)
        tableBody.appendChild(row);
    }
}

var opts = {
    width : 300,     // 信息窗口宽度
    height: 250,     // 信息窗口高度
    title : "详细信息" , // 信息窗口标题
    enableMessage:true//设置允许信息窗发送短息
};

var buttonFlag=0;//0:全部，1:车；2:人；3：桶
ObjMarker={
    employeeId:"",
    marker:"",
}
var objMarkers=new Array();
var Timer1s;
var sumCount=0;
var sixityCount=0;
var icon;
function updateMap() {
    window.clearTimeout(Timer1s);
    map.clearOverlays();
    getPositions();
    var label;
    switch (buttonFlag) {
        case 0:
            for (var i = 0; i < objPositionArray.length; i++) {
                if (objPositionArray[i].kind == "car") {
                    icon = carIcon;
                } else if (objPositionArray[i].kind = "bin") {
                    icon = binIcon;
                } else {
                    icon = personIcon;
                }
                if(sumCount==0) {
                    var marker = new BMap.Marker(new BMap.Point(objPositionArray[i].longitudeArray[0],objPositionArray[i].latitudeArray[0]), {icon: icon});  // 创建标注
                    map.addOverlay(marker);
                }
            }
            if(sumCount!=0){
                sixityCount=0;
                updateInOneS()
                Timer1s=setInterval(updateInOneS,1000)
            }
            break;
        case 1:
            break;
        case 2:
            break;
        case 3:
            break;
    }
    sumCount++;
}

function updateInOneS(){
    icon=carIcon;
    map.clearOverlays();
    for(var i=0;i<objPositionArray.length;i++) {
        var tempLo=objPositionArray[i].longitudeArray[sumCount-2]+(objPositionArray[i].longitudeArray[sumCount-1] - objPositionArray[i].longitudeArray[sumCount -2])/60.0*sixityCount;
        var tempLa=objPositionArray[i].latitudeArray[sumCount-2]+(objPositionArray[i].latitudeArray[sumCount-1]-objPositionArray[i].latitudeArray[sumCount-2])/60.0*sixityCount;
        var marker = new BMap.Marker(new BMap.Point(tempLo,tempLa), {icon: icon});  // 创建标注
        map.addOverlay(marker);
    }
    sixityCount++;
}

//
//     for(var i=0;i<objPositionArray.size;i++){
//         var icon;
//
//         var marker = new BMap.Marker(new BMap.Point(longitudeArray[i],latitudeArray[i]),{icon:icon});  // 创建标注
//         var content;
//         if(kindArray[i]=="car")
//         {
//             var result=getCar(employeeIdArray[i])
//             var labelstr="0-25"
//             content=result.windowInfo
//             if(result.label!=undefined)
//             labelstr=result.label
//             var label = new BMap.Label(labelstr, {
//                 offset: new BMap.Size(-15, 20)
//             }); //创建marker点的标记,这里注意下,因为百度地图可以对label样式做编辑,
//             label.setStyle({
//                 width: "auto",
//                 background: '#ffffff',
//                 border: '1px solid "#ff8355"',
//                 borderRadius: "5px",
//                 textAlign: "center",
//                 height: "auto",
//                 fontSize: "5px"
//             }); //对label 样式隐藏
//             marker.setLabel(label); //把label设置到maker上
//         }else if(kindArray[i]=="bin")
//         {
//             var result=getBin(employeeIdArray[i])
//             content=result.windowInfo
//             var labelstr="数据未录入"
//             if(result.label!=undefined)
//             labelstr=result.label
//             var label = new BMap.Label(labelstr, {
//                 offset: new BMap.Size(-15, 20)
//             }); //创建marker点的标记,这里注意下,因为百度地图可以对label样式做编辑,
//             label.setStyle({
//                 width: "auto",
//                 background: '#ffffff',
//                 border: '1px solid "#ff8355"',
//                 borderRadius: "5px",
//                 textAlign: "center",
//                 height: "auto",
//                 fontSize:"16px"
//         }); //对label 样式隐藏
//             marker.setLabel(label); //把label设置到maker上
//         }else{
//             var result=getPerson(employeeIdArray[i])
//             content=result.windowInfo
//             var labelstr="数据未录入"
//             if(result.label!=undefined)
//             labelstr=result.label
//             var label = new BMap.Label(labelstr, {
//                 offset: new BMap.Size(-15, 20)
//             }); //创建marker点的标记,这里注意下,因为百度地图可以对label样式做编辑,
//             label.setStyle({
//                 width: "auto",
//                 background: '#ffffff',
//                 border: '1px solid "#ff8355"',
//                 borderRadius: "5px",
//                 textAlign: "center",
//                 height: "auto",
//                 fontSize: "5px"
//             }); //对label 样式隐藏
//             marker.setLabel(label); //把label设置到maker上
//         }         // 将标注添加到地图中
//         addClickHandler(content,marker);
//     }
//
// }
function addClickHandler(content,marker){
    marker.addEventListener("click",function(e){
        openInfo(content,e)}
    );
}
function openInfo(content,e){
    var p = e.target;
    var point = new BMap.Point(p.getPosition().lng, p.getPosition().lat);
    var infoWindow = new BMap.InfoWindow(content,opts);  // 创建信息窗口对象
    map.openInfoWindow(infoWindow,point); //开启信息窗口
}

function getPositions() {
    $.ajaxSettings.async = false;
    $.getJSON( url + "/Positions",{},function (data) {
            if(objPositionArray.length==0) {
                for (var i = 0; i < data['data'].length; i++) {
                    var tempObjPosition ={
                        employeeId:"",
                        updateTimeArray:[],
                        longitudeArray:[],
                        latitudeArray:[],
                        workStatusArray:[],
                        kind:""
                    }
                    tempObjPosition.employeeId=data['data'][i]['employeeId'];

                    tempObjPosition.updateTimeArray=new Array();
                    tempObjPosition.longitudeArray=new Array();
                    tempObjPosition.latitudeArray=new Array();
                    tempObjPosition.workStatusTimeArray=new Array();

                    tempObjPosition.updateTimeArray[0]=(data['data'][i]['updateTime']);
                    tempObjPosition.longitudeArray[0]=(data['data'][i]['longitude']);
                    tempObjPosition.latitudeArray[0]=(data['data'][i]['latitude']);
                    tempObjPosition.workStatusTimeArray[0]=(data['data'][i]['workStatus']);
                    tempObjPosition.kind=data['data'][i]['kind'];
                    objPositionArray.push(tempObjPosition)
                }
            }else{
                for (var i = 0; i < data['data'].length; i++) {
                    for(var j=0;j<objPositionArray.length;j++)
                    {
                        if(objPositionArray[j].employeeId==data['data'][i]['employeeId']) {
                            objPositionArray[j].updateTimeArray.push(data['data'][i]['updateTime']);
                            objPositionArray[j].longitudeArray.push(data['data'][i]['longitude']);
                            objPositionArray[j].latitudeArray.push(data['data'][i]['latitude']);
                            objPositionArray[j].workStatusTimeArray.push(data['data'][i]['workStatus']);
                            break;
                        }
                    }
                }
            }
    });
    $.ajaxSettings.async = true;
}

function getCar(employeeId) {
    $.ajaxSettings.async = false;
    var result={};
    $.getJSON( url + "/Cars/"+employeeId,{},function (data) {
        var jsonStr=JSON.stringify(data['data'])
        if(jsonStr==null)
        {
            return result="数据未录入";
        }
        var carObject = JSON.parse(jsonStr)
        result.windowInfo=carObject.carName+"<br/>"+data['data']['phone']+"<br/>"+data['data']['carNumber']+"<br/>"+data['data']['carType']+"<br/>"+data['data']['kind']+"<br/>"+data['data']['gender']+"<br/>"+data['data']['age']+"<br/>"+data['data']['area']+"<br/>"+ '<input type="button" value="回放"  onclick="showTrace('+data['data']['employeeId']+')"/> ' ;
        result.label=data['data']['carNumber'];
    });
    $.ajaxSettings.async = true;
    return result;
}


function getPerson(employeeId) {
    $.ajaxSettings.async = false;
    var result={};
    $.getJSON( url + "/Persons/"+employeeId,{},function (data) {
        var jsonStr=JSON.stringify(data['data'])
        if(jsonStr==null) {
            return result = "数据未录入";
        }
        result.windowInfo= data['data']['personName']+"<br/>"+data['data']['phone']+"<br/>"+data['data']['kind']+"<br/>"+data['data']['job']+"<br/>"+ '<input type="button" value="回放"  onclick="showTrace('+data['data']['employeeId']+')"/> ' ;
        ;
        result.label=data['data']['personName'];
    });
    $.ajaxSettings.async = true;
    return result;
}

function getBin(employeeId) {
    $.ajaxSettings.async = false;
    var result={};
    $.getJSON( url + "/Bins/"+employeeId,{},function (data) {
        var jsonStr=JSON.stringify(data['data'])
        if(jsonStr==null) {
            return result = "数据未录入";
        }
        result.windowInfo=data['data']['binName']+"<br/>"+data['data']['currentV']+"<br/>"+data['data']['maxV']+"<br/>"+data['data']['temperature']+"<br/>"+data['data']['area']
        result.label=data['data']['binName'];
    });
    $.ajaxSettings.async = true;
    return result;
}


function updateTables() {
    updateCarsTable();
    updatePersonsTable();
    updateBinsTable()
}

function showAll() {
    map.clearOverlays();
    buttonFlag=0;
    updateMap();
}

function showCar() {
    map.clearOverlays();
    buttonFlag=1;
    updateMap();
}

function showPerson() {
    map.clearOverlays();
    buttonFlag=2;
    updateMap();
}

function showBin() {
    map.clearOverlays();
    buttonFlag=3;
    updateMap();
}

function getPosition(employeeId){
    $.ajaxSettings.async = false;
    var location=new Array();
    $.getJSON( url + "/Positions/"+employeeId,{},function (data) {
        var jsonStr=JSON.stringify(data['data'])
        if(jsonStr==null) {
            return "";
        }
        location[0]= data['data']['longitude'];
        location[1]= data['data']['latitude'];
    });
    $.ajaxSettings.async = true;
    return location;
}

var icon;
var storeLongitudeArray=new Array();
var storeLatitudeArray=new Array();
var cnt=0;
function showTrace(employeeId) {
    $.ajaxSettings.async = false;
    var params = {};
    var d=new Date()
    params['startDay'] =  (format(new Date(d.getFullYear(),d.getMonth(),d.getDay()+2)))
    params['endDay'] = (format(new Date(d.getFullYear(),d.getMonth(),d.getDay()+2,23,59,59)))
    $.getJSON(url + "/Stores/"+employeeId, params, function (data) {
        var jsonStr=JSON.stringify(data['data'])
        for(var i=0;i<data['data'].length;i++) {
            storeLongitudeArray[i] = data['data'][i]['longitude'];
            storeLatitudeArray[i] = data['data'][i]['latitude'];
        }
    });
    $.ajaxSettings.async = true;
    // map.clearOverlays();
    var temp=uniquePositions(storeLongitudeArray,storeLatitudeArray)
    if(temp[0].length==0)
    {
        alert("无轨迹资料")
        return;
    }
    arrPoints=new Array();
    for(var i=0;i<temp.length;i++)
    {
        arrPoints[i]=(new BMap.Point(temp[0][i],temp[1][i]))
    }
    //执行方法
    cnt = 0;
    var startMkr = new BMap.Marker(arrPoints[0]);
    map.addOverlay(startMkr); //标点
    var endMkr=new BMap.Marker(arrPoints[arrPoints.length-1])
    map.addOverlay(endMkr); //标点
    var startlabel = new BMap.Label("起点", {
        offset: new BMap.Size(-15, 20)
    }); //创建marker点的标记,这里注意下,因为百度地图可以对label样式做编辑,
    startlabel.setStyle({
        width: "auto",
        background: '#ffffff',
        border: '1px solid "#ff8355"',
        borderRadius: "5px",
        textAlign: "center",
        height: "auto",
        fontSize: "5px"
    }); //对label 样式隐藏
    startMkr.setLabel(startlabel); //把label设置到maker上
    var endlabel = new BMap.Label("终点", {
        offset: new BMap.Size(-15, 20)
    }); //创建marker点的标记,这里注意下,因为百度地图可以对label样式做编辑,
    startlabel.setStyle({
        width: "auto",
        background: '#ffffff',
        border: '1px solid "#ff8355"',
        borderRadius: "5px",
        textAlign: "center",
        height: "auto",
        fontSize: "5px"
    }); //对label 样式隐藏
    endMkr.setLabel(startlabel); //把label设置到maker上
    points = [];
    dynamicLine()
    // chance=setInterval(goNext,500);
}


function driveline(points) {
    map.addOverlay(new BMap.Polyline(points, {
        strokeColor: "green",
        strokeWeight: 1,
        strokeOpacity: 1
    }));
}

function dynamicLine() {
    if (cnt == arrPoints.length) return;
    // var mkr = new BMap.Marker(arrPoints[cnt]);
    // map.addOverlay(mkr); //标点
    points.push(arrPoints[cnt]);
    driveline(points);
    cnt++;
    setTimeout(dynamicLine, 100);
}

function format(date) {
    var y = date.getFullYear();
    var m = date.getMonth() + 1;
    m = m < 10 ? ('0' + m) : m;
    var d = date.getDate();
    d = d < 10 ? ('0' + d) : d;
    var h = date.getHours();
    h = h < 10 ? ('0' + h) : h;
    var minute = date.getMinutes();
    minute = minute < 10 ? ('0' + minute) : minute;
    var second = date.getSeconds();
    second = second < 10 ? ('0' + second) : second;
    return y + '-' + m + '-' + d + ' ' + h + ':' + minute + ':' + second;
}

function uniquePositions(lo,la){
    var nlo=new Array();
    var nla=new Array();
    for(var i = 0; i < lo.length-1; i++){
        if(lo[i]!=lo[i+1]||la[i]!=la[i+1]){
            nlo.push(lo[i]);
            nla.push(la[i]);
        }
    }
    nlo.push(lo[lo.length-1])
    nla.push(la[la.length-1])
    var pos=[nlo,nla]
    return pos;
}
