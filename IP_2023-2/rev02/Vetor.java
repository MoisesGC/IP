import java.util.Random;

public class Vetor{

	private int[] vet;
	private int tamanho;
	
	Vetor(){
		this.setTamanho(5);
		vet = new int[this.getTamanho()];
	}
	
	Vetor(int novoTamanho){
		this.setTamanho(novoTamanho);
		vet = new int[this.getTamanho()];
	}
	
	
	public int getTamanho(){
		return this.tamanho;
	}
	
	public void setTamanho(int novoTam){
		this.tamanho = novoTam;
	}
	
	
	public int getElemento(int index){
		return this.vet[index];
	}
	
	public void setElemento(int index, int novoValor){
		this.vet[index] = novoValor;
	}
	
	public void inicializaComValor(int valor){
		int cont;
		for(cont = 0; cont < this.getTamanho(); cont++){
			this.setElemento(cont, valor);
		}
	}
	
	public void inicializaRandom(){
		int cont,randInt;
		Random gerador = new Random();
		for(cont = 0; cont < this.getTamanho(); cont++){
			randInt = gerador.nextInt(this.getTamanho()*3);
			this.setElemento(cont, randInt);
		}
	}
	
	public void imprimeMaiorMenor(){
		int cont,indMenor,indMaior;
		
		indMenor = 0;
		indMaior = 0;

		for(cont = 1; cont < this.getTamanho(); cont++){
			if(this.getElemento(indMenor) > this.getElemento(cont)){
				indMenor = cont;
			}
			else{
				if(this.getElemento(indMaior) < this.getElemento(cont)){
					indMaior = cont;
				}
			}
		}
		
		System.out.println("Vetor(" + indMenor +")= " + this.getElemento(indMenor));
		System.out.println("Vetor(" + indMaior +")= " + this.getElemento(indMaior));

	}
	
	
	
	public boolean busca(int chave){
		int cont;
		boolean resposta;
		resposta = false;
		for(cont = 0; cont < this.getTamanho(); cont++){
			if (chave == this.getElemento(cont)){
				resposta = true;
			}
		}
		
		return resposta;
	}
	
	public boolean buscaV2(int chave){
		int cont;
		boolean achei;
		achei = false;
		cont = 0;
		while (cont < this.getTamanho() && (!achei)){
			if (chave == this.getElemento(cont)){
				achei = true;
			}
			cont++;
		}		
		return achei;
	}


	public void imprime(){
		int cont;
		for(cont = 0; cont < this.getTamanho(); cont++){
			System.out.print(this.getElemento(cont) + " ");
		}
		System.out.println();
	}




}

