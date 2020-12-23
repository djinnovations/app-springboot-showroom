<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

.glow {
  font-size: 20px;
  color: #000;
  text-align: center;
  -webkit-animation: glow 1s ease-in-out infinite alternate;
  -moz-animation: glow 1s ease-in-out infinite alternate;
  animation: glow 1s ease-in-out infinite alternate;
}

@-webkit-keyframes glow {
  from {
    text-shadow: 0 0 10px #fff, 0 0 20px #fff, 0 0 30px #e60073, 0 0 40px #e60073, 0 0 50px #e60073, 0 0 60px #e60073, 0 0 70px #e60073;
  }
  
  to {
    text-shadow: 0 0 20px #fff, 0 0 30px #ff4da6, 0 0 40px #ff4da6, 0 0 50px #ff4da6, 0 0 60px #ff4da6, 0 0 70px #ff4da6, 0 0 80px #ff4da6;
  }
}
</style>
</head>
<body>

<form action="saveCustomer">
Customer Name : <input type="text" name="name" required="required"> <br>
Email Address : <input type="email" name="email_Id"> <br>
Contact Number : <input type="tel" name="contact_Number" inputmode="decimal" required="required"> <br>
Customer Address : <input type="text" name="address" required="required"> <br>
User name : <input type="text" name="user_Name"> <br>
Password : <input type="password" name="password"><br>
<input type="submit" value="Add Customer">
</form>

<p class="glow">${msg }</p>

</body>
</html>