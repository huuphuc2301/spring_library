<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Library</title>
</head>
<body>
<form action="${back_uri}" method="GET">
    <input type="submit" value="Back"/>
</form>
<form action="${update_uri}" method="POST">
    Name: <input type="text" name="name" value="${author.name}"/>
    <br/><br/>
    Birth year: <input type="text" name="birth_year" value="${author.birthYear}"/>
    <br/><br/>
    Gender:
    <select name="gender">
        <c:choose>
            <c:when test="${author.gender == 'FEMALE'}">
                <option value="FEMALE" selected> Female </option>
                <option value="MALE"> Male </option>
            </c:when>
            <c:otherwise>
                <option value="FEMALE"> Female </option>
                <option value="MALE" selected> Male </option>
            </c:otherwise>
        </c:choose>
    </select>
    <br/><br/>
    Nationality:
    <select name="nationality">
        <c:forEach items="${nationalities}" var="nationality">
            <c:choose>
                <c:when test="${author.nationality == nationality}">
                    <option value="${nationality.id}" selected>${nationality.name}</option>
                </c:when>
                <c:otherwise>
                    <option value="${nationality.id}">${nationality.name}</option>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </select>
    <br/><br/>
    <input type="submit" value="Save"/>
</form>
<form action="${delete_uri}" method="POST">
    <input type="submit" value="Delete"/>
</form>
</body>
</html>
