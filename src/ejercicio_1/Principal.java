package ejercicio_1;

public class Principal {

	public static void main(String[] args) {
		
		Conjunto c = new Conjunto();
		Conjunto d = new Conjunto();
		
		c.addElemento(5);
		c.addElemento(6);
		c.addElemento(7);
		c.addElemento(8);
		c.addElemento(9);
		c.addElemento(10);
		
		d.addElemento(7);
		d.addElemento(8);
		d.addElemento(7);
		d.addElemento(9);
		d.addElemento(1);
		d.addElemento(2);
		d.addElemento(12);
		
		System.out.println("Unión");
		Conjunto b = c.union(d);
		System.out.println(b);
		
		System.out.println("Interseccion");
		b=c.interseccion(d);
		System.out.println(b);
		
		System.out.println("Diferencia");
		b=c.diferencia(d);
		System.out.println(b);
		
		System.out.println("pertenece");
		System.out.println(c.perteneceConjunto(5));
		
		System.out.println("Subconjunto");
		System.out.println(c.esSubconjunto(d));
		
		System.out.println("¿Son iguales?");
		System.out.println(c.sonIguales(d));
		
		
	}
}
