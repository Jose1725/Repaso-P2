/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomas.modelos;

/**
 *
 * @author Usuario
 */
public class Idioma {
    private String nombre;

    @Override
    public String toString() {
        return "Idioma{" + "nombre=" + nombre + '}';
    }

    public Idioma(String nombre) {
        this.nombre = nombre;
    }
    
    public void mostrar(){
        System.out.println(this.nombre);
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
