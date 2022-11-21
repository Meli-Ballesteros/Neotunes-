package model;

public class Cancion {
	
	private String name;
	private String album;
	private int genero;
	private String url;
	private int numeroReproduccion;
	private int numeroVentas;
	private double valorVenta;
	
	private Genero tipoGenero;
	
	public Cancion(String name, String album, int genero, String url, int numeroReproduccion, int numeroVentas, double valorVenta) {
		
		this.name = name;
		this.album = album;
		this.genero = genero;
		this.url = url;
		this.numeroReproduccion = numeroReproduccion;
		this.numeroVentas = numeroVentas;
		this.valorVenta = valorVenta;
		
		
		switch(genero) {
		
		case 1:			
			tipoGenero = Genero.ROCK; 
			break;
			
		case 2:
			tipoGenero = Genero.POP;
			break;
			
		case 3:
			tipoGenero = Genero.TRAP;
			break;
			
		case 4:
			tipoGenero = Genero.HOUSE;
			break;
		}		
	}


	public String getName() {
		return name;
	}


	public String getAlbum() {
		return album;
	}


	public int getGenero() {
		return genero;
	}


	public String getUrl() {
		return url;
	}
	
	
	public int getNumeroReproduccion() {
		return numeroReproduccion;
	}


	public void setNumeroReproduccion(int numeroReproduccion) {
		this.numeroReproduccion = numeroReproduccion;
	}


	public int getNumeroVentas() {
		return numeroVentas;
	}


	public void setNumeroVentas(int numeroVentas) {
		this.numeroVentas = numeroVentas;
	}


	public double getValorVenta() {
		return valorVenta;
	}


	
	public double generoMasEscuchado(String genero, String numeroReproduccion) {
		
		return numeroVentas;		
	}
	
	public int tipoGenero(){
		
        switch (tipoGenero) {
        
            case ROCK:
                return 1;
            case POP:
                return 2;
            case TRAP:
                return 3;
            case HOUSE:
                return 4;
                
            default:
             return 0;
        }  

    }

}
