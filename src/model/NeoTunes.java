package model;

import java.util.ArrayList;

public class NeoTunes {
	
	private ArrayList<User> usuarios;
	private ArrayList<Productor> productores;
	private ArrayList<Cancion> canciones;
	private ArrayList<Podcast> podcasts;
	
	public NeoTunes(){
		
		usuarios = new ArrayList<User>();
		productores = new ArrayList<Productor>();
		canciones = new ArrayList<Cancion>();
		podcasts = new ArrayList<Podcast>();
		
	}
	
	public String addUser(String nickname, String cedula, int fechaCompra, int fechaVinculacion, int typeU) {
		
		String message = null;
		
		User objEstandar = new Estandar(nickname, cedula, fechaCompra, fechaVinculacion, typeU);
		usuarios.add(objEstandar);
		message = "El usuario fue creado correctamente: "+ nickname;	
				
		
		
		return message;
	}
	
	
	public String addProductor(String name, String url, int fechaVinculacion, int typeU){
		
		String message = null;
		
		Productor objArtista = new Artista(name, url, fechaVinculacion, typeU);
		productores.add(objArtista);
		message = "El productor fue creado correctamente: "+ name;	
		
		return message;
			
	}
	
	
	public String addSong(String name, String album, int genero, String url, int numeroReproduccion, int numeroVentas, double valorVenta) {
		
		String message = null;
		Cancion objCancion = new Cancion(name, album, genero, url, numeroReproduccion, numeroVentas, valorVenta);
		canciones.add(objCancion);
		message = "La cancion fue creado correctamente: "+ name;	
		
		return message;		
	}
	
	public String addPodcast(String name, String description, String url, int category, int numeroReproduccionesP, int duracion) {
		
		String message = null;
		Podcast objPodcast = new Podcast(name, description, url, category, numeroReproduccionesP, duracion);
		podcasts.add(objPodcast);
		message = "El pocast fue creado correctamente: "+name;
		return message;
	}
	
	
}
