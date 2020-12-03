package Unidades;
import Jugador.Jugador;

public abstract class Unidad extends Jugador {

	public int Vida;
	public int Ataque;
	public int Defensa;
	
	
	public int getVida() {
		return Vida;
	}
	public void setVida(int vida) {
		Vida = vida;
	}
	public int getAtaque() {
		return Ataque;
	}
	public void setAtaque(int ataque) {
		Ataque = ataque;
	}
	public int getDefensa() {
		return Defensa;
	}
	public void setDefensa(int defensa) {
		Defensa = defensa;
	}
	
	
	
}
