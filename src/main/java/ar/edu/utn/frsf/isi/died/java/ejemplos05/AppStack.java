package ar.edu.utn.frsf.isi.died.java.ejemplos05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AppStack {
public static void main(String[] args) {
	
	Equipo e1 = new Equipo("Tiburones",29);
	Equipo e4 = new Equipo("Toros",31);
	Equipo e7 = new Equipo("Diablos",28);
	Equipo e9 = new Equipo("Empacadores",25);
	Stack<Equipo> zona1= new Stack<Equipo>();
	zona1.push(e1);
	zona1.push(e4);
	zona1.push(e9);
	System.out.println(zona1);
	System.out.println("Tamanio:"+zona1.size());
	System.out.println("1er ELemento:"+zona1.peek());
	System.out.println(zona1);
	System.out.println("1er ELemento:"+zona1.pop());
	System.out.println(zona1);
	zona1.push(e7);
	System.out.println(zona1);
	System.out.println("1er ELemento:"+zona1.pop());
	System.out.println(zona1);
	
}
}
