<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Emma">
<meta name="description" content="To count online users">
<title>Online User Number</title>
<script type="text/javascript" src="js/jquery-3.7.1.js"></script>
</head>
<body>
	<h1 style="text-align:center">Welcome!</h1>
	<h2 style="text-align:center">
		You are the ${userNumber}
		<c:choose>
            <c:when test="${userNumber == 1}">
                st
            </c:when>
            <c:when test="${userNumber==2 }">
            	nd
            </c:when>
            <c:otherwise>
                th
            </c:otherwise>
        </c:choose> 
	 	visitor
	 </h2>
	 
</body>
</html>