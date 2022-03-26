public class Main{

	public static void main(String args[]){	
	
		Vetor lista1,lista2;
		Matriz mat1;
		Fibo numFibo;
		Fatorial numFato;
		long start, delay;
		
		
		mat1 = new Matriz(6,6);
		mat1.inicializaOrdenado();
		mat1.shuffle();
		mat1.imprime();	
		mat1.ordena();
		mat1.imprime();
		
		//mat1.imprimeTransposta();
		//System.out.println();
		//mat1.transposicaoDeValores();	
		//System.out.println();
		//mat1.imprime();
		
		//System.out.println(mat1.busca(7));
		
		//mat1.inicializaOrdenado();
		//mat1.shuffle();
		//mat1.imprime();
		//mat1.ordena();
		
		//mat1.imprime();	
				
	}		

}
