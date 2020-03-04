package ejercicio_2;

public class Principal {
	public static void main(String[] args) {
	
		Vector3D v = new Vector3D(5,12,7);
		Vector3D ve = new Vector3D(3,7,4);
		
		System.out.println("modulo");
		System.out.println(v.moduloVector());
		
		System.out.println("prod escalar");
		System.out.println(v.prodEscalar(ve));
		
		System.out.println("prod vectorial");
		System.out.println(v.prodVectorial(ve));
		
		System.out.println("suma");
		System.out.println(v.sumaVector(ve));
		
		System.out.println("resta");
		System.out.println(v.restaVector(ve));
	}
}
