package model;

public class Estandar extends User{

	
	public Estandar(String nickname, String cedula, int fechaVinculacion, int fechaCompra, int typeU) {
		
		super(nickname, cedula, fechaVinculacion, fechaCompra, typeU);
		
		
		
		
	}

	@Override
	public String toString() {
		return "Estandar [getNickname()=" + getNickname() + ", getCedula()=" + getCedula() + ", getFechaVinculacion()="
				+ getFechaVinculacion() + ", getFechaCompra()=" + getFechaCompra() + ", getTypeU()=" + getTypeU()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	

}
