<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 8/10/2021
  Time: 2:52 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
<h1>Simple Calculator</h1>
<form action="/calculator" method="post">
    <table>
        <tr>
            <td>First operand:</td>
            <td>
                <input type="text" name="first">
            </td>
        </tr>
        <tr>
            <td>Operator:</td>
            <td>
                <select name="operator" >
                    <option value="+">Addition</option>
                    <option value="-">Subtration</option>
                    <option value="*">Mutiplication</option>
                    <option value="/">Division</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Second operand:</td>
            <td>
                <input type="text" name="second">
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" value="calculator">
            </td>
        </tr>
    </table>
</form>

</body>
</html>
