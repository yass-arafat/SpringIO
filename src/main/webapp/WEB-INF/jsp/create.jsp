<%-- 
    Document   : create
    Created on : Mar 8, 2017, 6:29:28 PM
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
        <f:form action="create.htm" modelAttribute="employee">
            Name: <input type="text" name="name"/>
            <input type="submit" value="Insert"/>
        </f:form>
    </body>
</html>
