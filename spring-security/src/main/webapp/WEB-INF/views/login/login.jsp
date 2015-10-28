<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>LOGIN</title>
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
              <c:if test="${authFailed}">
              	<div>
					<span style="color:red;"><c:out value="Authentication failed. Invalid credentials."/></span>              	
              	</div>
			</c:if>
              <form method="post" action="<c:url value='/j_spring_security_check' />">
                <ul>
                  <li>
                    <div class="input-field">
                      <input id="username" type="text" class="validate" name="j_username">
                      <label for="username">Username</label>
                    </div>
                  </li>
                  <li>
                    <div class="input-field">
                      <input id="password" type="password" class="validate" name="j_password">
                      <label for="password">Password</label>
                    </div>
                  </li>
                  <li>
                    <button class="btn waves-effect waves-light btn-block" type="submit">sign in</button>
                  </li>
                </ul>
              </form>
              <div class="login-control">
                <div class="stay-in pull-left">
                  <p>
                    <input type="checkbox" id="remember">
                    <label for="remember">Stay signed in</label>
                  </p>
                </div>
                <div class="pull-right forgot">
                  <a href='<c:url value="/login/forgot"></c:url>' title="Forgot password">Forgot Password?</a>
                </div>
              </div>
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