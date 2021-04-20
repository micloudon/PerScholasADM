<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%

if(request.getParameter("username") == "" || request.getParameter("password") == "") {
	response.sendRedirect("registration.jsp?messages='User name and password cannot be null' ");
}

%>

</head>
<body>

            
       

	<h4> firstname: <%=request.getParameter("firstname")%></h4>
	<h4> lastname: <%=request.getParameter("lastname")%></h4>
	<h4> Username: <%=request.getParameter("username")%></h4>
	<h4> Gender: <%=request.getParameter("gender")%></h4>
	<h4> Hobbies:
	<%
           String[] hobbies = request.getParameterValues("hobbies");
			
			for(String h : hobbies ) {
				out.print(h + " ");
			}
	%>
	  </h4>
	<h4> Country: <%=request.getParameter("country")%></h4>
	

</body>
</html>