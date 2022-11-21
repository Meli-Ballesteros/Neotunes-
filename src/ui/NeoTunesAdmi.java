package ui;

import java.util.Scanner;

import model.Estandar;
import model.NeoTunes;

import java.util.Date;

public class NeoTunesAdmi {

	private Scanner read;
	private Date fecha;
	
	private NeoTunes controller;
	
	
	public NeoTunesAdmi(){
		
		read = new Scanner(System.in);
		fecha = new Date();
		controller = new NeoTunes();
		
	}
	
	
	/**
	 * Este es el metodo
	 * @param args
	 */
	public static void main(String[] args) {	
		
		NeoTunesAdmi manager = new NeoTunesAdmi();
		manager.execute();
	}
	
	
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
                    /**"(
                    "(10). nerar un informe sobre el total de reproducciones de una cancion en la plataforma\n"+
                    "(11). Generar un informe sobre el total de reproducciones de un podcast en la plataforma\n"+
                    "(12). Generar un informe acerca del genero musical mas escuchado para un usuario en especifico.\n"+
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
                ;
                break;
            case 6:
                ;
                break;
            case 7:
                ;
                break;
            case 8:
            	;
            	break;
            case 9:
            	;
            	break;
            case 10:
            	;
            	break;
            case 11:
            	;
            	break;
            case 12:
            	;
            	break;
            case 13:
            	;
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
    
    
    public void listas() {
    	
    	read.nextLine();
    	System.out.println("Escribe el nombre de la lista: ");
    	String name
    	System.out.println("Es");
    }
}
