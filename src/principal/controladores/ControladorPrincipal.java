/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import autores.modelos.Alumno;
import autores.modelos.Cargo;
import autores.modelos.Profesor;
import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import grupos.modelos.Rol;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import publicaciones.modelos.Publicacion;
import tipos.modelos.Tipo;

/**
 *
 * @author Mariana
 */
public class ControladorPrincipal {
    public static void main(String[] args) {
        ArrayList<Grupo> listaGrupos = new ArrayList<>();
        ArrayList<Idioma> idiomas = new ArrayList<>();
        ArrayList<PalabraClave> palabrasClaves = new ArrayList<>();
        ArrayList<Tipo> tipos = new ArrayList<>();
        ArrayList<Lugar> lugares = new ArrayList<>();
        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<Profesor> profesores = new ArrayList<>();
        ArrayList<Publicacion> publicaciones = new ArrayList<>();
   // <editor-fold defaultstate="collapsed" desc="Grupos">
        System.out.println("\n----Grupos----\n");
        Grupo g1=new Grupo("G1", "Grupo 1");
        Grupo g2=new Grupo("G2", "Grupo 2");
        Grupo g3=new Grupo("G3", "Grupo 3");
        Grupo g4=new Grupo("G4", "Grupo 4");
        Grupo g5=new Grupo("G5", "Grupo 5");
        listaGrupos.add(g1);
        listaGrupos.add(g2);
        listaGrupos.add(g3);
        listaGrupos.add(g4);
        listaGrupos.add(g5);

        for (Grupo gr : listaGrupos)
            gr.mostrar();
    // </editor-fold>
   // <editor-fold defaultstate="collapsed" desc="idiomas">
        System.out.println("\n----Idiomas----\n");
        Idioma idioma1 = new Idioma("Idioma 1");
        Idioma idioma2 = new Idioma("Idioma 2");
        Idioma idioma3 = new Idioma("Idioma 3");
        Idioma idioma4 = new Idioma("Idioma 4");
        Idioma idioma5 = new Idioma("Idioma 5");
        idiomas.add(idioma1);
        idiomas.add(idioma2);
        idiomas.add(idioma3);
        idiomas.add(idioma4);
        idiomas.add(idioma5);

        for(Idioma i : idiomas)
            System.out.println(i); 
   // </editor-fold>
   // <editor-fold defaultstate="collapsed" desc="palabras claves">
        System.out.println("\n----Palabras clave----\n");
        PalabraClave palabraClave1 = new PalabraClave("PalabraClave1");
        PalabraClave palabraClave2 = new PalabraClave("PalabraClave2");
        PalabraClave palabraClave3 = new PalabraClave("PalabraClave3");
        PalabraClave palabraClave4 = new PalabraClave("PalabraClave4");
        PalabraClave palabraClave5 = new PalabraClave("PalabraClave5");

        palabrasClaves.add(palabraClave1);
        palabrasClaves.add(palabraClave2);
        palabrasClaves.add(palabraClave3);
        palabrasClaves.add(palabraClave4);
        palabrasClaves.add(palabraClave5);

        for(PalabraClave pc : palabrasClaves)
            System.out.println(pc); 
   // </editor-fold>
   // <editor-fold defaultstate="collapsed" desc="Tipos">
        System.out.println("\n----Tipos de publicación----\n");
        Tipo tipo1 = new Tipo("Tipo 1");
        Tipo tipo2 = new Tipo("Tipo 2");
        Tipo tipo3 = new Tipo("Tipo 3");
        Tipo tipo4 = new Tipo("Tipo 4");
        Tipo tipo5 = new Tipo("Tipo 5");

        tipos.add(tipo1);
        tipos.add(tipo2);
        tipos.add(tipo3);
        tipos.add(tipo4);
        tipos.add(tipo5);

        for(Tipo t : tipos)
            System.out.println(t);
   
    // </editor-fold>
   // <editor-fold defaultstate="collapsed" desc="Lugares">
        System.out.println("\n----Lugares----\n");
        Lugar lugar1 = new Lugar("Lugar 1");
        Lugar lugar2 = new Lugar("Lugar 2");
        Lugar lugar3 = new Lugar("Lugar 3");
        Lugar lugar4 = new Lugar("Lugar 4");
        Lugar lugar5 = new Lugar("Lugar 5");
        lugares.add(lugar1);
        lugares.add(lugar2);
        lugares.add(lugar3);
        lugares.add(lugar4);
        lugares.add(lugar5);

        for(Lugar l : lugares)
            System.out.println(l);
   // </editor-fold>
   // <editor-fold defaultstate="collapsed" desc="Autores">
        Alumno alumno1 = new Alumno(1, "Apellido1", "Nombre1", "Clave1", "1");
        Alumno alumno2 = new Alumno(2, "Apellido2", "Nombre2", "Clave2", "2");
        Alumno alumno3 = new Alumno(3, "Apellido3", "Nombre3", "Clave3", "3");
        Alumno alumno4 = new Alumno(4, "Apellido4", "Nombre4", "Clave4", "4");
        Alumno alumno5 = new Alumno(5, "Apellido5", "Nombre5", "Clave5", "5");
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);
        
        System.out.println("\n----Alumnos----\n");
        for(Alumno a : alumnos)
            a.mostrar();
        
        Profesor profesor1 = new Profesor(10, "Apellido10", "Nombre10", "Clave10", Cargo.TITULAR);
        Profesor profesor2 = new Profesor(20, "Apellido20", "Nombre20", "Clave20", Cargo.ADJUNTO);
        Profesor profesor3 = new Profesor(30, "Apellido30", "Nombre30", "Clave30", Cargo.ADJUNTO);
        Profesor profesor4 = new Profesor(40, "Apellido40", "Nombre40", "Clave40", Cargo.JTP);
        Profesor profesor5 = new Profesor(50, "Apellido50", "Nombre50", "Clave50", Cargo.ADG);
        profesores.add(profesor1);
        profesores.add(profesor2);
        profesores.add(profesor3);
        profesores.add(profesor4);
        profesores.add(profesor5);
        
        System.out.println("\n----Profesores----\n");
        for(Profesor p : profesores)
            p.mostrar();
   // </editor-fold>
   // <editor-fold defaultstate="collapsed" desc="Publicaciones"> 
        LocalDate fecha1;
        fecha1 = LocalDate.of(2021, 8, 24);
        ArrayList<PalabraClave> palabrasClaves1 = new ArrayList<>();
        palabrasClaves1.add(palabraClave1);
        palabrasClaves1.add(palabraClave2);
        ArrayList<PalabraClave> palabrasClaves2 = new ArrayList<>();
        palabrasClaves2.add(palabraClave3);
        ArrayList<PalabraClave> palabrasClaves3 = new ArrayList<>();
        palabrasClaves3.add(palabraClave1);
        palabrasClaves3.add(palabraClave5);
//        Publicacion publicacion1 = new Publicacion("Título 1", profesores.get(0),LocalDate.of(2020, 6, 24), tipo1, idioma1, lugar1, palabrasClaves1, "Enlace 1", "Resumen 1");
        Publicacion publicacion1 = new Publicacion("Título 1", LocalDate.of(2022, Month.OCTOBER, 24), "Enlace 1" , "Resumen 1", tipo1 ,idioma1, lugar1 ,new ArrayList<>(Arrays.asList(new PalabraClave[] {palabraClave1, palabraClave2, palabraClave3})) , new MiembroEnGrupo(Rol.ADMINISTRADOR,profesor1,g1));
        Publicacion publicacion2 = new Publicacion("Título 2", LocalDate.of(2022, Month.OCTOBER, 24), "Enlace 2" , "Resumen 2", tipo2 ,idioma2, lugar2 ,new ArrayList<>(Arrays.asList(new PalabraClave[] {palabraClave4, palabraClave5})) , new MiembroEnGrupo(Rol.ADMINISTRADOR,profesor2,g2));
        Publicacion publicacion3 = new Publicacion("Título 1", LocalDate.of(2022, Month.OCTOBER, 24), "Enlace 1" , "Resumen 1", tipo1 ,idioma1, lugar1 ,new ArrayList<>(Arrays.asList(new PalabraClave[] {palabraClave1})) , new MiembroEnGrupo(Rol.ADMINISTRADOR,profesor1,g1));
        Publicacion publicacion4 = new Publicacion("Título 1", LocalDate.of(2022, Month.OCTOBER, 24), "Enlace 1" , "Resumen 1", tipo1 ,idioma1, lugar1 ,new ArrayList<>(Arrays.asList(new PalabraClave[] {palabraClave1, palabraClave2, palabraClave3})) , new MiembroEnGrupo(Rol.ADMINISTRADOR,profesor1,g1));
        Publicacion publicacion5 = new Publicacion("Título 1", LocalDate.of(2022, Month.OCTOBER, 24), "Enlace 1" , "Resumen 1", tipo1 ,idioma1, lugar1 ,new ArrayList<>(Arrays.asList(new PalabraClave[] {palabraClave1, palabraClave2, palabraClave3})) , new MiembroEnGrupo(Rol.ADMINISTRADOR,profesor1,g1));
//         Publicacion publicacion1 = new Publicacion("Título 1", LocalDate.of(2022, Month.OCTOBER, 24), "Enlace 1" , "Resumen 1", tipo1 ,idioma1, lugar1 ,ArrayList<PalabraClave> palabraclave1 , new MiembroEnGrupo(Rol.ADMINISTRADOR,profesor1,g1));
    

//     
        
        publicaciones.add(publicacion1);
        publicaciones.add(publicacion2);
        publicaciones.add(publicacion3);
        publicaciones.add(publicacion4);
        publicaciones.add(publicacion5);
        System.out.println("\n----Publicaciones----\n");
        for(Publicacion p : publicaciones) {
            p.mostrar();
            System.out.println();
        }
       //</editor-fold>   
      
   
   
  }
}