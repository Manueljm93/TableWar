package Imperio;

public class ImperioRomano extends Imperio {

public String Nombre; 
	
	public String getNombre() {
		return Nombre;
	}
	
	public String setNombre() {
		return this.Nombre;
	}
	
	public ImperioRomano() {
		this.Nombre = "Imperio Romano";
	}
	public ImperioRomano(String Nombre) {
		this.Nombre = Nombre;
	}
	
	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(this.Nombre);
	}
}
