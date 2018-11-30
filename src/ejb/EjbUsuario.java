package ejb;

import dao.DaoUsuario;
import pojos.Usuario;

public class EjbUsuario {

	private Usuario pojosUsuario;
	
	public EjbUsuario(){
		pojosUsuario = new Usuario();
	}
	
	//¿metodo que ingresa a un usuario? => SI.
	public boolean IngresarUsuario(Usuario usuario){
		try{
			boolean ingreso = DaoUsuario.IngresarUsuario(usuario);			
			return ingreso;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
	}
	//¿	metodo que comprueba si un usuario es un usuario? => NO, metodo gatilla el inicio de sesion de ser correcta la validacion.
	public boolean LoginUsuario(Usuario usuario){
		try{
			boolean ingreso = DaoUsuario.LoginUsuario(usuario);			
			return ingreso;
		}catch(Exception e){
			System.out.println(e.getMessage());//¿cual es el mensaje si es que llegara a fallar? => depende del motivo de la falla.
			return false;
		}
	}
	
}
