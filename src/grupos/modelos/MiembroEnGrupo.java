/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import autores.modelos.Profesor;

/**
 *
 * @author Usuario
 */
public class MiembroEnGrupo {
    private Rol rol;
    private Profesor profesor;
    private Grupo grupo;

    public MiembroEnGrupo(Rol rol, Profesor profesor, Grupo grupo) {
        this.rol = rol;
        this.profesor = profesor;
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

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    
    
    
}
