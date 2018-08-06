<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/31 0031
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet"
          href="<%=request.getContextPath() %>/EasyUI/themes/default/easyui.css" type="text/css"/>
    <!-- 引入EasyUI的图标样式文件-->
    <link rel="stylesheet"
          href="<%=request.getContextPath() %>/EasyUI/themes/icon.css" type="text/css"/>
</head>
<body>

<table id="dgdrug"></table>




<script type="text/javascript">
    $(function(){
        searchss()
    })
    function searchss(){
        $("#dgdrug").datagrid({
            url:"<%=request.getContextPath()%>/con/querycarlist",
            checkOnSelect:false,
            selectOnCheck:false,
            singleSelect:true,
            pagination:true,//开启分页
            pageNumber:1,//初始化页码
            pageSize:2,//每页条数
            pageList:[2,3,5,8],//每页条数的下拉选项

            columns:[[
                {field:'userchek',checkbox:true},
                {field:'cid',title:'编号',width:100},
                {field:'cbrand',title:'汽车类型 ',width:100},
                {field:'cname',title:'汽车名称 ',width:100},



            ]]
        });
    }
</script>


<!-- 引入JQuery -->
<script type="text/javascript"
        src="<%=request.getContextPath() %>/EasyUI/jquery.min.js"></script>

<!-- 引入EasyUI -->
<script type="text/javascript"
        src="<%=request.getContextPath() %>/EasyUI/jquery.easyui.min.js"></script>

<!-- 引入EasyUI的中文国际化js，让EasyUI支持中文 -->
<script type="text/javascript"
        src="<%=request.getContextPath() %>/EasyUI/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript"
        src="<%=request.getContextPath() %>/EasyUI/util-js.js"></script>

</body>
</html>
