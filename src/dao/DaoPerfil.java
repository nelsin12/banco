package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import hibernateUtil.HibernateUtil;
import pojos.Perfil;

public class DaoPerfil {

	//Se define variable Sesion para comunicacion con BD.
	private static Session session;
	
	
	//Metodo obtiene registro de Perfil en base a ID
	
	public static Perfil getPerfilByID(Integer perfil_id){
				
		//Se instancia nueva sesion a partir de Clase SessionFactory de HibernateUtil.
		session = HibernateUtil.getSessionFactory().openSession();
   	 
		String query_string = "FROM perfil WHERE id = :id";//¿falto el select? => hibernate no lleva select cuando requieres todas las columnas.
		Query query = session.createQuery(query_string);
		query.setParameter("id",perfil_id);
		List results = query.list();
		
		Perfil perfil = new Perfil();
		perfil = (Perfil) results.get(0);
		
		return perfil;

	}
}
