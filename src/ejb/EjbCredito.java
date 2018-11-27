package ejb;

import pojos.Credito;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import dao.DaoCredito;
import pojos.Cliente;

public class EjbCredito {

	private Credito pojosCredito;
	
	public static final Integer ESTADO_CREDITO_APROBADO = 1;
	
	public EjbCredito(){
		pojosCredito = new Credito();
	}
	
	public List<String> validarSolicitud(Credito credito, Cliente cliente){
		List<String> errores = new ArrayList<>();
		
		//Validar si usuario es cliente
		if(!EjbCliente.checkUserByRUT(cliente)){
			errores.add("Solo se permite la solicitud de creditos a clientes registrados.");
			return errores;
		}
		
		//Se valida que el monto solicitado no exceda el 150% del sueldo del cliente.
		double factor = Double.parseDouble(EjbConfig.getConfigByID(EjbConfig.CONFIG_FACTOR_MAX_CREDITO));		
		if(cliente.getSueldo()*factor < credito.getMonto()){
			errores.add("Monto excede 150% del sueldo.");
		}
		
		//Se valida que el monto solicitado cumpla el monto minimo.
		Integer min_credito = Integer.parseInt(EjbConfig.getConfigByID(EjbConfig.CONFIG_MIN_CREDITO));
		if(credito.getMonto() < min_credito){
			errores.add("Monto debe ser al menos $300.000.");
		}
		
		//Se valida que banco pueda cursar el credito.
		Integer tope_credito = Integer.parseInt(EjbConfig.getConfigByID(EjbConfig.CONFIG_TOPE_CREDITO));
		Integer suma_creditos = this.getMontosCreditosAprobados();
		if(suma_creditos + credito.getMonto() > tope_credito){
			errores.add("Pongase en contacto con su ejecutivo.");
		}
		
		//Se valida que las cuotas solicitadas esten en el rango de 6 a 48 inclusives.
		Integer min_cuotas = Integer.parseInt(EjbConfig.getConfigByID(EjbConfig.CONFIG_NUM_MIN_CUOTAS));
		if( min_cuotas > credito.getNumCuotas()){
			errores.add("Solo se aceptan creditos con al menos 6 cuotas.");
		}
		
		//Se valida antiguedad del cliente en el banco.
		Integer min_antiguedad = Integer.parseInt(EjbConfig.getConfigByID(EjbConfig.CONFIG_MIN_ANTIGUEDAD));
		Integer antiguedad_cliente = DateUtils.getDiferenciaFechasEnMeses(cliente.getCreadoEl());
		if(antiguedad_cliente < min_antiguedad){
			errores.add("Solo puede pedir creditos si es que tiene mas de 6 meses de antiguedad.");
		}
		return errores;
	}
	
	public Integer getMontosCreditosAprobados(){
		
		List<Integer> montos = DaoCredito.getMontosCreditosAprobados();		
		return montos.stream().mapToInt(Integer::intValue).sum();
		
	}
}
