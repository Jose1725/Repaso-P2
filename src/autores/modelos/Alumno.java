/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

/**
 *
 * @author Usuario
 */
public class Alumno extends Autor{
//    private int dni;
//    private String apellidos;
//    private String nombres;
//    private String clave;
    private String cx;
    
    public void mostrar(){
       // System.out.println(+dni+" "+apellidos+" "+nombres+" "+clave+" "+cx);
       super.mostrar(); // con super se puede llamar a metodos de la superclasde
        System.out.println(cx);
    }

    public Alumno(int dni, String apellidos, String nombres, String clave, String cx) {
        super(dni,apellidos,nombres,clave); //llama al constructor de Autor
        this.cx = cx;
    }

    public String getCx() {
        return cx;
    }

    public void setCx(String cx) {
        this.cx = cx;
    }
//ya no van xq extiene de Autor
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
//    
//    // equals y hashcode
//
//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 97 * hash + this.dni;
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
//        final Alumno other = (Alumno) obj;
//        if (this.dni != other.dni) {
//            return false;
//        }
//        return true;
//    }
//    
    
}
