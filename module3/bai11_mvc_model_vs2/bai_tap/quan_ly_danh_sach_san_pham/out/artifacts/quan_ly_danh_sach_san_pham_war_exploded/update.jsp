<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 5/13/2021
  Time: 5:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Update Product</h1>
<a href="/">Back to home product</a>
<form method="post">
    <p>Name Product:
        <input type="text" name="nameProduct" value="${product.nameProduct}">
    </p>
    <p>Price:
        <input type="text" name="priceProduct" value="${product.priceProduct}">
    </p>
    <input type="submit" value="Update Product">
</form>
</body>
</html>
