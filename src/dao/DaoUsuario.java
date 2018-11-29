package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import hibernateUtil.HibernateUtil;
import pojos.Perfil;
import pojos.Usuario;


public class DaoUsuario {
	
	//Se define variable Sesion para comunicacion con BD.
	private static Session session;
	
	//Metodo permite ingreso de objeto Usuario a  BD.
	public static boolean IngresarUsuario(Usuario usuario){
		//Se inicializa variable de retorno como falso (en caso de que falle).
		boolean insert =false;
		
		//Se instancia nueva sesion a partir de Clase SessionFactory de HibernateUtil.
		session = HibernateUtil.getSessionFactory().openSession();
   	 
		//Inicias una transaccion. Transaccion es el canal por el cual se comunicara el prgrama con la BD.
        session.beginTransaction();//¿porque en los demas metodos no se inicia una transaccion?
        
        //Insertar un nuevo registro de Usuario a partir del objeto entregado como parametro
        Integer id_usuario = (Integer)session.save(usuario);
        
        if(id_usuario > 0){//¿podria a ver sido distinto de null tambien?
        	insert = true;
        }
        
        //Confirma la insercion del registro
        session.getTransaction().commit();//¿para que sirvia el commit?
        
        //Se cierra sesion
        session.close();
        
        //Se retorna valor de insercion
        return insert;
	}
	
	public static boolean LoginUsuario(Usuario usuario){
		//Se inicializa variable de retorno como falso (en caso de que usuario no este autorizado a login).
		boolean login =true;		
		//Se instancia nueva sesion a partir de Clase SessionFactory de HibernateUtil.
		session = HibernateUtil.getSessionFactory().openSession();		
		//Se genera consulta a ejecutar en BD.
		String query_string = "FROM usuario WHERE alias = :alias";
		//Se asocia query a actual sesion.
		Query query = session.createQuery(query_string);
		//Se setea parametro de querypara evitar inyeccion.
		query.setParameter("alias",usuario.getAlias());
		//Se guarda resultado de query en lista.
		List results = query.list();
		
		//Se valida que la lista tenga al menos 1 registro
		if(results.size() == 0){
			login = false;
		}else{
			Usuario usuario1 = new Usuario();
			usuario1 = (Usuario) results.get(0);
			
			//Se comparan las contraseñas del registro y del usuario entregado como parametro
			if(!usuario.getClave().equals(usuario1.getClave())){
				login = false;
			}
		}
		
		return login;
	}
}
