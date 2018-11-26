package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejb.EjbUsuario;
import ejb.EjbPerfil;
import pojos.Usuario;
import pojos.Perfil;

/**
 * Servlet implementation class IngresarUsuarioServlet
 */
@WebServlet("/IngresarUsuarioServlet")
public class IngresarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IngresarUsuarioServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Se crea objeto usuario de la capa "negocio" (package ejb)
		EjbUsuario ejbUsario = new  EjbUsuario();
		EjbPerfil ejbPerfil = new EjbPerfil();
		
		
		//Se crea objeto usuario de la capa "datos" (package pojos)
		Usuario pojosUsuario = new Usuario();
		Perfil pojosPerfil = new Perfil();
		
		pojosUsuario.setNombre(request.getParameter("txt_nombre"));
		pojosUsuario.setAlias(request.getParameter("txt_alias"));
		pojosUsuario.setClave(request.getParameter("txt_clave"));
		pojosUsuario.setPerfil(ejbPerfil.getPerfilByID(request.getParameter("cmb_perfil")));
		pojosUsuario.setNombre(request.getParameter("txt_nombre"));
		pojosUsuario.setNombre(request.getParameter("txt_nombre"));
	}

}
