<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 8/26/2023
  Time: 10:03 AM
  To change this template use File | Settings | File Templates.
--%>




<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>



<a href="${pageContext.request.contextPath}/sign-in"> sign-in</a>
<br>
<a href="${pageContext.request.contextPath}/sign-up"> sign-up</a>

</body>
</html>--%>




<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        #container {
            width: 960px;
            margin: 0 auto;
            background-color: white;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        a {
            text-decoration: none;
            color: #333;
            font-weight: bold;
            padding: 5px 10px;
            border-radius: 3px;
            background-color: #f0f0f0;
            margin: 5px;
            display: inline-block;
            transition: background-color 0.3s ease;
        }
        a:hover {
            background-color: #ddd;
        }
    </style>
</head>
<body>
<div id="container">
    <a href="${pageContext.request.contextPath}/sign-in">Sign In</a>
    <a href="${pageContext.request.contextPath}/sign-up">Sign Up</a>
</div>
</body>
</html>
