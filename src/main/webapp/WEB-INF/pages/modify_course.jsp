<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 style="color: green; text-align: center">Edit Course</h1>

<form:form modelAttribute="cour">
	<table border="0" bgcolor="cyan" align="center">
		<tr>
			<td>Course name::</td>
			<td><form:input path="courseName" /></td>
		</tr>
		<tr>
			<td>Students ::</td>
			<td><form:input path="students" /></td>
		</tr>


	<tr>
	<td><input type="submit" value="Edit Student" /></td>
	<td><button type="reset">Cancel</button></td>
	</tr>
	</table>


</form:form>
