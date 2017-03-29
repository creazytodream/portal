<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/22
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>登陆</title>
    <meta name="keywords" content="HTML5模版,Bootstrap模版,Bootstrap后台模版,Bootstrap网站后台,Bootstrap3模版,Bootstrap后台管理系统模版,Bootstrap主题" />
    <meta name="description" content="JS代码网提供HTML5模版,Bootstrap模版,Bootstrap后台模版下载">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <%@include file="/WEB-INF/include/taglib.jsp" %>
    <%@ include file="/WEB-INF/include/css.jsp" %>
    <%@ include file="/WEB-INF/include/js.jsp" %>
</head>
<body>
<div class="container-fluid">
    <div class="row-fluid">

        <div class="row-fluid">
            <div class="span12 center login-header">
                <h2>欢迎使用图书管理系统</h2>
            </div>
        </div>

        <div class="row-fluid">
            <div class="well span5 center login-box">
                <div class="alert alert-info">
                    请输入你的用户名和密码.
                </div>
                <form class="form-horizontal" action="${ctx}/index/index.do" method="post">
                    <fieldset>
                        <div class="input-prepend" title="Username" data-rel="tooltip">
                            <span class="add-on"><i class="icon-user"></i></span><input autofocus class="input-large span10" name="username" id="username" type="text" value="admin" />
                        </div>
                        <div class="clearfix"></div>

                        <div class="input-prepend" title="Password" data-rel="tooltip">
                            <span class="add-on"><i class="icon-lock"></i></span><input class="input-large span10" name="password" id="password" type="password" value="admin123456" />
                        </div>
                        <div class="clearfix"></div>

                        <div class="input-prepend">
                            <label class="remember" for="remember"><input type="checkbox" id="remember" />记住密码</label>
                        </div>
                        <div class="clearfix"></div>

                        <p class="center span5">
                            <button type="submit" class="btn btn-primary">登录</button>
                        </p>
                    </fieldset>
                </form>
            </div><!--/span-->
        </div><!--/row-->
    </div><!--/fluid-row-->

</div>

</body>

</html>
