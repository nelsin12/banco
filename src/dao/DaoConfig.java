package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import hibernateUtil.HibernateUtil;
import pojos.Perfil;

public class DaoConfig {

	//Se define variable Sesion para comunicacion con BD.
		private static Session session;
		
		
		//Metodo obtiene registro de Perfil en base a ID
		
		public static String getConfigByID(Integer config_id){
					
			//Se instancia nueva sesion a partir de Clase SessionFactory de HibernateUtil.
			session = HibernateUtil.getSessionFactory().openSession();
	   	 
			String query_string = "SELECT valor FROM config WHERE id = :id";
			Query query = session.createQuery(query_string);
			query.setParameter("id",config_id);
			List results = query.list();
			
			return (String) results.get(0);

		}
}
