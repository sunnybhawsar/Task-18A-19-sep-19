<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new Employee</title>
</head>
    <body>
        <h3>Add new Employee</h3>
        <hr>
        <form action="AddController" >
            <table>
            <tr>
                <td>Enter Employee No.</td><td><input type="text" name="eno"/></td>
            </tr>
            <tr>
                <td>Enter Name</td><td><input type="text" name="name"/></td>
            </tr>
            <tr>
                <td>Enter Salary</td><td><input type="text" name="salary"/></td>
            </tr>
            <tr><td><br></td></tr>
            <tr>
            <td></td>
                <td><input type="submit" value="Add Employee"/></td>
   
            </tr>
            </table>
            
        </form>                        
        <hr>
        <a href="index.jsp">Go to Home</a>
    </body>
</html>