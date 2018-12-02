package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import ejb.EjbCredito;
import hibernateUtil.HibernateUtil;

public class DaoCredito {

	//Se define variable Sesion para comunicacion con BD.
	private static Session session;
	
		
		
	//Metodo obtiene registro de Perfil en base a ID		
	public static List<Integer> getMontosCreditosAprobados(){
					
			//Se instancia nueva sesion a partir de Clase SessionFactory de HibernateUtil.
			session = HibernateUtil.getSessionFactory().openSession();
	   	 
			String query_string = "SELECT monto FROM credito WHERE estado = :estado";
			Query query = session.createQuery(query_string);
			query.setParameter("estado",EjbCredito.ESTADO_CREDITO_APROBADO);
			List<Integer> creditos = (List<Integer>) query.list();
			return creditos;

	}
}
