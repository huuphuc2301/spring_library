
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>library</title>
</head>
<body>
    <h2>Authors: </h2>
    <table border="1px">
        <thead>
        <tr>
            <th>Name</th>
            <th>Birth Year</th>
            <th>Gender</th>
            <th>Nationality</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${authors}" var="author">
            <tr>
                <td>${author.name}</td>
                <td>${author.birthYear}</td>
                <td>${author.gender}</td>
                <td>${author.nationality.name}</td>
                <td><a href="${uri}/${author.id}">Detail</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
