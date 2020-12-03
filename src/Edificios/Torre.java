package Edificios;

public class Torre extends Edificios {
	
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
	public Torre() {
		this.ataque = 25;
		this.defensa = 80;
		this.vida = 1800;
	}
	
}
