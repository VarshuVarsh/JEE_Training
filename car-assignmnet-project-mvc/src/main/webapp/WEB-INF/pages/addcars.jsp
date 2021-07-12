<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Cars</title>
</head>
<body bgcolor="Lightskyblue" style="text-align: center;">

	<h1 >Add Car for Sale</h1>
	<form:form method="post" action="cars">

		<form:label path="yearofManufacture" size="20">Year of Manufacture</form:label>
		<form:input path="yearofManufacture" size="20"/>
		<br/>
		<br/>
		<form:label path="distanceTraveled" size="20">Distance Traveled</form:label>
		<form:input path="distanceTraveled" size="20"/>
		<br/>
         <br/>
		<form:label path="modelName" size="20">Model</form:label>
		<form:input path="modelName" size="20" />
		<br/>
         <br/>
		<form:label path="colour" size="20">Color</form:label>
		<form:input path="colour" size="20"/>
		<br/>
		<br/>
		<form:label path="status" size="20">Status</form:label>
		<form:select path="status" >
		  <option value="Sold" selected>Sold</option>
		  <option value="UnSold" >UnSold</option>
		  <option value="Blocked">Blocked</option>
		</form:select>
		<br/>
		<br/>
		<input type="submit" value="Add" size="20">

	</form:form>

</body>
</html>