package tarea2;

public class Persona {
	
	private String rut;
	private String nombre;
	private String apellidopatrno;
	private String apellidomateno;
	private String sexo;
	
	public Persona(String rut, String nombre, String apellidopatrno, String apellidomateno, String sexo) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellidopatrno = apellidopatrno;
		this.apellidomateno = apellidomateno;
		this.sexo = sexo;
	}

	public Persona(String rut) {
		this.rut = rut;
	}

	public Persona() {
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidopatrno() {
		return apellidopatrno;
	}

	public void setApellidopatrno(String apellidopatrno) {
		this.apellidopatrno = apellidopatrno;
	}

	public String getApellidomateno() {
		return apellidomateno;
	}

	public void setApellidomateno(String apellidomateno) {
		this.apellidomateno = apellidomateno;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	

	
	

}
