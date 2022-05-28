<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>

	<div class="p-3">
	
			<table border="1" class="table table-hover">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Order Id</th>
					<th scope="col">Customer Id</th>
					<th scope="col">Order Status</th>
		
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${stocks}" var="o">
					<tr>
						<td>${o.getProductId()}</td>
						<td>${o.getStoreId()}</td>
						<td>${o.getQuantity()}</td>
			

					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>

</body>
</html>