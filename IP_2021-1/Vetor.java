import java.util.Scanner;
import java.util.Random;

public class Vetor{

	private int[] vet;
	private int tamanho;
	

	Vetor(){
		this.setTamanho(10);
		vet = new int[this.getTamanho()];
	}
	
	Vetor(int tamanhoInicio){
		this.setTamanho(tamanhoInicio);
		vet = new int[this.getTamanho()];
	}

	public int getElemento(int index){
		return this.vet[index];
	}

	public void setElemento(int index, int valor){
		this.vet[index] = valor;
	}
	
	public int getTamanho(){
		return this.tamanho;
	}

	public void setTamanho(int valor){
		this.tamanho = valor;
	}
	
	public void inicializa(int valor){
		int cont;
		for(cont = 0; cont < this.getTamanho(); cont++){
            		this.setElemento(cont, valor);
        	}
	}
	
	public void inicializa(Vetor novo){
		int cont;
		for(cont = 0; cont < this.getTamanho(); cont++){
            		this.setElemento(cont, novo.getElemento(cont));
        	}
	}
	
	public void inicializaManual(){
		int cont, valor;
		Scanner ler = new Scanner(System.in);
		
		for(cont = 0; cont < this.getTamanho(); cont++){
			valor = ler.nextInt();
            		this.setElemento(cont, valor);
        	}
	}
	
	public void inicializaRandomico(){
		int cont, valor;
		Random gerador = new Random();
		
		for(cont = 0; cont < this.getTamanho(); cont++){
			valor = gerador.nextInt(this.getTamanho() * 2);
            		this.setElemento(cont, valor);
        	}
	}
	
	
	public void imprime(){
		int cont;
		for(cont = 0; cont < this.getTamanho(); cont++){
            		System.out.print(" " + this.getElemento(cont));
        	}
        	System.out.println();
	}
	
	public void imprimeRecursivo(){
		this.imprimeR(this.getTamanho()-1);	
		System.out.println();
	}
	
	public void imprimeR(int index){
		int resp;	
		if (index > 0){		
			System.out.print(this.getElemento(index) + " "); 
			this.imprimeR(index-1);
		}
		else{
			System.out.print(this.getElemento(0)+ " ");
		}
	}	
	
	
	// retorna true se o valor chave estiver no atributo vet[]
	public boolean buscaV01(int chave){
		boolean resposta;
		int cont;
		
		resposta = false;	
		for(cont = 0; cont < this.getTamanho(); cont++){
			System.out.print("-");
            		if(chave == this.getElemento(cont)){
            			resposta = true;
            			
            		}
        	}
		return resposta;	
	}
	
	public boolean busca(int chave){
		boolean resposta;
		int cont;
		
		resposta = false;
		cont = 0;
		while((cont < this.getTamanho()) && !resposta){
			System.out.print("-");
            		if(chave == this.getElemento(cont)){
            			resposta = true;
            		}
            		cont++;
        	}      	
		return resposta;	
	}
	
	
	public int buscaIndiceDoMenor(){
		int cont,menorInd;
		
		menorInd = 0;
		for(cont = 1; cont < this.getTamanho(); cont++){
            		if(this.getElemento(menorInd) > this.getElemento(cont)){
            			menorInd = cont;			
            		}       		
        	}       		
		return menorInd;	
	}
	
	public void somaCom(Vetor outro){
		int cont,temp;
		for(cont = 0; cont < this.getTamanho(); cont++){
			temp = this.getElemento(cont) + outro.getElemento(cont);
            		this.setElemento(cont, temp);
        	}
	}
	
	public void subtracaoDe(Vetor outro){
		int cont,temp;
		for(cont = 0; cont < this.getTamanho(); cont++){
			temp = this.getElemento(cont) - outro.getElemento(cont);
            		this.setElemento(cont, temp);
        	}
	}
	
	public void multiplicaCom(Vetor outro){
		int cont,temp;
		for(cont = 0; cont < this.getTamanho(); cont++){
			temp = this.getElemento(cont) * outro.getElemento(cont);
            		this.setElemento(cont, temp);
        	}
	}
	
	
	public int produtoInterno(Vetor vet1, Vetor vet2){
		int cont,produto;
		produto = 0;
		for (cont=0; cont < vet1.getTamanho(); cont++){
			produto = produto + (vet1.getElemento(cont) * vet2.getElemento(cont));
		}
		return produto;
	}
	
	public int produtoInterno(Vetor vet1){

		return this.produtoInterno(vet1, this);
	}
	
	public float norma(){
	
		return (float)Math.sqrt(produtoInterno(this,this));
	}
	
	
	
	private void troca(int index1, int index2){
		int temp;
		temp = 	this.getElemento(index1);
		this.setElemento(index1, this.getElemento(index2));			
		this.setElemento(index2,temp);
	}
	
	public void selectionSort(){
		int cont, inicio, temp, menorInd;
		for(inicio = 0; inicio < this.getTamanho() -1; inicio++){
			menorInd = inicio;
			for (cont= (inicio + 1); cont < this.getTamanho(); cont++){
				if(this.getElemento(cont) < this.getElemento(menorInd)){
					menorInd = cont;
				}
			}
			this.troca(inicio, menorInd);
			//this.imprime();
		}

	}
	
	public void insertionSort(){
		int cont, tamanhoVet,anterior,analisado,temp;
		
		tamanhoVet = this.getTamanho();
		for(cont=1;cont < tamanhoVet; cont++){
			analisado = cont;
			anterior = analisado - 1;
			while((anterior >= 0) && (this.getElemento(analisado) < this.getElemento(anterior))){
				this.troca(analisado,anterior);
				analisado = anterior;
				anterior = anterior - 1;				
			}
		}	
	
	}
	
	public void shuffle(){
		int cont,index1,index2,tamanhoVet;
		
		tamanhoVet =  this.getTamanho();
        	for(cont = 0; cont < tamanhoVet; cont++){
        		Random gerador = new Random();
            		index1 = gerador.nextInt(tamanhoVet);
            		index2 = gerador.nextInt(tamanhoVet);
            		this.troca(index1,index2);
        	}
	}
	
	public void inicializaRandomicoV2(){
		int cont;		
		for(cont = 0; cont < this.getTamanho(); cont++){
            		this.setElemento(cont, cont);
        	}
        	this.shuffle();  	     		
	}
	
	public void inicializaRandomicoV3(){
		int cont;		
		for(cont = 0; cont < this.getTamanho(); cont++){
            		this.setElemento(cont, cont);
        	} 	     		
	}
	
		
}
