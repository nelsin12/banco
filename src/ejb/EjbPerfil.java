package ejb;

import pojos.Perfil;
import dao.DaoPerfil;

public class EjbPerfil {

	private Perfil pojosPerfil;
	private DaoPerfil daoPerfil;
	
	public EjbPerfil(){
		pojosPerfil = new Perfil();
		daoPerfil = new DaoPerfil();
	}
	
	public Perfil getPerfilByID(Integer perfil_id){
		try{
			pojosPerfil = daoPerfil.getPerfilByID(perfil_id);
		}catch(Exception e){
			System.out.println(e.getMessage());
			return this.pojosPerfil;
		}
	}
	
}
