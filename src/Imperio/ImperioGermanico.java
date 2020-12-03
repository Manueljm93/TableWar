package Imperio;

public class ImperioGermanico extends Imperio {

public String Nombre; 
	
	public String getNombre() {
		return Nombre;
	}
	
	public String setNombre() {
		return this.Nombre;
	}
	
	public ImperioGermanico() {
		this.Nombre = "Imperio Azteca";
	}
	
	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(this.Nombre);
	}
}
