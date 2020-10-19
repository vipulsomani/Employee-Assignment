<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
</head>
<body>
	<div>
		<div>
		<h2>Enter Data</h2>
		</div>
	</div>
	<div>
		<form:form action="saveEmployee" modelAttribute="employee" method="POST">
			<form:hidden path="id"/>
		<table>
			<tr>
			<td><label>Id</label></td>
			<td><form:input path="id"/></td>
			</tr>
			<tr>
			<td><label>Name</label></td>
			<td><form:input path="name"/></td>
			</tr>
			<tr>
			<td><label>Cloud Tech</label></td>
			<td><form:input path="cloud_tech"/></td>
			</tr>
			<tr>
			<td><label></label></td>
			<td><input type="Submit" value="save"/></td>
			</tr>
			
			
		</table>
		</form:form>
		<div>
			<p>
			<a href="${pageContext.request.contextPath }/employee/list">Back to List</a>
			</p>
		</div>
	</diV>
</body>
</html>