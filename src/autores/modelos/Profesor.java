/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import java.util.ArrayList;

/**
 *
 * @author JJC
 */
public class Profesor extends Autor{
//    private int dni;
//    private String apellidos;
//    private String nombres;
//    private String clave;
    private Cargo cargo;
    
    
    private ArrayList<MiembroEnGrupo> miembroengrupo = new ArrayList<>();

  
    
    
    @Override
    public void mostrar(){
        //otra forma para mostrar
//        System.out.println(super.getDni() + super.getApellidos() + super.getNombres() + super.getClave() + cargo);
        super.mostrar();
        System.out.println(cargo);
    }

    public Profesor(int dni, String apellidos, String nombres, String clave, Cargo cargo) {
       super(dni,apellidos,nombres,clave); //llama al constructor de Autor
        this.cargo = cargo;
    }




    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

//    @Override
//    public int getDni() {
//        return dni;
//    }
//
//    @Override
//    public void setDni(int dni) {
//        this.dni = dni;
//    }
//
//    @Override
//    public String getApellidos() {
//        return apellidos;
//    }
//
//    @Override
//    public void setApellidos(String apellidos) {
//        this.apellidos = apellidos;
//    }
//
//    @Override
//    public String getNombres() {
//        return nombres;
//    }
//
//    @Override
//    public void setNombres(String nombres) {
//        this.nombres = nombres;
//    }
//
//    @Override
//    public String getClave() {
//        return clave;
//    }
//
//    @Override
//    public void setClave(String clave) {
//        this.clave = clave;
//    }
//    
    // CARGO

    public ArrayList<MiembroEnGrupo> getMiembroengrupo() {
        return miembroengrupo;
    }

    public void setMiembroengrupo(ArrayList<MiembroEnGrupo> miembroengrupo) {
        this.miembroengrupo = miembroengrupo;
    }

  
    // equals y hashcode
////ya no van xq extiene de Autor
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 23 * hash + this.dni;
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Profesor other = (Profesor) obj;
//        if (this.dni != other.dni) {
//            return false;
//        }
//        return true;
//    }
    
    
    
}
