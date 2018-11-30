package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejb.EjbUsuario;
import pojos.Usuario;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
    	super();
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Se instancia objeto de la clase EjbUsuario para acceder a metodo LoginUsuario
		//Se puede definir este metodo como estatico y evitar instanciar este objeto.
		EjbUsuario ejbUsuario = new EjbUsuario();
		
		//Se instancia objeto de la clase Usuario (pojos) para entregar como parametro a metodo LoginUsuario
		Usuario pojosUsuario = new Usuario();
		
		//Se setean atributos de Usuario en base a informacion formulario (vista)
		String alias = request.getParameter("usuario");
		pojosUsuario.setAlias(alias);
		pojosUsuario.setClave(request.getParameter("clave"));
		
		//Se llama a metodo LoginUsuario definido en clase EjbUsuario.
		boolean login = ejbUsuario.LoginUsuario(pojosUsuario);
		
		if(login) {
			Usuario usuario = ejbUsuario.getUsuarioByUserName(alias);
			Integer perfil_id = usuario.getPerfil().getId();
			
			switch(perfil_id) {
				case 1:
					response.sendRedirect("vistasupervisor.jsp");
					break;
				case 2:
					response.sendRedirect("vistaejecutivo.jsp");
					break;
				case 3:
					response.sendRedirect("datoscliente.jsp");
					break;
			}
		}else {
			response.sendRedirect("login.jsp");
		}
		
	}

}
