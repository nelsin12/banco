package ejb;

public class EjbCliente extends EjbPersona {
	
	private Integer id_cliente;
	private Integer cantidad_creditos;
	private String clave_cliente;
	
	public EjbCliente(){}

	public Integer getId_cliente() {
		return id_cliente;
	}

	public Integer getCantidad_creditos() {
		return cantidad_creditos;
	}

	public void setCantidad_creditos(Integer cantidad_creditos) {
		this.cantidad_creditos = cantidad_creditos;
	}

	public String getClave_cliente() {
		return clave_cliente;
	}

	public void setClave_cliente(String clave_cliente) {
		this.clave_cliente = clave_cliente;
	}
	
	

}
