package ejercicio_1;

import java.util.ArrayList;

public class Conjunto {
	
	private ArrayList<Integer> l=new ArrayList<>();
	
	public void addElemento(int n) {
		
		if (l.contains(n)) {
			System.out.println("No se pueden a�adir dos elementos iguales");
		}else {
			l.add(n);
		}
	}
	public void deleteElemento(int n) {
		
		if (l.contains(n)) {
			l.remove(n);
		}else {
			System.out.println("No est� presente el elemento "+n+" en la lista");
		}
	}
	
	/**
	 * 
	 * @param d: 
	 * @return Devuelve un conjunto que contiene los elementos de dos conjuntos
	 */
	public Conjunto union(Conjunto d) {
		
		Conjunto aux = new Conjunto();
		
		aux.l.addAll(this.l);
		
		for(Integer x:d.l) {
			
			aux.addElemento(x);
			
		}
		
		return aux;
	
	}
	/**
	 * 
	 * @param Conjunto d
	 * @return devuelve un conjunto con los números que contengan los dos Conjuntos 
	 */
	public Conjunto interseccion(Conjunto d) {
		Conjunto aux = new Conjunto();
		
		for (Integer x:d.l) {
			if (this.l.contains(x)) {
				aux.l.add(x);
			}
				
		}
		if (aux.l.isEmpty()) {
			System.out.println("La intersección está vacía porque no coincide ningún número");
		}
		
		return aux;
	}
	
	/**
	 * 
	 * @param d
	 * @return devuelve un conjunto con los elementos del primer conjunto que no estén en el segundo
	 */
	public Conjunto diferencia(Conjunto d) {
		
		Conjunto aux = new Conjunto();
		
		for (Integer x:this.l) {
			
			if (!d.l.contains(x)) {
				
				aux.l.add(x);
			}
		}
		
		return aux;
	}
	
	/**
	 * 
	 * @param x
	 * @return devuelve true si es un subconjunto y devuelve false si no lo es
	 */
	public boolean perteneceConjunto(int x) {
		
		return this.l.contains(x);
	}
	
	/**
	 * 
	 * @param d
	 * @return devuelve true si contiene todos los elementos del Conjunto
	 */
	public boolean esSubconjunto(Conjunto d) {
		
		return this.l.containsAll(d.l);
	}
	/**
	 * 
	 * @param d
	 * @return devuelve true si el primer Conjunto es igual al segundo Conjunto
	 */
	public boolean sonIguales(Conjunto d) {
		
		if (this.l.size()==d.l.size() && this.esSubconjunto(d)) {
			
			return true;
		}
		return false;
		
	}
}
