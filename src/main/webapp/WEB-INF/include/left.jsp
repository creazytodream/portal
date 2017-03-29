<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/23
  Time: 8:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<div class="container-fluid">
    <div class="row-fluid">
        <!-- left menu starts -->
        <div class="span2 main-menu-span">
            <div class="well nav-collapse sidebar-nav">
                <ul class="nav nav-tabs nav-stacked main-menu">
                    <li class="nav-header hidden-tablet">Main</li>
                    <li><a class="ajax-link" href="${ctx}/index/index.do"><i class="icon-home"></i><span class="hidden-tablet"> 首页</span></a></li>
                    <li><a class="ajax-link" href="ui.html"><i class="icon-list-alt"></i><span class="hidden-tablet"> 图书管理</span></a></li>
                    <li><a href="login.html"><i class="icon-wrench"></i><span class="hidden-tablet"> 设置</span></a></li>
                    <li><a class="ajax-link" href="form.html"><i class="icon-edit"></i><span class="hidden-tablet"> 表单</span></a></li>
                    <li><a class="ajax-link" href="chart.html"><i class="icon-list-alt"></i><span class="hidden-tablet">权限管理</span></a></li>
                    <li><a class="ajax-link" href="typography.html"><i class="icon-font"></i><span class="hidden-tablet"> 文字排版</span></a></li>
                    <li><a class="ajax-link" href="gallery.html"><i class="icon-picture"></i><span class="hidden-tablet"> 相册</span></a></li>
                         </ul>
                <label id="for-is-ajax" class="hidden-tablet" for="is-ajax"><input id="is-ajax" type="checkbox"> Ajax菜单</label>
            </div><!--/.well -->
        </div><!--/span-->
        <!-- left menu ends -->


</body>
</html>
