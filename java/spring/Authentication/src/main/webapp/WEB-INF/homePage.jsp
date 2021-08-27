<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Welcome</title>
</head>
<body>
	<h1>Welcome, <c:out value="${user.email}" /></h1>
	<h3> TV Shows</h3>
	<table>
	  <tr>
	    <th>Shows</th>
	    <th>Network</th>
	    <th>AVG Rating</th>
	  </tr>
	  <tr>
	    <td>Alfreds Futterkiste</td>
	    <td>Maria Anders</td>
	    <td>Germany</td>
	  </tr>
	  <tr>
	    <td>Centro comercial Moctezuma</td>
	    <td>Francisco Chang</td>
	    <td>Mexico</td>
	  </tr>
	</table>
	<a href="/logout">Logout</a>
</body>
</html>