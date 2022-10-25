///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package principal.controladores;
//
//import autores.modelos.Alumno;
//import autores.modelos.Cargo;
//import autores.modelos.Profesor;
//import grupos.modelos.Grupo;
//import grupos.modelos.MiembroEnGrupo;
//import grupos.modelos.Rol;
//import idiomas.modelos.Idioma;
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.ArrayList;
//import java.util.Arrays;
//import lugares.modelos.Lugar;
//import palabrasclaves.modelos.PalabraClave;
//import publicaciones.modelos.Publicacion;
//import tipos.modelos.Tipo;
//
///**
// *
// * @author Mariana
// */
//public class ControladorPrincipal {
//    public static void main(String[] args) {
//        ArrayList<Grupo> listaGrupos = new ArrayList<>();
//        ArrayList<Idioma> idiomas = new ArrayList<>();
//        ArrayList<PalabraClave> palabrasClaves = new ArrayList<>();
//        ArrayList<Tipo> tipos = new ArrayList<>();
//        ArrayList<Lugar> lugares = new ArrayList<>();
//        ArrayList<Alumno> alumnos = new ArrayList<>();
//        ArrayList<Profesor> profesores = new ArrayList<>();
//        ArrayList<Publicacion> publicaciones = new ArrayList<>();
//   // <editor-fold defaultstate="collapsed" desc="Grupos">
//        System.out.println("\n----Grupos----\n");
//        Grupo g1=new Grupo("G1", "Grupo 1");
//        Grupo g2=new Grupo("G2", "Grupo 2");
//        Grupo g3=new Grupo("G3", "Grupo 3");
//        Grupo g4=new Grupo("G4", "Grupo 4");
//        Grupo g5=new Grupo("G5", "Grupo 5");
//        listaGrupos.add(g1);
//        listaGrupos.add(g2);
//        listaGrupos.add(g3);
//        listaGrupos.add(g4);
//        listaGrupos.add(g5);
//
//        for (Grupo gr : listaGrupos)
//            gr.mostrar();
//    // </editor-fold>
//   // <editor-fold defaultstate="collapsed" desc="idiomas">
//        System.out.println("\n----Idiomas----\n");
//        Idioma idioma1 = new Idioma("Idioma 1");
//        Idioma idioma2 = new Idioma("Idioma 2");
//        Idioma idioma3 = new Idioma("Idioma 3");
//        Idioma idioma4 = new Idioma("Idioma 4");
//        Idioma idioma5 = new Idioma("Idioma 5");
//        idiomas.add(idioma1);
//        idiomas.add(idioma2);
//        idiomas.add(idioma3);
//        idiomas.add(idioma4);
//        idiomas.add(idioma5);
//
//        for(Idioma i : idiomas)
//            System.out.println(i); 
//   // </editor-fold>
//   // <editor-fold defaultstate="collapsed" desc="palabras claves">
//        System.out.println("\n----Palabras clave----\n");
//        PalabraClave palabraClave1 = new PalabraClave("PalabraClave1");
//        PalabraClave palabraClave2 = new PalabraClave("PalabraClave2");
//        PalabraClave palabraClave3 = new PalabraClave("PalabraClave3");
//        PalabraClave palabraClave4 = new PalabraClave("PalabraClave4");
//        PalabraClave palabraClave5 = new PalabraClave("PalabraClave5");
//
//        palabrasClaves.add(palabraClave1);
//        palabrasClaves.add(palabraClave2);
//        palabrasClaves.add(palabraClave3);
//        palabrasClaves.add(palabraClave4);
//        palabrasClaves.add(palabraClave5);
//
//        for(PalabraClave pc : palabrasClaves)
//            System.out.println(pc); 
//   // </editor-fold>
//   // <editor-fold defaultstate="collapsed" desc="Tipos">
//        System.out.println("\n----Tipos de publicación----\n");
//        Tipo tipo1 = new Tipo("Tipo 1");
//        Tipo tipo2 = new Tipo("Tipo 2");
//        Tipo tipo3 = new Tipo("Tipo 3");
//        Tipo tipo4 = new Tipo("Tipo 4");
//        Tipo tipo5 = new Tipo("Tipo 5");
//
//        tipos.add(tipo1);
//        tipos.add(tipo2);
//        tipos.add(tipo3);
//        tipos.add(tipo4);
//        tipos.add(tipo5);
//
//        for(Tipo t : tipos)
//            System.out.println(t);
//   
//    // </editor-fold>
//   // <editor-fold defaultstate="collapsed" desc="Lugares">
//        System.out.println("\n----Lugares----\n");
//        Lugar lugar1 = new Lugar("Lugar 1");
//        Lugar lugar2 = new Lugar("Lugar 2");
//        Lugar lugar3 = new Lugar("Lugar 3");
//        Lugar lugar4 = new Lugar("Lugar 4");
//        Lugar lugar5 = new Lugar("Lugar 5");
//        lugares.add(lugar1);
//        lugares.add(lugar2);
//        lugares.add(lugar3);
//        lugares.add(lugar4);
//        lugares.add(lugar5);
//
//        for(Lugar l : lugares)
//            System.out.println(l);
//   // </editor-fold>
//   // <editor-fold defaultstate="collapsed" desc="Autores">
//        Alumno alumno1 = new Alumno(1, "Apellido1", "Nombre1", "Clave1", "1");
//        Alumno alumno2 = new Alumno(2, "Apellido2", "Nombre2", "Clave2", "2");
//        Alumno alumno3 = new Alumno(3, "Apellido3", "Nombre3", "Clave3", "3");
//        Alumno alumno4 = new Alumno(4, "Apellido4", "Nombre4", "Clave4", "4");
//        Alumno alumno5 = new Alumno(5, "Apellido5", "Nombre5", "Clave5", "5");
//        alumnos.add(alumno1);
//        alumnos.add(alumno2);
//        alumnos.add(alumno3);
//        alumnos.add(alumno4);
//        alumnos.add(alumno5);
//        
//        System.out.println("\n----Alumnos----\n");
//        for(Alumno a : alumnos)
//            a.mostrar();
//        
//        Profesor profesor1 = new Profesor(10, "Apellido10", "Nombre10", "Clave10", Cargo.TITULAR);
//        Profesor profesor2 = new Profesor(20, "Apellido20", "Nombre20", "Clave20", Cargo.ADJUNTO);
//        Profesor profesor3 = new Profesor(30, "Apellido30", "Nombre30", "Clave30", Cargo.ADJUNTO);
//        Profesor profesor4 = new Profesor(40, "Apellido40", "Nombre40", "Clave40", Cargo.JTP);
//        Profesor profesor5 = new Profesor(50, "Apellido50", "Nombre50", "Clave50", Cargo.ADG);
//        profesores.add(profesor1);
//        profesores.add(profesor2);
//        profesores.add(profesor3);
//        profesores.add(profesor4);
//        profesores.add(profesor5);
//        
//        System.out.println("\n----Profesores----\n");
//        for(Profesor p : profesores)
//            p.mostrar();
//   // </editor-fold>
//   // <editor-fold defaultstate="collapsed" desc="Publicaciones"> 
//        LocalDate fecha1;
//        fecha1 = LocalDate.of(2021, 8, 24);
//        ArrayList<PalabraClave> palabrasClaves1 = new ArrayList<>();
//        palabrasClaves1.add(palabraClave1);
//        palabrasClaves1.add(palabraClave2);
//        ArrayList<PalabraClave> palabrasClaves2 = new ArrayList<>();
//        palabrasClaves2.add(palabraClave3);
//        ArrayList<PalabraClave> palabrasClaves3 = new ArrayList<>();
//        palabrasClaves3.add(palabraClave1);
//        palabrasClaves3.add(palabraClave5);
//
//        System.out.println("\n----Publicaciones----\n");
//        
////        Publicacion publicacion1 = new Publicacion("Título 1", LocalDate.of(2022, Month.OCTOBER, 24), "Enlace 1", "Resumen 1", tipo1 ,idioma1, lugar1 ,new ArrayList<>(Arrays.asList(new PalabraClave[] {palabraClave1, palabraClave2, palabraClave3})), new MiembroEnGrupo(Rol.ADMINISTRADOR,profesor1,g1));
//        Publicacion publicacion1 = new Publicacion("Título 1", LocalDate.of(2022, Month.OCTOBER, 24), "Enlace 1", "Resumen 1", tipo1, idioma1, lugar1, new ArrayList<>(Arrays.asList(new PalabraClave[] {palabraClave1, palabraClave2, palabraClave3})), new MiembroEnGrupo(Rol.ADMINISTRADOR,profesor1, g1));
//        Publicacion publicacion2 = new Publicacion("Título 2", LocalDate.of(2022, Month.OCTOBER, 24), "Enlace 2" , "Resumen 2", tipo2 ,idioma2, lugar2 ,new ArrayList<>(Arrays.asList(new PalabraClave[] {palabraClave4, palabraClave5})) , new MiembroEnGrupo(Rol.ADMINISTRADOR,profesor2,g2));
//        Publicacion publicacion3 = new Publicacion("Título 1", LocalDate.of(2022, Month.OCTOBER, 24), "Enlace 1" , "Resumen 1", tipo1 ,idioma1, lugar1 ,new ArrayList<>(Arrays.asList(new PalabraClave[] {palabraClave1})) , new MiembroEnGrupo(Rol.ADMINISTRADOR,profesor1,g1));
//        Publicacion publicacion4 = new Publicacion("Título 1", LocalDate.of(2022, Month.OCTOBER, 24), "Enlace 1" , "Resumen 1", tipo1 ,idioma1, lugar1 ,new ArrayList<>(Arrays.asList(new PalabraClave[] {palabraClave1, palabraClave2, palabraClave3})) , new MiembroEnGrupo(Rol.ADMINISTRADOR,profesor1,g1));
//        Publicacion publicacion5 = new Publicacion("Título 1", LocalDate.of(2022, Month.OCTOBER, 24), "Enlace 1" , "Resumen 1", tipo1 ,idioma1, lugar1 ,new ArrayList<>(Arrays.asList(new PalabraClave[] {palabraClave1, palabraClave2, palabraClave3})) , new MiembroEnGrupo(Rol.ADMINISTRADOR,profesor1,g1));
//
//    
//
//        publicaciones.add(publicacion1);
//        publicaciones.add(publicacion2);
//        publicaciones.add(publicacion3);
//        publicaciones.add(publicacion4);
//        publicaciones.add(publicacion5);
//        
//        System.out.println("\n----Publicaciones----\n");
//        for(Publicacion p : publicaciones) {
//            p.mostrar();
//            System.out.println();
//        }
//       //</editor-fold>   
//      
//   
//   
//  }
//}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import autores.modelos.Alumno;
import autores.modelos.Autor;
import autores.modelos.Cargo;
import autores.modelos.Profesor;
import grupos.modelos.Rol;
import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.util.ArrayList;

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
//        ArrayList<Alumno> alumnos = new ArrayList<>();
    //        ArrayList<Profesor> profesores = new ArrayList<>();
        ArrayList<Autor> autores = new ArrayList<>();
        ArrayList<Publicacion> publicaciones = new ArrayList<>();
   // <editor-fold defaultstate="collapsed" desc="Grupos">
        System.out.println("\n----Grupos----\n");
        Grupo g1=new Grupo("G1", "Grupo 1");
        Grupo g2=new Grupo("G2", "Grupo 2");
        Grupo g3=new Grupo("G3", "Grupo 3");
        Grupo g4=new Grupo("G4", "Grupo 4");
        Grupo g5=new Grupo("G5", "Grupo 5");
        Grupo g6=new Grupo("G5", "Grupo 6");
        
        
        if(!listaGrupos.contains(g1))
            listaGrupos.add(g1);
        if(!listaGrupos.contains(g2))
            listaGrupos.add(g2);
         if(!listaGrupos.contains(g3))
            listaGrupos.add(g3);
        if(!listaGrupos.contains(g4))
            listaGrupos.add(g4);
        if(!listaGrupos.contains(g5))
            listaGrupos.add(g5);
        if(!listaGrupos.contains(g6))
            listaGrupos.add(g6);    //NO debe poder agregarse tiene mismo nombre que g5

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
        Idioma idioma6 = new Idioma("Idioma 5");
        
        if(!idiomas.contains(idioma1))
            idiomas.add(idioma1);
        if(!idiomas.contains(idioma2))
            idiomas.add(idioma2);
        if(!idiomas.contains(idioma3))
            idiomas.add(idioma3);
        if(!idiomas.contains(idioma4))
            idiomas.add(idioma4);
        if(!idiomas.contains(idioma5))
            idiomas.add(idioma5);
        if(!idiomas.contains(idioma6))
            idiomas.add(idioma6); //NO deberia agregarse a la lista, repetido
            
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
        PalabraClave palabraClave6 = new PalabraClave("PalabraClave5"); //REPETIDA

        if(!palabrasClaves.contains(palabraClave1));
            palabrasClaves.add(palabraClave1);
        if(!palabrasClaves.contains(palabraClave2));
            palabrasClaves.add(palabraClave2);
        if(!palabrasClaves.contains(palabraClave3));
            palabrasClaves.add(palabraClave3);
        if(!palabrasClaves.contains(palabraClave4));
            palabrasClaves.add(palabraClave4);
        if(!palabrasClaves.contains(palabraClave5));
            palabrasClaves.add(palabraClave5);
        if(!palabrasClaves.contains(palabraClave6));
            palabrasClaves.add(palabraClave6);
        
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
        Tipo tipo6 = new Tipo("Tipo 5");
        
        if(!tipos.contains(tipo1))
            tipos.add(tipo1);
        if(!tipos.contains(tipo2))
            tipos.add(tipo2);
        if(!tipos.contains(tipo3))
            tipos.add(tipo3);
        if(!tipos.contains(tipo4))
            tipos.add(tipo4);
        if(!tipos.contains(tipo5))
            tipos.add(tipo5);
        if(!tipos.contains(tipo6))
            tipos.add(tipo6);
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
        Lugar lugar6 = new Lugar("Lugar 5");
        
        if(!lugares.contains(lugar1))
            lugares.add(lugar1);
        if(!lugares.contains(lugar2))
            lugares.add(lugar2);
        if(!lugares.contains(lugar3))
            lugares.add(lugar3);
        if(!lugares.contains(lugar4))
            lugares.add(lugar4);
        if(!lugares.contains(lugar5))
            lugares.add(lugar5);
        if(!lugares.contains(lugar6))
            lugares.add(lugar6);
        for(Lugar l : lugares)
            System.out.println(l);
   // </editor-fold>
   // <editor-fold defaultstate="collapsed" desc="Autores">
        Autor alumno1 = new Alumno(1, "Apellido1", "Nombre1", "Clave1", "1");
        Autor alumno2 = new Alumno(2, "Apellido2", "Nombre2", "Clave2", "2");
        Autor alumno3 = new Alumno(3, "Apellido3", "Nombre3", "Clave3", "3");
        Autor alumno4 = new Alumno(4, "Apellido4", "Nombre4", "Clave4", "4");
        Autor alumno5 = new Alumno(5, "Apellido5", "Nombre5", "Clave5", "5");
        Autor alumno6 = new Alumno(1, "Apellido6", "Nombre6", "Clave6", "6");//REPETIDO con un alumno por DNI
        Autor alumno7 = new Alumno(6, "Apellido6", "Nombre6", "Clave6", "1");//REPETIDO con un alumno por CX
        
        Autor profesor1 = new Profesor(10, "Apellido10", "Nombre10", "Clave10", Cargo.TITULAR);
        Autor profesor2 = new Profesor(20, "Apellido20", "Nombre20", "Clave20", Cargo.ADJUNTO);
        Autor profesor3 = new Profesor(30, "Apellido30", "Nombre30", "Clave30", Cargo.ADJUNTO);
        Autor profesor4 = new Profesor(40, "Apellido40", "Nombre40", "Clave40", Cargo.JTP);
        Autor profesor5 = new Profesor(50, "Apellido50", "Nombre50", "Clave50", Cargo.ADG);
        Autor profesor6 = new Profesor(50, "Apellido60", "Nombre60", "Clave60", Cargo.ADJUNTO); //repetido con un profesor por DNI
        Autor profesor7 = new Profesor(5, "Apellido60", "Nombre60", "Clave60", Cargo.ADJUNTO); //repetido con un alumno por DNI
        Autor alumno8 = new Alumno(40, "Apellido4", "Nombre4", "Clave4", "4"); //repetido con un Prfesor por DNI
        
        if(!autores.contains(alumno1))
            autores.add(alumno1);
        if(!autores.contains(alumno2))
            autores.add(alumno2);
        if(!autores.contains(alumno3))
            autores.add(alumno3);
        if(!autores.contains(alumno4))
            autores.add(alumno4);
        if(!autores.contains(alumno5))
            autores.add(alumno5);
        if(!autores.contains(alumno6))
            autores.add(alumno6);
         if(!autores.contains(alumno7))
            autores.add(alumno7);
         
        if(!autores.contains(profesor1))
            autores.add(profesor1);
        if(!autores.contains(profesor2))
            autores.add(profesor2);
        if(!autores.contains(profesor3))
            autores.add(profesor3);
        if(!autores.contains(profesor4))
            autores.add(profesor4);
        if(!autores.contains(profesor5))
            autores.add(profesor5);
        if(!autores.contains(profesor6))
            autores.add(profesor6);
        if(!autores.contains(profesor7))
            autores.add(profesor7);
        if(!autores.contains(alumno8))
            autores.add(alumno8);
        
       
        System.out.println("\n----AUTORES----\n");
        for(Autor a : autores)
            a.mostrar();
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
        
        MiembroEnGrupo meg1= new MiembroEnGrupo(autores.get(0), listaGrupos.get(0), Rol.ADMINISTRADOR);
        MiembroEnGrupo meg2= new MiembroEnGrupo(autores.get(8), listaGrupos.get(0), Rol.ADMINISTRADOR);
       
        Publicacion publicacion1 = new Publicacion("Título 1",meg1,LocalDate.of(2020, 6, 24), tipo1, idioma1, lugar1, palabrasClaves1, "Enlace 1", "Resumen 1");
        Publicacion publicacion2 = new Publicacion("Título 2", meg2,fecha1, tipo2, idioma2, lugar2, palabrasClaves2, "Enlace 2", "Resumen 2");
        Publicacion publicacion3 = new Publicacion("Título 3",new MiembroEnGrupo(autores.get(1), listaGrupos.get(0), Rol.ADMINISTRADOR), LocalDate.of(2020, 6, 24), tipo1, idioma2, lugar2, palabrasClaves3, "Enlace 3", "Resumen 3");
        Publicacion publicacion4 = new Publicacion("Título 4",new MiembroEnGrupo(autores.get(0), listaGrupos.get(0), Rol.COLABORADOR),  LocalDate.of(2020, 6, 24), tipo4, idioma2, lugar5,palabrasClaves3, "Enlace 4", "Resumen 4");
        Publicacion publicacion5 = new Publicacion("Título 5", new MiembroEnGrupo(autores.get(7), listaGrupos.get(1), Rol.COLABORADOR), LocalDate.of(2020, 6, 24), tipo5, idioma3, lugar5, palabrasClaves1, "Enlace 5", "Resumen 5");
        Publicacion publicacion6 = new Publicacion("Título 5", meg1, LocalDate.of(2020, 6, 24), tipo5, idioma3, lugar5, palabrasClaves1, "Enlace 5", "Resumen 5");
        //repetida
        
        if(!publicaciones.contains(publicacion1))
            publicaciones.add(publicacion1);
        if(!publicaciones.contains(publicacion2))
            publicaciones.add(publicacion2);
        if(!publicaciones.contains(publicacion3))
            publicaciones.add(publicacion3);
        if(!publicaciones.contains(publicacion4))
            publicaciones.add(publicacion4);
        if(!publicaciones.contains(publicacion5))
            publicaciones.add(publicacion5);
        if(!publicaciones.contains(publicacion6))
            publicaciones.add(publicacion6);
        
        System.out.println("\n----Publicaciones----\n");
        for(Publicacion p : publicaciones) {
            p.mostrar();
            System.out.println();
        }
       //</editor-fold>   
      
    /*Main parte 3*/
        /*Luego de crear grupos y autores, tomar 1 grupo y agregarle 2 autores 
        como miembros. Mostrar el grupo verificando que tenga los miembros 
        asignados. Verificar también que no se pueda agregar 
        un mismo autor más de una vez, por más que sean en roles distintos.*/
        g1.agregarMiembro(profesor1, Rol.ADMINISTRADOR);
        g1.agregarMiembro(profesor1, Rol.COLABORADOR); //autor repetido
        g1.agregarMiembro(alumno1, Rol.COLABORADOR);
        g1.mostrar();
        
        /*Tomar 1 de los 2 autores que se asignó al grupo anterior y 
        agregarlo a otro grupo distinto. 
        Mostrar los 2 autores verificando que pertenezcan a los grupos
        a los que fueron asignados. 
        Verificar también que no se pueda agregarle a un autor 
        un mismo grupo más de una vez, por más que sean roles distintos.*/

        profesor1.agregarGrupo(g2, Rol.COLABORADOR);
        profesor1.agregarGrupo(g2, Rol.ADMINISTRADOR); //grupo repetido
        profesor1.mostrar();
        profesor2.mostrar();
        
        /*
        Tomar el grupo al que se le agregaron los 2 autores como miembros, 
        quitarle 1 y mostrarlo, verificando que el autor 
        ya no es miembro del grupo.
        */
        g1.quitarMiembro(profesor1);
        g1.mostrar();

        /*
        Crear un nuevo grupo para los super administradores. 
        Este grupo DEBE llevar por nombre "Super Administradores". 
        Intentar asignarle como miembro un autor cualquiera
        con el rol de colaborador, verificando que se lo
        agrega pero con el rol de administrador.
        */
        Grupo grupo7 = new Grupo("Super Administradores", "Grupo para los super administradores"); //grupo para los super administradores
        if (!listaGrupos.contains(grupo7))
            listaGrupos.add(grupo7);
        grupo7.agregarMiembro(profesor1, Rol.COLABORADOR);
        grupo7.mostrar();

        /*
        Verificar que el último grupo creado es de super administradores
        y cualquiera de los otros grupos no 
        (usar el método esSuperAdministradores() definido en la clase Grupo).
        */
        System.out.println(grupo7.esSuperAdministradores());
        System.out.println(g1.esSuperAdministradores());
        
        /*Tomar el autor que se agregó al grupo de super administradores, 
        verificar que el mismo es super administrador 
        y los otros autores no (usar el método esSuperAdministrador() 
        definido en la clase Autor).*/
        System.out.println(profesor1.esSuperAdministrador());
        System.out.println(alumno1.esSuperAdministrador());

        /*Main parte 3*/
   
  }
}