<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%if(request.getAttribute("sum")!=null){ %>
	<%int sum=(int)request.getAttribute("sum"); %>
	<h1>The sum is<%=sum %></h1>
	<%} %>

</body>
</html>