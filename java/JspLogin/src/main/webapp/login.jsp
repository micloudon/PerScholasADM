<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<%

	String message = null;
	if(request.getParameter("login") != null) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		request.setAttribute("username", username);
		request.setAttribute("password", password);
		
		if("tom".equals(username) && "jerry".equals(password)) {
			response.sendRedirect("success.jsp");
		}
		else {
			message = "Username and password do not match";
		}
	}

%>

</head>
	
<body>


<%

	if(message != null) {
		out.print("<span style='color:red' >" + message + "</span>");
	}

%>

	<form method="post">
		<label>Enter your name</label><input type="text" name="username">
		<label>Enter your password</label><input type="password" name="password">
		<input type="submit" name="login" value="login">
	</form>

</body>
</html>