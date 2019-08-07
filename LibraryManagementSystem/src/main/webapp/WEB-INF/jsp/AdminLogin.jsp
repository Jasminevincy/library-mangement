<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
<body>
<h3>Welcome Admin</h3>

   <form action="AdminLogin"  modelAttribute="adminlogin" method="post">
		
      	<table>
        <tr>
            <td> Username : </td>
            <td> 
                <input name="AdminId" type="text" required>
            </td>
        </tr>
        <tr>
            <td> Password : </td>
            <td> 
                <input name="AdminPassword" type="password" required>
            </td>
        </tr>
        
        <tr>
            <td> &nbsp; </td>
            <td> 
                <button id="sumbitip" type="submit">Login</button>
            </td>
        </tr>
    </table>
    
 </form>
 <p>${message}</p>
</body>
</html>