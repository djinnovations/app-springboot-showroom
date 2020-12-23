<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="saveVehicle">
Dealer Id : <input type="text" name="dealer_Id" required="required"> <br>
Vehicle Type : <input type="text" name="type" required="required"> <br>
Vehicle Name : <input type="text" name="name" required="required"> <br>
Vehicle Model : <input type="text" name="model" required="required"> <br>
Vehicle Cost : <input type="text" name="cost" inputmode="numeric" required="required"> <br>
<input type="submit" value="Add Vehicle">
</form>

${msg }

</body>
</html>