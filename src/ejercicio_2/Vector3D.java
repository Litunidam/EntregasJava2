package ejercicio_2;

public class Vector3D {

	private int [] v = new int [3];
	
	// Constructor por defecto
	public Vector3D() {
		
	}
	
	// Constructor con los tres numeros para el vector
	public Vector3D(int a, int b, int c) {
		this.v[0]=a;
		this.v[1]=b;
		this.v[2]=c;
	}
	
	public void setVector(int a, int b, int c) {
		this.v[0]=a;
		this.v[1]=b;
		this.v[2]=c;
	}
	
	/**
	 * 
	 * @param ve
	 * @return Devuelve la suma del vector ve que pasa por parámetros con el vector de la función 
	 */
	public Vector3D sumaVector(Vector3D ve) {
		
		Vector3D aux = new Vector3D();
		aux.v[0]=this.v[0]+ve.v[0];
		aux.v[1]=this.v[1]+ve.v[1];
		aux.v[2]=this.v[2]+ve.v[2];

		return aux;
	}
	
	/** 
	 * 
	 * @param ve
	 * @return Devuelve la resta del vector ve que pasa por parámetros con el vector de la función 1
	 */
	public Vector3D restaVector(Vector3D ve) {

		Vector3D aux = new Vector3D();
		aux.v[0]=this.v[0]-ve.v[0];
		aux.v[1]=this.v[1]-ve.v[1];
		aux.v[2]=this.v[2]-ve.v[2];

		return aux;
	}
	
	/**
	 * 
	 * @return Devuelve el módulo del vector
	 */
	public double moduloVector() {
		
		double modulo;
		modulo = Math.sqrt(Math.pow(this.v[0],2)+Math.pow(this.v[1],2)+Math.pow(this.v[2],2));
		
		return modulo;
	}
	
	/**
	 * 
	 * @param ve
	 * @return devuelve el resultado del producto escalar del vector, devuelve Math.E si no ha podido hacerlo
	 */
	public int prodEscalar(Vector3D ve) {
		
		int prod=0;
		
		prod=this.v[0]*ve.v[0]+this.v[1]*ve.v[1]*this.v[2]*ve.v[2];
		
		return prod;
	}

	/**
	 * 
	 * @param ve
	 * @return devuelve el resultado del producto vectorial en forma de vector
	 */
	public Vector3D prodVectorial(Vector3D ve) {
		
		Vector3D aux= new Vector3D();		
		
		aux.v[0]=this.v[1]*ve.v[2]-ve.v[1]*this.v[2];
		aux.v[1]=this.v[2]*ve.v[0]-ve.v[2]*this.v[0];
		aux.v[2]=this.v[0]*ve.v[1]-ve.v[0]*this.v[1];
		
		return aux;
	}
	
	@Override
	public String toString() {
		String a;
		a="<";
		for(int i=0;i<3;i++) {
			a+= this.v[i];
			if(i!=2) {
				a+=",";
			}
		}
		a+=">";
		
		return a;
	}

}
