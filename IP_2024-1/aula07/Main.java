import java.util.Scanner; 

public class Main{

	public static void main(String[] args){
		
		System.out.println("Usando o objeto vetor!");
		int cont,chave;
		int chaveInd;
		
		Scanner entrada = new Scanner(System.in);
			
		Vetor listaNumero = new Vetor(5);
			
		listaNumero.inicializaManual(entrada);
		
		listaNumero.imprimeEstatisticas();
				
				
		/*chave = entrada.nextInt();
		chaveInd = listaNumero.buscaV3(chave);		
		if(chaveInd != -1){
			System.out.println(chave + " estava presente na lista, no endereco "+chaveInd);
		}
		else{
			System.out.println("Nao foi encontrado");
		}
		*/
		
		entrada.close();	
	}

}

















