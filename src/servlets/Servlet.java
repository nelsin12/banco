package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jboss.resteasy.spi.HttpResponse;

import ejb.*;
import dao.*;

import javax.servlet.RequestDispatcher;

public class Servlet extends HttpServlet{ 
	
	
	
	public void doPost(HttpServletRequest request,HttpResponse response){
		
		String rut = request.getParameter("rut");
		String pass = request.getParameter("pass");
		EjbCliente cliente = new EjbCliente();
		cliente.setRut_persona(rut);
		cliente.setClave_cliente(pass);
		DaoCliente daocliente = new DaoCliente();
		if(daocliente.Logins(cliente)){
			RequestDispatcher request_dispatcher = request.getRequestDispatcher("index.jsp");
			try {
				request_dispatcher.forward(request, (ServletResponse) response);
			} catch (ServletException | IOException e) {				
				e.printStackTrace();
			}
		}else{
			RequestDispatcher request_dispatcher = request.getRequestDispatcher("Formulario.jsp");
			try {
				request_dispatcher.forward(request, (ServletResponse) response);
			} catch (ServletException | IOException e) {				
				e.printStackTrace();
			}
		}
	}
	
	

}
