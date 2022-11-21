package model;

public class User {
	
	/**
	 * Variables correspondientes a la clase User
	 */
	private String nickname;
	private String cedula;
	private int fechaVinculacion;
	private int fechaCompra;
	private int typeU;
	
	/**
	 * Contructor de la clase User
	 * @param nickname
	 * @param cedula
	 * @param fechaVinculacion
	 * @param fechaCompra
	 * @param typeU
	 */
	public User(String nickname, String cedula, int fechaVinculacion, int fechaCompra, int typeU) {
		
		this.nickname = nickname;
		this.cedula = cedula;
		this.fechaVinculacion = fechaVinculacion;
		this.fechaCompra = fechaCompra;
		this.typeU = typeU;
	}

	/**
	 * Getters y setters
	 * @return
	 */
	public String getNickname() {
		
		return nickname;
	}

	public String getCedula() {
		return cedula;
	}

	public int getFechaVinculacion() {
		return fechaVinculacion;
	}

	public int getFechaCompra() {
		return fechaCompra;
	}
	
	
	public int getTypeU() {
		return typeU;
	}

	public void timeReproduccion(){
		
	}
	
	
	public void genreMostListening() {
		
	}
	
	

}
