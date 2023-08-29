<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 8/26/2023
  Time: 11:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%--
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign In</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/sign-in" method="post">
    <label>
        <input type="text" name="username" placeholder="username">
    </label>
    <br>
    <label>
        <input type="password" name="password" placeholder="password">
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
    <title>Sign In</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
        }

        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            width: 300px;
            margin: 0 auto;
        }

        label {
            display: block;
            margin-bottom: 10px;
            font-weight: bold;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 3px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<form action="${pageContext.request.contextPath}/sign-in" method="post">
    <label>
        <input type="text" name="username" placeholder="Username">
    </label>
    <br>
    <label>
        <input type="password" name="password" placeholder="Password">
    </label>
    <br>
    <input type="submit" value="Sign In">
</form>
</body>
</html>
