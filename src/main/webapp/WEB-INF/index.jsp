<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/21
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/include/taglib.jsp" %>
<%@include file="/WEB-INF/include/taglib.jsp" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<center><h2><a href="${ctx}/users/list.do">查看学生</a></h2><br/><br>
    <a href="${ctx}/view/pdf.do" target="blank">保存pdf</a>
    <input name="button" type="button" id="button" value="保存excel"
           onclick="javascript:window.open('${ctx}/view/excel.do');"/>
</center>
</body>
</html>
