package pojos;
// Generated 26-nov-2018 16:00:00 by Hibernate Tools 4.3.1.Final

/**
 * Config generated by hbm2java
 */
public class Config implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7507466454655531166L;
	private Integer id;
	private String llave;
	private String valor;

	public Config() {
	}

	public Config(String llave, String valor) {
		this.llave = llave;
		this.valor = valor;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLlave() {
		return this.llave;
	}

	public void setLlave(String llave) {
		this.llave = llave;
	}

	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
