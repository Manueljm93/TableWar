package Edificios;
import Jugador.Jugador;

public abstract class Edificios extends Jugador {
	
	public int vida;
	public int defensa;
	public int ataque;
	
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	
	

}
