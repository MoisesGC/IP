public class Main{

	public static void main(String args[]){	
	
		String temp;
	
		FileOps arquivo = new FileOps("temp.txt");
		arquivo.cria();
		arquivo.escreve("Todo teste é maneiro!");
		temp = arquivo.leitura();
		arquivo.imprimeTokens(temp," ");
		
		System.out.println(temp);
		
	
				
	}		

}
