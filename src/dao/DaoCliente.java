package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import hibernateutil.HibernateUtil;
import pojos.Cliente;
import ejb.EjbCliente;

public class DaoCliente {

	private Session session;
    ResultSet rs = null; 
    boolean status = false;
    
    public boolean Logins(EjbCliente cliente){
   	 
        boolean retorno = false;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            String login_query = "Select * From cliente WHERE rut_persona = '" + cliente.getRut_persona();
            TypedQuery<?> query = session.createQuery(login_query);
            
            if (query.getSingleResult() != null ) {
            	
            	Cliente pojosCliente = new Cliente();
            	pojosCliente = (Cliente) query.getSingleResult();
            	if(!pojosCliente.getClaveCliente().equals(cliente.getClave_cliente())){
            		retorno = false;
            	}else{
            		retorno = true;
            	}                
            }
            else
            {
                retorno = false;
            }
        }catch (Exception e){
            throw e;
        }
        return retorno;
   }
    
    public EjbCliente getCliente(Integer id){
    	
    	EjbCliente ejbcliente = new EjbCliente();
    	try {
            session = HibernateUtil.getSessionFactory().openSession();
            String login_query = "Select * From cliente WHERE id_cliente = '" + id;
            TypedQuery<?> query = session.createQuery(login_query);
            
            if (query.getSingleResult() != null ) {
            	
            	Cliente pojosCliente = new Cliente();
            	pojosCliente = (Cliente) query.getSingleResult();
            	ejbcliente.setApe_materno(pojosCliente.getPersona().getApeMaterno());
            }
            else
            {
                ejbcliente = null;
            }
        }catch (Exception e){
            throw e;
        }
    	return ejbcliente;
    }
}
