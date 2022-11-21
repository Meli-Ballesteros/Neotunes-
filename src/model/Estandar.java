package model;

import java.util.ArrayList;

public class Estandar extends User{
	
	
	private ArrayList <Cancion> canciones;
	private ArrayList <Podcast> podcast;
 	
	public Estandar(String nickname, String cedula, int fechaVinculacion, int fechaCompra, int typeU) {
		
		super(nickname, cedula, fechaVinculacion, fechaCompra, typeU);	
	}
	
	
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
	

    
	@Override
	public String toString() {
		return "Estandar [getNickname()=" + getNickname() + ", getCedula()=" + getCedula() + ", getFechaVinculacion()="
				+ getFechaVinculacion() + ", getFechaCompra()=" + getFechaCompra() + ", getTypeU()=" + getTypeU()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	

}
