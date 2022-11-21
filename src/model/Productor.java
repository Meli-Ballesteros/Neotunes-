package model;

public class Productor {
	
	/**
	 * Variables de la clase Productor
	 */
	private String name;
	private String url;
	private int fechaVinculacion;
	private int typeP;
	
	/**
	 * Metodo constructor de la clase Productor
	 * @param name
	 * @param url
	 * @param fechaVinculacion
	 * @param typeP
	 */
	public Productor(String name, String url, int fechaVinculacion, int typeP){
		
		this.name = name;
		this.url = url;
		this.fechaVinculacion = fechaVinculacion;
		this.typeP = typeP;
	}

	
	/**
	 * Metodos Getters y Setters
	 * @return
	 */
	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

	public int getFechaVinculacion() {
		return fechaVinculacion;
	}
	
	public int getTypeP() {
		return typeP;
	}
}
