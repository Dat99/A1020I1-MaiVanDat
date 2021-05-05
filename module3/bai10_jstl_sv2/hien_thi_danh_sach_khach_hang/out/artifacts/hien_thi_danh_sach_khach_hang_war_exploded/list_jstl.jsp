<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 5/5/2021
  Time: 2:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Danh sách khách hàng</h2>
<table border="1">
    <tr>
        <th>STT</th>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>
    <c:forEach var="customer" items="${customerListServlet}" varStatus="loop">
        <tr>
            <td>${loop.index +1}</td>
            <td><c:out value="${customer.name}"/></td>
            <td><c:out value="${customer.dateOfBirth}"/></td>
            <td><c:out value="${customer.address}"/></td>
            <td><img src="Images/dat.jpg" style="width: 50px; height: 50px"></td>
        </tr>

    </c:forEach>
</table>

</body>
</html>
