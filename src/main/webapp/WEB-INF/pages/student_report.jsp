<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students</title>
</head>
<body>
	<c:choose>
		<c:when test="${!empty studsList}">
			<table border="1" bgcolor="cyan" align="center">

				<tr bgcolor="pink">
					<th>StudentId</th>
					<th>StudentName</th>
					<th>Courses</th>					
				</tr>
				<c:forEach var="stud" items="${studsList}">
					<tr>
						<td>${stud.studentId}</td>
						<td>${stud.studentName}</td>
						<td>${stud.courses}</td>
						
						<td><a href="edit_student?sno=${stud.studentId}"><img
								src="images/edit1.png" height="50" width="50" />&nbsp;&nbsp;</a> <a
							href="delete_student?sno=${stud.studentId}"
							onclick="confirm('Do u want to delete')">
							<img src="images/delete1.jpg" height="50" width="50" /></a></td>
					</tr>
				</c:forEach>
			</table>
		</c:when>

		<c:otherwise>
			<h1 style="color: red; text-align: center;">Record not found</h1>
		</c:otherwise>

	</c:choose>
	<blink>
		<h1 style="color: green;text-align=center;">${resultMsg}</h1>
	</blink>
	<br>
	<h1 style="text-align: center">
		<a href="insert_student">add Student<img src="images/add.jpg" height="100" width="100"/></a>
	</h1>
	<br>
	<br>
	<h1 style="text-align: center">
		<a href="./">Home<img src="images/home1.png" height="100" width="100"/></a>
	</h1>
</body>
</html>