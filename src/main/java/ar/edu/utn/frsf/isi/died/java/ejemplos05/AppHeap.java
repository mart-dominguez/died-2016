package ar.edu.utn.frsf.isi.died.java.ejemplos05;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class AppHeap {
public static void main(String[] args) {
	
	Equipo e1 = new Equipo("Tiburones",29);
	Equipo e4 = new Equipo("Toros",31);
	Equipo e7 = new Equipo("Diablos",28);
	Equipo e9 = new Equipo("Empacadores",25);
	Queue<Equipo> zona1= new PriorityQueue<Equipo>();
	zona1.add(e1);
	zona1.add(e4);
	zona1.add(e9);
	System.out.println(zona1);
	System.out.println("Tamanio:"+zona1.size());
	System.out.println("1er ELemento:"+zona1.peek());
	System.out.println(zona1);
	System.out.println("1er ELemento:"+zona1.poll());
	System.out.println(zona1);
	zona1.add(e7);
	System.out.println(zona1);
	System.out.println("1er ELemento:"+zona1.poll());
	System.out.println(zona1);
	
}
}
