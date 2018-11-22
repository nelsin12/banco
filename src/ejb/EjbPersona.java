package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import dao.DaoAdministrador;
import pojos.Administrador;
import static java.lang.System.out;
import java.util.List;
import javax.ejb.Stateless;
import pojos.Administrador;

public class EjbPersona{
	
	private String nombre;
	private String segundo_nombre;
	private String ape_materno;
	private String ape_paterno;
	private String rut_persona;
	private String correo;
	private String direccion;
	private String fecha_ingreso_banco;
	private Integer sueldo;
	private Integer telefono;
	
	public EjbPersona(){}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSegundo_nombre() {
		return segundo_nombre;
	}

	public void setSegundo_nombre(String segundo_nombre) {
		this.segundo_nombre = segundo_nombre;
	}

	public String getApe_materno() {
		return ape_materno;
	}

	public void setApe_materno(String ape_materno) {
		this.ape_materno = ape_materno;
	}

	public String getApe_paterno() {
		return ape_paterno;
	}

	public void setApe_paterno(String ape_paterno) {
		this.ape_paterno = ape_paterno;
	}

	public String getRut_persona() {
		return rut_persona;
	}

	public void setRut_persona(String rut_persona) {
		this.rut_persona = rut_persona;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFecha_ingreso_banco() {
		return fecha_ingreso_banco;
	}

	public void setFecha_ingreso_banco(String fecha_ingreso_banco) {
		this.fecha_ingreso_banco = fecha_ingreso_banco;
	}

	public Integer getSueldo() {
		return sueldo;
	}

	public void setSueldo(Integer sueldo) {
		this.sueldo = sueldo;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	
	
	
	
	
}
