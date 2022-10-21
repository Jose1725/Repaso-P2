/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

import grupos.modelos.Grupo;
import java.util.ArrayList;

/**
 *
 * @author JJC
 */
public class Profesor {
    private int dni;
    private String apellidos;
    private String nombres;
    private String clave;
    private Cargo cargo;
    
    
    private ArrayList<Grupo> profesor = new ArrayList<>();
    
    
    
    public void mostrar(){
        System.out.println(+dni+" "+apellidos+" "+nombres+" "+clave+" "+cargo);
    }


    public Profesor(int dni, String apellidos, String nombres, String clave, Cargo cargo) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.clave = clave;
        this.cargo = cargo;
    }
    
    
    
    

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
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

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    // CARGO

    public ArrayList<Grupo> getProfesor() {
        return profesor;
    }

    public void setProfesor(ArrayList<Grupo> profesor) {
        this.profesor = profesor;
    }
    
    
    
}
