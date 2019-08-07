<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
	<form action="Addlibrarian" modelAttribute="addlibrarian" method="post">
		<table>
			<tr>
				<td>&nbsp;</td>
				<td>
					<button type="submit">ADD LIBRARIAN</button>
				</td>
			</tr>
		</table>
	</form>
	<form action="Viewlibrarian" modelAttribute="viewlibrarian" method="post">
		<table>
			<tr>
				<td>&nbsp;</td>
				<td>
					<button type="submit">VIEW LIBRARIAN</button>
				</td>
			</tr>
		</table>
	</form >
	<form action="" modelAttribute="adminpage" method="post">
		<table>
			<tr>
				<td>&nbsp;</td>
				<td>
					<button type="submit">EDIT LIBRARIAN</button>
				</td>
			</tr>
		</table>
	</form>
	<form action="AdminPage" modelAttribute="adminpage" method="post">
		<table>
			<tr>
				<td>&nbsp;</td>
				<td>
					<button onclick="window.location.href='generatereport'">GENERATE
						REPORT</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>

