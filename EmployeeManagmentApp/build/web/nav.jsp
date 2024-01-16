<%@page import="java.util.Date" %>


<nav class="navbar navbar-expand-md navbar-dark bg-dark">
            <div class="container">
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="nav navbar-nav ">
                        <li class="nav-item active"><a class="nav-link" href="index.jsp">Home </a></li>
                        <li class="nav-item active"><a class="nav-link" href="employeeaddform.jsp">Add </a></li>
                        <li class="nav-item active"><a class="nav-link" href="employeesearch.jsp">Search</a></li>
                        <li class="nav-item active"><a class="nav-link" href="#">Delete </a></li>
                        <li class="nav-item active"><a class="nav-link" href="employeeupdate.jsp">Update </a></li>
                        <li class="nav-item active"><a class="nav-link" href="#">Salary Details </a></li>
                    </ul>

                </div>
            </div>
</nav>
<h5 class="text-right bg-dark text-white">
    <%= new Date() %>
</h5>

