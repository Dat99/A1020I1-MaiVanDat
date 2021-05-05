<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 5/5/2021
  Time: 1:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/discount" method="post">
    <p>
      List Price:
      <input type="text" name="listPrice" />
    </p>
    <p>
      Discount Percent:
      <input type="text" name="discountPercent"/>
    </p>
    <input type="submit" value="discountAmount"/>
  </form>

  <h1><%=request.getAttribute("discountAmount")%></h1>


  </body>
</html>
