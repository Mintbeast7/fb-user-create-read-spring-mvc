<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Facebook SignUp</title>
</head>
<body>

	<form action="viewconfirmationpage" method="post">

		<label for="firstname">First Name</label><br> <input type="text"
			id="firstname" name="firstname" placeholder="Enter first name"
			required> <br>
		<br> <label for="lastname">Last Name</label><br> <input
			type="text" id="lastname" name="lastname"
			placeholder="Enter last name" required> <br>
		<br> <label for="email">Email ID</label><br> <input
			type="email" id="email" name="email"
			placeholder="Enter email address" required> <br>
		<br> <label for="mobile">Mobile Number</label><br> <input
			type="tel" id="mobile" name="mobile"
			placeholder="Enter mobile number" required> <br>
		<br> <label for="password">Password</label><br> <input
			type="password" id="password" name="password"
			placeholder="Enter password" required> <br>
		<br> <label for="location">Location</label><br> <input
			type="text" id="location" name="location"
			placeholder="Enter location" required> <br>
		<br> <input type="submit" value="Submit">

	</form>


</body>
</html>