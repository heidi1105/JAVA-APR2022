<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring project</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="container mt-5">
		<h1> Assignment table</h1>
		<table class="table">
			<thead>
				<tr>
					<th> Stack </th>
					<th> Number of assignments </th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="assignment" items="${assignments }">
					<tr>
						<td> ${assignment.stack }</td>
						<td> ${assignment.getTotalAssignments() }</td>
						
					</tr>
				
				</c:forEach>
			
			</tbody>
		</table>
	</div>
	
</body>
</html>