package pojos;
// Generated 26-nov-2018 16:00:00 by Hibernate Tools 4.3.1.Final

/**
 * Sucursal generated by hbm2java
 */
public class Sucursal implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5410931086297350565L;
	private Integer id;
	private String nombre;
	private String direccion;

	public Sucursal() {
	}

	public Sucursal(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
