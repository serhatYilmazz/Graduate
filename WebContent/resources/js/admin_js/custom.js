$(document).ready(function(){
  $("#addSchool").click(function(){
    $.ajax({
      type: "GET",
      url: "addSchool",
      dataType: "html",
      success: function(response){
        $("#former").html(response).hide().fadeIn();
      }
    });
  });

  $("#addInstitution").click(function(){
    $.ajax({
      type: "GET",
      url: "addInstitution",
      dataType: "html",
      success: function(response){
        $("#former").html(response).hide().fadeIn();
      }
    });
  });

  $("#addFaculty").click(function(){
    $.ajax({
      type: "GET",
      url: "addFaculty",
      dataType: "html",
      success: function(response){
        $("#former").html(response).hide().fadeIn();
      }
    });
  });

  $("#addDepartment").click(function(){
    $.ajax({
      type: "GET",
      url: "addDepartment",
      dataType: "html",
      success: function(response){
        $("#former").html(response).hide().fadeIn();
      }
    });
  });

  $("#addAdmin").click(function(){
    $.ajax({
      type: "GET",
      url: "addAdmin",
      dataType: "html",
      success: function(response){
        $("#former").html(response).hide().fadeIn();
      }
    });
  });
  
  $("#adminPasswordAssign").click(function() {
	  var key = "";
      for(var i = 0; i < 6; i++){
        var rnd = Math.random();
        if(Math.round(rnd) == 0){
          key += String.fromCharCode(48 + 9 * Math.random());
        }
        else {
          key += String.fromCharCode(65 + 25 * Math.random());
        }
      }
      $("#role").text("1");
      $("#adminPasswordAssign").attr("class", "btn btn-success");
      $("#adminPasswordAssign").attr("disabled", true);
      $("#adminPasswordAssign").text("Assigned");
      $("#assignedPassword").val(key);
      $("#assignedPassword").val(1);
  });

});
