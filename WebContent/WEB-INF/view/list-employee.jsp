<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Employees</title>
</head>
<body>
	<div id="wrapper">
	<div>
	<h2>Employee Data</h2>
	</div></div>
	<input type="button" value="Add Employee"
	onclick="window.location.href='showFormForAdd';return false;"/>
	<div>
		<table>
			<tr>
			<th>Id</th>
			<th>Name</th>
			</tr>
			<c:forEach var="tempEmployee" items="${employees}">
				<tr>
					<td> ${tempEmployee.id }</td>
					<td> ${tempEmployee.name }</td>					
				</tr>				
			</c:forEach>
		</table>
	</div>
</body>
</html>