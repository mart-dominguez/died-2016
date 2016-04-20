package ar.edu.utn.frsf.isi.died.java.ejemplos05;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class AppCollections {

	public static void main(String[] args) {
		Collection<Equipo> zona1;
		Collection<Equipo> zona2;
		Collection<Equipo> zona3;
		Equipo e1 = new Equipo("Tiburones",29);
		Equipo e2 = new Equipo("Guerreros II",23);
		Equipo e3 = new Equipo("Los Delfines",25);
		Equipo e4 = new Equipo("Toros",31);
		Equipo e5 = new Equipo("Dorados",28);
		Equipo e6 = new Equipo("Cruzados",29);
		Equipo e7 = new Equipo("Diablos",28);
		Equipo e8 = new Equipo("Aceleros",28);
		Equipo e9 = new Equipo("Empacadores",25);
		
		zona1= new HashSet<Equipo>();
		zona1.add(e1);
		zona1.add(e1);
		zona1.add(e2);
		zona1.add(e3);
		System.out.println(zona1);
		
		zona1.clear();
		System.out.println(zona1);

		zona1.add(e3);
		zona1.add(e2);
		zona1.add(e1);

		System.out.println(zona1);
		zona2= new TreeSet<Equipo>();
		zona2.add(e4);
		zona2.add(e5);
		zona2.add(e6);
		zona2.add(e7);
		System.out.println(zona2);
		
		zona3= new LinkedHashSet<Equipo>();
		zona3.add(e4);
		zona3.add(e7);
		zona3.add(e6);
		zona3.add(e8);
		zona3.add(e2);
		zona3.add(e1);
		zona3.add(e9);
		zona3.add(e3);
		zona3.add(e5);
		System.out.println(zona3);
		
		System.out.println(zona3.containsAll(zona2));
		zona2.remove(e7);
		zona3.removeAll(zona2);
		zona3.removeAll(zona1);
		System.out.println(zona3);

		
	}
}
