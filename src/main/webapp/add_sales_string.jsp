<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="saveSales">
Vehicle Id : <input type="text" name="vehicle_Id"> <br>
Customer Id : <input type="text" name="customer_Id"> <br>
Order Date : <input type="text" name="order_Date"> <br>
Delivery Date : <input type="text" name="delivery_Date"> <br>
<input type="submit" value="Add Sales">
</form>

${msg }

</body>
</html>