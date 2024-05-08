import java.util.Random;

public class Vetor{

	private int[] vet;
	private int tamanho;
	
	Vetor(){
		this.setTamanho(5);
		vet = new int[this.getTamanho()];
		this.inicializa(-1);
	}
	
	Vetor(int tamInicial){
		this.setTamanho(tamInicial);
		vet = new int[this.getTamanho()];
		this.inicializa(-1);
	}
	
	
	public int getTamanho(){
		return this.tamanho;
	}
	
	private void setTamanho(int novoValor){
		this.tamanho = novoValor;
	}
	
	public int getElemento(int index){
		int resp;
		resp = -1;  //retorna -1 no caso de index invalido
		if((index < this.getTamanho()) && (index >=0)){
			resp = this.vet[index];
		}
		else{
			System.out.println("Get com index errado!");
		}	
		return resp;
	}
	
	public void setElemento(int index, int novoValor){
		if((index < this.getTamanho()) && (index >=0)){
			this.vet[index] = novoValor;
		}
		else{
			System.out.println("Set com index errado!");
		}	
	}
	
	public void imprime(){
		int cont;
		for(cont = 0; cont < this.getTamanho(); cont++){
			System.out.print(this.getElemento(cont)+" ");
		}
		System.out.println();
	}
	
	public void imprimeRecursivo(){
		this.imprimeR(0);
		System.out.println();
	}
	
	private void imprimeR(int index){
		if(index == (this.getTamanho()-1)){
			System.out.print(" " + this.getElemento(index));
		}
		else{
			this.imprimeR(index+1);
			System.out.print(" " + this.getElemento(index));
			//this.imprimeR(index+1);
		}
	}
	
	public void inicializa(int valor){
		int cont;
		for(cont = 0; cont < this.getTamanho(); cont++){	
			this.setElemento(cont, valor);
		}
	}
	
	public void inicializaRandom(){
		int cont;
		int valor;
		Random gerador = new Random();
		for(cont = 0; cont < this.getTamanho(); cont++){
			valor = gerador.nextInt(this.getTamanho() * 2);	
			this.setElemento(cont, valor);
		}
	}
	
	
	public void inicializaOrdem(int inicio){
		int cont;
		int valor;
		for(cont = 0; cont < this.getTamanho(); cont++){
			valor = inicio;	
			this.setElemento(cont, valor);
			inicio++;
		}
	}
	
	public void troca(int index1, int index2){
		int temp;
		temp = this.getElemento(index1); 
      		this.setElemento(index1, this.getElemento(index2));  
      		this.setElemento(index2,temp); 
	}
	
	public void shuffle(){
		int cont, ind1,ind2;
		Random gerador = new Random();
		for(cont = 0; cont < this.getTamanho(); cont++){
			ind1 = gerador.nextInt(this.getTamanho());	
			ind2 = gerador.nextInt(this.getTamanho());
			this.troca(ind1,ind2);
		}
	}
	
	public boolean busca(int chave){
		boolean achou;
		int cont;
		
		achou = false;
		for(cont = 0; cont < this.getTamanho(); cont++){	
			if(chave == this.getElemento(cont)){
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
			if(chave == this.getElemento(cont)){
				achou = true;
			}
			cont++;
		}		
		return achou;
	}
	
	
	public int produtoInterno(Vetor vetA, Vetor vetB){
		int cont,valor, prodInt;
		prodInt = 0;
		for(cont = 0; cont < vetA.getTamanho(); cont++){
			valor = vetA.getElemento(cont) * vetB.getElemento(cont);
			prodInt = prodInt + valor;
		}
		
		return prodInt;
	}

	public int produtoInterno(Vetor vetA){
		int prodInt;
		prodInt = this.produtoInterno(this,vetA);
		return prodInt;
	}	
	
	public void copiaDe(Vetor destino, Vetor origem){
		int cont,valor;
		for(cont = 0; cont < destino.getTamanho(); cont++){
			valor = origem.getElemento(cont);
			destino.setElemento(cont, valor);
		}
	}
	
	
	public void copiaDe(Vetor outro){
		this.copiaDe(this, outro);
	}
	
	
	public void imprimeMenor(){
		int cont,indMenor;
        	indMenor = 0;
        	cont = 1;	
        	while(cont < this.getTamanho()){
        		if(this.getElemento(cont) < this.getElemento(indMenor)){
        			indMenor = cont;
        		}      		
			cont++;
        	}
        	System.out.println(this.getElemento(indMenor));
	}
	
	public void arrumaMenor(int indexInicio, int indexFinal){
		int cont,indMenor;
        	indMenor = indexInicio;
        	cont = indexInicio + 1;	
        	while(cont <= indexFinal){
        		if(this.getElemento(cont) < this.getElemento(indMenor)){
        			indMenor = cont;
        		}      		
			cont++;
        	}
        	this.troca(indexInicio,indMenor);	
	}
	
	
	public void ordena(){
		int cont,indexMaior;
		indexMaior = this.getTamanho()-1;
		for(cont = 0; cont < indexMaior; cont++){
			this.arrumaMenor(cont,indexMaior);		
		}		
	}
	
	
	
	
	
	

}





