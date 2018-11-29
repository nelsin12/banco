package ejb;

import dao.DaoUsuario;
import pojos.Usuario;

public class EjbUsuario {

	private Usuario pojosUsuario;
	
	public EjbUsuario(){
		pojosUsuario = new Usuario();
	}
	
	//¿metodo que ingresa a un usuario?
	public boolean IngresarUsuario(Usuario usuario){
		try{
			boolean ingreso = DaoUsuario.IngresarUsuario(usuario);			
			return ingreso;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
	}
	//¿	metodo que comprueba si un usuario es un usuario?
	public boolean LoginUsuario(Usuario usuario){
		try{
			boolean ingreso = DaoUsuario.LoginUsuario(usuario);			
			return ingreso;
		}catch(Exception e){
			System.out.println(e.getMessage());//¿cual es el mensaje si es que llegara a fallar?
			return false;
		}
	}
	
}
