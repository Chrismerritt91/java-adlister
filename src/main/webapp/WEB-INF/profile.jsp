<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Your Profile"/>
    </jsp:include>
</head>
<body>
<jsp:include page="../partials/navbar.jsp"/>

<div class="container">
    <h1>Welcome back, ${name}!</h1>
</div>
<br>
<h3>Logout</h3>
<form action="/profile" method="post">
        <select name="logout" id="logout">
            <option value="yes">yes</option>
            <option value="no">no</option>
        </select>
        <button>Submit</button>
</form>


</body>
</html>
