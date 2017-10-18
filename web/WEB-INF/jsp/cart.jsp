<%-- 
    Document   : cart
    Created on : Oct 18, 2017, 3:30:10 AM
    Author     : 200NS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <title>Carts Page</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
     <a class="navbar-brand" >Carts</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
         <span class="navbar-toggler-icon"></span>
        </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      
        <a class="nav-item nav-link" href="../welcome">Home</a>
        <a class="nav-item nav-link" href="../product/all">Daftar Produk</a>
      
    </div>
  </div>
</nav>
        <br/>
        <p>
        <table class="table">
            <thead class="thead-inverse">
                <tr>
                    <th> ID </th>
                    <th> Nama Produk </th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="p" items="${kart}">
                   <tr>
                       <td>
                            ${kart}
                        </td>
                         
                        <td>
                             ${kart}]
                        </td>
                </tr>
                
  
      </c:forEach>
                
 
            <tbody>
                </table>
        </p>
  
      
                
                
    </body>
</html>
