<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>

<%

	//String message = null;
	if(request.getParameter("register") != null) {
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String hobbies[] = request.getParameterValues("hobbies");
		String country = request.getParameter("country");
		
		
		
		response.sendRedirect("details.jsp");
		
	}
	
	

%>


</head>
<body>

	<form action="details.jsp" method="post">
		<label>Enter your first name</label><input type="text" name="firstname"><br>
		<label>Enter your last name</label><input type="text" name="lastname"><br>
		<label>Enter your password</label><input type="password" name="password"><br>
		<label>Enter your username</label><input type="text" name="username"><br>
		
		<label>Gender</label>
		<br>
		
		<input type="radio" id="male" name="gender" value="male">
		<label>Male</label><br>
		<input type="radio" id="female" name="gender" value="female">
		<label>Female</label>
		
		<br>
		<label>Hobbies</label>
		<br>
		<input type="checkbox" id="dance" name="hobbies" value="dance">
  		<label>Dance</label><br>
  		<input type="checkbox" id="music" name="hobbies" value="music">
  		<label>Music</label><br>
  		<input type="checkbox" id="sports" name="hobbies" value="sports">
  		<label>Sports</label><br>
  		<input type="checkbox" id="painting" name="hobbies" value="painting">
  		<label>Painting</label><br>
  		
  		<label>Country</label>
 		 <select name="country" id="country">
    		<option value="USA">USA</option>
    		<option value="UK">UK</option>
    		<option value="EU">EU</option>
    		<option value="India">India</option>
  		</select>
		
		<input type="submit" name="register" value="register">
	</form>

</body>
</html>





