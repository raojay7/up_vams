<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/common/header.jsp" %>
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]> <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]> <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js"> <!--<![endif]-->
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>珍藏最美的风景</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Free HTML5 Template by FREEHTML5.CO"/>
    <meta name="keywords" content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive"/>
    <meta name="author" content="FREEHTML5.CO"/>

    <!-- Facebook and Twitter integration -->
    <meta property="og:title" content=""/>
    <meta property="og:image" content=""/>
    <meta property="og:url" content=""/>
    <meta property="og:site_name" content=""/>
    <meta property="og:description" content=""/>
    <meta name="twitter:title" content=""/>
    <meta name="twitter:image" content=""/>
    <meta name="twitter:url" content=""/>
    <meta name="twitter:card" content=""/>

    <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
    <link rel="shortcut icon" href="${basePath}lib_one/favicon.ico">

    <!-- Google Webfont -->
    <!--<link href='http://fonts.useso.com/css?family=PT+Mono' rel='stylesheet' type='text/css'>-->
    <!-- Themify Icons -->
    <link rel="stylesheet" href="${basePath}lib_one/css/themify-icons.css">
    <!-- Icomoon Icons -->
    <link rel="stylesheet" href="${basePath}lib_one/css/icomoon-icons.css">
    <!-- Bootstrap -->
    <link rel="stylesheet" href="${basePath}lib_one/css/bootstrap.css">
    <!-- Owl Carousel -->
    <link rel="stylesheet" href="${basePath}lib_one/css/owl.carousel.min.css">
    <link rel="stylesheet" href="${basePath}lib_one/css/owl.theme.default.min.css">
    <!-- Magnific Popup -->
    <link rel="stylesheet" href="${basePath}lib_one/css/magnific-popup.css">
    <!-- Easy Responsive Tabs -->
    <link rel="stylesheet" href="${basePath}lib_one/css/easy-responsive-tabs.css">
    <!-- Theme Style -->
    <link rel="stylesheet" href="${basePath}lib_one/css/style.css">


    <!-- FOR IE9 below -->
    <!--[if lte IE 9]>
    <script src="${basePath}lib_one/js/modernizr-2.6.2.min.js"></script>
    <script src="${basePath}lib_one/js/respond.min.js"></script>
    <![endif]-->

    <script type="text/javascript" language="JavaScript">
    function gotoSchoolHome() {

        document.forms[0].submit();

    }
</script>
</head>

<body class="fh5co-outer">

<!-- 导航栏start -->

<header id="fh5co-header" role="banner">

    <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <!-- Mobile Toggle Menu Button -->
                <a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle" data-toggle="collapse"
                   data-target="#fh5co-navbar" aria-expanded="false" aria-controls="navbar"><i></i></a>
                <a class="navbar-brand" href="${basePath}home/index.do">主页</a>
            </div>
            <div id="fh5co-navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li><a href="${basePath}user/photoUI.do">个人中心</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">

                    <li>

                        <a class="btn btn-outline" href="${basePath}school/searchUI.do">搜索我的学校</a>

                    </li>
                    <li>&nbsp;&nbsp;</li>
                    <c:if test="${sessionScope.user!=null}">
                        <li>
                            <div class="btn btn-outline">${sessionScope.user.userName}</div>
                            <a class="btn btn-outline" href="${basePath}user/logout.do">注销</a>
                        </li>
                    </c:if>

                    <c:if test="${sessionScope.user==null}">
                        <li><a class="btn btn-outline" href="${basePath}user/loginUI.do">登录</a></li>
                    </c:if>
                    <!--<li><a href="#" class="btn btn-calltoaction btn-primary">快速注册</a></li>-->
                </ul>
            </div>
        </div>
    </nav>

</header>

<!-- 导航栏end -->


<!--主页背景图开始-->
<div id="fh5co-hero" style="background-image: url(${basePath}lib_one/images/background5.jpg);">
    <a href="#fh5co-main" class="smoothscroll animated bounce fh5co-arrow"><i class="ti-angle-down"></i></a>
    <div class="overlay"></div>
    <div class="container">
        <div class="col-md-8 col-md-offset-2">
            <div class="text">
                <h1>
                    <strong>UP-VAMS</strong>
                    <br>
                    <em style="font-size: 1.0px">-- 校园文化的盛宴</em>
                </h1>

            </div>
        </div>
    </div>
</div>

<!--主页背景图结束-->


<!--主页推送通知开始-->

<main role="main" id="fh5co-main">
    <section class="feature">
        <div class="container">

            <div class="row">
                <div class="col-md-4">
                    <div class="feature-item">
                        <div class="feature-icon"><i class="icon ti-comment"></i></div>
                        <div class="feature-text">
                            <h3>关注我们的微信公众号</h3>
                            <p>
                                <br>
                                <a href="#"> <img style="width: 120px;height: 120px"
                                                  src="${basePath}lib_one/images/st-icon.jpg"/> </a></p>
                            <p>
                                扫描上面二维码关注我们。
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="feature-item">
                        <div class="feature-icon"><i class="icon ti-heart"></i></div>
                        <div class="feature-text">
                            <h3>最美校园图片</h3>
                            <p>
                            <h5>
                                我们对个上万张校园图片进行评选
                                、这里有最美的图书馆、最美的教学楼、最美的校园风景。
                            </h5>
                            <br>
                            <br>
                            <br>
                            <br>
                            <br>

                            <a href="#" class="btn btn-calltoaction btn-primary">点击浏览</a>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="feature-item">
                        <div class="feature-icon"><i class="icon ti-mobile"></i></div>
                        <div class="feature-text">
                            <h3>手机APP下载</h3>
                            <p>
                            <h5>
                                网页浏览不方便，试试下载使用我们的APP端吧，请点击下面下载链接，我们准备了不同的版本供你下载。
                            </h5>
                            <br>
                            <br>
                            <br>
                            <br>

                            <br>

                            <a href="#" class="btn btn-calltoaction btn-primary">点击下载</a>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!--主页推送通知结束-->


    <!--学校排行开始-->
    <section class="grid-gallery">
        <div class="container">

            <div class="row">
                <div class="col-md-2">
                    <h2 class="section-heading">学校排行</h2>
                </div>
            </div>


            <c:forEach items="${page.list}" var="homeSchool">
            <!--no1-->

            <div class="row">

                <div class="col-md-2">
                    <a class="btn btn-outline">${homeSchool.schoolName}</a>
                </div>

                <div class="col-md-2">
                    <a class="btn btn-outline">图片总数:${homeSchool.schoolPhotoCount}</a>
                </div>

                <div class="col-md-2">
                    <a class="btn btn-outline">访问量:${homeSchool.schoolPageView}</a>
                </div>

                <div class="col-md-2">
                    <a class="btn btn-outline">活跃指数:${homeSchool.schoolActiveIndex}</a>
                </div>

                <div class="col-md-2">
                    <a class="btn btn-outline">排名 NO ${homeSchool.schoolRanking}</a>
                </div>

            </div>


            <hr>

            <div class="row gallery-row">

                <div class="col-md-6 col-sm-6">
                    <a href="${basePath}school/photo/detail.do" class="img image-popup">
                        <div class="overlay"></div>
                        <div class="text">
                            <h2>${homeSchool.schoolName}</h2>
                            <br>
                            <h5>${homeSchool.photo.photoIntroduction}</h5>
                        </div>
                        <img src="${picPath}${homeSchool.photo.photoName}" alt="Image" class="img-responsive">
                    </a>
                </div>

                <div class="col-md-6 col-sm-6">
                    <div class="row first-row">
                        <div class="col-md-6 col-sm-6">
                            <a href="${basePath}school/photo/detail.do" class="img image-popup">
                                <div class="overlay"></div>
                                <div class="text">
                                    <h2>${homeSchool.photos[1].photoIntroduction}</h2>
                                </div>
                                <img src="${picPath}${homeSchool.photos[1].photoName}" alt="Image"
                                     class="img-responsive">
                            </a>
                        </div>
                        <div class="col-md-6 col-sm-6">
                            <a href="${basePath}school/photo/detail.do" class="img image-popup">
                                <div class="overlay"></div>
                                <div class="text">
                                    <h2>${homeSchool.photos[2].photoIntroduction}</h2>
                                </div>
                                <img src="${picPath}${homeSchool.photos[2].photoName}" alt="Image" class="img-responsive">
                            </a>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6 col-sm-6">
                            <a href="${basePath}school/photo/detail.do" class="img image-popup">
                                <div class="overlay"></div>
                                <div class="text">
                                    <h2>${homeSchool.photos[3].photoIntroduction}</h2>
                                </div>
                                <img src="${picPath}${homeSchool.photos[3].photoName}" alt="Image"
                                     class="img-responsive">
                            </a>
                        </div>
                        <div class="col-md-6 col-sm-6">
                            <a href="${basePath}school/photo/detail.do" class="img image-popup">
                                <div class="overlay"></div>
                                <div class="text">
                                    <h2>${homeSchool.photos[4].photoIntroduction}</h2>
                                </div>
                                <img src="${picPath}${homeSchool.photos[4].photoName}" alt="Image" class="img-responsive">
                            </a>
                        </div>
                    </div>
                </div>


            </div>


            <div class="row">
                <div class="col-md-12 text-center">
                    <div>
                        <form action="${basePath}school/find.do" method="post">
                            <input class="btn btn-primary" type="button" value="浏览更多" onclick="gotoSchoolHome()">
                            <input hidden name="schoolId" value="${homeSchool.schoolId}"/>
                        </form>
                    </div>
                </div>
            </div>
            </c:forEach>

            <br>


            <div class="row">
                <div class="col-md-12 text-center">
                    <div><a href="#" class="btn btn-primary">浏览更多</a></div>
                </div>
            </div>

            <!--no2 end-->


        </div>
    </section>

    <!--学校排行结束-->

    <section class="feature">
        <div class="container">

            <div class="row">
                <div class="col-md-3">
                    <h2 class="section-heading">3D虚拟导览</h2>
                </div>
            </div>


            <div class="row">
                <div class="col-md-4">
                    <a href="${basePath}lib_one/images/ncu-playground-night.jpg" class="img image-popup">
                        <div class="overlay"></div>
                        <div class="text">
                        </div>
                        <img src="${basePath}lib_one/images/ncu-playground-night.jpg" alt="Image"
                             class="center-block img-circle img-responsive">
                    </a>

                    <h3 class="text-center">清华大学</h3>
                    <p class="text-center"><a href="${basePath}virtual/test-demo.html" class="btn btn-primary">进入体验</a>
                    </p>
                </div>


                <div class="col-md-4">
                    <a href="${basePath}lib_one/images/ncu-door.jpg" class="img image-popup">
                        <div class="overlay"></div>
                        <div class="text">
                        </div>
                        <img src="${basePath}lib_one/images/ncu-door.jpg" alt="Image"
                             class="center-block img-circle img-responsive">
                    </a>

                    <h3 class="text-center">北京大学</h3>
                    <p class="text-center"><a href="#" class="btn btn-primary">进入体验</a></p>
                </div>


                <div class="col-md-4">
                    <a href="${basePath}lib_one/images/hafo-05.jpeg" class="img image-popup">
                        <div class="overlay"></div>
                        <div class="text">
                        </div>
                        <img src="${basePath}lib_one/images/hafo-05.jpeg" alt="Image"
                             class="center-block img-circle img-responsive">
                    </a>

                    <h3 class="text-center">哈佛大学</h3>
                    <p class="text-center"><a href="#" class="btn btn-primary">进入体验</a></p>
                </div>


            </div>

        </div>
    </section>


    <section class="grid-gallery">
        <div class="container">


            <div class="row">
                <div class="col-md-2">
                    <h2 class="section-heading">精选项目</h2>
                </div>
            </div>

            <hr>

            <div class="row gallery-row">

                <div class="col-md-6 col-sm-6">
                    <a href="${basePath}lib_one/images/ncu-door.jpg" class="img image-popup">
                        <div class="overlay"></div>
                        <div class="text">
                            <h2>BigBan</h2>
                            <br>
                            <h3>在浏览器里面查看所有图片</h3>
                            <h5>体验校园文化大爆炸</h5>
                        </div>
                        <img src="${basePath}lib_one/images/ncu-door.jpg" alt="Image" class="img-responsive">
                    </a>
                </div>

                <div class="col-md-6 col-sm-6">
                    <div class="row first-row">
                        <div class="col-md-6 col-sm-6">
                            <a href="${basePath}lib_one/images/main-learning-building.jpg" class="img image-popup">
                                <div class="overlay"></div>
                                <div class="text">
                                    <h2>飞行穿越图片空间</h2>
                                </div>
                                <img src="${basePath}lib_one/images/main-learning-building.jpg" alt="Image"
                                     class="img-responsive">
                            </a>
                        </div>
                        <div class="col-md-6 col-sm-6">
                            <a href="${basePath}lib_one/images/ncu-library.jpg" class="img image-popup">
                                <div class="overlay"></div>
                                <div class="text">
                                    <h2>3D图片走廊</h2>
                                </div>
                                <img src="${basePath}lib_one/images/ncu-library.jpg" alt="Image" class="img-responsive">
                            </a>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6 col-sm-6">
                            <a href="${basePath}lib_one/images/ncu-main-playground.jpg" class="img image-popup">
                                <div class="overlay"></div>
                                <div class="text">
                                    <h2>拼图游戏</h2>
                                </div>
                                <img src="${basePath}lib_one/images/ncu-main-playground.jpg" alt="Image"
                                     class="img-responsive">
                            </a>
                        </div>
                        <div class="col-md-6 col-sm-6">
                            <a href="${basePath}lib_one/images/ncu-dragon.jpg" class="img image-popup">
                                <div class="overlay"></div>
                                <div class="text">
                                    <h2>金龙</h2>
                                </div>
                                <img src="${basePath}lib_one/images/ncu-dragon.jpg" alt="Image" class="img-responsive">
                            </a>
                        </div>
                    </div>
                </div>

            </div>

            <div class="row">
                <div class="col-md-12 text-center">
                    <div><a href="#" class="btn btn-primary">快速体验</a></div>
                </div>
            </div>

        </div>


    </section>


</main>


<footer role="contentinfo" id="fh5co-footer">
    <div class="container">
        <div class="row">
            <div class="col-md-3 col-sm-6">
                <div class="footer-box border-bottom">
                    <h3 class="footer-heading">关于我们</h3>
                    <p>
                        我们是来自南昌大学的一个软件开发团队，有激情，有梦想。
                        用我们的猿臂，敲出Amazing的软件。
                    </p>
                </div>

                <h3 class="footer-heading">联系我们</h3>
                <form action="#" class="form-subscribe">
                    <div class="field">
                        <input type="email" class="form-control" placeholder="你的邮箱...">
                        <button class="btn btn-primary">发送</button>
                    </div>
                </form>
                <div class="fh5co-spacer fh5co-spacer-sm"></div>

            </div>
            <div class="col-md-3 col-sm-6">

                <h3 class="footer-heading">OUR_SYS</h3>
                <ul class="footer-list">
                    <li><a href="#">OUS_SYS登录</a></li>
                    <li><a href="#">神通通讯录主页</a></li>
                </ul>

            </div>


            <div class="visible-sm clearfix"></div>


            <div class="col-md-3 col-sm-6">

                <h3 class="footer-heading">导航链接</h3>
                <ul class="footer-list">
                    <li><a href="#"><abbr title="Hypertext Markup Language 5">3D虚拟导览</abbr></a></li>
                    <li><a href="#"><abbr title="Cascading Stylesheets 3">BIGBAN</abbr></a></li>
                    <li><a href="#">正在开发中的项目</a></li>
                </ul>

            </div>


            <div class="col-md-3 col-sm-6 clearfix">

                <div class="row">
                    <div class="col-md-6 col-sm-6">
                        <div class="footer-box">
                            <h3 class="footer-heading">人才</h3>
                            <ul class="footer-list">
                                <li><a href="#">我们的团队</a></li>
                                <li><a href="#">联系我们</a></li>
                                <li><a href="#">加入我们</a></li>

                            </ul>
                        </div>
                    </div>
                    <div class="col-md-6 col-sm-6">
                        <div class="footer-box">
                            <h3 class="footer-heading">支持我们</h3>
                            <ul class="footer-list">
                                <li><a href="#">捐赠</a></li>
                                <li><a href="#">赞助</a></li>
                                <li><a href="#">和我们合作</a></li>
                            </ul>
                        </div>
                    </div>
                </div>

            </div>

        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="copyright">
                    <p class="text-center">
                        <small>
                            <a href="#" target="_blank">ST-TEAM</a><br> &copy; 2015 Display. All Rights Reserved.
                        </small>
                    </p>
                </div>
            </div>
        </div>
    </div>
</footer>


<!-- Go To Top -->
<a href="#" class="fh5co-gotop"><i class="ti-shift-left"></i></a>


<!-- jQuery -->
<script src="${basePath}lib_one/js/jquery-1.10.2.min.js"></script>
<!-- jQuery Easing -->
<script src="${basePath}lib_one/js/jquery.easing.1.3.js"></script>
<!-- Bootstrap -->
<script src="${basePath}lib_one/js/bootstrap.js"></script>
<!-- Owl carousel -->
<script src="${basePath}lib_one/js/owl.carousel.min.js"></script>
<!-- Magnific Popup -->
<script src="${basePath}lib_one/js/jquery.magnific-popup.min.js"></script>
<!-- Easy Responsive Tabs -->
<script src="${basePath}lib_one/js/easyResponsiveTabs.js"></script>
<!-- FastClick for Mobile/Tablets -->
<script src="${basePath}lib_one/js/fastclick.js"></script>

<!-- Main JS -->
<script src="${basePath}lib_one/js/main.js"></script>

</body>
</html>
