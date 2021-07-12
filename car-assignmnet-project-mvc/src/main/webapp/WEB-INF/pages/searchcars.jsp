<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Cars</title>
</head>
<body bgcolor="Lightskyblue" style="text-align:center;">
<h1> Car Search </h1>
<form:form method="post" action="/cars/search">

<form:label path="modelName" size="20">Model</form:label>
<form:input path="modelName" size="20" text="Search By Model Name"/>

<input type="submit" value="Search">

</form:form>

</body>
</html>