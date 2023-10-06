import java.util.Random;

public class Matriz{

	private int[][] mat;
	private int ordem;
	
	Matriz(){
		this.setOrdem(5);
		mat = new int[this.getOrdem()][this.getOrdem()];
		//this.inicializa(-1);
	}
	
	Matriz(int tamInicial){
		this.setOrdem(tamInicial);
		mat = new int[this.getOrdem()][this.getOrdem()];
		//this.inicializa(-1);
	}
	
	
	public int getOrdem(){
		return this.ordem;
	}
	
	private void setOrdem(int novoValor){
		this.ordem = novoValor;
	}
	
	public int getElemento(int i, int j){	
		return this.mat[i][j];
	}
	
	public void setElemento(int i, int j, int novoValor){
		this.mat[i][j] = novoValor;

	}
	
	public void imprime(){
		int contI, contJ;
		for(contI = 0; contI < this.getOrdem(); contI++){
			for(contJ = 0; contJ < this.getOrdem(); contJ++){
				System.out.print(this.getElemento(contI,contJ)+" ");
			}
		System.out.println();
		}
	}
	
	public void imprimeTransposta(){
		int contI, contJ;
		for(contI = 0; contI < this.getOrdem(); contI++){
			for(contJ = 0; contJ < this.getOrdem(); contJ++){
				System.out.print(this.getElemento(contJ,contI)+" ");
			}
		System.out.println();
		}
	}
	
	
	
	public void inicializa(int valor){
		int contI, contJ;
		for(contI = 0; contI < this.getOrdem(); contI++){
			for(contJ = 0; contJ < this.getOrdem(); contJ++){	
				this.setElemento(contI,contJ, valor);
			}
		}
	}
	
	public void inicializaRandom(){
		int valor;
		Random gerador = new Random();
		int contI, contJ;
		for(contI = 0; contI < this.getOrdem(); contI++){
			for(contJ = 0; contJ < this.getOrdem(); contJ++){	
				valor = gerador.nextInt(this.getOrdem() * this.getOrdem() * 2);	
				this.setElemento(contI,contJ, valor);
			}
		}
	}
	
	public void imprimeIndices(){
		int contI, contJ;
		for(contI = 0; contI < this.getOrdem(); contI++){
			for(contJ = 0; contJ < this.getOrdem(); contJ++){
				System.out.print("["+contI +","+ contJ +"]");
			}
			System.out.println();
		}
	}
	
	public void imprimeSetorSuperior(){
		int contI, contJ;
		for(contI = 0; contI < this.getOrdem(); contI++){
			for(contJ = 0; contJ < this.getOrdem(); contJ++){
				if(contI < contJ){
					//System.out.print("["+contI +","+ contJ +"]");
					System.out.print(this.getElemento(contI,contJ)+" ");
				}
			}
			System.out.println();
		}
	}
	
	
	public void imprimeSetorInferior(){
		int contI, contJ;
		for(contI = 0; contI < this.getOrdem(); contI++){
			for(contJ = 0; contJ < this.getOrdem(); contJ++){
				if(contI > contJ){
					//System.out.print("["+contI +","+ contJ +"]");
					System.out.print(this.getElemento(contI,contJ)+" ");
				}
			}
			System.out.println();
		}
	}
	
	public void imprimeDiagonalPrincipal(){
		int contI, contJ;
		for(contI = 0; contI < this.getOrdem(); contI++){
			System.out.print(this.getElemento(contI,contI)+" ");
		}
		System.out.println();
	}
	
	public void imprimeDiagonalInvertida(){
		int contI, contJ;
		for(contI = 0; contI < this.getOrdem(); contI++){
			for(contJ = 0; contJ < this.getOrdem(); contJ++){
				if((contI + contJ) == (this.getOrdem() -1)){
					//System.out.print("["+contI +","+ contJ +"]");
					System.out.print(this.getElemento(contI,contJ)+" ");
				}
			}	
		}
		System.out.println();
	}
	
	
	/*
	
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
	
	
	
	
	  */
	

}
