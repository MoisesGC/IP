public class Triangulo{

	
	private int ladoA;
	private int ladoB;
	private int ladoC;
	
	
	Triangulo(int lda, int ldb, int ldc){
		this.setLadoA(lda);
	        this.setLadoB(ldb);
		this.setLadoC(ldc);
	}
	

	public int getLadoA(){
		return this.ladoA;
	}
	public void setLadoA(int valor){
		this.ladoA = valor;
	}
	
	public int getLadoB(){
		return this.ladoB;
	}
	public void setLadoB(int valor){
		this.ladoB = valor;
	}
	
	public int getLadoC(){
		return this.ladoC;
	}
	public void setLadoC(int valor){
		this.ladoC = valor;
	}


	public void identificaTriangulo(){
	
		int ldA,ldB,ldC;
		
		ldA = this.getLadoA();
		ldB = this.getLadoB();
		ldC = this.getLadoC();
			
		if ((ldA == ldB)&&(ldB == ldC)) {
			System.out.println("Identificado: Equilatero");
		} 
		else {
			if((ldA != ldB) && (ldB != ldC) && (ldC != ldA)){
				System.out.println("Identificado: Escaleno");
			}
		     	else{
		     		System.out.println("Identificado: Isoceles");
		     	}	
		
		}
			
	}
	
}

