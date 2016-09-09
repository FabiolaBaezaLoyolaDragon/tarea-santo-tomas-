package ejercicio1;

public class Perro extends Animal{
	private String nombre;
	private String agresividad;
	
	
	
	public Perro(String nombre, String agresividad) {
		super();
		this.nombre = nombre;
		this.agresividad = agresividad;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", agresividad=" + agresividad + "]";
	}

	public String ladra(){
		String ladrido = " ";
		if(this.agresividad.equals ("fiero")){
			ladrido ="grrr";
		}
		if(this.agresividad.equals("manso")){
			ladrido = "guau";
		}
		return ladrido;
	}
	

	
}
