<%--
  Created by IntelliJ IDEA.
  User: nayst
  Date: 2023/2/2
  Time: 09:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>web01</title>
</head>
<body>
    <form action="add" method="post">
        名称：<input type="text" name="name"/><br/>
        价格：<input type="text" name="price"/><br/>
        库存：<input type="text" name="count"/><br/>
        备注：<input type="text" name="remark"/><br/>
        <input type="submit" value="添加">
    </form>
</body>
</html>
