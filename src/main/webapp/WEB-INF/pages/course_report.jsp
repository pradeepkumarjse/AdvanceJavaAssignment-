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
		<c:when test="${!empty courList}">
			<table border="1" bgcolor="cyan" align="center">

				<tr bgcolor="pink">
					<th>CourseId</th>
					<th>CourseName</th>
					<th>Students</th>
					
				</tr>
				<c:forEach var="cour" items="${courList}">
					<tr>
						<td>${cour.courseId}</td>
						<td>${cour.courseName}</td>
						<td>${cour.students}</td>
						
						<td><a href="edit_course?cno=${cour.courseId}"><img
								src="images/edit1.png" height="50" width="50" />&nbsp;&nbsp;</a> <a
							href="delete_course?cno=${cour.courseId}"
							onclick="confirm('Do u want to delete')"><img
								src="images/delete1.jpg" height="50" width="50" /></a></td>
					</tr>
				</c:forEach>
			</table>
		</c:when>

		<c:otherwise>
			<h1 style="color: red; text-align: center;">Record not found</h1>
		</c:otherwise>

	</c:choose>
	<blink>
		<h1 style="color: green;text-align=center;">${resultMsg1}</h1>
	</blink>

	<br>
	<h1 style="text-align: center">
		<a href="insert_course">add Course<img src="images/add.jpg" height="100" width="100"/></a>
	</h1>
	<br>
	<br>

	<h1 style="text-align: center">
		<a href="./">Home<img src="images/home1.png" height="100" width="100"/></a>
	</h1>

</body>
</html>