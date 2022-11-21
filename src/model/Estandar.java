package model;

import java.util.ArrayList;

public class Estandar extends User{
	
	/**
	 * Este son los arreglos correspondientes a la clase Estandar
	 */
	private ArrayList <Cancion> canciones;
	private ArrayList <Podcast> podcast;
 	
	public Estandar(String nickname, String cedula, int fechaVinculacion, int fechaCompra, int typeU) {
		
		super(nickname, cedula, fechaVinculacion, fechaCompra, typeU);	
	}
	
	/**
	 * Este metodo se encarga de generar un informe del total de genero escuchado en un ususario en especifico
	 * @return
	 */
	public String totalGenreU(){
		
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
	 * Este metodo es el encargado de reproducir una cancion de un usuario estandar
	 * @return
	 */
    public String start() {
    	
    	return "";
    }
	
    /**
     * Este es el metodo encargado de compartir una lista 
     * @param name
     * @return
     */
    public int shareList(String name) {
    	
    	 int message = 0;
         ListaReproduccion playlist = null; 
         if(playlist == null){
        	message = playlist.getCodigo();
            
         }         
     
        return message;
    	  	
    }
	
    /**
     * Este es el metodo toString de la clase Estandar
     */
	@Override
	public String toString() {
		return "Estandar [getNickname()=" + getNickname() + ", getCedula()=" + getCedula() + ", getFechaVinculacion()="
				+ getFechaVinculacion() + ", getFechaCompra()=" + getFechaCompra() + ", getTypeU()=" + getTypeU()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	

}
