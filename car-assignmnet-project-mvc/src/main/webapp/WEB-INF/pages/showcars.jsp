<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show cars</title>
<style>
table{
border:2px solid blue;
border-collapse:collapse;
margin-left:auto;
margin-right:auto;
}
tr,th,td{
border:2px solid blue;
}
</style>
</head>
<body bgcolor="Lightskyblue" style="text-align:center;">
<h1 style="font-color:green;"> Cars Availability </h1>
<p><c:if test="${error}">
	Please enter valid Car details.
</c:if></p>
<table>
<tr>
<th>Year Of Manufacture</th>
<th>Distance Traveled</th>
<th>Model</th>
<th>Color</th>
<th>Status</th>

</tr>
<c:forEach items="${list}" var="eachItem">
<tr>
<td><c:out value="${eachItem.yearofManufacture}"/></td>
<td><c:out value="${eachItem.distanceTraveled}"/></td>
<td><c:out value="${eachItem.modelName}"/></td>
<td><c:out value="${eachItem.colour}"/></td>
<td><c:out value="${eachItem.status}"/></td>
</tr>
</c:forEach>
</table>
</body>
</html>