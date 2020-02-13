package Ejercicio1;

import java.util.ArrayList;

public class Conjunto {
	Conjunto c = new Conjunto();
	private ArrayList<Integer> l=new ArrayList<Integer>();
	
	public void setElemento(int n) {
		
		if (l.contains(n)) {
			System.out.println("No se pueden añadir dos elementos iguales");
		}else {
			l.add(n);
		}
	}
	public void deleteElemento(int n) {
		
		if (l.contains(n)) {
			l.remove(n);
		}else {
			System.out.println("No está presente el elemento "+n+" en la lista");
		}
	}

}
