public class Main{

	public static void main(String[] args){
	
		System.out.println("Simulador do Detran");
		float resposta;
		
		
		Curuja curujinha01 = new Curuja(100.0f);
		
		resposta = curujinha01.calculaMulta(80.0f);
		//System.out.println(resposta);
		
		resposta = curujinha01.calculaMulta(100.0f);
		//System.out.println(resposta);
		
		resposta = curujinha01.calculaMulta(120.0f);
		//System.out.println(resposta);
		
		resposta = curujinha01.calculaMulta(140.0f);
		//System.out.println(resposta);
		
		resposta = curujinha01.calculaMulta(150.0f);
		//System.out.println(resposta);
		
		resposta = curujinha01.calculaMulta(0.0f);
		System.out.println(resposta);
	
	}



}
