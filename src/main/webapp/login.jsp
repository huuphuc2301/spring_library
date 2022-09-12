<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Library</title>
</head>
<body>
<h1>
    <%= "Login" %>
</h1>
<form action="${uri}" method ="POST">
    <p>
        Username: <input type="text" name="username" />
    </p>
    <p>
        Password: <input type="password" name="password" />
    </p>
    <input type="submit" value="Login"/>
</form>
</body>
</html>
