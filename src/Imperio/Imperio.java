package Imperio;
import Jugador.Jugador;

public abstract class  Imperio extends Jugador   {
	
	public String NombreImperio;

	public String getNombre() {
		return NombreImperio;
	}

	public void setNombre(String nombre) {
		NombreImperio = nombre;
	}
	
	public Imperio(){
		this.NombreImperio = "";
		
	}
	public Imperio(String NombreImperio) {
		
		this.NombreImperio = NombreImperio;
		
	}
	
	
	
}
