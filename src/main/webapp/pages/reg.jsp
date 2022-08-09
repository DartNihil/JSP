<%--
  Created by IntelliJ IDEA.
  User: valen
  Date: 08.08.2022
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/registration" method="post">
    Name:<input type="text" name="name" /><br/>
    Email ID:<input type="text" name="email" /><br/>
    Password:<input type="password" name="pass" /><br/>
    <input type="submit" value="register" />
</form>
</body>
</html>
