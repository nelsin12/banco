package ejb;

import pojos.Perfil;

public class EjbUsuario {

	private Integer id;
	private Perfil perfil;
	private String nombre;
	private String alias;
	private String clave;
	private String rut;
	private int idSucursal;
	
	public EjbUsuario(){}

	public EjbUsuario(Perfil perfil, String nombre, String alias, String clave, String rut, int idSucursal) {
		super();
		this.perfil = perfil;
		this.nombre = nombre;
		this.alias = alias;
		this.clave = clave;
		this.rut = rut;
		this.idSucursal = idSucursal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}

	@Override
	public String toString() {
		return "EjbUsuario [id=" + id + ", perfil=" + perfil + ", nombre=" + nombre + ", alias=" + alias + ", clave="
				+ clave + ", rut=" + rut + ", idSucursal=" + idSucursal + "]";
	}
	
}
