<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Choose Friend</title>
  <style>
    body {
      font-family: Arial, sans-serif;
    }
    h1 {
      font-size: 24px;
    }
    h2 {
      font-size: 20px;
    }
    ul {
      list-style: none;
      padding: 0;
    }
    li {
      margin-bottom: 10px;
    }
    a {
      text-decoration: none;
      color: #007bff;
    }
    input[type="text"] {
      padding: 8px;
      border: 1px solid #ccc;
      border-radius: 4px;
    }
    button {
      padding: 8px 16px;
      background-color: #007bff;
      color: white;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }
    button:hover {
      background-color: #0056b3;
    }
  </style>
</head>
<body>
<h1>Select a Friend</h1>
<h1>Chat Page</h1>

<h2>Existing Friends:</h2>
<ul>
  <c:forEach items="${existingFriends}" var="friend">
    <li>${friend.name} <a href="/start-chat${friend.id}">Start Chat</a></li>
  </c:forEach>
</ul>

<h2>Search for New Friends:</h2>
<form action="${pageContext.request.contextPath}/search-results" method="get">
  <label>
    <input type="text" name="searchQuery" placeholder="Search for friends...">
  </label>
  <button type="submit">Search</button>
</form>

</body>
</html>