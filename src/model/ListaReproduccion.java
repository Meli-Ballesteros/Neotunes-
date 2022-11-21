package model;

public class ListaReproduccion {
	
	private String name;
	private int codigo;
	
	
	/**
	 * Este es el contructor de la clase Lista 
	 * @param name
	 * @param codigo
	 */
	public ListaReproduccion(String name, int codigo) {
		
		this.name = name;
		this.codigo = codigo;
	}
	

	/**
	 * Este es el metodo Getter y setter
	 * @return
	 */
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
