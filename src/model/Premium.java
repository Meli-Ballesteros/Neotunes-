package model;

import java.util.ArrayList;

public class Premium extends User{
	
	/**
	 * Estos son lso arrylist de la clase premium
	 * 
	 */
	private ArrayList <Cancion> canciones;
	private ArrayList <Podcast> podcast;

	/**
	 * Este es el metodo constructor de la clase Premium
	 * @param nickname
	 * @param cedula
	 * @param fechaVinculacion
	 * @param fechaCompra
	 * @param typeU
	 */
	public Premium(String nickname, String cedula, int fechaVinculacion, int fechaCompra, int typeU) {
		super(nickname, cedula, fechaVinculacion, fechaCompra, typeU);
		
	}
	
	/**
	 * Este es el metodo encargado de saber el genero mas escuchado por un usuario en especifico
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
	 * Este es el metodo encargado de compartir una lista de reproduccion 
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
	 * Este es el metodo encargado de simular una reproduccion
	 * @return
	 */
	public String start() {
    	
    	return "";
    }


}
