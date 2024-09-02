package clases;


import java.util.HashSet;
import javax.swing.JOptionPane;




public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias= new HashSet ();
    
    



    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        
        
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }

    public Alumno() {
    }

 
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

/*para ello tiene un método agregarMateria que permite
inscribir al Alumno en una materia determinada (implementar de manera tal que no deje
inscribir un alumno en dos materias iguales.) y otro método cantidadMaterias que devuelve la
cantidad de materias a las que está inscripto el alumno.*/
    public void agregarMateria(Materia m) {
        materias.add(m);   
    }

    
    public int cantidadMaterias() {
        return materias.size();
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return this.legajo == other.legajo;
    }

    @Override
    public String toString() {
        return apellido  + nombre;
    }
    
}


