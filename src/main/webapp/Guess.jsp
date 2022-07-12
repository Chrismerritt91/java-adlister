<%--
  Created by IntelliJ IDEA.
  User: chrismerritt
  Date: 7/12/22
  Time: 9:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess a number</title>
</head>
<body>

<form action="/guess" method="post">
  <label for="guess">Pick a number between 1 and 3:</label>
  <br>
  <input type="number" name="guess" id="guess" placeholder="1-3">
  <br>
  <button>Submit</button>

</form>


</body>
</html>
