<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>shows</title>
</head>
<body>
	<h1>Nombre de la pelicula</h1>
	<h2>Network: <c:out value="${user.email}" /></h2>
	<br>
	<h1>User who rated this show</h1>
	<br>
	<div>
		<table>
		  <tr>
		    <td>Name</td>
		    <td>Rating</td>
		  </tr>
		  <tr>
		    <td><c:out value="${showId}"/></td>
		    <td><c:out value="${user.id}"/></td>
		  </tr>
		</table>
	</div>
</body>
</html>