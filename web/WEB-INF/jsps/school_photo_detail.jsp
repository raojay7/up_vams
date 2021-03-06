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
    <title>学校主页</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Free HTML5 Website Template by FreeHTML5.co"/>
    <meta name="keywords"
          content="free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive"/>

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
    <link rel="shortcut icon" href="favicon.ico">

    <link href='https://fonts.googleapis.com/css?family=Roboto:400,300,600,400italic,700' rel='stylesheet'
          type='text/css'>
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

        <h1 id="fh5co-logo"><a href="${basePath}home/index.do"><img src="${basePath}lib_one/images/logo_back.png"
                                                                    alt="Free HTML5 Bootstrap Website Template"></a>
        </h1>
        <nav id="fh5co-main-menu" role="navigation">
            <ul>
                <li><a href="${basePath}school/index.do">学校简介</a></li>
                <li class="fh5co-active"><a href="${basePath}school/photo/libraryUI.do">学校图片库</a></li>
                <li><a href="${basePath}school/corridor_3dvisitUI.do">3D走廊游览</a></li>
                <li><a href="${basePath}school/fly_3dvisitUI.do">3D模拟飞行游览</a></li>
                <li><a href="${basePath}school/bigban_visitUI.do">BigBan</a></li>
                <li><a href="${basePath}school/photo/uploadUI.do">我要上传到照片</a></li>
                <li><a href="${basePath}school/more_prjUI.do">正在开发中的项目</a></li>

            </ul>
        </nav>

        <div class="fh5co-footer">
            <p>
                <small>&copy; 2016 ShenTong workspace All Rights Reserved.</small>
            </p>
            <ul>
                <li><a href="#"><i class="icon-facebook"></i></a></li>
                <li><a href="#"><i class="icon-twitter"></i></a></li>
                <li><a href="#"><i class="icon-instagram"></i></a></li>
                <li><a href="#"><i class="icon-linkedin"></i></a></li>
            </ul>
        </div>

    </aside>


    <div id="fh5co-main">

        <div class="fh5co-narrow-content animate-box fh5co-border-bottom" data-animate-effect="fadeInLeft">
            <h2 class="fh5co-heading">${detail_photo.photoTitle}</h2>
            <p>
            <p>
                ${detail_photo.photoIntroduction}
            </p></p>

            <div class="row">
                <div class="col-md-12">
                    <figure><img src="${picPath}${detail_photo.photoOssname}"
                                 alt="Free HTML5 Bootstrap Template by FreeHTML5.co" class="img-responsive"></figure>
                </div>

                <div class="col-md-12">
                    <p class="text-center">
                        <c:if test="${userPhoto.upState==null}">

                            <a href="${basePath}user/photo/vote.do?photoId=${detail_photo.photoId}"
                               class="btn btn-primary btn-outline">赞一个</a>
                        </c:if>

                        <c:if test="${userPhoto.upState==1}">
                            <a href="${basePath}user/photo/vote/cancel.do?photoId=${detail_photo.photoId}"
                               class="btn btn-primary btn-outline">取消点赞</a>
                        </c:if>
                        <c:if test="${userPhoto.upState==0}">

                            <a href="${basePath}user/photo/revote.do?photoId=${detail_photo.photoId}"
                               class="btn btn-primary btn-outline">赞一个</a>
                        </c:if>

                    </p>
                </div>

                <div class="row">


                    <div class="col-md-2">
                        <a class="btn btn-outline">浏览数:${detail_photo.photoViewNum}</a>
                    </div>

                    <div class="col-md-2">
                        <a class="btn btn-outline">点赞数:${detail_photo.photoLikeNum}</a>
                    </div>


                </div>


            </div>

        </div>


        <div class="fh5co-narrow-content">
            <div class="row">
                <div class="col-md-4 animate-box" data-animate-effect="fadeInLeft">
                    <h1 class="fh5co-heading-colored">评论列表</h1>
                </div>
            </div>

            <c:if test="${pageResult!=null}">
                <c:forEach var="discussion" items="${pageResult.list}">
                    <div class="row">
                        <div class="col-md-12 animate-box" data-animate-effect="fadeInLeft">
                                第${discussion.disFloorNum}楼
                            <p style="text-align: right">发表时间:${discussion.disCreateTime}</p>
                            <p class="fh5co-lead">${discussion.disContent}</p>
                            <hr>

                            <p><a class="btn btn-primary">发表人：${discussion.creator.userName}</a></p>
                        </div>
                    </div>
                </c:forEach>
            </c:if>
            <script type="text/javascript">
                //翻页
                function doGoPage(pageNum) {
                    document.getElementById("pageNum").value = pageNum;
                    document.forms[0].action = "${request.getContextPath}/school/photo/detail.do?photoId=${detail_photo.photoId}";
                    document.forms[0].submit();
                }
            </script>
            <jsp:include page="/common/pageNavigator.jsp"/>


            <form action="/discussion/submission.do" role="form">

                <div class="form-group">
                    <label class="control-label">评论</label>
                    <textarea class="form-control" placeholder="说点什么吧..." name="disContent"></textarea>
                </div>
                <input hidden name="photoId" value="${detail_photo.photoId}">
                <input hidden name="userId" value="${user.userId}">
                <button type="submit" class="btn btn-default">提交</button>
            </form>


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

