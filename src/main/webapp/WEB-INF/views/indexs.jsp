<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/21
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/include/taglib.jsp" %>
<html>
<head>
    <title>首页</title>
    <script type="text/javascript" src="${ctx}/resources/comments/jquery/jquery.js"></script>
</head>
<script type="text/javascript">
    $(document).ready(function(){
        $("#exec").click(function(){
            //获取下拉框的值
            var titlesValue = "";//$("#columns").find("option:selected").text();
            $("#columns").find("option:selected").each(function(){ //由于复选框一般选中的是多个,所以可以循环输出
                titlesValue += ($(this).text())+",";
            });
            var names =  $("#columns").val();
            $("#colums").val(names);
            $("#titles").val(titlesValue);
        });
    });

</script>
<body>
<center><h2><a href="${ctx}/users/list.do">查看学生</a><br>
    &nbsp;&nbsp; &nbsp;
    <div style="border: 1px solid #ccc; width: 50%;height:200px;align:center;margin-top:200px;margin-left:300px;padding:50px;">
        <form action="${ctx}/view/excel.do" method="post">
            <input type="submit" value="使用POI导出Excel"><br>
        </form>
        <hr><br>
        <form method="post" action="${ctx}/view/jxlExcel.do">
            <select id="columns" multiple="multiple" style="width:100px;height:120px;">
                <option value="id">ID</option>
                <option value="name">姓名</option>
                <option value="sex">性别</option>
                <option value="age">年龄</option>
                <option value="password">密码</option>
                <option value="address">地址</option>
            </select>
            <input type="hidden" id="titles" name="titles">
            <input type="hidden" id="colums" name="colums">
            <input type="submit" id="exec" value="使用JXL导出Excel"><br>
        </form>
        <hr><br>
        <form action="${ctx}/view/pdf.do" method="post">
            <input type="submit" value="导出PDF"><br>
            <br>
            <img src="${ctx}/img/car.do" width="100px" height="50px"/>
        </form>
    </div>
</h2>
<br/>
    <form id="questionTypesManage"  method="post" enctype="multipart/form-data">
        选择文件：　<input id="uploadExcel" name="uploadExcel" class="easyui-filebox" style="width:200px" data-options="prompt:'请选择文件...'">

        　　<a href="#" class="easyui-linkbutton" style="width:122px" onclick="uploadExcel()" >导入题库</a> 　　     　　　　　

    </form>

</center>
</body>
</html>
