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
public class Asignatura {
    String nombre;
    String n = nombre;
    int codigoInterno;
    public long codigoExterno;
    Tipo tipo;

    Asignatura() {
        this("Sin nombre",Tipo.FUNDAMENTACION);
    }

    Asignatura(short codigoInterno,Tipo tipo) {
        this("Sin nombre", codigoInterno, 0,tipo);
    }

    Asignatura(int codigoExterno, Tipo tipo) {
        this.nombre= "Sin nombre";
        this.codigoInterno= 0;
        this.codigoExterno= (int)codigoExterno;
        this.tipo=tipo;
    }

    Asignatura(String nombre, Tipo tipo) {
        
        this.nombre= nombre;
        this.codigoInterno= 0;
        this.codigoExterno= 0;
        this.tipo=tipo;
    }

    Asignatura(String nombre, short codigoInterno, int codigoExterno,Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = (int) codigoExterno;
        this.tipo = tipo;
    }

    private Asignatura(int i, String sin_nombre, int codigoExterno, Tipo tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void cambiarDatos(int codigoExterno ,short codigoInterno, String nombre,Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    void cambiarDatos(short codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(short codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
    
}
