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
	<title>Blend &mdash; Free HTML5 Bootstrap Website Template by FreeHTML5.co</title>
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

	<%--<link href='https://fonts.googleapis.com/css?family=Roboto:400,300,600,400italic,700' rel='stylesheet' type='text/css'>--%>
	<%--<link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>--%>
	<%----%>
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
					<li class="fh5co-active"><a href="${basePath}user/photoUI.do">我收藏的图片</a></li>
					<li><a href="${basePath}user/schoolUI.do">我收藏的学校</a></li>
					<li><a href="${basePath}user/profileUI.do">账户信息</a></li>
					<li><a href="${basePath}user/friendUI.do">我关注的神友</a></li>
					<li><a href="${basePath}user/friend/recommendUI.do">神友的推荐</a></li>
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


		<!--收藏图片缩略开始-->

		<div id="fh5co-main">
			<div class="fh5co-gallery">

				<a class="gallery-item" href="user_photo_detail.html">
					<img src="${basePath}lib_two/images/work_1.jpg" alt="school_door">
					<span class="overlay">
						<h2>Photo</h2>
						<span>school door</span>
					</span>
				</a>

				<a class="gallery-item" href="user_photo_detail.html">
					<img src="${basePath}lib_two/images/work_1.jpg" alt="school_door">
					<span class="overlay">
						<h2>Photo</h2>
						<span>school door</span>
					</span>
				</a>

				<a class="gallery-item" href="user_photo_detail.html">
					<img src="${basePath}lib_two/images/work_1.jpg" alt="school_door">
					<span class="overlay">
						<h2>Photo</h2>
						<span>school door</span>
					</span>
				</a>
				<a class="gallery-item" href="user_photo_detail.html">
					<img src="${basePath}lib_two/images/work_1.jpg" alt="school_door">
					<span class="overlay">
						<h2>Photo</h2>
						<span>school door</span>
					</span>
				</a>
				<a class="gallery-item" href="user_photo_detail.html">
					<img src="${basePath}lib_two/images/work_1.jpg" alt="school_door">
					<span class="overlay">
						<h2>Photo</h2>
						<span>school door</span>
					</span>
				</a>
				<a class="gallery-item" href="user_photo_detail.html">
					<img src="${basePath}lib_two/images/work_1.jpg" alt="school_door">
					<span class="overlay">
						<h2>Photo</h2>
						<span>school door</span>
					</span>
				</a>
				<a class="gallery-item" href="user_photo_detail.html">
					<img src="${basePath}lib_two/images/work_1.jpg" alt="school_door">
					<span class="overlay">
						<h2>Photo</h2>
						<span>school door</span>
					</span>
				</a>

				<a class="gallery-item" href="user_photo_detail.html">
					<img src="${basePath}lib_two/images/work_1.jpg" alt="school_door">
					<span class="overlay">
						<h2>Photo</h2>
						<span>school door</span>
					</span>
				</a>




			</div>

			<center>

				<p><a href="#" class="btn btn-primary btn-outline">上一页</a></p>

			</center>

			<center>

				<p><a class="btn btn-primary btn-outline">第1页</a></p>

			</center>


			<center>

				<p><a href="#" class="btn btn-primary btn-outline">下一页</a></p>

			</center>


		</div>



	</div>

	<br>
	<br>
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

