/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones.modelos;

import autores.modelos.Profesor;
import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    
    
    private MiembroEnGrupo miembroengrupo;

    public Publicacion(String titulo, LocalDate fechaDePublicacion, String enlace, String resumen, Tipo tipo, Idioma idioma, Lugar lugar,ArrayList<PalabraClave> palabraclave, MiembroEnGrupo miembroengrupo) {
        this.titulo = titulo;
        this.fechaDePublicacion = fechaDePublicacion;
        this.enlace = enlace;
        this.resumen = resumen;
        this.tipo = tipo;
        this.idioma = idioma;
        this.lugar = lugar;
        this.palabraclave = palabraclave;
//        this.profesor = profesor;
        this.miembroengrupo = miembroengrupo;
    }

//    public Publicacion(String título_1, LocalDate of, String enlace_1, String resumen_1, Tipo tipo1) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    

//    public Publicacion(String título_1, LocalDate of, String enlace_1, String resumen_1, Tipo tipo1, Idioma idioma1, Lugar lugar1, ArrayList<PalabraClave> arrayList, MiembroEnGrupo miembroEnGrupo) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

   

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
    
    public void mostrar(){
        
//        Título: Título 5
//        Autor: Apellido40, Nombre40
//        Fecha de publicación: 24/06/2020
//        Tipo: Tipo 5
//        Idioma: Idioma 3
//        Lugar: Lugar 5
//        Palabras claves
//        ---------------
//        PalabraClave2
//        PalabraClave3
//        PalabraClave4
//        Enlace: Enlace 5
//        Resumen: Resumen 5
        System.out.println("Titulo: " + this.titulo);
//        System.out.println("Autor: " + this.profesor.getNombres() +", " + this.profesor.getApellidos());
        System.out.println("Autor: "+this.miembroengrupo.getProfesor());
        System.out.println("Fecha de publicación: "+this.fechaDePublicacion.getDayOfMonth()+"/"+this.fechaDePublicacion.getMonth()+"/"+this.fechaDePublicacion.getYear());
        System.out.println("Tipo : " +this.tipo);
        System.out.println("Idioma: "+this.idioma);
        System.out.println("Lugar: "+this.lugar);
        System.out.println("Palabras claves");
        for (PalabraClave palabra : palabraclave){
            System.out.println(this.palabraclave);
        }   
        System.out.println("Enlace: "+this.enlace);
        System.out.println("Resumen: "+ this.resumen);

    }

    public MiembroEnGrupo getMiembroengrupo() {
        return miembroengrupo;
    }

    public void setMiembroengrupo(MiembroEnGrupo miembroengrupo) {
        this.miembroengrupo = miembroengrupo;
    }
    
    
    // equals y hashcode
    
    
    
    
    
    
    
    
}


