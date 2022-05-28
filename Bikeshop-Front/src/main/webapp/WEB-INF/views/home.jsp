<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BikeShop Catalog and Inventory</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
	
		<h1 class="py-3 px-1">Monitor de inventario</h1>
		<br>
		<div>
			<form:form action="/listar" method="POST" modelAttribute="busquedaDTO">
				<div class="form-group row col-12">
				 <div class="form-group row col-3">
			      	 <p class="text-muted">Tienda  </p>
			      	 <br>
			     	 <select name="storeId" class="form-control">
			     	 	<c:forEach items="${stores}" var="store">
			     	 		<option class="col-6" value="${store.storeId}"><c:out value="${store.getStoreName()}"></c:out></option>
			     	 	</c:forEach>
					 </select>
				  </div>
				  <div class="form-group row col-3">
			      	 <p class="text-muted">Categoria  </p>
			      	 <br>
			     	 <select  name="categoryId" class="form-control">
			     	 	<c:forEach items="${categories}" var="categories">
			     	 		<option class="col-6" value="${categories.categoryId}"><c:out value="${categories.getCategoryName()}"></c:out></option>
			     	 	</c:forEach>
					 </select>
				  </div>
				  <div class="form-group row col-3">
			      	 <p class="text-muted">Marca  </p>
			      	 <br>
			     	 <select name="brandId" class="form-control">
			     	 <c:forEach items="${brands}" var="brands">
			     	 	<option class="col-6" value="${brands.brandId}"><c:out value="${brands.getBrandName()}"></c:out> </option>
			     	 </c:forEach>
						
					 </select>
				  </div>
				</div>
			  <br>
			  <div class="form-group row px-3">
				 <div >
					 <button type="submit" class="btn btn-primary">Buscar</button>
				 </div>
			  </div>
		   </form:form>
		</div>
		<br>

						



	</div>
</body>
</html>