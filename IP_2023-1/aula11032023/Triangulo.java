public class Triangulo{

	private int ladoA;
	private int ladoB;
	private int ladoC;	

	public int getLadoA(){
		return this.ladoA;
	}
	
	public void setLadoA(int novoValor){
		this.ladoA = novoValor;
	}

	public int getLadoB(){
		return this.ladoB;
	}
	
	public void setLadoB(int novoValor){
		this.ladoB = novoValor;
	}

	public int getLadoC(){
		return this.ladoC;
	}
	
	public void setLadoC(int novoValor){
		this.ladoC = novoValor;
	}
	
	public boolean ehTriangulo(int ldA, int ldB, int ldC){
		boolean resp;
					
		 resp =  ((Math.abs(ldB - ldC) < ldA) && (ldA < (ldB + ldC))) &&
		         ((Math.abs(ldA - ldB) < ldC) && (ldC < (ldA + ldB))) &&
		         ((Math.abs(ldA - ldC) < ldB) && (ldB < (ldA + ldC))); 
				
		return resp;
	}
	 
	
	public void identificaTriangulo(){
	
		int ldA,ldB,ldC;
		
		ldA  = this.getLadoA();
		ldB  = this.getLadoB();
		ldC  = this.getLadoC();
		
		if( this.ehTriangulo(ldA,ldB,ldC) ){
		
			System.out.println("Eh triangulo!");
		
		}
		
		// identificar se eh triangulo
		
		// se for triangulo
			// ver se isoles
			// ver se escaleno
			// ver se equilatero
				

	}
	


}
