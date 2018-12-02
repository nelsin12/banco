package ejb;

import pojos.Perfil;
import dao.DaoPerfil;

public class EjbPerfil {

	private Perfil pojosPerfil;
	
	public EjbPerfil(){
		pojosPerfil = new Perfil();
	}
	
	//¿basicamente que hace esta linea?
	public Perfil getPerfilByID(Integer perfil_id){//¿el byid solo tare el id? => ByID indica que el parametro q se usa de filtro es el ID, podria ser ByName en caso de que quieras buscar por nombre.
		try{
			pojosPerfil = DaoPerfil.getPerfilByID(perfil_id);
			return pojosPerfil;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return this.pojosPerfil;
		}
	}
	
}
