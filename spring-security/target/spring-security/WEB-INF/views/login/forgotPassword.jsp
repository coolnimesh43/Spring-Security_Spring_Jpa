<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>FORGOT PASSWORD</title>
    
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
      <div class="page login">
        <div class="main container">
          <div class="login-content row">
            <div class="logo"><h1>AML Filter</h1></div>
            <div class="global-form-wrapper form-login z-depth-1 shadow-demo">
              <div class="avatar">
                <img src='<c:url value="/resources/images/avatar.png"></c:url>' alt="Avatar" title="Avatar">
              </div>
              <c:if test="${invalidEmail}">
              	<div>
					<span style="color:red;"><c:out value="The email address you have entered is invalid. Please try again."/></span>              	
              	</div>
              </c:if>
              <form method="post" action='<c:url value="/login/forgot"></c:url>'>
                <ul>
                  <li>
                    <div class="input-field">
                      <input id="email" type="email" class="validate" name="email">
                      <label for="email">Email Address</label>
                    </div>
                  </li>
                  <li>
                    <button class="btn waves-effect waves-light btn-block" type="submit">reset password</button>
                  </li>
                </ul>
              </form>
            </div>
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