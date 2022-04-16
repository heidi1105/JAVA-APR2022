<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
   	<h1> Welcome to the page</h1>
   	<a href="/gifts/new"> Send a new gift</a>
   	   	<a href="/logout"> Logout</a>
		<table class="table">
			<thead>
   			<tr>
   				<th> ID </th>
   				<th> Gift </th>
   				<th> Quantity </th>
   				<th> Sender </th>
   				<th colspan="2"> Actions </th>
   			</tr>
			</thead>
   			<tbody>
   				<c:forEach var="gift" items="${gifts }">
   					<tr>
   						<td> ${gift.id }</td>
   						<td> <c:out value="${gift.giftName }"/> </td>
   						<td> ${gift.quantity } </td>
   						<td> ${gift.sender.userName } </td>
   						
   						
   						
   						<td> <a href="/gifts/${gift.id }/edit" class="btn btn-success">Edit</a> </td>
   						<td> 
   							<form action="/gifts/${gift.id }/delete" method="post">
   							<input type="hidden" name="_method" value="delete" />
   							<button class="btn btn-danger"> Delete</button>
   							</form> </td>
   					</tr>
   				</c:forEach>
   			</tbody>
		
		</table>	
   
   </div>
</body>
</html>