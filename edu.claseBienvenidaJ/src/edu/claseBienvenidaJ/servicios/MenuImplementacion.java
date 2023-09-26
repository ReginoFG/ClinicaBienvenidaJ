package edu.claseBienvenidaJ.servicios;

/**
 * Implemetación de la interfaz Menú.
 */
public class MenuImplementacion implements MenuInterfaz{

	/**
	 * Método que imprime por pantalla mensaje de bienvenida
	 * 260923-rfg
	 */
	@Override
	public void mostrarMensajeBienvenida() {

		String mensaje ="Clinica CSI1";
		
		System.out.println(mensaje);
		
	}

}
