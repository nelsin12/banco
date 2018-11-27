package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import pojos.Cliente;
import pojos.Usuario;
import hibernateUtil.HibernateUtil;

public class DaoCliente {

	//Se define variable Sesion para comunicacion con BD.
	private static Session session;
			
			
	//Metodo obtiene registro de Perfil en base a ID			
	public static boolean checkUserByRUT(Cliente cliente){
		
		boolean check = true;
		//Se instancia nueva sesion a partir de Clase SessionFactory de HibernateUtil.
		session = HibernateUtil.getSessionFactory().openSession();
		   	 
		String query_string = "FROM cliente WHERE rut = :rut";
		Query query = session.createQuery(query_string);
		//TODO: Corregir DB
		query.setParameter("rut",cliente.getRUT());
		List results = query.list();
		
		if(results.size() == 0){
			check = false;
		}
		
		return check;
		
	}
}
