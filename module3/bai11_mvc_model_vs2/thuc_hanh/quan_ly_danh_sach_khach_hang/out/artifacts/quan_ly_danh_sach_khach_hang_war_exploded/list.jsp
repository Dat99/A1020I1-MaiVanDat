<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 5/12/2021
  Time: 4:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>List Customer</title>
</head>
<body>
<h2>List Customer</h2>
<table border="1", style="margin-left: auto; margin-right: auto">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["customerList"]}' var="customer">
        <tr>
            <td>${customer.getId()}</td>
            <td><a href="/customer?actionCustomer=view&id=${customer.getId()}">${customer.getName()}</a></td>
            <td>${customer.getEmail()}</td>
            <td>${customer.getAddress()}</td>
            <td><a href="/customer?actionCustomer=edit&id=${customer.getId()}">edit</a></td>
            <td><a href="/customer?actionCustomer=delete&id=${customer.getId()}">delete</a></td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
