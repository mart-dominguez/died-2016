package ar.edu.utn.frsf.isi.died.java.ejemplos05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class AppList {

	public static void main(String[] args) {
		Collection<Equipo> zona1;
		Equipo e1 = new Equipo("Tiburones",29);
		Equipo e2 = new Equipo("Guerreros II",23);
		Equipo e3 = new Equipo("Los Delfines",25);
		Equipo e4 = new Equipo("Toros",31);
		Equipo e5 = new Equipo("Dorados",28);
		
		zona1= new ArrayList<Equipo>();
		zona1.add(e2);
		zona1.add(e1);
		zona1.add(e1);
		zona1.add(e3);
		System.out.println(zona1);
		Iterator<Equipo> iterador = zona1.iterator();
		boolean encontroEquipo1=false;
		while(iterador.hasNext()){
			Equipo aux = iterador.next();
			if(aux.equals(e1) && !encontroEquipo1) {
				iterador.remove();
				encontroEquipo1=true;
			}			
		}
		System.out.println(zona1);
		
		List<Equipo> zona2 = new LinkedList<Equipo>();
		zona2= new ArrayList<Equipo>();
		zona2.add(e2);
		zona2.add(e1);
		zona2.add(e1);
		zona2.add(e3);
		System.out.println(zona2);

		
		ListIterator<Equipo> iteradorLista = zona2.listIterator();
		encontroEquipo1=false;
		while(iteradorLista.hasNext()){
			Equipo aux = iteradorLista.next();
			if(aux.equals(e1) && !encontroEquipo1) {
				iteradorLista.remove();
				encontroEquipo1=true;
			}
			if(aux.equals(e2)){
				iteradorLista.add(e4);
			}
			if(aux.equals(e3)){
				iteradorLista.set(e5);
			}
		}
		System.out.println(zona2);
		
	}
}
