package model;

public class ListaReproduccion {
	
	private String name;
	private int codigo;
	
	
	public ListaReproduccion(String name, int codigo) {
		
		this.name = name;
		this.codigo = codigo;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	

}
