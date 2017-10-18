<%-- 
    Document   : productdetail
    Created on : Oct 17, 2017, 3:19:13 PM
    Author     : user
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <title>Detail Page</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
     <a class="navbar-brand" >Produk Detail</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
         <span class="navbar-toggler-icon"></span>
        </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      
        <a class="nav-item nav-link" href="../welcome">Home</a>
        <a class="nav-item nav-link" href="../">Product All</a>
      
    </div>
  </div>
</nav>
        <br/>
        <table class="table">
            <thead>
                <tr>
                    <th> ID </th>
                    <th> Nama Produk </th>
                    <th> Harga </th>
                </tr>
            </thead>
            
            <tbody>
                <tr>
                    <td>${product.id}</td>
                    <td>${product.namaproduk}</td>
                    <td>${product.harga}</td>
                </tr>
            </tbody>
        </table>
            
        <a href="beli"> <button> AddCart </button>  </a>
        
            
        
    </body>
</html>
