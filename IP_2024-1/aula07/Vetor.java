import java.util.Scanner; 
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
		this.imprime();
	}
	
	public boolean busca(int chave){
		boolean achou;
		int cont;
		achou = false;
		for(cont = 0;cont < this.getTamanho(); cont++){	
			if (this.getElemento(cont) == chave){
				achou = true;
			}
		}
		
		return achou;
	}
	
	public boolean buscaV2(int chave){
		boolean achou;
		int cont;
		achou = false;
		cont = 0;
		while((cont < this.getTamanho()) && !achou){	
			if (this.getElemento(cont) == chave){
				achou = true;
			}		
			cont++;
		}
		
		return achou;
	}
	
	public int buscaV3(int chave){
		boolean achou;
		int cont, chaveInd;
		achou = false;
		chaveInd = -1;
		cont = 0;
		while((cont < this.getTamanho()) && !achou){	
			if (this.getElemento(cont) == chave){
				achou = true;
				chaveInd = cont;
				
			}		
			cont++;
		}
		
		return chaveInd;
	}
	
	
	public void inicializaComValor(int valor){
		int cont;
		for(cont = 0; cont < this.getTamanho(); cont++){
			this.setElemento(cont,valor);
		}
	}
	
	public void inicializaManual(Scanner ler){
		int cont,entrada;
		for(cont = 0; cont < this.getTamanho(); cont++){
			entrada = ler.nextInt();
			this.setElemento(cont,entrada);
		}
	}
	
	public void inicializaRandomico(){
		int cont,entrada;
		Random gerador = new Random();
		for(cont = 0; cont < this.getTamanho(); cont++){
			entrada = gerador.nextInt(this.getTamanho() * 2);
			this.setElemento(cont,entrada);
		}
	}
	
	public void troca(int end1, int end2){
		int valor1,valor2;		
		valor2 = this.getElemento(end2);
		valor1 = this.getElemento(end1);		
		this.setElemento(end2,valor1);
		this.setElemento(end1,valor2);

	}
	
	public void imprimeEstatisticas(){	
		int cont, maior, menor;
		float media;	
		maior = 0;
		menor = 0;
		media = 0.0f;
		
		maior = this.getElemento(0);
		menor = this.getElemento(0);
		media = (float)this.getElemento(0);
		
		
		for(cont=1; cont < this.getTamanho(); cont++){
			if(maior < this.getElemento(cont)){
				maior = this.getElemento(cont);
			}
			if(menor >  this.getElemento(cont)){
				menor = this.getElemento(cont);
			}
			media = media + this.getElemento(cont);
		}
		
		media = media/(float)cont;
		
		System.out.println("O maior valor eh "+ maior 
				  +"\nO menor valor eh "+ menor
				  +"\nA media dos valores eh "+ media); 
	}
	
	public void trocaMaiorMenor(){	
		int endMaior,endMenor,cont;	
		endMaior = 0;
		endMenor = 0;
		for(cont=1; cont < this.getTamanho(); cont++){
			if(this.getElemento(endMaior) < this.getElemento(cont)){
				endMaior = cont;
			}
			if(this.getElemento(endMenor) >  this.getElemento(cont)){
				endMenor = cont;
			}
		}		
		this.troca(endMaior,endMenor);	
	}
	
	
	
	public void imprime(){
		int cont;
		//System.out.println();
		for(cont = 0; cont < this.getTamanho(); cont++){
			System.out.print(" "+this.getElemento(cont));
		}
		System.out.println();
	}
		
}	
