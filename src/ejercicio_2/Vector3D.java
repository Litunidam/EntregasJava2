package ejercicio_2;

public class Vector3D {

	private int [] v = new int [3];
	
	public Vector3D() {
		
	}
	
	public Vector3D(int a, int b, int c) {
		this.v[0]=a;
		this.v[1]=b;
		this.v[2]=c;
	}
	
	public Vector3D sumaVector(Vector3D ve) {
		
		Vector3D aux = new Vector3D();
		aux.v[0]=this.v[0]+ve.v[0];
		aux.v[1]=this.v[1]+ve.v[1];
		aux.v[2]=this.v[2]+ve.v[2];

		return aux;
	}
	
	public Vector3D restaVector(Vector3D ve) {

		Vector3D aux = new Vector3D();
		aux.v[0]=this.v[0]-ve.v[0];
		aux.v[1]=this.v[1]-ve.v[1];
		aux.v[2]=this.v[2]-ve.v[2];

		return aux;
	}
	
	public double moduloVector() {
		
		double modulo;
		modulo = Math.sqrt(Math.pow(this.v[0],2)+Math.pow(this.v[1],2)+Math.pow(this.v[2],2));
		
		return modulo;
	}
	
	public int prodEscalar(Vector3D ve) {
		
		int prod=0;
		
		prod=this.v[0]*ve.v[0]+this.v[1]*ve.v[1]*this.v[2]*ve.v[2];
		
		return prod;
	}
}
