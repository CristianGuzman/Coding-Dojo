<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Show</title>
</head>
<body>
	<h1>Create a new show</h1>
	<p><form:errors path="show.*"/></p>
	<form:form method="POST" action="/newshow" modelAttribute="show">
        <p>
            <form:label path="text">Title:</form:label>
            <input type="text" id="ftitulo" name="ftitulo" required>
        </p>
        <p>
            <form:label path="text">Network:</form:label>
		  	<input type="text" id="network" name="network" required>
        </p>
        <input type="submit" value="create"/>
    </form:form>
</body>
</html>