<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Message</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 0;
        }

        .navbar {
            display: flex;
            justify-content: center;
            align-items: center;
            background-color: #333;
            padding: 10px;
        }

        form {
            margin: 0;
            padding: 0;
        }

        button {
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 4px;
            padding: 8px 16px;
            margin: 0 8px;
            cursor: pointer;
            font-size: 14px;
            transition: background-color 0.3s ease-in-out;
        }

        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<div class="navbar">
    <form action="${pageContext.request.contextPath}home.jsp"><button>Home</button></form>
    <form action="${pageContext.request.contextPath}/chat">
        <input type="hidden" name="userId" value="${userId}">
        <button>Start Chat</button>
    </form>

</div>
</body>
</html>