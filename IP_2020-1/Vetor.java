import java.util.Scanner;
import java.util.Random;

public class Vetor{
	private int[] vet;
	private int tamanho;
	
	Vetor(int tamanho){
		this.setTamanho(tamanho);
		this.vet = new int[this.getTamanho()];
	}

	public int getElemento(int indice){
		return this.vet[indice];
	}
	public void setElemento(int indice, int novoValor){
		this.vet[indice] = novoValor;
	}

	public int getTamanho(){
		return this.tamanho;
	}
	public void setTamanho(int tamanhoVet){
		this.tamanho = tamanhoVet;
	}
	
	public void inicializarComValor(int valor){
		int cont;
		for (cont=0; cont < this.getTamanho(); cont++){
			this.setElemento(cont, valor);
		}		
	}
	//numeros entre 0 e 10
	public void inicializaRandomico(){ 
		int cont;
		System.out.println("Inicialização aleatoria..");
		Random randomGenerator = new Random();
		for(cont=0;cont < this.getTamanho();cont++){
			this.setElemento(cont, randomGenerator.nextInt(50));
		}

	}
	
	public void inicializaManual(){ 
		int cont,entrada;
		Scanner ler = new Scanner(System.in);
		System.out.println("Inicialização manual..");
		for(cont=0; cont< this.getTamanho(); cont++){
			entrada = ler.nextInt();
			this.setElemento(cont, entrada);
		}

	}


	public void multiplicaPorValor(int valor){ 
		int cont,temp;
		for (cont=0; cont < this.getTamanho(); cont++){
			temp = this.getElemento(cont) * valor;
			this.setElemento(cont, temp);
		}	
	}


	public void somaComValor(int valor){ 
		int cont,temp;
		for (cont=0; cont < this.getTamanho(); cont++){
			temp = this.getElemento(cont) + valor;
			this.setElemento(cont, temp);
		}
	}

	public void somaComVetor(Vetor outro){ 
		int cont,temp;
		for (cont=0; cont < this.getTamanho(); cont++){
			temp = this.getElemento(cont) + outro.getElemento(cont);
			this.setElemento(cont, temp);
		}
	}

	public int produtoComVetor(Vetor outro){ 
		int cont,produto;
		produto = 0;
		for (cont=0; cont < this.getTamanho(); cont++){
			produto = produto + (this.getElemento(cont) * outro.getElemento(cont));
		}
		return produto;
	}	
		
	private void troca(int index1, int index2){
		int temp;
		temp = 	this.getElemento(index1);
		this.setElemento(index1, this.getElemento(index2));			
		this.setElemento(index2,temp);
	}

	public void insertionSortBeta(){
		int cont, tamanhoVet,anterior,analisado,temp;
		
		tamanhoVet = this.getTamanho();
		for(cont=1;cont < tamanhoVet; cont++){
			System.out.println("Ordenando VetInd: " + cont);
			analisado = cont;
			anterior = analisado - 1;
			System.out.println("Versao SortBeta");
			while((anterior >= 0) && (this.getElemento(analisado) < this.getElemento(anterior))){
				this.troca(analisado,anterior);
				this.imprimir();
				analisado = anterior;
				anterior = anterior - 1;				
			}
		}	
	
	}

	//System.out.println("");
	//while((anterior >= 0) && (this.getElemento(analisado) < this.getElemento(anterior))
		//analisado = anterior;
		//anterior = anterior - 1;
	
	public void selectionSort(){
		int cont, seta, temp, menorInd;
		for(seta = 0; seta < this.getTamanho() -1; seta++){
			menorInd = seta;
			for (cont= (seta + 1); cont < this.getTamanho(); cont++){
				if(this.getElemento(cont) < this.getElemento(menorInd)){
					menorInd = cont;
				}
			}
			//System.out.println(this.getElemento(menorInd));
			//System.out.println(menorInd);

			//colocando o menor valor na posicao apontada
			temp = this.getElemento(menorInd);
			this.setElemento(menorInd, this.getElemento(seta)); 
			this.setElemento(seta, temp);

			this.imprimir();
		}

	}
	
	
	
	
	
	
	public void insertionSort(){
		int cont, tamanhoVet,anterior,analisado,temp;
		tamanhoVet = this.getTamanho();
			
		for(cont = 1;cont < tamanhoVet; cont++){
			analisado = cont;
			anterior = cont-1;
			while((anterior >= 0) && (this.getElemento(analisado) < this.getElemento(anterior))){
				this.troca(analisado,anterior);
				analisado = anterior;
				anterior = anterior - 1;
			}		
		}
	}

	public void imprimirEstatisticas(){
		int maior, menor, acum, cont, media;
		cont = 0;
		maior = this.getElemento(cont);
		menor = this.getElemento(cont);
		acum = this.getElemento(cont);
	   	for (cont=1; cont < this.getTamanho(); cont++){
			if( this.getElemento(cont)> maior){
				maior = this.getElemento(cont);
			}
			if(this.getElemento(cont) < menor){
				menor = this.getElemento(cont);
			}
			acum = acum + this.getElemento(cont);
		}
		
		System.out.println("O maior numero lido foi: " + maior);
		System.out.println("O menor numero lido foi: " + menor);
		media = acum / this.getTamanho();
		System.out.println("O media foi: " + media);
		
	}

	public void imprimir(){
		int cont;
		for (cont=0; cont < this.getTamanho(); cont++){
			System.out.print(this.getElemento(cont) + " ");
		}	
		System.out.println();	
	}

	
}
