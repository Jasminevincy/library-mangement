<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Registration</title>
        </head>
        <body>
            <form:form id="regForm" modelAttribute="librarianregister" action="LibrarianRegister" method="post">
                <table align="center">
                    <tr>
                        <td>
                            <label path="name">Full name</label>
                        </td>
                        <td>
                            <input path="name" name="name" id="name" type="text" required />
                        </td>
                    </tr>
                     <tr>
                        <td>
                            <label path="email">Email</label>
                        </td>
                        <td>
                            <input path="email" name="email" id="email" type="text" required />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label >UsertName</label>
                        </td>
                        <td>
                            <input name="username" id="username" type="text" required/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label >Password</label>
                        </td>
                        <td>
                            <input  name="password" id="password" type="password" required />
                        </td>
                    </tr>
                   <tr>
                        <td>
                            <label >Phone</label>
                        </td>
                        <td>
                            <input  name="contactno" id="contactno" type="number" required/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label >Qualification</label>
                        </td>
                        <td>
                            <input name="qualification" id="qualification" type="text" required/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label >Date</label>
                        </td>
                        <td>
                            <input  type="text" placeholder="YYYY-MM-DD" name="date" id="date" required />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <button id="register" name="register">Register</button>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="home.jsp">Home</a>
                        </td>
                    </tr>
                </table>
            </form:form>
        </body>
        </html>