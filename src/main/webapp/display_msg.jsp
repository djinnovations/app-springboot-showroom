<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%!List eList = new ArrayList();%>
	<table>
		<%
			eList = (ArrayList) request.getAttribute("data");
			for (int i = 0; i < eList.size(); i++) {
		%>
		<tr>
			<td><%=eList.get(i)%></td>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>