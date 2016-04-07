/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.utn.frsf.isi.died.java.ejemplos02.academica;

import ar.edu.utn.frsf.isi.died.java.ejemplos02.alumnado.Alumno;

/**
 *
 * @author mdominguez
 */
public class Curso {
    private Alumno[] alumnosInscriptos;
    private String nombre;
    private Integer cupo;
    
    public Curso(String nombre){
        this.nombre = nombre;        
    }
    
    public void abrirCurso(Integer cupo){
        this.cupo=cupo;
        this.alumnosInscriptos = new Alumno[cupo];
    }
    
    public Boolean inscribir(Alumno alu){
        Boolean pudoInscribirlo=false;
        // si el curso no está abierto entonces retornar false
        if(this.alumnosInscriptos==null) return false;
        Integer indiceAux =0;
        while(indiceAux<cupo && !pudoInscribirlo){
            if(this.alumnosInscriptos[indiceAux]==null){
                this.alumnosInscriptos[indiceAux]=alu;
                pudoInscribirlo=true;
            }
            indiceAux++;
        }
        return pudoInscribirlo;
    }
    
    public void imprimir(){
        System.out.println("Listado de alumnos");
        for(Alumno unAlumno: this.alumnosInscriptos){
            System.out.println("AlumnoInscripto - Nombre: "+unAlumno.getNombre()+ " - Nro Libreta"+unAlumno.getNroLibretaUniversitaria());
        }
    }
}
