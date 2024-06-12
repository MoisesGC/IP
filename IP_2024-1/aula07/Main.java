import java.util.Scanner; 

public class Main{

	public static void main(String[] args){
		
		System.out.println("Usando o objeto vetor!");
		int cont,chave;
		boolean achou;
		
		Vetor listaNumero = new Vetor(5);
		listaNumero.inicializaRandomico();
	
		chave = 5;
		achou = listaNumero.buscaV2(chave);		
		if(achou){
			System.out.println("Estava presente na lista!");
		}
		else{
			System.out.println("Nao foi encontrado");
		}
		
		
	}


}
