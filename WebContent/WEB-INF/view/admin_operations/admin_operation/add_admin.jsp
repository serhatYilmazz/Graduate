<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/admin_js/custom.js"></script>

<form:form class="form-horizontal" action="addAdmin" method="POST" modelAttribute="admin">
  <div class="form-group">
    <label for="adminEMail" class="">Admin E-Mail</label>
    <form:input path="eMail" type="text" name="adminEMail" class="form-control" id="adminEMail" placeholder="New Admin E-Mail" />
  </div>
  <div class="form-group">
    <label for="adminName" class="">Admin Name</label>
    <form:input path="name" type="text" name="adminName" class="form-control" id="adminName" placeholder="New Admin Name"/>
  </div>
  <div class="form-group">
    <label for="institutionPassword">Admin Password</label>
    <div class="col-md-12 row">
        <button type="button" class="btn btn-default" name="button" id="adminPasswordAssign">Assign</button>
        <form:input path="password" type="hidden" id="assignedPassword" />
        <form:input path="role" type="hidden" id="role" />
    </div>
  </div>
  <div class="form-group">
    <label for="adminPhone" class="">Admin Phone</label>
    <form:input path="phone" type="text" name="adminPhone" class="form-control" id="adminPhone" placeholder="New Admin Phone"/>
  </div>
  <div class="form-group">
      <button type="submit" class="btn btn-primary col-md-12">Save and Mail to Admin</button>
  </div>
</form:form>
