/**
 * 
 */
package ejercicio1;

/**
 * @author Fabiola Baeza
 *
 */
public class Main {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Perro p1=new Perro("Cain","fiero");
		System.out.println(p1.ladra());
		Perro p2=new Perro("Abel","manso");
		System.out.println(p2.ladra());
		Loro lorito = new Loro ();
		System.out.println(lorito.habla());
		Ping�ino pingui= new Ping�ino ("Adela");
		System.out.println(pingui.toString());
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		

	}

}
