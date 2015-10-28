<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Error</title>
</head>
<body>
	<div class="main">
		<div class="main-content">
			<p>You cannot access this page.</p>
		</div>
		<form action='<c:url value="/j_spring_security_logout"></c:url>' method="post">
			<input type="submit" value="Logout">
		</form>
		
	</div>
</body>
</html>