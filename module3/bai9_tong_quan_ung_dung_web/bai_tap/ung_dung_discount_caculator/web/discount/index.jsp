<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 8/4/2021
  Time: 7:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Caculator</title>
  </head>
  <body>
  <h2> Product Discount Calculator</h2>
  <form action="discount" method="post">
    <label>Product Description:</label>0
    <br>
    <input type="text" placeholder="Product Description" />
    <br>
    <label>List Price: </label>
    <br>
    <input type="text"name="price" placeholder="List Price"/>
    <br>
    <label>Discount Percent: </label>
    <br>
    <input type="text" name="percent" placeholder="Discount Percent "/>
    <br>
    <input type="submit" value="Calculate Discount">
  </form>
  </body>
</html>
