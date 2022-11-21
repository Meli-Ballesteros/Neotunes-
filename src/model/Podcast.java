package model;

public class Podcast {
	
	/**
	 * Variables correspondientes clase Podcast
	 */
	private String name;
	private String description;
	private String url;
	private int category;
	private int numeroReproduccionesP;
	private int duracion;
	
	/**
	 * Relacion con la clase Categoria
	 */
	private Categoria tipoCategoria;
	
	/**
	 * Metodo contructor clase Podcast
	 * @param name
	 * @param description
	 * @param url
	 * @param category
	 * @param numeroReproduccionesP
	 * @param duracion
	 */
	public Podcast(String name, String description, String url, int category, int numeroReproduccionesP, int duracion) {
		
		this.name = name;
		this.description = description;
		this.url = url;
		this.category = category;
		this.numeroReproduccionesP = numeroReproduccionesP;
		this.duracion = duracion;
		
		switch(category) {
		
		case 1:			
			tipoCategoria = Categoria.POLITICO; 
			break;
			
		case 2:
			tipoCategoria = Categoria.ENTRETENIMIENTO;
			break;
			
		case 3:
			tipoCategoria = Categoria.VIDEOJUEGOS;
			break;
			
		case 4:
			tipoCategoria = Categoria.MODA;
			break;
		}		

	}
	
	/**
	 * Getters y Setters
	 * @return
	 */
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getUrl() {
		return url;
	}
	
	public int getCategory() {
		return category;
	}

	public int getNumeroReproduccionesP() {
		return numeroReproduccionesP;
	}

	public int getDuracion() {
		return duracion;
	}
	
	

}
