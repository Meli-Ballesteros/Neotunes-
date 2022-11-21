package model;

import java.util.ArrayList;
import java.util.Calendar;

public class NeoTunes {
	
	/**
	 * Estas variables son los Arraylist
	 */
	private ArrayList<User> usuarios;
	private ArrayList<Productor> productores;
	private ArrayList<Cancion> canciones;
	private ArrayList<Podcast> podcasts;
	private ArrayList<ListaReproduccion> listas;
	
	
	/**
	 * Este es el metodo constructor de la clase controladora
	 */
	public NeoTunes(){
		
		usuarios = new ArrayList<User>();
		productores = new ArrayList<Productor>();
		canciones = new ArrayList<Cancion>();
		podcasts = new ArrayList<Podcast>();
		listas = new ArrayList<ListaReproduccion>();
		
	}
	
	
	/**
	 * Este metodo se encarga de agregar un usuario a la matriz
	 * @param nickname
	 * @param cedula
	 * @param fechaCompra
	 * @param fechaVinculacion
	 * @param typeU
	 * @return
	 */
	public String addUser(String nickname, String cedula, int fechaCompra, int fechaVinculacion, int typeU) {
		
		User user = searchUser(nickname);
		String message = null;
		
		if (user != null) {

            message = "El usuario ya existe";
            
        } else {
        	
        	if(typeU == 1) {
        		
        		User objEstandar = new Estandar(nickname, cedula, fechaCompra, fechaVinculacion, typeU);
        		usuarios.add(objEstandar);
        		message = "El usuario estandar fue creado correctamente: "+ nickname;	 
        		
        	} else {
        		
        		User objPremium = new Premium(nickname, cedula, fechaCompra, fechaVinculacion, typeU);
        		usuarios.add(objPremium);
        		message = "El usuario premium fue creado correctamente: "+ nickname;	
        	}
        	
        	     
    		
        }	
		
		return message;
	}
	
	
	/**
	 * Este metodo se encarga de buscar un usuario 
	 * @param nickname
	 * @return
	 */
	public User searchUser(String nickname){
		
		User usuario = null; 
		boolean created = false; 
		
		for(int i=0; i<usuarios.size() && !created; i++ ){
			
			if(usuarios.get(i).getNickname().equalsIgnoreCase(nickname)){
				
				usuario = usuarios.get(i); 
				created = true; 
			} 
		}
		return usuario; 
	}
	
	/**
	 * Este metodo se encarga de añadir un productor a la matriz
	 * @param name
	 * @param url
	 * @param fechaVinculacion
	 * @param typeU
	 * @return
	 */
	public String addProductor(String name, String url, int fechaVinculacion, int typeU){
		
		Productor producer = searchProducer(name);
		String message = null;
		
		if (producer != null) {

            message = "El productor ya existe";
            
        } else {
        	
        	if(typeU == 1) {
        		
        		Productor objArtista = new Artista(name, url, fechaVinculacion, typeU);
        		productores.add(objArtista);
        		message = "El artista fue creado correctamente: "+ name;  
        		
        	} else {
        		
        		Productor objCreador = new Creador(name, url, fechaVinculacion, typeU);
        		productores.add(objCreador);
        		message = "El creador fue creado correctamente: "+ name;
        	}
        	
        	     
    		
        }
        return message;
			
	}
	
	/**
	 * Este metodo se encarga de buscar un productor dentro de la matriz
	 * @param name
	 * @return
	 */
	public Productor searchProducer(String name){
		
		Productor productor = null; 
		boolean created = false; 
		
		for(int i=0; i<productores.size() && !created; i++ ){
			
			if(productores.get(i).getName().equalsIgnoreCase(name)){
				
				productor = productores.get(i); 
				created = true; 
			} 
		}
		return productor; 
	}
	
	
	/**
	 * Este metodo se encarga de  añadir una cancion a la matriz
	 * @param name
	 * @param album
	 * @param genero
	 * @param url
	 * @param numeroReproduccion
	 * @param numeroVentas
	 * @param valorVenta
	 * @return
	 */
	public String addSong(String name, String album, int genero, String url, int numeroReproduccion, int numeroVentas, double valorVenta) {
		
		String message = null;
		Cancion objCancion = new Cancion(name, album, genero, url, numeroReproduccion, numeroVentas, valorVenta);
		canciones.add(objCancion);
		message = "La cancion fue creado correctamente: "+ name;	
		
		return message;		
	}
	
	/**
	 * Este metodo se encarga de buscar una cancion dentro de la matriz
	 * @param name
	 * @return
	 */
	public Cancion searchSong(String name){
		
        Cancion sonido = null;
        boolean created= false;
        
        for(int i=0; i<canciones.size() && !created; i++){
        	 
            if(canciones.get(i).getName().equalsIgnoreCase(name)){
            	
                sonido = canciones.get(i);
                created= true;
            }
         }
    
        return sonido;
    }
	
	/**
	 * Este metodo se encarga de añadir un podcast a la matriz
	 * @param name
	 * @param description
	 * @param url
	 * @param category
	 * @param numeroReproduccionesP
	 * @param duracion
	 * @return
	 */
	public String addPodcast(String name, String description, String url, int category, int numeroReproduccionesP, int duracion) {
		
		String message = null;
		Podcast objPodcast = new Podcast(name, description, url, category, numeroReproduccionesP, duracion);
		podcasts.add(objPodcast);
		message = "El pocast fue creado correctamente: "+name;
		return message;
	}
	
	/**
	 * Este metodo se encarga de añadir una Lista de reproduccion
	 * @param name
	 * @param codigo
	 * @return
	 */
	public String addList(String name, int codigo) {
		
		String message = null;
		ListaReproduccion objLista = new ListaReproduccion(name, codigo);
		listas.add(objLista);
		message = "La lista fue creada correctamente: "+name;
		return message;
		
	}
	
	
	/**
	 * Este metodo es el encargado de editar una lista
	 * @param nickname
	 * @param name
	 * @param sonido
	 * @param option
	 * @return
	 */
	public String editList(String nickname, String name, String sonido, int option){
		
        String message = null;         
        Cancion cancion = searchSong(sonido);
        
        if(cancion == null){
            message = "Esta cancion no existe";
        }
        else{
        	
            User user = searchUser(nickname);
            
            if(user == null){
                message = "El usuario ingresado no existe!"; 
            }
            else{
                if(option ==1){

                    if(user instanceof Estandar){
                        Estandar estandar = ((Estandar)(user));
                        
                    }
                    else if(user instanceof Premium){
                        Premium premium = ((Premium)(user));
                        
                    }                    
                }
               
            }
        }

        return message;

    }
	
	/**
	 * Este metodo es el encargado de compartir una lista y mostrar el codigo correspondiente
	 * @param nickname
	 * @param name
	 * @return
	 */
	public int shareList(String nickname, String name) {
		int message = 0; 
        User user = searchUser(nickname);

        if(user == null){
        	
            System.out.println("El ususario no existe");;
        } else{
        	
            if(user instanceof Estandar){
                Estandar est = ((Estandar)(user) );
                message = est.shareList(name);
               
            }
            else if(user instanceof Premium){
                Premium premium = ( (Premium)(user) );
                message = premium.shareList(name);
                
            }            
        }
        
        return message;

         
		
	}
	
	/**
	 * Este metodo se encarga de simular una reproduccion
	 * @param nickname
	 * @param audio
	 * @return
	 */
	public String listen(String nickname, String audio) {
		
		String message = null; 
        User user = searchUser(nickname);

        if(user == null){
            message = "El usuario ingresado no existe";
        }
        else {
            Cancion cancion = searchSong(audio);
            if(cancion == null){
                message = "La cancion no existe";
            }
               else{
                if(user instanceof Estandar){
                    //Estandar est = ((Estandar)(cancion));
                    //message = est.play();
                    simulation(cancion);
                }
                else if(user instanceof Premium){
                    Premium premium = ((Premium)(user));
                    message = premium.start();
                    simulation(cancion);
                }                
            } 
        }
        
        return message;
		
	}
	
	/**
	 * 
	 * @param cancion
	 * @return
	 */
	public String simulation(Cancion cancion) {
		
		return "";
	}
	
	/**
	 * Este metodo se encarga de informar el total de reproducciones de canciones
	 * @return
	 */
	public String totalVSongs(){
		
        String message = null;
        int total=0;
        
        if(canciones.size()!=0){
        	
            for(int i=0;i<canciones.size();i++){
            	
            	total+=canciones.get(i).getNumeroReproduccion();
            }
        }
        
        message = "El total de vistas de canciones es: "+total ;
        
        return message;
    }
	
	/**
	 * Este metodo se encarga de informar el total de reproducciones de podcast
	 * @return
	 */
	public String totalVPodcasts(){
		
        String message = null;
        int total=0;
        
        if(podcasts.size()!=0){
        	
            for(int i=0;i<podcasts.size();i++){
            	
            	total+=podcasts.get(i).getNumeroReproduccionesP();
            }
        }
        
        message = "El total de vistas de podcast es: "+total ;
        
        return message;
    }
	
	/**
	 * Este metodo se encarga de saber el tipo de genero de un usuario
	 * @param nickname
	 * @return
	 */
	public String typeUserGenre(String nickname) {
		
		User user = searchUser(nickname);
		String message = null; 
        

        if(user == null){
        	
            message = "No existe este usuario";
        }
        else{ 

            if(user instanceof Estandar){
            	
                Estandar est = ((Estandar)(user)); 
                 message = est.totalGenreU();
            }
            else if(user instanceof Premium){
                Premium premium = ((Premium)(user)); 
                 message = premium.totalGenreU();

            }            
        }
        return message;
	}
	
	/**
	 * Este metodo se encarga de generar el total del genero un usuario en especifico
	 * @return
	 */
	public String totalGenreU() {
		
		 String message = null;
	     int[] genres ={0,0,0,0};
	     
	     if(canciones.size()!=0){
	    	 
	            for(int i =0; i< canciones.size(); i++){
	            	
	                Cancion song = ((Cancion)(canciones.get(i)));
	                
	                    switch(song.tipoGenero()){
	                    
	                     case 1:
	                    	 genres[0]++;
	                     break;
	                     case 2:
	                    	 genres[1]++;
	                      break;
	                     case 3:
	                    	 genres[2]++;
	                      break;
	                     case 4:
	                    	 genres[3]++;
	                      break;
	                      
	                     default:
	                    	 
	                      break;
	                   }

	            }
	            
	            
	        }
	             
	        return message; 
	}
	
	/**
	 * Este metodo se encarga de generar un informe del total  o el genero mas escuchado en la app
	 * @return
	 */
	public String totalGenreApp(){
		
		String message = null;
	    int position = 0;	    
	    int mayor = 0;
	    int[] genres ={0,0,0,0};
	            
	    for(int i=0; i<4; i++){
	    	
	    	if(genres[i]> mayor){
	    		
	    		position = i; 
	        }
	    }
	            
	    switch(position){
	    
	             case 0:
	            	 message="\n ROCK \n"+"views: "+genres[position];
	             break;
	             
	             case 1:
	            	 message="\n POP \n"+"views: "+genres[position];
	             break;
	             
	             case 2:
	            	 message="\n TRAP \n"+"views: "+genres[position];
	             break;
	             
	             case 3:
	            	 message="\n HOUSE \n"+"views: "+genres[position];
	             break;
	             
	             case 4:
	            	 message="La cancion no existe";
	             break;
	             
	            }
	                     
	        return message; 	
	}
	
	
}
