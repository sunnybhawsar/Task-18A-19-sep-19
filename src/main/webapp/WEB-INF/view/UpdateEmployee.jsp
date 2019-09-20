<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee Details</title>
</head>
<body>
        <h3>Update Employee Details</h3>
        <hr>
        <form action="UpdateController">
            <table>
            <tr>
                <td>Enter Employee No.</td><td><input type="text" name="eno" value="${info.eno}" /></td>
            </tr>
            <tr>
                <td>Enter Name</td><td><input type="text" name="name" value="${info.name}" /></td>
            </tr>
            <tr>
                <td>Enter Salary</td><td><input type="text" name="salary" value="${info.salary}" /></td>
            </tr>
            <tr><td><br></td></tr>
            <tr>
            <td></td>
                <td><input type="submit" value="Update Details"/></td>
   
            </tr>
            </table>
            
        </form>                        
        <hr>
        <a href="index.jsp">Go to Home</a>
    </body>
</html>