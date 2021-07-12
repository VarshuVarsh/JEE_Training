<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Blood Donor</title>
</head>
<body>
<form:form method="post" action="donors">
<form:label  path="phoneNumber">PhoneNumber</form:label>
<form:input  path="phoneNumber"/>
<span style ="color: #ff0000"><form:errors path="phoneNumber"></form:errors> </span>

<form:label  path="firstName">FirstName</form:label>
<form:input  path="firstName"/>
<form:label  path="bloodGroup">BloodGroup</form:label>
<form:select path="bloodGroup" items="${groups}"></form:select>

<input type="submit" value="Add">

</form:form>
</body>
</html>