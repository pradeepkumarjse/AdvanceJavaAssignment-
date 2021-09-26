<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1 style="color: green; text-align: center">Register Course</h1>

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
			<td><input type="image" src="images/submit.jpg" height="75"
				width="75" /></td>
			<td><button type="reset"><img src="images/reset.jpg" height="75"
				width="75" /></button></td>

		</tr>
	</table>
</form:form>