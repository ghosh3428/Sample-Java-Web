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
            <div class="card">
                <div class="card-header bg-primary text-white">
                    <h1 class="display-3 text-center ">Employee Search Form</h1>
                </div>
                <div class="card-body">
                    <form method="post" action="searchServlet">
                        <div class="form-group row">
                            <label class="col-md-4 h3">Employee ID</label>
                            <div class="col-md-8">
                                <input type="text" name="e_id" class="form-control"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col text-center">
                                <input type="submit" value="Search Employee" class="btn btn-warning btn-lg"/>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
