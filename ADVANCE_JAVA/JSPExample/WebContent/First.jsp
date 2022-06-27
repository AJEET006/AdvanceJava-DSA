<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; 
charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>HI from JSP</h1>
	<% for(int i=0;i<100;i++){ %>
		<br/><b><i>Hello <%= i %></i></b>
		<% }//end of for %>
</body>
</html>