
public class Arma {
	//Atributos
	String nombre;
	
	//Constructores
	public Arma(){
		nombre="";
	}
	
	//Métodos
	//Getters y Setter
	public String isNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombreNuevo) {
		this.nombre=nombreNuevo;
	}
	
	//ToString
	public String toString(){
				
		return "Arma [nombre=" + this.isNombre() + "]";
	}
}
