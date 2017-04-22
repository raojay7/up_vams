<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/common/header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
<title>检索面板</title>
<style type="text/css">
    * {
        margin: 0px;
        padding: 0px;
    }
    body, button, input, select, textarea {
        font: 12px/16px Verdana, Helvetica, Arial, sans-serif;
    }
    li {
        margin-left: 30px;
    }
	#container {
	   min-width:603px;
	   min-height:367px;
	}
</style>
<script charset="utf-8" src="http://map.qq.com/api/js?v=2.exp"></script>
<script>
var map = null;
var searchService = null;

var init = function () {
    var center = new qq.maps.LatLng(39.916527, 116.397128);
    map = new qq.maps.Map(document.getElementById('container'), {
        center:center,
        zoomLevel:13
    });


    var marker = new qq.maps.Marker(
            {
                position:center,
                map: map
            }
    );
	
		
	  //绑定单击事件添加参数
    qq.maps.event.addListener(map, 'click', function(event) {

        marker.setPosition(event.latLng);


	    document.getElementById("lng").value = event.latLng.getLng();
	
	    document.getElementById("lat").value = event.latLng.getLat();    
	 
        <!-- alert('您点击的位置为: [' + event.latLng.getLat() + ', ' + -->
        <!-- event.latLng.getLng() + ']'); -->
    });
	
    //调用Poi检索类
    searchService = new qq.maps.SearchService({
        panel:document.getElementById('infoDiv'),
        map : map
    });
    getResult();
}
function getResult() {

    //设置searchRequest
    var poiText = document.getElementById("poiText").value;
    
    searchService.search(poiText);

}

</script>
</head>
<body onload="init()">
<div id="container"></div>
<div>

    <br>
    <br>
    地点 <input type='text' id="poiText" placeholder="请输入地点关键字"/>

	  <input type="button" value="搜索" onclick="getResult()"/>
	<br>
    <br>

    <font color="red">&nbsp;&nbsp;点击地图某个位置可标记点,请放大地点后,标记在搜索到点的边上</font>

    <br>
    <br>
    <!--可能跳转有问题-->
	<form name = "" method="post" action="${bathPath}get_xyResult.do">
	
	<span>经度</span>
	<input id = "lng" name="latitude"/>
	<br>
        <br>
	<span>纬度</span>
	<input id = "lat" name="longitude"/>

        <br>
        <br>
        <input value="提交坐标值" type="submit" style="margin-left: 25px">

	</form>

  
    <div id="pageIndexLabel" style="width: 100px;"></div>
</div>
<div style='width: 500px; height: 180px' id="infoDiv"></div>
</body>
</html>
