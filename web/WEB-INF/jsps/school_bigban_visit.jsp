<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/common/header.jsp"%>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>学校主页</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Website Template by FreeHTML5.co" />
	<meta name="keywords" content="free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />

  	<!-- Facebook and Twitter integration -->
	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />

	<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
	<link rel="shortcut icon" href="favicon.ico">

	<link href='https://fonts.googleapis.com/css?family=Roboto:400,300,600,400italic,700' rel='stylesheet' type='text/css'>
	<link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
	
	<!-- Animate.css -->
	<link rel="stylesheet" href="${basePath}lib_two/css/animate.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="${basePath}lib_two/css/icomoon.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="${basePath}lib_two/css/bootstrap.css">
	<!-- Owl Carousel -->
	<link rel="stylesheet" href="${basePath}lib_two/css/owl.carousel.min.css">
	<link rel="stylesheet" href="${basePath}lib_two/css/owl.theme.default.min.css">
	<!-- Theme style  -->
	<link rel="stylesheet" href="${basePath}lib_two/css/style.css">

	<!-- Modernizr JS -->
	<script src="${basePath}lib_two/js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
		<script src="${basePath}lib_two/js/respond.min.js"></script>
		<![endif]-->

	</head>
	<body>


	<div id="fh5co-page">

		<a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle"><i></i></a>


		<aside id="fh5co-aside" role="complementary" class="border js-fullheight">

			<h1 id="fh5co-logo"><a href="${basePath}home/index.do"><img src="${basePath}lib_one/images/logo_back.png" alt="Free HTML5 Bootstrap Website Template"></a></h1>
			<nav id="fh5co-main-menu" role="navigation">
				<ul>
					<li><a href="${basePath}school/index.do">学校简介</a></li>
					<li><a href="${basePath}school/photo/libraryUI.do">学校图片库</a></li>
					<li><a href="${basePath}school/corridor_3dvisitUI.do">3D走廊游览</a></li>
					<li><a href="${basePath}school/fly_3dvisitUI.do">3D模拟飞行游览</a></li>
					<li class="fh5co-active"><a href="${basePath}school/bigban_visitUI.do">BigBan</a></li>
					<li><a href="${basePath}school/photo/uploadUI.do">我要上传到照片</a></li>
					<li><a href="${basePath}school/more_prjUI.do">正在开发中的项目</a></li>

				</ul>
			</nav>

			<div class="fh5co-footer">
				<p><small>&copy; 2016 ShenTong workspace All Rights Reserved.</small></p>
				<ul>
					<li><a href="#"><i class="icon-facebook"></i></a></li>
					<li><a href="#"><i class="icon-twitter"></i></a></li>
					<li><a href="#"><i class="icon-instagram"></i></a></li>
					<li><a href="#"><i class="icon-linkedin"></i></a></li>
				</ul>
			</div>

		</aside>



		<div id="fh5co-main">
			<div class="fh5co-gallery">

				<div class="section">
					<div class="container">

						<br>
						<br>

						<div class="row">
							<div class="col-md-6">
								<img src="${basePath}lib_one/images/BIGBAN.png"
									 class="img-responsive">
							</div>
							<div class="col-md-6">
								<h1>BIGBAN</h1>
								<p>
									<br>详细描述和使用说明
									<br>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo
									ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis
									dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies
								</p>
								<p>
									<a class="btn btn-lg btn-outline">前往游览</a>
								</p>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>






	</div>

	<!-- jQuery -->
	<script src="${basePath}lib_two/js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="${basePath}lib_two/js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="${basePath}lib_two/js/bootstrap.min.js"></script>
	<!-- Carousel -->
	<script src="${basePath}lib_two/js/owl.carousel.min.js"></script>
	<!-- Stellar -->
	<script src="${basePath}lib_two/js/jquery.stellar.min.js"></script>
	<!-- Waypoints -->
	<script src="${basePath}lib_two/js/jquery.waypoints.min.js"></script>
	<!-- Counters -->
	<script src="${basePath}lib_two/js/jquery.countTo.js"></script>
	
	
	<!-- MAIN JS -->
	<script src="${basePath}lib_two/js/main.js"></script>

	</body>
</html>

