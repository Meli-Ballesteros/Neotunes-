package model;

public class Productor {
	
	private String name;
	private String url;
	private int fechaVinculacion;
	private int typeP;
	
	public Productor(String name, String url, int fechaVinculacion, int typeP){
		
		this.name = name;
		this.url = url;
		this.fechaVinculacion = fechaVinculacion;
		this.typeP = typeP;
	}

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
