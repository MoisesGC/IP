import java.util.Scanner; 

public class Main{

	public static void main(String[] args){
		
		System.out.println("Usando o objeto vetor!");
		int cont,chave;
		int chaveInd;
		float prodInt;
		float tamanhoVet, similaridade;
		
		Scanner entrada = new Scanner(System.in);
			
		Vetor vet01 = new Vetor(12);
		//Vetor vet02 = new Vetor(6);
		//Vetor vet03 = new Vetor(6);
		
		
		vet01.inicializaSerie(5);
		vet01.imprime();
		vet01.shuffle();
		vet01.imprime();
		vet01.ordenaBetaVersion();
		vet01.imprime();	
			
		/*vet01.inicializaManual(entrada);
		vet02.inicializaManual(entrada);
					
		vet01.imprime();
		vet02.imprime();
		
		*/
		/*prodInt = vet02.produtoInterno();
		System.out.println("O produto interno dos vetores eh " + prodInt);
		tamanhoVet = vet02.tamanho();	
		System.out.println("O tamanho do vetor eh " + tamanhoVet);	
		*/
		
		/*vet03.soma(vet01, vet02, vet03);
		vet03.imprime();
		vet02.soma(vet01, vet02);
		vet02.imprime();
		vet01.soma(vet01);
		vet01.imprime();
		
		
		vet03.multiplicaPorEscalar(2.0f);
		vet03.imprime();	*/
		
		
		/*
		"eu gosto de bolo cremoso de bolo"
		"eu gosto de doce cremoso" 
	        
		
		1 - eu
		2 - gosto
		3 - de 
		4 - bolo
		5 - cremoso
		6-  doce
	
	
		1,1,2,1,2,1
		1,1,1,0,1,1 
		
		similaridade = vet03.cosenoEntreVetores(vet01,vet02);
		System.out.println("A similaridade entre os vetores eh " + similaridade);	
				
		entrada.close();	
		*/
		
	}

}

















