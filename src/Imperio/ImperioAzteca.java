package Imperio;

public class ImperioAzteca extends Imperio {

	public String Nombre; 
	
	public String getNombre() {
		return Nombre;
	}
	
	public String setNombre() {
		return this.Nombre;
	}
	
	public ImperioAzteca() {
		this.Nombre = "Imperio Azteca";
	}
	
	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(this.Nombre);
	}
}
