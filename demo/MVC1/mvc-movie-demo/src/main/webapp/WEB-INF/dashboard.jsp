<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring project</title>
</head>
<body>
	<h1>Movie Dashboard</h1>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Rating</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="movie" items="${movies }">
				<tr>
					<td>${movie.id }</td>
					<td>
						<a href="/movies/${movie.id }">
							<c:out value="${movie.title }"></c:out>
						</a>
					</td>
					<td>${movie.rating }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>