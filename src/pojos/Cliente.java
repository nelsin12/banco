package pojos;
// Generated 14-nov-2018 9:41:42 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente implements java.io.Serializable {

	private Integer idCliente;
	private Persona persona;
	private String claveCliente;
	private int cantidadCreditos;
	private Set creditos = new HashSet(0);

	public Cliente() {
	}

	public Cliente(Persona persona, String claveCliente, int cantidadCreditos) {
		this.persona = persona;
		this.claveCliente = claveCliente;
		this.cantidadCreditos = cantidadCreditos;
	}

	public Cliente(Persona persona, String claveCliente, int cantidadCreditos, Set creditos) {
		this.persona = persona;
		this.claveCliente = claveCliente;
		this.cantidadCreditos = cantidadCreditos;
		this.creditos = creditos;
	}

	public Integer getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getClaveCliente() {
		return this.claveCliente;
	}

	public void setClaveCliente(String claveCliente) {
		this.claveCliente = claveCliente;
	}

	public int getCantidadCreditos() {
		return this.cantidadCreditos;
	}

	public void setCantidadCreditos(int cantidadCreditos) {
		this.cantidadCreditos = cantidadCreditos;
	}

	public Set getCreditos() {
		return this.creditos;
	}

	public void setCreditos(Set creditos) {
		this.creditos = creditos;
	}

}
