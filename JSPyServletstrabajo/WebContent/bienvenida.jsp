<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Panel de control</title>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link 
	rel="stylesheet" 
	type="text/css"
    href="css/bootstrap.min.css">
<script
	 src="js/bootstrap.min.js">
</script>
</head>
<body>
   <div class="container">
		<div class="row">
			<div class="col-md-2">
				
			</div>
			<div class="col-md-8">
				<h1 class="text-center">Escuela De Tecncologias De La Información</h1>
				<h2 class="text-center">Panel Principal</h2>
				<h3 class="text-center">Sistema</h3>
				<p class="text-center">
					<%= request.getAttribute("usuarioLogueado") %>
				</p>
			</div>
			<div class="col-md-2">
				
			</div>
		</div>
	</div>
</body>
</html>