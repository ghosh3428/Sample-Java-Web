
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
                    <h1 class="display-3 text-center ">Employee Details</h1>
                </div>
                <div class="card-body">
                    <div class="form-group row">
                            <label class="col-md-4 h3">Employee ID</label>
                            <label class="col-md-4 h3">${employee.id}</label>
                        </div>
                        <div class="form-group row">
                            <label class="col-md-4 h3">First Name</label>
                            <label class="col-md-4 h3">${employee.firstName}</label>
                        </div>
                        <div class="form-group row">
                            <label class="col-md-4 h3">Last Name</label>
                            <label class="col-md-4 h3">${employee.lastName}</label>
                        </div>
                        <div class="form-group row">
                            <label class="col-md-4 h3">Designation</label>
                            <label class="col-md-4 h3">${employee.designation}</label>
                        </div>
                        <div class="form-group row">
                            <label class="col-md-4 h3">Age</label>
                            <label class="col-md-4 h3">${employee.age}</label>
                        </div>
                        <div class="form-group row">
                            <label class="col-md-4 h3">Basic Salary</label>
                            <label class="col-md-4 h3">${employee.basic}</label>
                        </div>
                        <div class="form-group row">
                            <label class="col-md-4 h3">Years Of Experience</label>
                            <label class="col-md-4 h3">${employee.yearOfExp}</label>
                        </div>
                        <div class="form-group row">
                            <label class="col-md-4 h3">Address</label>
                            <label class="col-md-4 h3">${employee.address}</label>
                        </div>
                        <div class="form-group row">
                            <label class="col-md-4 h3">Phone Number</label>
                            <label class="col-md-4 h3">${employee.phone}</label>
                        </div>
                </div>
            </div>
        </div>
    </body>
</html>
