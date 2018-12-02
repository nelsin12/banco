<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ventana del login</title>
<link rel="stylesheet" href="css/login.css">
</head>
<body>

	<div class="login-box">
		<img src="img/logo 4.png" class="avatar" alt="Avatar Image">
		<h1>Cuenta</h1>
		<form action="LoginServlet">
			<!-- USERNAME INPUT -->
			<label for="username">Usuario</label> <input type="text"
				placeholder="Ingresar Usuario">
			<!-- PASSWORD INPUT -->
			<label for="password">Clave</label> <input type="password"
				placeholder="Ingresar Clave"> <label for="password">Tipo
				de ingreso</label> <br> <select>
				<option value="0">Cliente</option>
				<option value="1">Supervisor</option>
				<option value="2">Ejecutivo</option>
			</select> <br> <br> <input type="submit" value="Ingresar"> <a
				href="ejecutivosolicitudCliente.html">Registrate</a><br> <a
				href="#">¿olvidaste tu contraseña?</a>
		</form>
	</div>


</body>
</html>