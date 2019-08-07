<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Librarian</title>
</head>
<body>
	<form action="LibrarianLogin"  modelAttribute="librarianlogin" method="post">
    <table>
        <tr>
            <td> Username : </td>
            <td> 
                <input name="Username" type="text" required>
            </td>
        </tr>
        <tr>
            <td> Password : </td>
            <td> 
                <input name="Password" type="password" required>
            </td>
        </tr>
        
        <tr>
            <td> &nbsp; </td>
            <td> 
                <button id="sumbitip" type="submit">Login</button>
                <button onclick="window.location.href='LibrarianRegister';">Register</button>
                <h2>${message}</h2>
            </td>
        </tr>
        
    </table>
  </form>
  
</body>
</html>