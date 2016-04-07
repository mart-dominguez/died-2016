/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.utn.frsf.isi.died.java.ejemplos02;

import ar.edu.utn.frsf.isi.died.java.ejemplos02.academica.Curso;
import ar.edu.utn.frsf.isi.died.java.ejemplos02.alumnado.Alumno;

/**
 *
 * @author mdominguez
 */
public class Aplicacion {
    public static void main(String[] args){
        Alumno alu1 = new Alumno(33669);
        alu1.setNombre("Zinzan Brooke");

        Alumno alu2 = new Alumno(10101,"Carlos Spencer");

        Alumno alu3 = new Alumno();
        alu3.setNombre("Thomas Castaignede");
        alu3.setNroLibretaUniversitaria(32143);

        Alumno alu4 = new Alumno();
        alu4.setNombre("John Eales");
        alu4.setNroLibretaUniversitaria(45678);
        
        Curso curso1 = new Curso("java avanzado");
        
        System.out.println("Inscribio alu4?"+curso1.inscribir(alu4));
        curso1.abrirCurso(3);
        System.out.println("Inscribio alu4?"+curso1.inscribir(alu4));
        System.out.println("Inscribio alu3?"+curso1.inscribir(alu3));
        System.out.println("Inscribio alu2?"+curso1.inscribir(alu2));
        
        System.out.println("Inscribio alu1?"+curso1.inscribir(alu1));
        
        
    }
}
