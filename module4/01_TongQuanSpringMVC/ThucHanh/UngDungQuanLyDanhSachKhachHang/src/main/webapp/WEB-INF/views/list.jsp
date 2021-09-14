<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="java.util.List" %>
<%@ page import="controllers.model.Customer" %>
<%@ page import="controllers.service.CustomerService" %>
<%@ page import="controllers.service.CustomerServiceFactory" %>
<%!
    private CustomerService customerService = CustomerServiceFactory.getInstance();
%>
<%
    long count = customerService.count();
    List<Customer> customers = customerService.findAll();
%>
<style>
    table {
        border: 1px solid #000;
    }

    th, td {
        border: 1px dotted #555;
    }
</style>
<%--There are <%= count %> customer(s) in list.--%>
There are ${requestScope.customers.size()} customer(s) in list.
<table>
    <caption>Customers List</caption>
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    </thead>
<%--    <tbody>--%>
<%--    <% for (Customer c : customers) { %>--%>
<%--    <tr>--%>
<%--        <td>--%>
<%--            <%= c.getId() %>--%>
<%--        </td>--%>
<%--        <td>--%>
<%--            <a href="info.jsp?id=<%= c.getId() %>"><%= c.getName() %></a>--%>
<%--        </td>--%>
<%--        <td>--%>
<%--            <%= c.getEmail() %>--%>
<%--        </td>--%>
<%--        <td>--%>
<%--            <%= c.getAddress() %>--%>
<%--        </td>--%>
<%--    </tr>--%>
<%--    <% } %>--%>
<%--    </tbody>--%>

    <c:forEach var="c" items="${requestScope.customers}">
        <tr>
            <td>
                <c:out value="${c.id}"/>
            </td>
            <td>
                <a href="info.jsp?id=${c.id}">${c.name}</a>
            </td>
            <td>
                <c:out value="${c.email}"/>
            </td>
            <td>
                <c:out value="${c.address}"/>
            </td>
        </tr>
    </c:forEach>
</table>