
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>library</title>
</head>
<body>
<h2>Books: </h2>
<form action="${uri}" method="GET">
    <input type="text" name="search_text" value="${search_text}"/>
    <input type="submit" value="Search"/>
</form>
<table border="1px">
    <thead>
    <tr>
        <th>Title</th>
        <th>Author</th>
        <th>Category</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.title}</td>
            <td>${book.author.name}</td>
            <td>${book.category.name}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
