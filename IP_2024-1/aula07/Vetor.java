import java.util.Scanner; 
import java.util.Random;

public class Vetor{

	private float[] vet;
	private int tamanho;
	
	Vetor(){
		this(5);
	}
	
	Vetor(int novoTamanho){
		this.setTamanho(novoTamanho);
		vet = new float[this.getTamanho()];
	}
	
	
	public int getTamanho(){
		return this.tamanho;
	}
	
	public void setTamanho(int novoTam){
		this.tamanho = novoTam;
	}
	
	
	public float getElemento(int index){
		return this.vet[index];
	}
	
	public void setElemento(int index, float novoValor){
		this.vet[index] = novoValor;
		//this.imprime();
	}
	
	public boolean busca(float chave){
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
	
	public boolean buscaV2(float chave){
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
	
	public int buscaV3(float chave){
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
	
	
	public void inicializaComValor(float valor){
		int cont;
		for(cont = 0; cont < this.getTamanho(); cont++){
			this.setElemento(cont,valor);
		}
	}
	
	public void inicializaManual(Scanner ler){
		int cont;
		float entrada;
		for(cont = 0; cont < this.getTamanho(); cont++){
			entrada = (float)ler.nextInt();
			this.setElemento(cont,entrada);
		}
	}
	
	public void inicializaSerie(int inicio){
		int cont;
		float entrada;
		entrada = inicio;
		for(cont = 0; cont < this.getTamanho(); cont++){
			this.setElemento(cont,entrada);
			entrada++;
		}
	}
	
	public void inicializaRandomico(){
		int cont;
		float entrada;
		Random gerador = new Random();
		for(cont = 0; cont < this.getTamanho(); cont++){
			entrada = (float)gerador.nextInt(this.getTamanho() * 2);
			this.setElemento(cont,entrada);
		}
	}
	
	public void troca(int end1, int end2){
		float valor1,valor2;		
		valor2 = this.getElemento(end2);
		valor1 = this.getElemento(end1);		
		this.setElemento(end2,valor1);
		this.setElemento(end1,valor2);

	}
	
	public void imprimeEstatisticas(){	
		int cont;
		float media,maior, menor;	
		maior = 0.0f;
		menor = 0.0f;
		media = 0.0f;
		
		maior = this.getElemento(0);
		menor = this.getElemento(0);
		media = this.getElemento(0);
		
		
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
	
	public void shuffle(){
		int cont,ind1,ind2;
		Random gerador = new Random();
		for(cont = 0; cont < (this.getTamanho()*2); cont++){
			ind1 = gerador.nextInt(this.getTamanho());
			ind2 = gerador.nextInt(this.getTamanho());
			this.troca(ind1,ind2);	
		}
	
	}
	
	
	public void ordenaBetaVersion(){
		int endMenor,indInicio,cont;	
		
		for(indInicio = 0; indInicio < this.getTamanho()-1; indInicio++){
			endMenor = indInicio;
			for(cont= (indInicio+1); cont < this.getTamanho(); cont++){
				if(this.getElemento(endMenor) >  this.getElemento(cont)){
					endMenor = cont;
				}
			}
					
			this.troca(indInicio,endMenor);	
		}	
		
	}
	
	
	public float produtoInterno(){	
		return this.produtoInterno(this, this);
	}
	
	public float produtoInterno(Vetor vet1){
		return this.produtoInterno(vet1, this);
	}
	
	
	public float produtoInterno(Vetor vet1, Vetor vet2){
	
		float acumulador;
		int cont;
		
		acumulador = 0.0f;
		for(cont = 0; cont < vet1.getTamanho(); cont++){
			acumulador = acumulador + (vet1.getElemento(cont)* vet2.getElemento(cont));
		}
		return acumulador;
	}
	
	public float tamanho(){
		float prodInt;
		
		prodInt = this.produtoInterno(this, this);
		return (float)Math.sqrt(prodInt);
	
	}
	
	public void soma(Vetor vet1){
		this.soma(vet1,this,this);
	}
	
	
	public void soma(Vetor vet1, Vetor vet2){
		this.soma(vet1, vet2, this);
	}
	
	public void soma(Vetor vet1, Vetor vet2, Vetor vet3){
		int cont;
		float temp;
		
		for(cont = 0; cont < vet3.getTamanho(); cont++){
			temp = vet1.getElemento(cont) + vet2.getElemento(cont);
			vet3.setElemento(cont, temp);
		}
	}
	
	public void multiplicaPorEscalar(float escalar){
		this.multiplicaPorEscalar(escalar, this, this);
	}
	
	
	public void multiplicaPorEscalar(float escalar, Vetor vet01){
		this.multiplicaPorEscalar(escalar, vet01, vet01);
	}
	
	
	public void multiplicaPorEscalar(float escalar, Vetor vet01, Vetor vet02){
		int cont;
		float temp;
		
		for(cont = 0; cont < vet01.getTamanho(); cont++){
			temp = vet01.getElemento(cont) * escalar;
			vet02.setElemento(cont, temp);
		}
	}
	
	
	public float cosenoEntreVetores(Vetor vet01, Vetor vet02){
	
		float prodEscalar;
		float multiplicaNormas;
		
			
		prodEscalar = this.produtoInterno(vet01, vet02);
		System.out.println(prodEscalar);
		
		multiplicaNormas = vet01.tamanho() * vet02.tamanho();
		System.out.println(vet01.tamanho());
		System.out.println(vet02.tamanho());
		System.out.println(multiplicaNormas);
		
		System.out.println(prodEscalar/multiplicaNormas);
		
		return (prodEscalar/multiplicaNormas);
	
	
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
