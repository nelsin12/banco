package hibernateutil;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;

public class HibernateUtil {
	
	private static StandardServiceRegistry standarServiceRegistry;
	 private static SessionFactory factory;
	    
	    static {
	        try {
	        	
	        	Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
	        	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
	        	applySettings(configuration.getProperties());
	            factory = configuration.buildSessionFactory(builder.build());

	        } catch (Throwable ex) {
	           System.out.println("se cae acaaaaaa");
	            throw new ExceptionInInitializerError(ex);
	        }
	    }
	    
	    public static SessionFactory getSessionFactory() {
	        return factory;
	    }

}
