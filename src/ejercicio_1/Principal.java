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
		
		Conjunto b = c.union(d);
		
		
		
		
		
	}
}
