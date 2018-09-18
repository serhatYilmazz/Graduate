<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${sessionScope.admin.geteMail() == null }">
	<c:redirect url="${pageContext.request.contextPath}/"/>
</c:if>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/admin_js/custom.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/custom.css">
    <meta charset="utf-8">
    <title>Admin</title>
  </head>
  <body>

    <!-- Navigation -->
    <div class="container">
      <nav class="navbar navbar-default fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button class="navbar-toggle collapsed" data-toggle="collapse" data-target="#collapsedNavBar"
          aria-expanded="false" type="button" name="button">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>

        <a href="theAdmin" class="navbar-brand"> Home </a>
        </div>

        <div class="navbar-collapse collapse" aria-expanded="false" id="collapsedNavBar">
          <ul class="nav navbar-nav">
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">School Operations<span class="caret"></span> </a>
                <ul class="dropdown-menu">
                  <li class=""> <a href="#" id="addSchool">Add School</a> </li>
                  <li class=""> <a href="#" id="addFaculty">Add Faculty</a> </li>
                  <li class=""> <a href="#" id="addDepartment">Add Department</a> </li>
                </ul>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Admin Operations <span class="caret"></span> </a>
              <ul class="dropdown-menu">
                  <li> <a href="#" id="addAdmin">Add Admin</a> </li>
              </ul>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Institution Operations <span class="caret"></span> </a>
              <ul class="dropdown-menu">
                <li class=""> <a href="#" id="addInstitution">Add Institution</a> </li>
              </ul>
            </li>
            <li ><a href="logout">Logout</a></li>
          </ul>
        </div>
      </div>
    </nav>
    </div>

    <!-- Body -->
    <div class="container" id="former">

    </div>

  </body>
</html>
