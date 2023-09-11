import java.util.Scanner;

public class Main{

        public static void main(String[] args){
        
        	System.out.println("Teste do Objeto Vetor");
        	Scanner ler = new Scanner(System.in);
        	boolean achou;
		long startTime;
		long totalTime;
		
		Vetor myVet = new Vetor(10000);
		
		//myVet.imprime();
		/*myVet.setElemento(0,3);
		myVet.setElemento(1,5);
		myVet.setElemento(2,8);
		myVet.setElemento(3,9);
		myVet.setElemento(4,12);
		myVet.setElemento(5,12);
		myVet.setElemento(-3,12);
		myVet.setElemento(50,12);
		myVet.getElemento(5);*/
		
		
	
		myVet.inicializaRandom();
		achou = myVet.busca(10);
		
		startTime = System.nanoTime();
		achou = myVet.busca(10);
		totalTime = System.nanoTime() - startTime;
		System.out.println(achou);
		System.out.println(totalTime);
		
		startTime = System.nanoTime();
		achou = myVet.buscaV2(10);
		totalTime = System.nanoTime() - startTime;
		System.out.println(achou);
		System.out.println(totalTime);
		
		//myVet.imprime();
        
        }
}

