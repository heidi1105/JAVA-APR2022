<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>Movies</title>

</head>
<body>
	<h1>Movie Dashboard</h1>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Rating</th>
				<th colspan="2"> Actions </th>
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
					<td> <a href="/movies/${movie.id }/edit">
						Edit</a></td>
					<td>
						<form action="/movies/${movie.id }" method="post">
						    <input type="hidden" name="_method" value="delete">
						    <button> Delete</button>  
						</form>
					
					</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<h1>Create a new movie</h1>
	<form:form action="/createProcess" method="post" modelAttribute="movie">
    <p>
        <form:label path="title">Title</form:label>
        <form:input type="text" path="title"/>
        <form:errors path="title"/>
    </p>	
    
     <p>
        <form:label path="description">Description</form:label>
        <form:textarea path="description"/>
        <form:errors path="description"/>
    </p>
    
     <p>
        <form:label path="rating">Rating</form:label>
        <form:input type="number" path="rating"/>
        <form:errors path="rating"/>     
    </p> 
    <button> Create a new movie!</button>
	
	</form:form>   
</body>
</html>

