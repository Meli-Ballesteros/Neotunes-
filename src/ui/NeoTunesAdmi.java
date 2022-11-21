package ui;

import java.util.Scanner;

import model.Estandar;
import model.NeoTunes;

import java.util.Date;

public class NeoTunesAdmi {

	/**
	 * Estas son las variables de la clase Main
	 */
	private Scanner read;
	private Date fecha;
	
	/**
	 * Esta es la relacion con la clase controladora del Modelo
	 */
	private NeoTunes controller;
	
	/**
	 * Esta es la clase contructora
	 */
	public NeoTunesAdmi(){
		
		read = new Scanner(System.in);
		fecha = new Date();
		controller = new NeoTunes();
		
	}
	
	
	/**
	 * Este es el metodo main
	 * @param args
	 */
	public static void main(String[] args) {	
		
		NeoTunesAdmi manager = new NeoTunesAdmi();
		manager.execute();
	}
	
	/**
	 * Este es el metodo encargado de recoger la opcion introducida por el usuario en el menu
	 */
	public void execute() {
		
        int option = 0;
        
        do {        	
            System.out.println("\nSelecciona una opcion correcta:\n\n"+
                    "(1). Crear un usuario \n" +
                    "(2). Crear un productor\n" +
                    "(3). Crear una cancion\n" +
                    "(4). Crear un podcast\n" +
                    "(5). Crear una lista de reproduccion\n"+
                    "(6). Editar una lista de reproduccion\n" +
                    "(7). Compartir una lista de reproduccion\n" +
                    "(8). Simular reproduccion de audio (Cancion/Podcast)\n"+
                    "(9). Comprar una cancion\n"+
                    "(10). Generar un informe sobre el total de reproducciones de una cancion en la plataforma\n"+
                    "(11). Generar un informe sobre el total de reproducciones de un podcast en la plataforma\n"+
                    "(12). Generar un informe acerca del genero musical mas escuchado para un usuario en especifico.\n"+
                    /**"(                       
                    "(13). Generar un informe acerca del genero musical mas escuchado en la plataforma. \n"+
                    "(14). Generar un informe referente a la categoria de podcast mas escuchada para un usuario en especifico. \n"+
                    "(15). Generar un informe referente a la categoria de podcast mas escuchada en la plataforma.\n"+
                    "(16). Generar un informe con respecto al TOP 5 de artistas en la plataforma\n"+
                    "(17). Generar un informe con respecto al TOP 5 de creadores de contenido en la plataforma\n"+
                    "(18). Generar un informe alusivo al TOP 10 de canciones de un usuario en especifico\n"+
                    "(19). Generar un informe alusivo al TOP 10 de podcast de un usuario en especifico\n"+
                    "(20). Generar un informe sobre el numero de canciones vendidas en un genero en especifico\n"+
                    "(21). Generar un informe sobre el valor total de ventas de un genero en especifico\n"+
                    "(22). Generar un informe acerca de la cancion mas vendida en la plataforma\n"+
                     * 
                     */
                    "(0). SALIR\n");
            try {
                option = read.nextInt();
                executeOption(option);
                
            }catch (NumberFormatException ex){
                ex.printStackTrace();
            }
            
            
            
        } while (option != 0);        
    }
	
	/**
	 * Este metodo se encarga de trasladar la desicion del usuario para obtener lo que desea en el menu
	 * @param option
	 */
    public void executeOption(int option) {
    	
    	
        switch (option){
        
            case 1:            	
                user();
                break;                
            case 2:            	
            	productor();
                break;
            case 3:
            	cancion();
                break;
            case 4:
                podcast();
                break;
            case 5:
                listas();
                break;
            case 6:
                editarListas();
                break;
            case 7:
                compartirListas();
                break;
            case 8:
            	reproducir();
            	break;
            case 9:
            	comprar();
            	break;
            case 10:
            	informeReproduccionS();            	
            	break;
            case 11:
            	informeReproduccionP();
            	break;
            case 12:
            	informeGeneroU();
            	break;
            case 13:
            	informeGeneroApp();
            	break;
            case 14:
            	;
            	break;
            case 15:
            	;
            	break;
            case 16:
            	;
            	break;
            case 17:
            	;
            	break;
            case 18:
            	;
            	break;
            case 19:
            	;
            	break;
            case 20:
            	;
            	break;
            case 21:
            	;
            	break;
            case 22:
            	;
            	break;
            	
            default:
                System.out.println("Gracias por confiar en NeoTunes");
                break;
        }
    }
    
    /**
     * Este metodo se encarga de recoger informacion para poder crear un usuario
     */
    public void user(){
    	
    	read.nextLine();
    	System.out.print("Escribe el nickname que deseas agregar: ");
    	String nickname = read.nextLine();
    	
    	System.out.print("Escribe el numero de cedula del usuario: ");
    	String cedula = read.nextLine();
    	
    	System.out.println("Escribe el tipo de usuario: ");
    	System.out.println("1. Estandar");
    	System.out.println("2. Premium");
    	int fechaVinculacion = fecha.getDay();
    	int fechaCompra = fecha.getDate();
    	
        int typeU = read.nextInt();
    	    	
    	
    	
    	System.out.println(controller.addUser(nickname, cedula, fechaCompra, fechaVinculacion, typeU));
    	
    	
    	    	
    }
    
    /**
     * Este metodo se encarga de recoger informacion para poder crear un productor
     */
    public void productor() {
    	
    	read.nextLine();
    	System.out.print("Escribe el nombre que deseas agregar: ");
    	String name = read.nextLine();
    	System.out.print("Escribe el nombre de la url: ");
    	String url = read.nextLine();
    	System.out.println("Escribe el tipo de usuario: ");
    	System.out.println("1. Artista");
    	System.out.println("2. Creador");
        int typeU = read.nextInt();
        	
    	int fechaVinculacion = fecha.getYear();
    	
    	
    	System.out.print(controller.addProductor(name, url, fechaVinculacion, typeU)); 
    }
    
    
    /**
     * Este metodo se encarga de recoger informacion para poder crear una cancion
     */
    public void cancion() {
    	
    	read.nextLine();
    	System.out.println("Escribe el nombre de la cancion: ");
    	String name = read.nextLine();
    	System.out.println("Escribe el album de la cancion: " );
    	String album = read.nextLine();
    	System.out.println("Escribe el genero de la cancion: ");
    	System.out.println("1. ROCK");
    	System.out.println("2. POP");
    	System.out.println("3. TRAP");
    	System.out.println("4. HOUSE");
    	int genero = read.nextInt();
    	read.nextLine();
    	System.out.println("Escribe la url de la cancion: "); 
    	String url = read.nextLine();
    	int numeroReproduccion = 0;
    	int numeroVentas = 0;
    	System.out.println("Escribe el valor de venta de la cancion: ");
    	double valorVenta = read.nextDouble();
    	
    	System.out.print(controller.addSong(name, album, genero, url, numeroReproduccion, numeroVentas, valorVenta)); 
    }
    
    
    /**
     * Este metodo se encarga de recoger informacion para poder crear un podcast
     */
    public void podcast() {
    	
    	read.nextLine();
    	System.out.println("Escribe el nombre del podcast: ");
    	String name = read.nextLine();
    	System.out.println("Escribe la descripcion del podcast: ");
    	String description = read.nextLine();
    	System.out.println("Escribe la url del podcast: ");
    	String url = read.nextLine();
    	System.out.println("Escribe la categoria del podcast: ");
    	System.out.println("1. Politico");
    	System.out.println("2. Entretenimiento");
    	System.out.println("3. Videojuego");
    	System.out.println("4. Moda");
    	int category = read.nextInt();
    	
    	int numeroReproduccionesP = 0;
    	
    	System.out.println("Escribe la duracion del podcast");
    	int duracion = read.nextInt();
    	
    	System.out.println(controller.addPodcast(name, description, url, category, numeroReproduccionesP, duracion));
    	
    }
    
    /**
     * Este metodo se encarga de recoger informacion para poder crear una lista de reproduccion
     */
    public void listas() {
    	
    	read.nextLine();
    	System.out.println("Escribe el nombre de la lista: ");
    	String name = read.nextLine();
    	
    	System.out.println("Escribe el codigo de la lista: ");
    	int codigo = read.nextInt();
    	
    	System.out.println(controller.addList(name, codigo));
    }
    
    public void editarListas() {
    	
    	read.nextLine();
    	System.out.println("Escribe el tipo de usuario");
    	System.out.println("1. Estandar");
    	System.out.println("2. Premium");
    	int typeU = read.nextInt();
    	System.out.println("1. Agregar un audio de la lista");
    	System.out.println("2. Eliminar un audio de la lista");    	    
        String typeEdit = read.nextLine();         
        System.out.println("Escribe el nombre de la Lista");
        String name=read.nextLine();
        System.out.println("Escribe el nombre del audio");
        String sonido = read.nextLine();
        
        System.out.println(controller.editList(typeEdit, name, sonido, typeU));        
        	
    }
    
    /**
     * Este metodo se encarga de mandar la informacion necesaria para poder compartir una lista
     */
    public void compartirListas() {
    	
    	read.nextLine();
    	System.out.println("Escribe el nickname del usuario");
        String nickname=read.nextLine();
        System.out.println("Escribe el nombre de la Lista");
        String name = read.nextLine();
        
        System.out.println(controller.shareList(nickname, name));
    }
    
    /**
     * Este metodo se encarga de recoger informacion para poder reproducir un audio
     */
    public void reproducir() {
    	
    	System.out.println("Escribe el nombre del usuario");
    	String nickname = read.nextLine();
    	
    	System.out.println("Escribe el nombre del audio a reproducir");
    	String audio = read.nextLine();
    	
    	System.out.println(controller.listen(nickname, audio));
    }
    
    /**
     * Este metodo se encarga de recoger informacion para poder comprar una cancion
     */
    public void comprar() {
    	
    	
    }
    
    /**
     * Este metodo se encarga de infromar el total de reproducciones de canciones
     */
    public void informeReproduccionS(){
    	
    	System.out.println(controller.totalVSongs());    	
    }
    
    /**
     * Este metodo se encarga  de informar el total de reproducciones de podcast
     */
    public void informeReproduccionP(){
    	
    	System.out.println(controller.totalVPodcasts());    	
    }
    
    /**
     * Este metodo se encarga de informar la el genero mas escuchado por un usuario en especifico
     */
    public void informeGeneroU() {
    	
    	System.out.println("Escribe el nickname del usuario ");
        String nickname = read.next();
        System.out.println(controller.typeUserGenre(nickname));
    }
    
    /**
     * Este metodo se encargar de informar el genero mas escuchado en toda la aplicacion
     */
    public void informeGeneroApp() {
    	
    	System.out.println(controller.totalGenreApp());
    }
}
