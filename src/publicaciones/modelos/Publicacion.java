/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones.modelos;

import autores.modelos.Profesor;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.util.ArrayList;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

/**
 *
 * @author Usuario
 */
public class Publicacion {
    private String titulo;
    private LocalDate fechaDePublicacion;
    private String enlace;
    private String resumen;
    
    private ArrayList<PalabraClave> palabraclave = new ArrayList<>();
    private Tipo tipo;
    private Idioma idioma;
    private Lugar lugar;
    
    private Profesor profesor;

    public Publicacion(String titulo, LocalDate fechaDePublicacion, String enlace, String resumen, Tipo tipo, Idioma idioma, Lugar lugar, Profesor profesor) {
        this.titulo = titulo;
        this.fechaDePublicacion = fechaDePublicacion;
        this.enlace = enlace;
        this.resumen = resumen;
        this.tipo = tipo;
        this.idioma = idioma;
        this.lugar = lugar;
        this.profesor = profesor;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(LocalDate fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public ArrayList<PalabraClave> getPalabraclave() {
        return palabraclave;
    }

    public void setPalabraclave(ArrayList<PalabraClave> palabraclave) {
        this.palabraclave = palabraclave;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }
    
    
    
    
    
}


