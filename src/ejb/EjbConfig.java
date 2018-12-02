package ejb;

import dao.DaoConfig;
import pojos.Config;

public class EjbConfig {

	//no tiene sentido usar memoria cada vez que inicialisemos objetos 
	public static final Integer CONFIG_TOPE_CREDITO = 1;
	public static final Integer CONFIG_MIN_CREDITO = 2;
	public static final Integer CONFIG_NUM_MIN_CUOTAS = 3;
	public static final Integer CONFIG_NUM_MAX_CUOTAS = 4;
	public static final Integer CONFIG_MIN_ANTIGUEDAD = 5;
	public static final Integer CONFIG_FACTOR_MAX_CREDITO = 6;
	
	public EjbConfig(){
		new Config();
	}
	
	public static String getConfigByID(Integer config_id){
		
		String value = "";
		try{
			value = DaoConfig.getConfigByID(config_id);//llamo al dao.config 
			return value;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return value;
		}
	}
	
	
}
