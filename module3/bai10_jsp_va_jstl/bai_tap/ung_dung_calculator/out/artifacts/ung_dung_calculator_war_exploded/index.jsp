<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 5/21/2021
  Time: 3:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/calculator">
    <p>First Operand:
        <input type="text" name="first_operand"></p>
    <p>Operator:
        <select name="operator">
            <option value="+">Cộng</option>
            <option value="-">Trừ</option>
            <option value="*">Nhân</option>
            <option value="/">Chia</option>
        </select>
    </p>
    <p>Second Operand:
        <input type="text" name="second_operand">
    </p>
    <input type="submit" value="Calculate">
</form>

</body>
</html>
