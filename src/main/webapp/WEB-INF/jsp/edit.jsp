<%-- 
    Document   : edit
    Created on : Mar 8, 2017, 6:18:42 PM
    Author     : yassir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <f:form action="update.htm" modelAttribute="employee">
            <input type="hidden" name="id" value="${emp.id}"/>
            Name: <input type="text" name="name" value="${emp.name}"/>
            <input type="submit" value="Save"/>
        </f:form>
    </body>
</html>
