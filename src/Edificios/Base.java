package Edificios;

public class Base extends Edificios {

	public int ataque;
	
	public int vida;
	
	public int defensa;
	
	public int ataqueExtra;
	
	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	
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
	
	public Base() {
		this.vida = 8000;
				this.ataque = 
				this.defensa = 350;
	}		
}
