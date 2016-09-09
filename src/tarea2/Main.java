/**
 * 
 */
package tarea2;

/**
 * @author Fabiola
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1;
		Persona p2;
		Persona p3;
		
		p1 = new Persona("111-1", "juan", "perez", "perez","mazculino");
		p2 = new Persona("222-2");
		p3 = new Persona();
		
		p1.setNombre("pepe");
		p2.setApellidopatrno("fernandes");
		p3.setRut("333-3");
		
		System.out.println("nombre de persona 1 es: "+ p1.getNombre());
		System.out.println("apellido de persona 2 es: "+p2.getApellidopatrno());
		System.out.println("rut de persona 3 es: "+p3.getRut());

	}

}
