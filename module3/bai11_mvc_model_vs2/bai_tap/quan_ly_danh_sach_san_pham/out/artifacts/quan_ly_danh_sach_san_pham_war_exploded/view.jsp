<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 5/13/2021
  Time: 4:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>View Product</h1>
<a href="/?action=create">Create Product</a>
<table border="1" style="text-align: center">
    <tr>
        <th>No</th>
        <th>ID</th>
        <th>Name Product</th>
        <th>Price Product</th>
        <th>Action</th>
    </tr>
    <c:forEach var="product" items="${products}" varStatus="loop">
        <tr>
            <td>${loop.index + 1}</td>
            <td><c:out value="${product.id}"/></td>
            <td><c:out value="${product.name}"/></td>
            <td><c:out value="${product.price}"/></td>

            <td>
                <a href="/?action=update&id=${product.getId()}">Edit | </a>
                <a href="/?action=delete&id=${product.getId()}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
