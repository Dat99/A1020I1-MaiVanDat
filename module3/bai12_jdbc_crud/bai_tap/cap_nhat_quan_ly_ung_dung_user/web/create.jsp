<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 5/21/2021
  Time: 6:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
  <title>User Management </title>
</head>
<body>

  <h1>User Management</h1>
  <h2>
    <a href="/user">List All Users</a>
  </h2>

<div align="center">
  <form method="post">
    <table border="1" cellpadding="5">
      <caption>
        <h2>Add New User</h2>
      </caption>
      <tr>
        <th>User Name:</th>
        <td>
          <input type="text" name="name" />
        </td>
      </tr>
      <tr>
        <th>User Email:</th>
        <td>
          <input type="text" name="email" />
        </td>
      </tr>
      <tr>
        <th>Country:</th>
        <td>
          <input type="text" name="country"/>
        </td>
      </tr>
      <tr>
        <td>
          <input type="submit" value="Save"/>
        </td>
      </tr>
    </table>
  </form>
</div>
</body>
</html>
