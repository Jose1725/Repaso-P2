package grupos.modelos;

import autores.modelos.Profesor;
import java.util.ArrayList;
import java.util.Objects;

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
    
    private ArrayList<MiembroEnGrupo> miembroengrupo = new ArrayList<>();
    
    
    
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

    public ArrayList<MiembroEnGrupo> getMiembroengrupo() {
        return miembroengrupo;
    }

    public void setMiembroengrupo(ArrayList<MiembroEnGrupo> miembroengrupo) {
        this.miembroengrupo = miembroengrupo;
    }

   
    // equals y hashcode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Grupo other = (Grupo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
    
    
}


