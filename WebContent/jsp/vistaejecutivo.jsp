<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/estilos.css">
<link rel="stylesheet" href="css/ejecutivo.css">
<title>vista ejecutivo</title>
</head>
<body>
	<%
		if(session.getAttribute("username") == null){
			response.sendRedirect("login.jsp");
		}
	%>
	<header>
	<div class="contenedor">
		<div id="marca">
			<h1>
				<span class="resaltado">THINK</span> Siempre pensando en ti
			</h1>
			<br>
		</div>
		<nav>
		<ul>
			<li class="actual"><a href="#">Cerrar Sesion </a></li>
			<li><a href="login.html">| X |</a></li>
		</ul>
		</nav>
	</div>
	</header>
	<br>
	<br>
	<!--ACA ESTA EL MENU-->
	<nav class="navegacion">
	<ul class="menu">
		<li><a href="EjecutivoPrincipal.html">Estados</a></li>
		<li><a href="EjecutivoSoliciudDeCredito.html">Nuevas
				Solicitudes</a></li>

	</ul>
	</nav>
	<main> <br>
	<div id="main-container">
		<table>
			<thead>
				<tr>
					<th>Cliente</th>
					<th>Monto solicitado</th>
					<th>Numero de cuotas</th>
					<th>Fecha Autorizacion</th>
					<th>Fecha de entrega</th>
					<th>Estado</th>
				</tr>
			</thead>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
		</table>
	</div>
	<br>
	<br>

	</main>
	<br>
	<br>
	<br>
	<footer>
	<div class="container-footer-all">
		<div class="container-body">
			<div class="colum1">
				<h1>Mas Informacion del BANCO</h1>
				<p>Este banco se encuentra en el segundo puesto de los bancos
					mas importantes en too chile , cuenta con mas de 153 mi clientes y
					400 bancos a lo largo de todo el pais, funcionando desde 1990
					gracias al apoyo de ipBancos y la republica de chile, sede sentral
					ubicada en moneda 284</p>
			</div>
			<div class="colum2">
				<h1>Redes sociales</h1>
				<div class="row">
					<img src="img/facebook.png"> <label>Siguienos en
						facebook</label>
				</div>
				<div class="row">
					<img src="img/twitter.png"> <label>Siguienos en
						twitter</label>
				</div>
				<div class="row">
					<img src="img/instagram.png"> <label>Siguienos en
						instagram</label>
				</div>
			</div>
			<div class="colum3">
				<h1>Informacion Contactos</h1>

				<div class="row2">
					<img src="img/house.png"> <label>casa central moeda
						289 santiago/ chile </label>
				</div>
				<div class="row2">
					<img src="img/smartphone.png"> <label>fono : 800 805
						980 </label>
				</div>
				<div class="row2">
					<img src="img/google-plus.png"> <label>Email:
						BancoThink@gmail.com </label>
				</div>
			</div>
		</div>
	</div>
	</footer>

</body>
</html>