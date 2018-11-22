package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ejb.*;
import dao.*;

import javax.servlet.RequestDispatcher;

public class Servlet extends HttpServlet{
	
	public boolean login(String rut, String pass){
		EjbCliente cliente = new EjbCliente();
		cliente.setRut_persona(rut);
		cliente.setClave_cliente(pass);
		DaoCliente daocliente = new DaoCliente();
		return daocliente.Logins(cliente);
	}

}
