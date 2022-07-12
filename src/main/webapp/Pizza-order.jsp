<%--
  Created by IntelliJ IDEA.
  User: chrismerritt
  Date: 7/11/22
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Build Pizza</title>
</head>
<body>
<form action="/pizza-order" method="post">
    <label for="crust">Crust</label>
    <select name="crust" id="crust">
        <option value="thin-crust">Thin crust</option>
        <option value="hand-tossed">Hand Tossed</option>
        <option value="deep-dish">Deep Dish</option>
    </select>
    <br>
    <label for="sauce">Sauce</label>
    <select name="sauce" id="sauce">
        <option value="traditional">Traditional</option>
        <option value="white-sauce">White Sauce</option>
        <option value="light-sauce">Light sauce</option>
    </select>
    <br>
    <label for="size">Size</label>
    <select name="size" id="size">
        <option value="personal">Personal</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select>
    <br>
    <h4>Toppings</h4>
    <label for="pepperoni"><input type="checkbox" name="toppings" value="pepperoni" id="pepperoni">Pepperoni</label>
    <label for="sausage"><input type="checkbox" name="toppings" value="sausage" id="sausage">Sausage</label>
    <label for="bacon"><input type="checkbox" name="toppings" value="bacon" id="bacon">Bacon</label>
    <label for="peppers"><input type="checkbox" name="toppings" value="peppers" id="peppers">Peppers</label>
    <label for="extra-cheese"><input type="checkbox" name="toppings" value="extra-cheese" id="extra-cheese">Extra-cheese</label>
    <br>
    <label for="address">Enter address</label>
    <input type="text" name="address" id="address" placeholder="Enter Address">
    <button>Place Order</button>
</form>

</body>
</html>
