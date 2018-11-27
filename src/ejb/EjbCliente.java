package ejb;

import dao.DaoCliente;
import dao.DaoPerfil;
import pojos.Cliente;

public class EjbCliente {

	private Cliente pojosCliente;
	
	public EjbCliente(){
		pojosCliente = new Cliente();
	}
	
	public static boolean checkUserByRUT(Cliente cliente){
		try{
			boolean check = DaoCliente.checkUserByRUT(cliente);
			return check;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
	}
}
