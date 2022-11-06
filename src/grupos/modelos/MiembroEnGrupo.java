/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import autores.modelos.Alumno;
import autores.modelos.Autor;
import autores.modelos.Profesor;
import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class MiembroEnGrupo {
    private Rol rol;
//    private Profesor profesor;
//    private Alumno alumno;
    private Autor autor; //Modificarla teniendo en cuenta que un alumno también puede ser autor
    private Grupo grupo;
    
    //public MiembroEnGrupo(Rol rol, Profesor profesor,Alumno alumno,Grupo grupo)
    public MiembroEnGrupo(Rol rol, Autor autor,Grupo grupo) {
        this.rol = rol;
//        this.profesor = profesor;
//        this.alumno = alumno;
        this.autor = autor;
        this.grupo = grupo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

//    public Profesor getProfesor() {
//        return profesor;
//    }
//
//    public void setProfesor(Profesor profesor) {
//        this.profesor = profesor;
//    }
//
//    public Alumno getAlumno() {
//        return alumno;
//    }
//
//    public void setAlumno(Alumno alumno) {
//        this.alumno = alumno;

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.autor);
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
        if (getClass().getSuperclass() != obj.getClass().getSuperclass()) {
            return false;
        }
        final MiembroEnGrupo other = (MiembroEnGrupo) obj;
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }
    
    
    
    
    }
    
    
    
    

