/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroom;

/**
 *
 * @author usuario
 */
public enum Tipo {
    
    DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	
	private int codigo;
	private String nombre;
	private Tipo(int c) {
		codigo = c;

	}
        private Tipo(String n) {
		nombre = n;
        }
    
}
