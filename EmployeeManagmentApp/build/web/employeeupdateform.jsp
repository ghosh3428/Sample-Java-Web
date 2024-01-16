
<%@page import="java.util.Date"%>
<!DOCTYPE html>

<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <link href="bootstrap.css" rel="stylesheet" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body style="background: linear-gradient(217deg, rgba(255,0,0,.8), rgba(255,0,0,0) 70.71%),
          linear-gradient(127deg, rgba(0,255,0,.8), rgba(0,255,0,0) 70.71%),
          linear-gradient(336deg, rgba(0,0,255,.8), rgba(0,0,255,0) 70.71%);">
        <%@include file="nav.jsp" %>
        <div class="container">
            <div class="card" >
                <div class="card-header bg-primary text-white">
                    <h1 class="display-3 text-center ">Employee Update Form</h1>
                </div>
                <div class="card-body">
                    <form method="post" action="">
                        <div class="form-group row">
                            <label class="col-md-4 h3">Employee ID</label>
                            <label class="col-md-4 h3">${employee.id}</label>
                        </div>
                        <div class="form-group row">
                            <label class="col-md-4 h3">First Name</label>
                            <div class="col-md-8">
                                <input type="text" name="e_fn" 
                                       class="form-control"
                                       value="${employee.firstName}"/>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-md-4 h3">Last Name</label>
                            <div class="col-md-8">
                                <input type="text" name="e_fn" 
                                       class="form-control"
                                       value="${employee.lastName}"/>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-md-4 h3">Designation</label>
                            <div class="col-md-8">
                                <input type="text" name="e_fn" 
                                       class="form-control"
                                       value="${employee.designation}"/>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-md-4 h3">Age</label>
                            <div class="col-md-8">
                                <input type="text" name="e_fn" 
                                       class="form-control"
                                       value="${employee.age}"/>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-md-4 h3">Basic Salary</label>
                            <div class="col-md-8">
                                <input type="text" name="e_fn" 
                                       class="form-control"
                                       value="${employee.basic}"/>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-md-4 h3">Years Of Experience</label>
                            <div class="col-md-8">
                                <input type="text" name="e_fn" 
                                       class="form-control"
                                       value="${employee.yearOfExp}"/>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-md-4 h3">Address</label>
                            <div class="col-md-8">
                                <input type="text" name="e_fn" 
                                       class="form-control"
                                       value="${employee.address}"/>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-md-4 h3">Phone Number</label>
                            <div class="col-md-8">
                                <input type="text" name="e_fn" 
                                       class="form-control"
                                       value="${employee.phone}"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col text-center">
                                <input type="submit" value="Update Employee" class="btn btn-warning btn-lg"/>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
