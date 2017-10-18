<%-- 
    Document   : registration
    Created on : Oct 16, 2017, 9:23:11 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form Registration</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    </head>
    <body>
        <h1>Form Registration</h1>
        
        <form:form action="register/save" modelAttribute="registerBean" method="POST">
            
            <form:label path="firstName">First Name</form:label>
            <form:input path="firstName"/> <br/>
            <form:label path="lastName">Last Name</form:label>
            <form:input path="lastName"/> <br/>
            <form:label path="userName">User Name</form:label>
            <form:input path="userName"/> <br/>
            <form:label path="password">Password</form:label>
            <form:password path="password"/> <br/>
            <p>
                <button name="submitButton" value="Sumbit" > Submit </button>
                
            </p>
        </form:form>
        
    </body>
</html>
