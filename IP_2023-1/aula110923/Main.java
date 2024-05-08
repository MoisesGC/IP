import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		System.out.println("Teste do Objeto Vetor");
        	Scanner ler = new Scanner(System.in);
        	Calculo calc = new Calculo();
        	Vetor vet1 = new Vetor(10);
        	int resposta;
        	
        	
        	resposta = calc.fatorial(0);
        	System.out.println(resposta);
        	resposta = calc.fatorial(1);
        	System.out.println(resposta);
        	resposta = calc.fatorial(5);
        	System.out.println(resposta);
        	vet1.inicializaRandom();
       	vet1.imprimeRecursivo();
       	vet1.imprime();
        	
        }	


	public static void main4(String[] args){
		System.out.println("Teste do Objeto Vetor");
        	Scanner ler = new Scanner(System.in);
        	int resposta;
        	
        	Vetor vet1 = new Vetor(10);
        	//Vetor vet2 = new Vetor(10);
        	
        	//System.out.println("Antes");
        	//vet1.inicializaOrdem(-10);
        	vet1.inicializaRandom();
        	//vet1.imprime();
        	//vet2.inicializa(3);
        	//vet2.imprime();
        	
    		//resposta = vet1.produtoInterno(vet2);
        	vet1.shuffle();
        	//System.out.println(resposta);
                vet1.imprime();
                vet1.imprimeMenor();
                vet1.arrumaMenor(2,6);
                vet1.imprime();
                vet1.arrumaMenor(0,5);
                vet1.imprime();
                vet1.arrumaMenor(5,9);
                vet1.imprime();
                vet1.ordena();
                vet1.imprime();
        	//vet2.imprime();
        	
	}

	public static void main3(String[] args){
		System.out.println("Teste do Objeto Vetor");
        	Scanner ler = new Scanner(System.in);
        	
        	Vetor vet = new Vetor(10);
        	
        	vet.inicializaRandom();
        	vet.imprime();
        	
        	int cont,num,indMenor,temp;
        	indMenor = 0;
        	cont = 1;	
        	while(cont < 10){
        		if(vet.getElemento(cont) < vet.getElemento(indMenor)){
        			indMenor = cont;
        		}      		
			cont++;
        	}
        	
        	System.out.println(vet.getElemento(indMenor));
      		System.out.println(indMenor);
      		
      		temp = vet.getElemento(0); 
      		vet.setElemento(0, vet.getElemento(indMenor));  
      		vet.setElemento(indMenor,temp); 
      		
      		vet.imprime();
      		
      		/*int a,b,temp;
      		
      		a = 5;
      		b = 3;
      		
      		temp = vet.getElemento(0); //vet[a];
      		vet.setElemento(0, vet.getElemento(indMenor));  //vet[a] = vet[b];
      		vet.setElemento(indMenor,temp); //vet[b] = temp;*/
      		
	
	}

        public static void main2(String[] args){
        
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

