package Edificios;

public class Muralla extends Edificios {
	
	public int vida;
	
	public int defensa;
	
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
	
	public Muralla() {
		this.vida = 3000;
		this.defensa = 100;		
	}

	
	
	
	
}
