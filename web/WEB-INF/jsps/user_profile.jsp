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
    <title>Blend &mdash; Free HTML5 Bootstrap Website Template by FreeHTML5.co</title>
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

    <link href='https://fonts.googleapis.com/css?family=Roboto:400,300,600,400italic,700' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>

    <!-- Animate.css -->
    <link rel="stylesheet" href="${basePath}lib_two/css/animate.css">
    <!-- Icomoon Icon Fonts-->
    <link rel="stylesheet" href="${basePath}lib_two/css/icomoon.css">
    <!-- Bootstrap  -->
    <link rel="stylesheet" href="${basePath}lib_two/css/bootstrap.css">


    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">

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

<script type="text/javascript" language="JavaScript">
    function changeGender() {
        var val=$('input:radio[name="gender"]:checked').val();
        alert(val);
        document.forms[2].action = "${basePath}user/update.do";
        document.forms[2].submit();

    }

</script>

<div id="fh5co-page">

    <a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle"><i></i></a>
    <aside id="fh5co-aside" role="complementary" class="border">

        <h1 id="fh5co-logo"><a href="${basePath}home/index.do"><img src="${basePath}lib_one/images/logo_back.png"
                                                      alt="Free HTML5 Bootstrap Website Template"></a></h1>
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
            <p>
                <small>&copy; 2016 Blend Free HTML5. All Rights Reserved.</span> More Templates <a
                        href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a
                        href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></small>
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


        <div class="section">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="page-header">
                            <h1>账户信息
                                <small>- ${sessionScope.user.userEmail}</small>
                            </h1>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="section">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <ul class="media-list">
                            <li class="media">
                                <div class="media-body">
                                    <h4 class="media-heading"></h4>
                                    <p>
                                        <span class="glyphicon glyphicon-tag"
                                              style="color: rgb(159, 192, 100); font-size: 29px;"></span>&nbsp;昵称: ${sessionScope.user.userName}
                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        <!--
                                        按钮触发模态框 -->
                                        <button class="btn btn-primary btn-sm" data-toggle="modal"
                                                data-target="#changeName">修改
                                        </button>
                                        <!-- 模态框（Modal） -->
                                    </p>
                                    <form id="changeNameForm" action="${basePath}user/update.do" method="post">
                                        <div class="modal fade" id="changeName" tabindex="-1" role="dialog"
                                             aria-labelledby="changeName" aria-hidden="true">
                                            <div class="modal-dialog">
                                                <div class="modal-content">
                                                    <div class="modal-header">
                                                        <button type="button" class="close" data-dismiss="modal"
                                                                aria-hidden="true">×
                                                        </button>
                                                        <h4 class="modal-title" id="myModalLabel">修改昵称</h4>
                                                    </div>
                                                    <div class="modal-body">
                                                        <div class="form-group">
                                                            <label class="control-label" for="newName">新昵称</label>
                                                            <input class="form-control" id="newName" name="userName"
                                                                   placeholder="输入新昵称" type="text">
                                                            <input hidden name="userId" value="${sessionScope.user.userId}">
                                                        </div>
                                                    </div>
                                                    <div class="modal-footer">
                                                        <button type="button" class="btn btn-default"
                                                                data-dismiss="modal">关闭
                                                        </button>

                                                        <button type="submit" class="btn btn-primary">提交更改</button>
                                                    </div>
                                                </div>
                                                <!-- /.modal-content -->
                                            </div>
                                            <!-- /.modal -->
                                        </div>
                                    </form>
                                    <p></p>
                                </div>
                            </li>
                            <li class="media">
                                <div class="media-body">
                                    <h4 class="media-heading"></h4>
                                    <p>
                                        <span class="glyphicon glyphicon-user"
                                              style="color: rgb(159, 192, 100); font-size: 29px;"></span>&nbsp;账号: ${sessionScope.user.userEmail}
                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    </p>
                                </div>
                            </li>
                            <li class="media">
                                <div class="media-body">
                                    <h4 class="media-heading"></h4>
                                    <p>
                                        <span class="glyphicon glyphicon-picture"
                                              style="color: rgb(159, 192, 100); font-size: 29px;"></span>&nbsp;我的头像：
                                        <br>
                                        <br>
                                        <img class="media-object" src="${basePath}lib_one/images/hafo-05.jpeg"
                                             height="64" width="64">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        <!--
                                        按钮触发模态框 -->
                                        <button class="btn btn-primary btn-sm" data-toggle="modal"
                                                data-target="#changeImg">更换头像
                                        </button>
                                        <!-- 模态框（Modal） -->
                                    </p>
                                    <!--头像功能涉及文件上传，暂时不做-->
                                    <form action="#" method="post">
                                        <div class="modal fade" id="changeImg" tabindex="-1" role="dialog"
                                             aria-labelledby="changeImg" aria-hidden="true">
                                            <div class="modal-dialog">
                                                <div class="modal-content">
                                                    <div class="modal-header">
                                                        <button type="button" class="close" data-dismiss="modal"
                                                                aria-hidden="true">×
                                                        </button>
                                                        <h4 class="modal-title" id="myModalLabel1">新头像</h4>
                                                    </div>
                                                    <div class="modal-body">
                                                        <div class="form-group">
                                                            <label class="control-label" for="newImg">选择新头像</label>
                                                            <input class="form-control" id="newImg" type="file">
                                                            <input hidden name="userId" value="${sessionScope.user.userId}">
                                                        </div>
                                                    </div>
                                                    <div class="modal-footer">
                                                        <button type="button" class="btn btn-default"
                                                                data-dismiss="modal">关闭
                                                        </button>
                                                        <button type="button" class="btn btn-primary">提交更改</button>
                                                    </div>
                                                </div>
                                                <!-- /.modal-content -->
                                            </div>
                                            <!-- /.modal -->
                                        </div>
                                    </form>
                                    <p></p>
                                </div>
                            </li>
                            <li class="media">
                                <div class="media-body">
                                    <h4 class="media-heading"></h4>
                                    <p>
                                        <span class="glyphicon glyphicon-bookmark"
                                              style="color: rgb(159, 192, 100); font-size: 29px;"></span>&nbsp;性别:
                                        <c:choose>
                                            <c:when test="${sessionScope.user.gender==null}">
                                                请填写性别哦，亲~~~不然成人妖了哦
                                            </c:when>
                                            <c:when test="${sessionScope.user.gender==1}">
                                                男
                                            </c:when>
                                            <c:otherwise>
                                                女
                                            </c:otherwise>
                                        </c:choose>
                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        <!--
                                        按钮触发模态框 -->
                                        <button class="btn btn-primary btn-sm" data-toggle="modal"
                                                data-target="#myModal2">修改
                                        </button>
                                        <!-- 模态框（Modal） -->
                                    </p>
                                    <form method="post">
                                    <div class="modal fade" id="myModal2" tabindex="-1" role="dialog"
                                         aria-labelledby="myModalLabel" aria-hidden="true">
                                        <div class="modal-dialog">
                                            <div class="modal-content">
                                                <div class="modal-header">
                                                    <button type="button" class="close" data-dismiss="modal"
                                                            aria-hidden="true">×
                                                    </button>
                                                    <h4 class="modal-title" id="myModalLabel2">请选择</h4>
                                                </div>
                                                <div id="userGender" class="modal-body">

                                                    <div class="radio">
                                                        <label>
                                                            <input type="radio" name="gender" id="optionsRadios1"
                                                                   value="0" checked>女
                                                        </label>
                                                    </div>
                                                    <div class="radio">
                                                        <label>
                                                            <input type="radio" name="gender" id="optionsRadios2"
                                                                   value="1">男
                                                        </label>
                                                    </div>
                                                    <input hidden name="userId" value="${sessionScope.user.userId}">
                                                </div>
                                                <div class="modal-footer">
                                                    <button type="button" class="btn btn-default" data-dismiss="modal">
                                                        关闭
                                                    </button>
                                                    <button type="button" onclick="changeGender()" class="btn btn-primary">提交更改</button>
                                                </div>
                                            </div>
                                            <!-- /.modal-content -->
                                        </div>
                                        <!-- /.modal -->
                                    </div>
                                    </form>
                                    <p></p>
                                </div>
                            </li>
                            <li class="media">
                                <div class="media-body">
                                    <h4 class="media-heading"></h4>
                                    <p>
                                        <span class="glyphicon glyphicon-star"
                                              style="color: rgb(159, 192, 100); font-size: 29px;"></span>&nbsp;积分: 230
                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    </p>
                                </div>
                            </li>
                            <li class="media">
                                <div class="media-body">
                                    <h4 class="media-heading"></h4>
                                </div>
                            </li>
                        </ul>
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

