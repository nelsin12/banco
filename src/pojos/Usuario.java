package pojos;
// Generated 26-nov-2018 16:00:00 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2039398173002456974L;
	private Integer id;
	private Perfil perfil;
	private String nombre;
	private String alias;
	private String clave;
	private String rut;
	private int idSucursal;
	private Set<Credito> creditos = new HashSet<Credito>(0);
	private Set<Cliente> clientes = new HashSet<Cliente>(0);

	public Usuario() {
	}

	public Usuario(Perfil perfil, String nombre, String alias, String clave, String rut, int idSucursal) {
		this.perfil = perfil;
		this.nombre = nombre;
		this.alias = alias;
		this.clave = clave;
		this.rut = rut;
		this.idSucursal = idSucursal;
	}

	public Usuario(Perfil perfil, String nombre, String alias, String clave, String rut, int idSucursal,
			Set<Credito> creditos, Set<Cliente> clientes) {
		this.perfil = perfil;
		this.nombre = nombre;
		this.alias = alias;
		this.clave = clave;
		this.rut = rut;
		this.idSucursal = idSucursal;
		this.creditos = creditos;
		this.clientes = clientes;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Perfil getPerfil() {
		return this.perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getIdSucursal() {
		return this.idSucursal;
	}

	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}

	public Set<Credito> getCreditos() {
		return this.creditos;
	}

	public void setCreditos(Set<Credito> creditos) {
		this.creditos = creditos;
	}

	public Set<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

}
