<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 8/26/2023
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%--
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign up</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/sign-up" method="post">
    <label>
        <input type="text" name="name" placeholder="name">
    </label>
    <br>
    <label>
        <input type="text" name="username" placeholder="username">
    </label>
    <br>
    <label>
        <input type="password" name="password" placeholder="password">
    </label>
    <br>
    <label>
        <input type="text" name="phoneNumber" placeholder="phoneNumber">
    </label>
    <br>
    <input type="submit">
</form>
</body>
</html>
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign up</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }

        form {
            width: 300px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            background-color: #f9f9f9;
            border-radius: 5px;
        }

        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<form action="${pageContext.request.contextPath}/sign-up" method="post">
    <label>
        <input type="text" name="name" placeholder="Name">
    </label>
    <br>
    <label>
        <input type="text" name="username" placeholder="Username">
    </label>
    <br>
    <label>
        <input type="password" name="password" placeholder="Password">
    </label>
    <br>
    <label>
        <input type="text" name="phoneNumber" placeholder="Phone Number">
    </label>
    <br>
    <input type="submit" value="Sign Up">
</form>

</body>
</html>
