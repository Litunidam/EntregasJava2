package ejercicio_4_opcional;

import java.util.ArrayList;
import java.util.Iterator;

public class Conjunto<T> {

	private ArrayList<T> l = new ArrayList<>();

	public void addElemento(T n) {

		if (!l.contains(n)) {
			l.add(n);
		}
	}

	public void deleteElemento(T n) {

		if (l.contains(n)) {
			l.remove(n);
		} else {
			System.out.println("No está presente el elemento " + n + " en la lista");
		}
	}

	/**
	 * 
	 * @param d:
	 * @return Devuelve un conjunto que contiene los elementos de dos conjuntos
	 */
	public Conjunto<T> union(Conjunto<T> d) {

		Conjunto<T> aux = new Conjunto<>();

		aux.l.addAll(this.l);

		for (T x : d.l) {

			aux.addElemento(x);

		}

		return aux;
	}

	/**
	 * 
	 * @param Conjunto d
	 * @return devuelve un conjunto con los números que contengan los dos Conjuntos
	 */
	public Conjunto<T> interseccion(Conjunto<T> d) {
		Conjunto<T> aux = new Conjunto<>();

		for (T x : d.l) {
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
	 * @return devuelve un conjunto con los elementos del primer conjunto que no
	 *         estén en el segundo
	 */
	public Conjunto<T> diferencia(Conjunto<T> d) {

		Conjunto<T> aux = new Conjunto<>();

		for (T x : this.l) {

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
	public boolean perteneceConjunto(T x) {

		return this.l.contains(x);
	}

	/**
	 * 
	 * @param d
	 * @return devuelve true si contiene todos los elementos del Conjunto
	 */
	public boolean esSubconjunto(Conjunto<T> d) {

		return this.l.containsAll(d.l);
	}

	/**
	 * 
	 * @param d
	 * @return devuelve true si el primer Conjunto es igual al segundo Conjunto
	 */
	public boolean sonIguales(Conjunto<T> d) {

		if (this.l.size() == d.l.size() && this.esSubconjunto(d)) {

			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		String s;
		s = "{";
		for (T x : this.l) {
			s += x;
			if (x != this.l.get(this.l.size() - 1)) {
				s += ",";
			}
		}
		s += "}";
		return s;
	}

}
