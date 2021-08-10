<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <title>Danh sách khách hàng</title>mà
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/static/css/bootstrap.css">
</head>
<body>
<h1>Danh sách khách hàng</h1>
<table border="1">
    <thead>
    <tr style="text-align: center">
        <th>STT</th>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="customer" items="${customerList}" varStatus="loop">
    <tr>
        <td>
            <c:out value="${loop.index+1}"/>
        </td>
        <td>
            <c:out value="${customer.name}"/>
        </td>
        <td>
            <c:out value="${customer.date_of_birth}"/>
        </td>
        <td>
            <c:out value="${customer.address}"/>
        </td>
        <td>
            <img src="/static/images/${customer.image}" width="50" height="50"/>
        </td>
<%--        <td>--%>
<%--            <img src="<c:out value="${customer.image}"/>" width="50" height="50"/>--%>
<%--        </td>--%>
    </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>

