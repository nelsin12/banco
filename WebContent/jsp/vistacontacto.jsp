<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<header>
      <div class="contenedor">
        <div id="marca">
          <h1><span class="resaltado">THINK</span> Siempre pensando en ti</h1>
        </div>
        <nav>
          <ul>
            <li><a href="index.html">Inicio</a></li>
            <li><a href="contacto.html">Contacto</a></li>
            <li><a href="login.html">login</a></li>
          </ul>
        </nav>
      </div>
    </header>
    <section id="main">
             <div id="container">
          <form name="formulario" id="formulario" method="post" action="envio.php">
            <fieldset><h2>Contacto</h2></fieldset>

         <div>
         <label for="nombre">Nombre: </label>
         <input type="text" name="nombre" id="nombre" size="60">
         <span id="validar-nombre"></span>
        </div>

         <div>
          <label for="correo">Correo:</label>
         <input type="text" name="correo" id="correo" size="60"/>
         <span id="validar-correo"></span>
         </div>

        <div><label for="sitio">Sitio Web:</label>
         <input type="text" name="sitio" id="sitio" size="60"/>
         <span id="validar-sitio"></span>
        </div>

         <div>
         <label for="mensaje">Mensaje: </label>
         <textarea name="mensaje" id="mensaje" rows="10" cols="56"></textarea>
         <span id="validar-mensaje"></span>
         </div>

         <p id="envio">
         <input type="submit" name="enviar" id="enviar" value="Enviar" />
         </p>

        </form>
        <aside id="lateral">
          <div class="oscuro">
            <h3>Haste cliente</h3>
            <p>contactate con nuestros ejecutivos y ellos te guiaran en todo, para que puedas ser parte de nuestra gran comunidad, recuerda nuestra atencion es 100% personalizada sin letra chica</p>
            <p>no puedes venir al banco porque  no tienes tiempo no te preocupes no necesitas ser un cliente vib, nosotros vamos a tu casa</p>
            <p>no posees un contrato laboral fijo, no te preocupes ¡con nosotros no lo nesecitas!
          </div>
        </aside>
      </div>
    </section>

  </main>
  <br>
  <br>
  <br>
 <footer>
     <div class="container-footer-all">
         <div class="container-body">
            <div class="colum1">
              <h1>Mas Informacion del BANCO</h1>
                  <p>Este banco se encuentra en el segundo puesto de los bancos mas
                  importantes en too chile , cuenta con mas de 153 mi clientes y 400 bancos
                  a lo largo de todo el pais, funcionando desde 1990 gracias al apoyo
                  de ipBancos y la republica de chile, sede sentral ubicada en moneda 284</p>
           </div>
           <div class="colum2">
                <h1>Redes sociales</h1>
                  <div class="row">
                    <img src="img/facebook.png">
                    <label>Siguienos en facebook</label>
                  </div>
                  <div class="row">
                    <img src="img/twitter.png">
                    <label>Siguienos en twitter</label>
                  </div>
                  <div class="row">
                    <img src="img/instagram.png">
                    <label>Siguienos en instagram</label>
                  </div>
           </div>
           <div class="colum3">
                <h1>Informacion Contactos</h1>

                <div class="row2">
                  <img src="img/house.png">
                  <label>casa central moeda 289 santiago/ chile </label>
                </div>
                <div class="row2">
                  <img src="img/smartphone.png">
                  <label>fono : 800 805 980 </label>
                </div>
                <div class="row2">
                  <img src="img/google-plus.png">
                  <label>Email: BancoThink@gmail.com </label>
                </div>
           </div>
         </div>
       </div>
  </footer>
</body>
</html>