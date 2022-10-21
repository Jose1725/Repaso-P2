package grupos.modelos;

import autores.modelos.Profesor;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Grupo {
    private String nombre;
    private String descripcion;
    
    private ArrayList<Profesor> profesor = new ArrayList<>();
    
    
    
    public void mostrar(){
        System.out.println(nombre+" "+descripcion);
    }

    public Grupo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Profesor> getProfesor() {
        return profesor;
    }

    public void setProfesor(ArrayList<Profesor> profesor) {
        this.profesor = profesor;
    }
    
    
    
    
    
}


