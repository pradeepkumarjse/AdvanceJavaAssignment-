<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1 style="color: green; text-align: center">Register Student</h1>

<form:form modelAttribute="stud">
	<table border="0" bgcolor="cyan" align="center">
		<tr>
			<td>Student name::</td>
			<td><form:input path="studentName" /></td>
		</tr>
		<tr>
			<td>Courses ::</td>
			<td><form:input path="courses" /></td>
		</tr>


		<tr>
			<td><input type="image" src="images/submit.jpg" height="75"
				width="75" /></td>
			<td><button type="reset"><img src="images/reset.jpg" height="75"
				width="75" /></button></td>

		</tr>
	</table>
</form:form>