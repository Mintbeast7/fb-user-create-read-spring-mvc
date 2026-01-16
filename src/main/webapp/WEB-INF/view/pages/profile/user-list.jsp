<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NextGen | Confirmation</title>
</head>

<body>

    <h2>User Confirmation Details</h2>

    <table border="1" cellpadding="8" cellspacing="0">
    <tr>
        <th>User ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
        <th>Mobile</th>
        <th>Location</th>
    </tr>

    <c:forEach var="user" items="${allUsers}">
        <tr>
            <td>${user.id}</td>
            <td>${user.firstname}</td>
            <td>${user.lastname}</td>
            <td>${user.email}</td>
            <td>${user.mobile}</td>
            <td>${user.location}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
