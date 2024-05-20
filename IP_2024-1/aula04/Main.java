public class Main{

	public static void main(String[] args){
	
		System.out.println("Teste do Triangulo!");
		char tempChar,respostaCerta;

		Triangulo triang01;
		
		triang01 = new Triangulo(2,50,5);
		respostaCerta = '0';
		
		tempChar = triang01.identificaV4();
		System.out.println(tempChar);
		
		tempChar = triang01.identificaV4();
		if (tempChar == respostaCerta){
			System.out.println("Nao Triangulo: PASS");
		}
		else{
			System.out.println("Nao Triangulo: FAIL");
		}
		
		triang01.setLadoA(2);
		triang01.setLadoB(2);
		triang01.setLadoC(2);
		respostaCerta = '2';

		tempChar = triang01.identificaV4();
		if (tempChar == respostaCerta){
			System.out.println("Triangulo Equilatero: PASS");
		}
		else{
			System.out.println("Triangulo Equilatero: FAIL");
		}
		

		
	}
	
}
