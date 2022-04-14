<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

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
		<form:form action="/movies/new" method="post" modelAttribute="movie"
			class="form-control">

			<div>
				<form:label path="title" class="form-label"> Title </form:label>
				<form:input path= "title" class="form-control" />
				<form:errors path="title" class="text-danger" />
			</div>
			<div>
				<form:label path="description" class="form-label"> Description </form:label>
				<form:input path= "description" class="form-control" />
				<form:errors path="description" class="text-danger" />
			</div>
			<div>
				<form:label path="rating" class="form-label"> Rating </form:label>
				<form:input path= "rating" type="number" class="form-control" />
				<form:errors path="rating" class="text-danger" />
			</div>
			<div>
				<form:label path="viewer" class="form-label"> Viewer </form:label>			
				<form:select path="viewer" class="form-select">
					<c:forEach var="user" items="${users }">
						<form:option value="${user.id}"> ${user.username}</form:option>
					</c:forEach>
					
				</form:select>
			</div>
				<button class="btn btn-primary"> Create a new user</button>
			
		</form:form>

	</div>
</body>
</html>