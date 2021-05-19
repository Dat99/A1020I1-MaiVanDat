<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 5/13/2021
  Time: 4:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create Product</h1>
<a href="/">Back to home product</a>
<form action="/?action=create" method="post">
    <p>ID:
        <input type="text" name="id" id="id">
    </p>
    <p>Name Product:
        <input type="text" name="nameProduct" id="nameProduct">
    </p>
    <p>Price:
        <input type="text" name="priceProduct" id="priceProduct">
    </p>
    <input type="submit" value="Create Product">
</form>

</body>
</html>
