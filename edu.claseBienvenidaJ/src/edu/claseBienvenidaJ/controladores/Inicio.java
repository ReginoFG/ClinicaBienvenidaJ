package edu.claseBienvenidaJ.controladores;

import edu.claseBienvenidaJ.servicios.MenuImplementacion;
import edu.claseBienvenidaJ.servicios.MenuInterfaz;

/**
 * Clase principal de la aplicación
 * 250923-rfg
 */
public class Inicio {

	/**
	 * Método principal de nuestra aplicación
	 * 260923-rfg
	 * @param args
	 */
	public static void main(String[] args) {
		
		MenuInterfaz mi = new MenuImplementacion();
		
		mi.mostrarMensajeBienvenida();
	
	}

}
