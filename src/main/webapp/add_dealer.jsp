<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="saveDealer">
Dealer Name : <input type="text" name="name" required="required"> <br>
Email Address : <input type="email" name="email_Id"> <br>
Contact Number : <input type="tel" name="contact_Number" inputmode="decimal" required="required"> <br>
Dealer Address : <input type="text" name="address" required="required"> <br>
<input type="submit" value="Add Dealer">
</form>

${msg }

</body>
</html>