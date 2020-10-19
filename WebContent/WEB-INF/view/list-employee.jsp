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
		<table border=1>
			<tr>
			<th><a href="window.location.href='orderById';return false;">Id</a></th>
			<th><a href="window.location.href='orderByFirstName';return false;">First Name</a></th>
			<th>Cloud Tech</th>
			<th>Action</th>
			
			
			</tr>
			<c:forEach var="tempEmployee" items="${employees}">
			<c:url var="updateLink" value="/employee/showFormForUpdate">
				<c:param name="employeeId" value="${tempEmployee.id }"></c:param>
			</c:url>
			
			
			<c:url var="deleteLink" value="/employee/delete">
				<c:param name="employeeId" value="${tempEmployee.id }"></c:param>
			</c:url>
				<tr>
				
					<td> ${tempEmployee.id }</td>
					<td> ${tempEmployee.name }</td>
					<td> ${tempEmployee.cloud_tech }</td>	
					<td>
						<a href="${updateLink }">Edit</a>
						|
						<a href="${deleteLink }">Delete</a>
						
					</td>
								
										
				</tr>				
			</c:forEach>
		</table>
	</div>
</body>
</html>