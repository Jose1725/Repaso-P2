/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrasclaves.modelos;

/**
 *
 * @author Usuario
 */
public class PalabraClave {
     private String nombre;

    @Override
    public String toString() {
        return "Idioma{" + "nombre=" + nombre + '}';
    }

    public PalabraClave(String nombre) {
        this.nombre = nombre;
    }
    
     public void mostrar(){
        System.out.println(this.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     
     
     
     
}
