<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="css/custom.css">
    <title>Login</title>
</head>
<body>
  
  <img src="https://cdn.pixabay.com/photo/2018/08/19/19/56/peacock-feathers-3617474__340.jpg" class="img-circle img-responsive center-block" style="width: 400px; margin-top: 20px">
  <!--
    <div class="container">
            <div id="myCarousel" class="carousel slide" data-ride="carousel">
                   
                    <ol class="carousel-indicators">
                      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                      <li data-target="#myCarousel" data-slide-to="1"></li>
                      <li data-target="#myCarousel" data-slide-to="2"></li>
                    </ol>
                  
                    
                    <div class="carousel-inner">
                      <div class="item active">
                        <img src="https://pixabay.com/tr/%C3%A7ay-%C4%B1%C5%9F%C4%B1klar%C4%B1-mumlar-mum-%C4%B1%C5%9F%C4%B1%C4%9F%C4%B1-inan%C3%A7-3612508/" alt="YBU1">
                      </div>
                  
                      <div class="item">
                        <img src="https://pixabay.com/tr/rushmore-da%C4%9F%C4%B1-heykel-an%C4%B1t-i%C5%9Faret-3608620/" alt="YBU2">
                      </div>
                  
                      <div class="item">
                        <img src="https://pixabay.com/tr/katedral-kilise-dom-din-3599450/" alt="YBU3">
                      </div>
                    </div>
                  
                    
                    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                      <span class="glyphicon glyphicon-chevron-left"></span>
                      <span class="sr-only">Previous</span>
                    </a>
                    <a class="right carousel-control" href="#myCarousel" data-slide="next">
                      <span class="glyphicon glyphicon-chevron-right"></span>
                      <span class="sr-only">Next</span>
                    </a>
            </div>
    </div>
  -->
  
  	<c:if test="${param.act eq 'err' }">
  		<div class="container" style="margin-top:40px;">
  			<p class="alert alert-danger"> Username or password is wrong </p>
  		</div>
  	</c:if>
    <div class="container" style="margin-top:20px;" >
	    <form:form class="form-horizontal" method="POST" action="signIn" modelAttribute = "userLogin">
	    	<div class="form-group">
	        	<label for="inputEmail3" class="col-sm-2 control-label">Email</label>
	            <div class="col-sm-10">
	            	<form:input path="eMail" type="email" class="form-control" id="inputEmail3" placeholder="Email" />
	            </div>
	        </div>
	        <div class="form-group">
	        	<label for="inputPassword3" class="col-sm-2 control-label">Password</label>
	            <div class="col-sm-10">
	            	<form:input path="password" type="password"  class="form-control" id="inputPassword3" placeholder="Password"/>
	            </div>
	        </div>
	        <div class="form-group">
	            <div class="col-sm-offset-2 col-sm-10">
	            	<button type="submit" class="btn btn-default">Sign in</button>
	        	</div>
	        </div>
	    </form:form>
    </div>

</body>
</html>