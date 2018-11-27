package ejb;

import pojos.Perfil;
import dao.DaoPerfil;

public class EjbPerfil {

	private Perfil pojosPerfil;
	
	public EjbPerfil(){
		pojosPerfil = new Perfil();
	}
	
	public Perfil getPerfilByID(Integer perfil_id){
		try{
			pojosPerfil = DaoPerfil.getPerfilByID(perfil_id);
			return pojosPerfil;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return this.pojosPerfil;
		}
	}
	
}
