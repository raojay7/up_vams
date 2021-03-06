<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/common/header.jsp" %>
<!doctype html>
<html lang="zh">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>超酷3D立方体空间旋转图片画廊特效</title>
	<style type="text/css">
		html {
			overflow: hidden;
			-ms-touch-action: none;
			-ms-content-zooming: none;
		}
		body {
			position: absolute;
			margin: 0px;
			padding: 0px;
			background: #fff;
			width: 100%;
			height: 100%;
		}
		#screen {
			position: absolute;
			left:0;
			top:0;
			width: 100%;
			height: 100%;
			background:#000;
			perspective:500px;
			-webkit-perspective:500px;
		}

		.cube {
			position: absolute;
			top: 50%;
			left: 50%;
			width: 0;
			height: 0;
			margin: 0;
			user-select: none;
			transform-style: preserve-3d;
			-webkit-transform-style: preserve-3d;
		}

		.face {
			position: absolute;
			margin-left:-300px;
			margin-top:-200px;
			width:600px;
			height:400px;
			backface-visibility: hidden;
			-webkit-backface-visibility: hidden;
			transform-origin:50% 50%;
			-webkit-transform-origin:50% 50%;
			transition: outline 0.5s ease-in-out 0s;
			cursor: pointer;
		}

		.button {
			position: absolute;
			margin-left:-150px;
			margin-top:-100px;
			width:300px;
			height:200px;
		}
		.face:hover {
			outline: rgba(255,255,255,1) solid 10px !important;
		}
	</style>
	<!--[if IE]>
	<script src="http://libs.baidu.com/html5shiv/3.7/html5shiv.min.js"></script>
	<![endif]-->
</head>
<body>
<div id="screen">
	<div id="cube" class='cube'>
		<!-- cube images -->
		<img id="1" src="${picPath}${pageResult.list[0].photoOssname}" class='face' data-transform="translateZ(-400px)" style="outline:none !important">
		<img id="2" src="${picPath}${pageResult.list[1].photoOssname}" class='face' data-transform="rotateY(90deg) translateZ(-400px)">
		<img id="3" src="${picPath}${pageResult.list[2].photoOssname}"  class='face' data-transform="rotateY(-90deg) translateZ(-400px)">
		<img id="4" src="${picPath}${pageResult.list[3].photoOssname}" class='face' data-transform="rotateY(180deg) translateZ(-400px)">
		<img id="5" src="${picPath}${pageResult.list[4].photoOssname}" class='face' data-transform="rotateX(90deg) translateZ(-300px)">
		<img id="6" src="${picPath}${pageResult.list[5].photoOssname}"  class='face' data-transform="rotateX(-90deg) translateZ(-300px)">
		<!-- bonus image -->
		<img id="7" src="${picPath}${pageResult.list[1].photoOssname}"  class='face' data-transform="rotateY(180deg) translateZ(305px)" style="visibility:hidden">
		<!-- buttons -->
		<img src="${picPath}${pageResult.list[7].photoOssname}" class='face button' alt="7" data-transform="translateY(-80px) translateZ(-340px) scale(0.5)">
		<img src="${picPath}${pageResult.list[2].photoOssname}" class='face button' alt="2" data-transform="translateX(-200px) translateY(-80px) translateZ(-340px) scale(0.5)">
		<img src="${picPath}${pageResult.list[3].photoOssname}"  class='face button' alt="3" data-transform="translateX(200px) translateY(-80px) translateZ(-340px) scale(0.5)">
		<img src="${picPath}${pageResult.list[4].photoOssname}" class='face button' alt="4" data-transform="translateY(80px) translateZ(-340px) scale(0.5)">
		<img src="${picPath}${pageResult.list[5].photoOssname}" class='face button' alt="5" data-transform="translateX(-200px) translateY(80px) translateZ(-340px) scale(0.5)">
		<img src="${picPath}${pageResult.list[6].photoOssname}"  class='face button' alt="6" data-transform="translateX(200px) translateY(80px) translateZ(-340px) scale(0.5)">
	</div>
</div>
<script type="text/javascript" src="${request.getContextPath}/js/main.js"></script>
</body>
</html>