package ejercicio_4_opcional;


public class Principal {

	public static void main(String[] args) {

		Conjunto<Integer> enteros1 = new Conjunto<>();
		Conjunto<Integer> enteros2 = new Conjunto<>();
		
		Conjunto<String> string1 = new Conjunto<>();
		Conjunto<String> string2 = new Conjunto<>();
		
		enteros1.addElemento(5);
		enteros1.addElemento(6);
		enteros1.addElemento(7);
		enteros1.addElemento(8);
		enteros1.addElemento(9);
		enteros1.addElemento(10);
		
		enteros2.addElemento(7);
		enteros2.addElemento(8);
		enteros2.addElemento(7);
		enteros2.addElemento(9);
		enteros2.addElemento(1);
		enteros2.addElemento(2);
		enteros2.addElemento(12);
		
		string1.addElemento("hola");
		string1.addElemento("adios");
		string1.addElemento("buenas");
		string1.addElemento("tardes");
		string1.addElemento("señores");
		
		string2.addElemento("asdf");
		string2.addElemento("asdfmovie");
		string2.addElemento("jkl");
		string2.addElemento("puerta");
		string2.addElemento("tardes");
		
		System.out.println("Unión Integer");
		Conjunto<Integer> b = enteros1.union(enteros2);
		System.out.println(b);
		
		System.out.println("Unión String");
		Conjunto<String> s = string1.union(string2);
		System.out.println(s);
		
		System.out.println("Interseccion Integer");
		b=enteros1.interseccion(enteros2);
		System.out.println(b);
		
		System.out.println("Interseccion String");
		s=string1.interseccion(string2);
		System.out.println(s);
		
		System.out.println("Diferencia Integer");
		b=enteros1.diferencia(enteros2);
		System.out.println(b);
		
		System.out.println("Diferencia String");
		s=string1.diferencia(string2);
		System.out.println(s);
		
		System.out.println("Pertenece Integer");
		System.out.println(enteros1.perteneceConjunto(5));
		
		System.out.println("Pertenece String");
		System.out.println(string1.perteneceConjunto("981y23"));
		
		System.out.println("Subconjunto Integer");
		System.out.println(enteros1.esSubconjunto(enteros2));
		
		System.out.println("Subconjunto String");
		System.out.println(string1.esSubconjunto(string2));
		
		System.out.println("¿Son iguales? Integer");
		System.out.println(enteros1.sonIguales(enteros2));
		
		System.out.println("¿Son iguales? String");
		System.out.println(string1.sonIguales(string2));
		
	}

}
