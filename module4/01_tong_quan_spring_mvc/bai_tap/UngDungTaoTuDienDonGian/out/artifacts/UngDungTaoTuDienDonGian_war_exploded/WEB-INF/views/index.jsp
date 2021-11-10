<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 9/14/2021
  Time: 8:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary</title>
  </head>
  <body>
  <form action="/dictionary", method="get">
    <h1>Nhập từ vựng cần tìm:</h1>
    <input type="text", name="search", id="input"> <br><br>
    <input type="submit" value="Tìm kiếm">
  </form>
  <label>Kết quả: ${result}</label>
  </body>
</html>
