<%--
  Created by IntelliJ IDEA.
  User: chrismerritt
  Date: 7/13/22
  Time: 1:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="cookies"/>
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp"/>
<%--you can do it this way or use param.name, and you dont have to set attribute or get parameter--%>
<%--<c:if test="${not empty name}">--%>
<%--    <h2>Hi, ${name}</h2>--%>
<%--</c:if>--%>
<form action="/cookies" method="post">
    <ul>
        <li>
            <label for="name">What is your name</label>
            <input type="text" name="name" id="name">
        </li>
        <li>
            <label for="favorite">What is your favorite cookie?</label>
            <input type="text" name="favorite" id="favorite">
        </li>
    </ul>
    <button>Submit</button>
</form>
</body>
</html>
