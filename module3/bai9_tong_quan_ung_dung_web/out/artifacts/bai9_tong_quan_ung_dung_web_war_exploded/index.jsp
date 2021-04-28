

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
