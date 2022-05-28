<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
    <title>Booklet</title>
</head>
<body>


<!-- Fin Header -->

<!-- Inicio Contenido -->
<div class="p-3">

		<form method="POST" action="/listar">
	
	
			<select name = "stores">
			  <c:forEach items="${stores}" var="s">
	    			<option class="dropdown-item" href="#" value="${s.getStoreId()}"><c:out value="${s.getStoreName()}"/><option> 
	    	  </c:forEach>
			</select>

			<br><br>
			<!-- - 
			<select name = "categories">
			  <c:forEach items="${categories}" var="c">
	    			<option class="dropdown-item" href="#" value="${c.getCategoryName()}"><c:out value="${c.getCategoryName()}"/><option> 
	    	  </c:forEach>
			</select>
			
			<br><br>
			
			<select name = "brands">
			  <c:forEach items="${brands}" var="b">
	    			<option class="dropdown-item" href="#" value="${b.getBrandsName()}"><c:out value="${b.getBrandsName()}"/><option> 
	    	  </c:forEach>
			</select>
			-->
			<br>
			  <div class="form-group row">
				 <div >
					 <button type="submit" class="btn btn-primary">Buscar</button>
				 </div>
			  </div>

	
	</form>

	
	


</div>

<!-- Fin Contenido -->
</body>
</html>