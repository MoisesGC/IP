public class Triangulo{

	private int ladoA;
	private int ladoB;
	private int ladoC;
	
	Triangulo(int ladA, int ladB, int ladC){
		this.setLadoA(ladA);
		this.setLadoB(ladB);
		this.setLadoC(ladC);	
	}

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
	
	// analisa os atributos e identifica o tipo de triangulo	
	public void identificaV1(){
		int ldA,ldB,ldC;
		String msgOk;
		
		ldA = this.getLadoA();
		ldB = this.getLadoB();
		ldC = this.getLadoC();
		
		msgOk = "Nao forma triangulo";
		// identifica se forma triangulo
		if((ldA + ldB) > ldC &&
		   (ldA + ldC) > ldB &&
		   (ldC + ldB) > ldA) {
		   
			msgOk = "Tudo ok!";
			if((ldA != ldB) && (ldB != ldC) && (ldC != ldA)){
				System.out.println("Eh escaleno");
			}
			
			if((ldA == ldB) && (ldB == ldC)){
				System.out.println("Eh equilatero");
			}
			
			if((ldA != ldB) && (ldB == ldC) ||
			   (ldA != ldB) && (ldA == ldC) ||
			   (ldA != ldC) && (ldA == ldB) 		
				                           ){
				System.out.println("Eh isoceles");
			}
			
		}
		System.out.println(msgOk);		
	
	}
	
	public boolean verificaDesigualdade(){
		int ldA,ldB,ldC;
		boolean resposta;
		ldA = this.getLadoA();
		ldB = this.getLadoB();
		ldC = this.getLadoC();
		
		resposta = false;
		if((ldA + ldB) > ldC &&
		   (ldA + ldC) > ldB &&
		   (ldC + ldB) > ldA) {
		   	resposta = true;
		   
		}
	
		return resposta;
	}
	
	
	public void identificaV2(){
		int ldA,ldB,ldC;
		String msgOk;
		
		ldA = this.getLadoA();
		ldB = this.getLadoB();
		ldC = this.getLadoC();
		
		msgOk = "Nao forma triangulo";
		// identifica se forma triangulo
		if(this.verificaDesigualdade()) {   
			msgOk = "Tudo ok!";
			if((ldA != ldB) && (ldB != ldC) && (ldC != ldA)){
				System.out.println("Eh escaleno");
			}
			
			if((ldA == ldB) && (ldB == ldC)){
				System.out.println("Eh equilatero");
			}
			
			if((ldA != ldB) && (ldB == ldC) ||
			   (ldA != ldB) && (ldA == ldC) ||
			   (ldA != ldC) && (ldA == ldB) 		
				                           ){
				System.out.println("Eh isoceles");
			}
			
		}
		System.out.println(msgOk);		
	}
	
	
	
	
	
	
	public void imprime(){
		System.out.println("Lado A: " + this.getLadoA() +
			            "\nLado B: " + this.getLadoB() +
			            "\nLado C: " + this.getLadoC()
		);
	}
	
	

}
