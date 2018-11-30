package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import pojos.Cliente;
import hibernateUtil.HibernateUtil;

public class DaoCliente {

	//Se define variable Sesion para comunicacion con BD.
	private static Session session;//¿siempre hay que definir esta variable con cada sessionFactory que instancie? => SessionFactory se instancia solo una vez. El objeto session se instancia usando SessionFactory.
			
			
	//Metodo obtiene registro de Perfil en base a ID			
	public static boolean checkUserByRUT(Cliente cliente){
		
		boolean check = true;//declaro el check como true siempre
		//Se instancia nueva sesion a partir de Clase SessionFactory de HibernateUtil.
		session = HibernateUtil.getSessionFactory().openSession();
		   	 
		//¿tomo el rut de la tabla cliente y me lo traigo como query?  => Tomas el rut como parametro de busqueda y con ese RUT te traes el registro Cliente.
		String query_string = "FROM cliente WHERE rut = :rut";
		Query query = session.createQuery(query_string);
		
		//¿llamo al parametro rut atravez de la query y obtengo el rut de este y lo almaceno en una lista? => Esta linea setea el parametro rut de la query con un valor. El resultado de la query se almacena como lista.
		query.setParameter("rut",cliente.getUsuario().getRut());
		List results = query.list();
		
		if(results.size() == 0){
			check = false;
		}
		
		return check;//¿quien captura o llama a este return? => EjbCredito:30
		
	}
	
	
}
