<%--
  Created by IntelliJ IDEA.
  User: chrismerritt
  Date: 7/15/22
  Time: 12:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Authors"/>
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp"/>
<c:forEach var="authors" items="${authors}">
    <p>${authors.author_name}</p>
</c:forEach>
</body>
</html>
