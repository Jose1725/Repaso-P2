/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

import grupos.modelos.MiembroEnGrupo;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public abstract class Autor {
    
    private int dni;
    private String apellidos;
    private String nombres;
    private String clave;
    
    
    //Asociación
    private ArrayList<MiembroEnGrupo> miembro = new ArrayList<>();

    public Autor(int dni, String apellidos, String nombres, String clave) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.dni;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true;   }
        if (obj == null) {  return false;   }
        if (getClass().getSuperclass() != obj.getClass().getSuperclass()) { return false; } //.getSuperclass() para la superclase
        /*final*/ Autor other = (Autor) obj;
//        if (this.dni != other.dni) {
//            return false;
//        }
        return (this.dni == other.dni);
//        return true;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void mostrar(){
        //[nro_documento] Apellido, Nombres por ejemplo: [30759167] Gimenez, María José
        System.out.println("["+dni+"]"+apellidos+" ,"+nombres );
        
    }
    
    
    
    
    
    
}
