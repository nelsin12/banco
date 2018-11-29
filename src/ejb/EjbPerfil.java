package ejb;

import pojos.Perfil;
import dao.DaoPerfil;

public class EjbPerfil {

	private Perfil pojosPerfil;
	
	public EjbPerfil(){
		pojosPerfil = new Perfil();
	}
	
	//¿basicamente que hace esta linea?
	public Perfil getPerfilByID(Integer perfil_id){//¿el byid solo tare el id?
		try{
			pojosPerfil = DaoPerfil.getPerfilByID(perfil_id);
			return pojosPerfil;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return this.pojosPerfil;
		}
	}
	
}
