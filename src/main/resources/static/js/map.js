var url="http://47.105.166.205:8080/information"
// var url="http://localhost:8080/information"
//


//Posistions表
var employeeIdArray=new Array();
var timeArray=new Array();
var longitudeArray=new Array();
var latitudeArray=new Array();
var workStatusArray=new Array();
var kindArray=new Array();
var numofPositions;
var tempxx;

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

var buttonFlag=0;//0:全部，1:车；2:人；3：桶

// updateAll();
// setInterval("updateAll()",5000);

function initMap(){
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

function updateMap(){
    getPositions();
    var opts = {
        width : 300,     // 信息窗口宽度
        height: 200,     // 信息窗口高度
        title : "详细信息" , // 信息窗口标题
        enableMessage:true//设置允许信息窗发送短息
    };
    for(var i=0;i<tempxx;i++){
        var icon;
        switch (buttonFlag) {
            case 0:
                if(kindArray[i]=="car")
                {
                    icon=carIcon;
                }else if(kindArray[i]=="bin")
                {
                    icon=binIcon
                }else{
                    icon=personIcon;
                }
                break;
            case 1:
                if(kindArray[i]!="car")
                {
                    continue;
                }
                icon=carIcon;
                break;
            case 2:
                if(kindArray[i]!="person")
                {
                    continue;
                }
                icon=personIcon;
                break;
            case 3:
                if(kindArray[i]!="bin")
                {
                    continue;
                }
                icon=binIcon;
                break;
        }
        var marker = new BMap.Marker(new BMap.Point(longitudeArray[i],latitudeArray[i]),{icon:icon});  // 创建标注
        var content;
        var areaContent;
        areaContent=gc.getLocation(new BMap.Point(longitudeArray[i],latitudeArray[i]), function(rs){
            var addComp = rs.addressComponents;
            return(addComp.district + ", " + addComp.street + ", " + addComp.streetNumber);
        });
        content=content+areaContent;
        if(kindArray[i]=="car")
        {
            content=getCar(employeeIdArray[i])
        }else if(kindArray[i]=="bin")
        {
            content=getBin(employeeIdArray[i])
        }else{
            content=getPerson(employeeIdArray[i])
        }
        map.addOverlay(marker);               // 将标注添加到地图中
        addClickHandler(content,marker);
    }
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
}
function getPositions() {
    $.ajaxSettings.async = false;
    $.getJSON( url + "/Positions",{},function (data) {
        for (var i = 0; i < data['data'].length; i++) {
            employeeIdArray[i] = data['data'][i]['employeeId'];
            timeArray[i] = data['data'][i]['updateTime'];
            longitudeArray[i] = data['data'][i]['longitude'];
            latitudeArray[i] = data['data'][i]['latitude'];
            workStatusArray[i] = data['data'][i]['workStatus'];
            kindArray[i] = data['data'][i]['kind'];
        }
        tempxx=data['data'].length;
    });
    $.ajaxSettings.async = true;
}

function getCar(employeeId) {
    $.ajaxSettings.async = false;
    var result;
    $.getJSON( url + "/Cars/"+employeeId,{},function (data) {
        var jsonStr=JSON.stringify(data['data'])
        if(jsonStr==null)
        {
            return result="数据未录入";
        }
        var carObject = JSON.parse(jsonStr)
        result=carObject.carName+"<br/>"+data['data']['phone']+"<br/>"+data['data']['carNumber']+"<br/>"+data['data']['carType']+"<br/>"+data['data']['kind']+"<br/>"+data['data']['gender']+"<br/>"+data['data']['age']+"<br/>"+data['data']['area']+"<br/>";
    });
    $.ajaxSettings.async = true;
    return result;
}

function getPerson(employeeId) {
    $.ajaxSettings.async = false;
    var result;
    $.getJSON( url + "/Persons/"+employeeId,{},function (data) {
        var jsonStr=JSON.stringify(data['data'])
        if(jsonStr==null) {
            return result = "数据未录入";
        }
        result= data['data']['personName']+"<br/>"+data['data']['phone']+"<br/>"+data['data']['kind']+"<br/>"+data['data']['job'];
    });
    $.ajaxSettings.async = true;
    return result;
}

function getBin(employeeId) {
    $.ajaxSettings.async = false;
    var result;
    $.getJSON( url + "/Bins/"+employeeId,{},function (data) {
        var jsonStr=JSON.stringify(data['data'])
        if(jsonStr==null) {
            return result = "数据未录入";
        }
        result=data['data']['binName']+"<br/>"+data['data']['currentV']+"<br/>"+data['data']['maxV']+"<br/>"+data['data']['temperature']+"<br/>"+data['data']['area']
    });
    return result;
    $.ajaxSettings.async = true;
    return result;
}
function updateAll() {
    map.clearOverlays();
    updateMap();
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