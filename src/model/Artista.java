package model;

public class Artista extends Productor{
	
	/**
	 * Metodo constructor clase Artista
	 * @param name
	 * @param url
	 * @param fechaVinculacion
	 * @param typeP
	 */
	public Artista(String name, String url, int fechaVinculacion, int typeP) {
		super(name, url, fechaVinculacion, typeP);
		
	}

	public String contenidoMasEscuchado(int numeroReproduccion) {
		return null;
		
	}
}
