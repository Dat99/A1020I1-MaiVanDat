<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 5/12/2021
  Time: 5:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <p>Name:
        <input type="text"  name="name">
    </p>
    <p>Email:
        <input type="text"  name="email">
    </p>
    <p>Address:
        <input type="text"  name="address">
    </p>
    <input type="submit" value="Submit">
</form>
<p><c:out value="${msg}"/>
</p>

</body>
</html>
