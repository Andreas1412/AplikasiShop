<%-- 
    Document   : product
    Created on : Oct 17, 2017, 3:13:18 PM
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Halaman Product</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
     <a class="navbar-brand" >PRODUCT</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
         <span class="navbar-toggler-icon"></span>
        </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
      <div class="navbar-nav">
      
      <a class="nav-item nav-link" href="../welcome">Home</a>
      <a class="nav-item nav-link" href="../carts">Carts</a>
      
    </div>
    
  </div>
</nav>
        
  <c:forEach var="p" items="${product}">
  <p><a href="${p.id}">${p.namaproduk}</a></p>
  
      </c:forEach>
  
        
    </body>
</html>
