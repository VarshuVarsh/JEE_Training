<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cars Selling/Buying Site</title>
</head>
<body bgcolor="Lightskyblue" style="text-align: center;">
	<h1 style="color: red">
		<c:out value="${heading}" />
	</h1>
	<br />
	<br />
	<p style="text-align: center;">
		<h2><a href="cars">Add Cars</a></h2>
		<h2><a href="cars/all">View Cars</a></h2>
		<h2><a href="cars/search">Search Cars</a></h2>
	</p>
</body>
</html>