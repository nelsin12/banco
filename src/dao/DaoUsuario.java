package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.hibernate.Session;

import hibernateUtil.HibernateUtil;
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
        session.beginTransaction();
        
        //Insertar un nuevo registro de Usuario a partir del objeto entregado como parametro
        Integer id_usuario = (Integer)session.save(usuario);
        
        if(id_usuario > 0){
        	insert = true;
        }
        
        //Confirma la insercion del registro
        session.getTransaction().commit();
        
        //Se cierra sesion
        session.close();
        
        //Se retorna valor de insercion
        return insert;
	}
}
