package ar.edu.utn.frsf.isi.died.java.ejemplos05;

public class Equipo implements Comparable<Equipo>{
	private String nombre;
	private Integer puntos;
	
	public Equipo(){
		puntos = 0;
	}
	
	public Equipo(String n,Integer p){
		this.nombre=n;
		this.puntos=p;
	}
	
	@Override
	public boolean equals(Object arg0) {
		return (arg0 instanceof Equipo && ((Equipo)arg0).nombre.equalsIgnoreCase(this.nombre));
	}
	
	@Override
	public int compareTo(Equipo o) {
		int aux = o.puntos.compareTo(this.puntos);
		if(aux==0) return this.nombre.compareTo(o.nombre);
		else return aux;
	}
	
	@Override
	public String toString() {
		return "<"+this.nombre+":"+this.puntos+">";
	}
	
	@Override
	public int hashCode() {
		return this.nombre.hashCode()%11;
	}
}
