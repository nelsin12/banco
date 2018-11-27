package ejb;

import dao.DaoUsuario;
import pojos.Usuario;

public class EjbUsuario {

	private Usuario pojosUsuario;
	
	public EjbUsuario(){
		pojosUsuario = new Usuario();
	}
	
	public boolean IngresarUsuario(Usuario usuario){
		try{
			boolean ingreso = DaoUsuario.IngresarUsuario(usuario);			
			return ingreso;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public boolean LoginUsuario(Usuario usuario){
		try{
			boolean ingreso = DaoUsuario.LoginUsuario(usuario);			
			return ingreso;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
	}
	
}
