<%--
  Created by IntelliJ IDEA.
  User: chrismerritt
  Date: 7/8/22
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<form action="/login" method="POST">
    <label for="login">User Login</label>
    <input type="text" id="login" name="login" placeholder="username">
    <label for="password">Password</label>
    <input type="password" id="password" name="password" placeholder="password">
    <button>Submit</button>
</form>

</body>
</html>
