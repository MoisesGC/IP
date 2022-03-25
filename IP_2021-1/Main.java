public class Main{

	public static void main(String args[]){	
	
		Vetor lista1,lista2;
		Matriz mat1;
		Fibo numFibo;
		Fatorial numFato;
		long start, delay;
		
		
		mat1 = new Matriz(4,4);
		
		mat1.inicializaOrdenado();
		mat1.shuffle();
		mat1.imprime();
		mat1.ordena();
		
		mat1.imprime();
		
		
		//lista1 = new Vetor(20);
		//lista2 = new Vetor(20);
		
		//lista1.inicializaRandomicoV2();
		//lista2.inicializa(lista1);
		//lista2.inicializaRandomico();
		
		//lista1.imprime();
		//lista2.imprime();
		
		//start = System.nanoTime();
		//lista1.insertionSort();
		//delay = System.nanoTime()- start;
		//System.out.println("Tempo em nano:" + delay);
		
		//start = System.nanoTime();
		//lista2.selectionSort();
		//delay = System.nanoTime()- start;
		//System.out.println("Tempo em nano:" + delay);
		
		
		//lista1.imprimeRecursivo();
		//lista2.imprime();
		
		//numFibo = new Fibo();
		//numFato = new Fatorial();
		
		//System.out.println(numFibo.getElemento(10));
		//numFibo.imprimeSequencia(50);
		//numFato.imprime(20);
		
		//System.out.println();
		
				
	}		

}
