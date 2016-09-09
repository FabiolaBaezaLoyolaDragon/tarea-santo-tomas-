/**
 * 
 */
package Pais;

import java.util.Date;

/**
 * la clase pais representa un pais en el sistema
 * @author Fabiola Baeza
 * @version 1.0 08/09/2016
 *
 */

public class Paiss {
	private String nombre;
	private Integer habitantes;
	private Integer metroscuadrados;
	private Date fechadeindependencia;
	/**
	 * @param nombre es el nombre que recibe el pais
	 * @param habitantes es el numero esacto de habitantes del pais
	 * @param metroscuadrados es el territorio que avarca
	 * @param fechadeindependencia es la fecha de mayor selebracion
	 */
	public Paiss(String nombre, Integer habitantes, Integer metroscuadrados, Date fechadeindependencia) {
		this.nombre = nombre;
		this.habitantes = habitantes;
		this.metroscuadrados = metroscuadrados;
		this.fechadeindependencia = fechadeindependencia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(Integer habitantes) {
		this.habitantes = habitantes;
	}
	public Integer getMetroscuadrados() {
		return metroscuadrados;
	}
	public void setMetroscuadrados(Integer metroscuadrados) {
		this.metroscuadrados = metroscuadrados;
	}
	public Date getFechadeindependencia() {
		return fechadeindependencia;
	}
	public void setFechadeindependencia(Date fechadeindependencia) {
		this.fechadeindependencia = fechadeindependencia;
	}
	
	public String imprecion(){
		return "el pais tiene" + this.nombre + " con la cantidad de habitantes "+ this.habitantes + " los metros cuadrados: "+ this.metroscuadrados +
				" fecha de independencia "+this.fechadeindependencia ;
	}
	
	
	

}
