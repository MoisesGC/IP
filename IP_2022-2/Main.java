import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		//Auxiliar aux = new Auxiliar();
		int temp;
		Scanner ler = new Scanner(System.in);
		//temp = aux.multRecurs(5,6);
		
		//System.out.println(temp);	
	
		System.out.println("Aula de Matrizes!");
		
		Matriz mat1,mat2,mat3,mat4;
		mat1 = new Matriz(5,1);
		mat2 = new Matriz(1,5);
		mat3 = new Matriz(5,5);
		mat4 = new Matriz(5,5);
		mat1.inicializaComValor(1);
		mat1.imprime();
		mat2.inicializaRandomico();
		mat2.imprime();
		mat1.multiplicaMatriz(mat1,mat2,mat3);
		mat3.imprime();
		mat3.imprimeDiagonal();
		mat4.imprimeIndex();
		
		//mat1.inicializaRandomico();
		//mat1.imprime();
		//mat1.multiplicaPorInteiro(3);
		//mat1.imprime();
		//mat1.somaPorInteiro(1);
		//mat1.somaComMatriz(mat2);
		//mat1.imprime();
		//mat2.imprime();
		//mat1.somaComMatrizV3(mat2,mat3);
		//mat3.imprime();
		
		/*temp = ler.nextInt();
		
		long startTime,endTime,totalTime;
	
		startTime = System.nanoTime();
		System.out.println(mat3.busca(temp));
		endTime   = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println(totalTime);
		
		startTime = System.nanoTime();
		System.out.println(mat3.buscaV2(temp));
		endTime   = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println(totalTime);
                */

	}



	public static void main3(String[] args){
		//Auxiliar aux = new Auxiliar();
		int temp;
		Scanner ler = new Scanner(System.in);
		//temp = aux.multRecurs(5,6);
		
		//System.out.println(temp);	
	
		System.out.println("Aula de Matrizes!");
		
		Matriz mat1,mat2,mat3;
		mat1 = new Matriz(10,10);
		mat2 = new Matriz(10,10);
		mat3 = new Matriz(10,10);
		mat1.inicializaComValor(3);
		mat1.imprime();
		mat2.inicializaRandomico();
		mat2.imprime();
		//mat1.inicializaRandomico();
		//mat1.imprime();
		//mat1.multiplicaPorInteiro(3);
		//mat1.imprime();
		//mat1.somaPorInteiro(1);
		//mat1.somaComMatriz(mat2);
		//mat1.imprime();
		//mat2.imprime();
		mat1.somaComMatrizV3(mat2,mat3);
		mat3.imprime();
		
		temp = ler.nextInt();
		
		long startTime,endTime,totalTime;
	
		startTime = System.nanoTime();
		System.out.println(mat3.busca(temp));
		endTime   = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println(totalTime);
		
		startTime = System.nanoTime();
		System.out.println(mat3.buscaV2(temp));
		endTime   = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println(totalTime);

	}


	public static void main2(String[] args){
	
		System.out.println("Aula de Vetores!");
		
		Vetor vet1,vet2;
		vet1 = new Vetor(100);
		vet2 = new Vetor(100);
		//vet1.setElemento(0,1);
		//vet1.setElemento(1,2);
		
		//System.out.println(vet1.getElemento(0));
		
		//vet1.imprime();
		vet1.inicializaRandomico();
		vet2.inicializaRandomico();
		vet1.comparaValores(vet2);
		//vet1.imprime();
		//vet1.shuffle();
		//vet1.imprime();
		vet1.inicializaCrescente();
		//vet1.imprime();
		vet1.shuffle();
		//vet1.imprime();
		long startTime = System.nanoTime();
		System.out.println(vet1.contaNumerosPrimos(false));
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);	
		
		startTime = System.nanoTime();
		System.out.println(vet1.contaNumerosPrimos(true));
		endTime   = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println(totalTime);	
		
		
	}


	public static void main1(String[] args){
	
		System.out.println("Ola Turma de IP 2022-2!");
		
		Scanner ler = new Scanner(System.in);
		Aluno aluno01,aluno02,aluno03;
		int notaTemp;
		
		aluno01 = new Aluno("Fulano");
		aluno02 = new Aluno("Beltrano");
		aluno03 = new Aluno("Cicrano");
		//notaTemp = ler.nextInt();
		notaTemp = 8;
		aluno01.setNota(notaTemp);
		notaTemp = 9;
		aluno02.setNota(notaTemp);
		notaTemp = 5;
		aluno03.setNota(notaTemp);	
		
		
		aluno01.imprime();
		aluno02.imprime();
		aluno03.imprime();
		
		aluno01.comparaNotaCom(aluno02);
		System.out.println(aluno02.retornaMaiorNota(aluno03));
		
		
	}

}
