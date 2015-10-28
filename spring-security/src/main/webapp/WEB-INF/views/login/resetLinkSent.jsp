<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>RESET PASSWORD</title>
    
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/layout.css"></c:url>'>
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/materialize.css"></c:url>'>
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/login-style.css"></c:url>'>
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
    <!-- main wrapper -->
    <div class="main-wrapper">
      <div class="page reset login">
        <div class="main container">
          <div class="login-content row">
          <h2>Reset Account Password</h2>
          <p>The link to reset your account password has been sent to your email address. You can reset your password using the emailed link.</p>
          <p>Thank You.</p>
          </div>
        </div>
      </div>
    </div>
    <!-- jQuery  -->
    <script src='<c:url value="/resources/js/jquery-1.11.3.min.js"></c:url>'></script>
    <script src='<c:url value="/resources/js/materialize.js"></c:url>'></script>
    <script src='<c:url value="/resources/js/init.js"></c:url>'></script>
  </body>
</html>