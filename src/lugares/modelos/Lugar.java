/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lugares.modelos;

/**
 *
 * @author Usuario
 */
public class Lugar {
     private String nombre;

    @Override
    public String toString() {
        return "Idioma{" + "nombre=" + nombre + '}';
    }

    public Lugar(String nombre) {
        this.nombre = nombre;
    }
    
     public void mostrar(){
        System.out.println(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     
     
     
}