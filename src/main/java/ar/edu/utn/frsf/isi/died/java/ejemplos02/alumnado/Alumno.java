/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.utn.frsf.isi.died.java.ejemplos02.alumnado;

/**
 * Clase que representa un alumno en el sistema
 * @author mdominguez
 */
public class Alumno {
    /**
     * Guarda el numero de libreta como un valor entero
     */
    private Integer nroLibretaUniversitaria;
    /**
     * Nombre y apellido del alumno
     */
    private String nombre;
    
    
    // constructores
    public Alumno(){
        
    }

    public Alumno(Integer nroLib,String nom){        
        this.nroLibretaUniversitaria=nroLib;
        this.nombre = nom;
    }

    public Alumno(String nombre){
        this(null,nombre);
    }
    
    public Alumno(Integer nroLib){
        this(nroLib,null);
    }

    // metodos de negocio
    
    // getters y setters
    public Integer getNroLibretaUniversitaria() {
        return nroLibretaUniversitaria;
    }

    public void setNroLibretaUniversitaria(Integer nroLibretaUniversitaria) {
        this.nroLibretaUniversitaria = nroLibretaUniversitaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
