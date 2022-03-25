public class Main{

	public static void main(String args[]){	
	
		Vetor lista1,lista2;
		Matriz mat1;
		Fibo numFibo;
		Fatorial numFato;
		long start, delay;
		
		
		mat1 = new Matriz(10,10);
		
		mat1.inicializaOrdenado();
		mat1.shuffle();
		mat1.imprime();
		mat1.ordena();
		
		mat1.imprime();	
				
	}		

}
