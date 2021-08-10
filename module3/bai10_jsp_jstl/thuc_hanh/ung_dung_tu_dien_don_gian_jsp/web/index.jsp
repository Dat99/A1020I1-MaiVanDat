<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 8/9/2021
  Time: 8:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      .form{
        display: inline-block;
      }
    </style>
  </head>
  <body>
  <h1>VietNam Dictionary</h1>
  <form method="post" action="dictionary/dictionary.jsp" class="form">
    <input type="text" name="search" placeholder="Enter your word:">
    <input type="submit" value="Submit">
  </form>
  </body>
</html>
