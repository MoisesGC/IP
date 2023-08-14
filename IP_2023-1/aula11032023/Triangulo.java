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
	 
	private boolean souTriangulo(){
		return this.ehTriangulo(this.getLadoA(), this.getLadoB(), this.getLadoC());
	} 
	
	public void identificaTriangulo(){
	
		int ldA,ldB,ldC;
		
		ldA  = this.getLadoA();
		ldB  = this.getLadoB();
		ldC  = this.getLadoC();
		
		if(this.souTriangulo()){
			System.out.print("Eh triangulo ");
			if((ldA != ldB) && 
			   (ldA != ldC) && 
			   (ldB != ldC)){
				System.out.println(" - escaleno!");
			}
			else{
				if ((ldA == ldB) && (ldB != ldC) ||
				    (ldA == ldC) && (ldC != ldB) ||
				    (ldC == ldB) && (ldA != ldC)){
					System.out.println(" - isoceles!");
				}
				else{
					if((ldA == ldB) && 
					   (ldA == ldC)){
						System.out.println(" - equilatero!");
					}
				}	
			}	
		}
		else{
			System.out.println("Lados fornecidos nao formam triangulo! ");
		}	
	}
}

