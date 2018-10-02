<%--
  Created by IntelliJ IDEA.
  User: Mateusz
  Date: 2018-10-02
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Lista kontaktów</title>
</head>
<body>
<h1 align="center">Moja lista kontaktów</h1>
<table align="center" border="1" cellpadding="10">
    <tr>
        <th>Imię i nazwisko</th>
        <th>Email</th>
        <th>Kraj</th>
    </tr>
    <c:forEach items="${contactList}" var="contact">
        <tr>
            <td>${contact.name}</td>
            <td>${contact.email}</td>
            <td>${contact.country}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
