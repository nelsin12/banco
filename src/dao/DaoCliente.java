package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import pojos.Cliente;
import pojos.Usuario;
import hibernateUtil.HibernateUtil;

public class DaoCliente {

	//Se define variable Sesion para comunicacion con BD.
	private static Session session;//¿siempre hay que definir esta variable con cada sessionFactory que instancie?
			
			
	//Metodo obtiene registro de Perfil en base a ID			
	public static boolean checkUserByRUT(Cliente cliente){
		
		boolean check = true;//declaro el check como true siempre
		//Se instancia nueva sesion a partir de Clase SessionFactory de HibernateUtil.
		session = HibernateUtil.getSessionFactory().openSession();
		   	 
		//¿tomo el rut de la tabla cliente y me lo traigo como query? 
		String query_string = "FROM cliente WHERE rut = :rut";
		Query query = session.createQuery(query_string);
		
		//¿llamo al parametro rut atravez de la query y obtengo el rut de este y lo almaceno en una lista?
		query.setParameter("rut",cliente.getRUT());
		List results = query.list();
		
		if(results.size() == 0){
			check = false;
		}
		
		return check;//¿quien captura o llama a este return?
		
	}
}
