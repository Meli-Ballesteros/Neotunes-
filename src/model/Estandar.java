package model;

public class Estandar extends User{

	
	public Estandar(String nickname, String cedula, int fechaVinculacion, int fechaCompra, int typeU) {
		
		super(nickname, cedula, fechaVinculacion, fechaCompra, typeU);	
	}
	
	public Playlist searchPlaylist(String name){
        Playlist newPlaylist=null;
        boolean validation= false;
         for(int i=0;i<20 && !validation ;i++){
            if(playlist[i]!=null && playlist[i].getName().equals(name)){
                newPlaylist=playlist[i];
                validation= true;
            }
         }
    
        return newPlaylist;
    }
	
	@Override
    public String addAudioPlaylist(String name, Cancion cancion, String sonido){
        String msj="";
        ListaReproduccion playlist =searchPlaylist(namePlaylist);
        if(thePlaylist==null){
            msj="dont exist the playslist";
        }
         else{
            if(thePlaylist.typePlaylist()==1){
                if(thePlaylist.typePlaylist()==typeAudio){
                    boolean audiorepit= thePlaylist.searchAudio(audioName);
                    if(audiorepit == false){
                        thePlaylist.getAudios().add(audio);
                        msj="audio added";
                    }
                    else{
                        msj="the audio is repit";
                    }
                }
                else{
                    msj="you cant add this audio beacuse is diferent type of playlist";
                }
            }
            if(thePlaylist.typePlaylist()==2){
                if(thePlaylist.typePlaylist()==typeAudio){
                    boolean audiorepit= thePlaylist.searchAudio(audioName);
                    if(audiorepit == false){
                        thePlaylist.getAudios().add(audio);
                        msj="audio added";
                    }
                    else{
                        msj="the audio is repit";
                    }
                }
                else{
                    msj="you cant add this audio beacuse is difertent type of playlist";
                }
            }
            if(thePlaylist.typePlaylist()==3){
                
                    boolean audiorepit= thePlaylist.searchAudio(audioName);
                    if(audiorepit == false){
                        thePlaylist.getAudios().add(audio);
                        msj="audio added";
                    }
                    else{
                        msj="the audio is repit";
                    }
            }
         }
        
        return msj;

    }
	@Override
	public String toString() {
		return "Estandar [getNickname()=" + getNickname() + ", getCedula()=" + getCedula() + ", getFechaVinculacion()="
				+ getFechaVinculacion() + ", getFechaCompra()=" + getFechaCompra() + ", getTypeU()=" + getTypeU()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	

}
