<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
   <div class="container mt-5">
   <h1> <c:out value="${user.username }"></c:out></h1>
	<table class="table">
		<thead>
			<tr>
				<th> ID </th>
				<th> Title </th>
				<th> Rating </th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="movie" items="${user.viewedMovies }">
				<tr>
					<td> ${ movie.id}</td>
					<td> ${movie.title }</td>
					<td> ${movie.rating } </td>
				</tr>
			</c:forEach>
		
		
		</tbody>
	</table>


   
   </div>
</body>
</html>