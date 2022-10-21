/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import autores.modelos.Alumno;
import autores.modelos.Cargo;
import autores.modelos.Profesor;
import grupos.modelos.Grupo;
import idiomas.modelos.Idioma;
import java.util.ArrayList;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

/**
 *
 * @author JJC
 */
public class ControladorPrincipal {
    public static void main(String[] args) {
        //array de cada clase
        ArrayList<Alumno> alumno = new ArrayList<>();
        ArrayList<Profesor> profesor= new ArrayList<>();
        ArrayList<Idioma> idioma= new ArrayList<>();
        ArrayList<Lugar> lugar= new ArrayList<>();
        ArrayList<PalabraClave> palabraclave= new ArrayList<>();
        ArrayList<Tipo> tipo = new ArrayList<>();
        ArrayList<Grupo> grupo= new ArrayList<>();
        
        //se instancia cada clase
        Alumno alumno1 = new Alumno(1,"a1","n1","cl1","cx1");
        Alumno alumno2 = new Alumno(2,"a2","n2","cl2","cx2");
        Alumno alumno3 = new Alumno(3,"a3","n3","cl3","cx3");
        Alumno alumno4 = new Alumno(4,"a4","n4","cl4","cx4");
        Alumno alumno5 = new Alumno(5,"a5","n5","cl5","cx5");
        
//        Profesor profesor1 = new Profesor(1,"a1","n1","cl1","c1");
        Profesor profesor1 = new Profesor(1,"a1","n1","cl1",Cargo.ADG);
        Profesor profesor2 = new Profesor(2,"a2","n2","cl2",Cargo.Adjunto);
        Profesor profesor3 = new Profesor(3,"a3","n3","cl3",Cargo.Asociado);
        Profesor profesor4 = new Profesor(4,"a4","n4","cl4",Cargo.JTP);
        Profesor profesor5 = new Profesor(5,"a5","n5","cl5",Cargo.Titular);
        
        
        Idioma idioma1 = new Idioma("Idioma 1");
        Idioma idioma2 = new Idioma("Idioma 2");
        Idioma idioma3 = new Idioma("Idioma 3");
        Idioma idioma4 = new Idioma("Idioma 4");
        Idioma idioma5 = new Idioma("Idioma 5");
        
        
        Lugar lugar1 = new Lugar("Lugar 1");
        Lugar lugar2 = new Lugar("Lugar 2");
        Lugar lugar3 = new Lugar("Lugar 3");
        Lugar lugar4 = new Lugar("Lugar 4");
        Lugar lugar5 = new Lugar("Lugar 5");
        
        
        PalabraClave palabraClave1 = new PalabraClave("PalabraClave1");
        PalabraClave palabraClave2 = new PalabraClave("PalabraClave2");
        PalabraClave palabraClave3 = new PalabraClave("PalabraClave3");
        PalabraClave palabraClave4 = new PalabraClave("PalabraClave4");
        PalabraClave palabraClave5 = new PalabraClave("PalabraClave5");
        
        
        Tipo tipo1 = new Tipo("Tipo 1");
        Tipo tipo2 = new Tipo("Tipo 2");
        Tipo tipo3 = new Tipo("Tipo 3");
        Tipo tipo4 = new Tipo("Tipo 4");
        Tipo tipo5 = new Tipo("Tipo 5");
        
        
        Grupo g1=new Grupo("G1", "Grupo 1");
        Grupo g2=new Grupo("G2", "Grupo 2");
        Grupo g3=new Grupo("G3", "Grupo 3");
        Grupo g4=new Grupo("G4", "Grupo 4");
        Grupo g5=new Grupo("G5", "Grupo 5");
        
        //se cargan objetos a cada array
        alumno.add(alumno1);
        alumno.add(alumno2);
        alumno.add(alumno3);
        alumno.add(alumno4);
        alumno.add(alumno5);
        
        profesor.add(profesor1);
        profesor.add(profesor2);
        profesor.add(profesor3);
        profesor.add(profesor4);
        profesor.add(profesor5);
        
        idioma.add(idioma1);
        idioma.add(idioma2);
        idioma.add(idioma3);
        idioma.add(idioma4);
        idioma.add(idioma5);
        
        lugar.add(lugar1);
        lugar.add(lugar2);
        lugar.add(lugar3);
        lugar.add(lugar4);
        lugar.add(lugar5);
        
        palabraclave.add(palabraClave1);
        palabraclave.add(palabraClave2);
        palabraclave.add(palabraClave3);
        palabraclave.add(palabraClave4);
        palabraclave.add(palabraClave5);
        
        tipo.add(tipo1);
        tipo.add(tipo2);
        tipo.add(tipo3);
        tipo.add(tipo4);
        tipo.add(tipo5);
        
        grupo.add(g1);
        grupo.add(g2);
        grupo.add(g3);
        grupo.add(g4);
        grupo.add(g5);
        
        
        //recorrer vectores
        System.out.println("Alumno");
        for(Alumno a: alumno){
            a.mostrar();
        }
        System.out.println("");
        
        System.out.println("Profesor");
        for(Profesor p: profesor){
            p.mostrar();
        }
        System.out.println("");
        
        System.out.println("Idioma");
        for(Idioma i: idioma){
            i.mostrar();
        }
        System.out.println("");
        
        System.out.println("Lugar");
        for(Lugar l: lugar){
            l.mostrar();
        }
        System.out.println("");
        System.out.println("Palabra clave");
        for(PalabraClave pc: palabraclave){
            pc.mostrar();
        }
        System.out.println("");
        
        System.out.println("Tipo");
        for(Tipo t: tipo){
            t.mostrar();
        }    
        System.out.println("");
        System.out.println("Grupo");
        for(Grupo g: grupo){
            g.mostrar();
        }
        System.out.println("");
        
        
       //Get y Set"
//       idioma.get(5);
//        idioma.set(1, idioma4);
//        System.out.println(idioma.get(1));
//        
//        
//        System.out.println("Idioma2");
//        for(Idioma i: idioma){
//            i.mostrar();
//        }
   
        
        
    }
    
    
    
}

