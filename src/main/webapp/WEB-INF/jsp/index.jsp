<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <a href="redirectCreate.htm">Insert a new employee</a>
        <table style="border-collapse: collapse" cellpadding="7px"
            border="1">
            <tr>
                <th> ID </th>
                <th> Name</th>
                <th> Actions</th>
            </tr>
            <c:forEach items="${lst}" var="em">
                <tr>
                    <td>${em.id}</td>
                    <td>${em.name}</td>
                    <td>
                        <a href="edit.htm?id=${em.id}">Edit </a>| 
                        <a href="remove.htm?id=${em.id}"
                           onclick="return confirm('Are you sure?')"> Remove </a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>