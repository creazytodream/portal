<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- topbar starts -->
<div class="navbar">
    <div class="navbar-inner">
        <div class="container-fluid">
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>
            <a class="brand" href="index.html"> <img alt="Charisma Logo" src="${ctx}/resources/components/img/logo20.png" /> <span>Admin</span></a>

            <!-- theme selector starts -->
            <div class="btn-group pull-right theme-container" >
                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                    <i class="icon-tint"></i><span class="hidden-phone"> 修改主题</span>
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu" id="themes">
                    <li><a data-value="classic" href="#"><i class="icon-blank"></i> 经典</a></li>
                    <li><a data-value="cerulean" href="#"><i class="icon-blank"></i> Cerulean</a></li>
                    <li><a data-value="cyborg" href="#"><i class="icon-blank"></i> Cyborg</a></li>
                    <li><a data-value="redy" href="#"><i class="icon-blank"></i> 中国红</a></li>
                    <li><a data-value="journal" href="#"><i class="icon-blank"></i> Journal</a></li>
                    <li><a data-value="simplex" href="#"><i class="icon-blank"></i> 简洁</a></li>
                    <li><a data-value="slate" href="#"><i class="icon-blank"></i> Slate</a></li>
                    <li><a data-value="spacelab" href="#"><i class="icon-blank"></i> 太空</a></li>
                    <li><a data-value="united" href="#"><i class="icon-blank"></i> United</a></li>
                </ul>
            </div>
            <!-- theme selector ends -->

            <!-- user dropdown starts -->
            <div class="btn-group pull-right" >
                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                    <i class="icon-user"></i><span class="hidden-phone"> admin</span>
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                    <li><a href="#">个人信息</a></li>
                    <li class="divider"></li>
                    <li><a href="login.html">退出</a></li>
                </ul>
            </div>
            <!-- user dropdown ends -->


        </div>
    </div>
</div>

</body>
</html>
