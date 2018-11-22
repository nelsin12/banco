package dao;

import hibernateutil.HibernateUtil;
import pojos.Administrador;

import org.hibernate.*;
import javax.ejb.SessionBean;
import javax.persistence.TypedQuery;

import java.util.List;
import org.hibernate.*;
import java.sql.PreparedStatement;  
import java.sql.ResultSet; 
import pojos.Administrador;
import org.hibernate.cfg.*;

public class DaoAdministrador {
	
	private Session session;
    PreparedStatement pst = null;  
    ResultSet rs = null; 
    boolean status = false;  
    
    public boolean insert(Administrador administrador) throws Exception {
    	
    	 Session session = HibernateUtil.getSessionFactory().openSession();
    	 
        Transaction transaccion = session.beginTransaction();
        
        session.save(administrador);
        
       transaccion.commit();
        session.close();
        return true;
    	 
    }
    
    public boolean Logins(Administrador administrador){
    	 
        boolean retorno = false;
        try {
        	
        	
            session = HibernateUtil.getSessionFactory().openSession();
            String hql = "From Administrador WHERE administrador = '" + administrador.getIdAdministrador() + "' and nombre = '" + administrador.getNombre() + "' and apellido = " + administrador.getApellido() + "' telefono = '" + administrador.getTelefono() + "'contrasena = '" + administrador.getEmail();
            TypedQuery<?> query = session.createQuery(hql);
            
            if (!query.getResultList().isEmpty()) {
                retorno = true;
            }
            else
            {
                return retorno;
            }
        }catch (Exception e){
            throw e;
        }
        return retorno;
        }

}
