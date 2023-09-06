<%--
  Created by IntelliJ IDEA.
  User: sardor
  Date: 30.08.2023
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Results</title>
</head>
<body>
<h1>Search Results</h1>

<h2>Search Results:</h2>
<ul>
    <c:forEach  var="result" items="${friends}">
        <li>${result.name}
            <form action="${pageContext.request.contextPath}/message">

                <input type="hidden" name="friendId" value="${result.id}">
                <input type="hidden" name="userId" value="${userId}">
                <button>Start Chat</button>
            </form>
        </li>
    </c:forEach>
</ul>
</body>
</html>

