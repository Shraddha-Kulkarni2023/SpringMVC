<%@ page import="com.Example.Model.User" %>
<html>
<head>
    <title>Login Success</title>
</head>
<body>
    <h2></h2>
    <% User user1 = (User) request.getAttribute("user1"); %>
    <p>Welcome, <%= user1.getUsername() %>  <%= user1.getPassword() %></p>
</body>
</html>