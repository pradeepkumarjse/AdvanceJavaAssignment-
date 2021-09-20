<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Student</title>
</head>
<body>

<h1 style="color: green; text-align: center">Edit Student</h1>

<form:form modelAttribute="stud">
	<table border="0" bgcolor="cyan" align="center">
		<tr>
			<td>Student name::</td>
			<td><form:input path="sname" /></td>
		</tr>
		<tr>
			<td>Course ::</td>
			<td><form:input path="courseName" /></td>
		</tr>


	<tr>
	<td><input type="submit" value="Edit Student" /></td>
	<td><button type="reset">Cancel</button></td>
	</tr>
	</table>


</form:form>

</body>
</html>