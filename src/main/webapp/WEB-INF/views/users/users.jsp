<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/21
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../include/taglib.jsp" %>
<html>
<head>
    <title>用戶列表</title>
</head>
<body>
<center>
    <table>
        <tr>
            <td>ID</td>
            <td>名字</td>
            <td>性别</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${users}" var="user">

            <tr>
                <td>${user.id}</td>
                <td>${user.uname}</td>
                <td>${user.sex}</td>
                <td><a href="${ctx}/users/delete.do?id=${user.id}">删除</a>&nbsp;&nbsp;&nbsp;
                    <a href="${ctx}/users/get.do?id=${user.id}">详情</a></td>
            </tr>
        </c:forEach>

    </table>
</center>
</body>
</html>
