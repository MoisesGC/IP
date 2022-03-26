import java.util.Random;


public class Matriz{

	private int[][] mat;
	private int numLinhas;
	private int numColunas;
	

	Matriz(){
		this.setNumLinhas(5);
		this.setNumColunas(5);
		mat = new int[this.getNumLinhas()][this.getNumColunas()];
	}
	
	Matriz(int numLin , int numCol){
		this.setNumLinhas(numLin);
		this.setNumColunas(numCol);
		mat = new int[this.getNumLinhas()][this.getNumColunas()];
	}
		

	public int getElemento(int indexL, int indexC){
		return this.mat[indexL][indexC];
	}

	public void setElemento(int indexL, int indexC, int valor){
		this.mat[indexL][indexC] = valor;
	}
	
	public int getNumLinhas(){
		return this.numLinhas;
	}

	public void setNumLinhas(int valor){
		this.numLinhas = valor;
	}
	
	public int getNumColunas(){
		return this.numColunas;
	}

	public void setNumColunas(int valor){
		this.numColunas = valor;
	}
	
	
	public void inicializaRandomico(){
		Random gerador = new Random();
		int contLinhas, contColunas, valor;
		for(contLinhas = 0; contLinhas < this.getNumLinhas(); contLinhas++){
			for(contColunas = 0; contColunas < this.getNumColunas(); contColunas++){
			        valor = gerador.nextInt(this.getNumLinhas() + this.getNumColunas() * 2);
            			this.setElemento(contLinhas, contColunas, valor);
			}
			
        	}
	}
	
	public void inicializa(int valor){
		Random gerador = new Random();
		int contLinhas, contColunas;
		for(contLinhas = 0; contLinhas < this.getNumLinhas(); contLinhas++){
			for(contColunas = 0; contColunas < this.getNumColunas(); contColunas++){
            			this.setElemento(contLinhas, contColunas, valor);
			}
			
        	}
	}
	
	public void imprime(){
		int contLinhas, contColunas;
		for(contLinhas = 0; contLinhas < this.getNumLinhas(); contLinhas++){
			for(contColunas = 0; contColunas < this.getNumColunas(); contColunas++){
			         System.out.print(" " + this.getElemento(contLinhas,contColunas));
			}
			System.out.println();
        	}
	}
	
	public void imprimeTransposta(){
		int contLinhas, contColunas;
		for(contColunas = 0; contColunas < this.getNumColunas(); contColunas++){
			for(contLinhas = 0; contLinhas < this.getNumLinhas(); contLinhas++){
			         System.out.print(" " + this.getElemento(contLinhas,contColunas)); // pega a posicao transposta
			}
			System.out.println();
        	}
	}
	

	public void transposicaoDeValores(){
		int contLinhas, contColunas;
		
		if(this.getNumColunas() == this.getNumLinhas()){  // evitando o caos...
			for(contLinhas = 0; contLinhas < this.getNumLinhas(); contLinhas++){
				for(contColunas = contLinhas+1; contColunas < this.getNumColunas(); contColunas++){
					 this.troca(contLinhas,contColunas,contColunas,contLinhas);				  
				}
			}
		}
	}
	
	
	
	public boolean busca(int chave){
		boolean resposta;
		int contLinhas, contColunas;
		
		resposta = false;
		contLinhas = 0;
		while((contLinhas < this.getNumLinhas()) && !resposta){
			contColunas = 0;
			while((contColunas < this.getNumColunas()) && !resposta){		
		    		if(chave == this.getElemento(contLinhas,contColunas)){
		    			resposta = true;
		    		}
		    		contColunas++;
		    	}
		    	contLinhas++;	
        	}      	
		return resposta;	
	}
	
	
	private void troca(int indexi1, int indexj1, int indexi2, int indexj2){
		int temp;
		temp = 	this.getElemento(indexi1,indexj1);
		this.setElemento(indexi1, indexj1, this.getElemento(indexi2,indexj2));			
		this.setElemento(indexi2, indexj2, temp);
	}
	
	
	public void inicializaOrdenado(){
		int conti,contj,valor;
		valor = 0;
		for(conti = 0; conti < this.getNumLinhas(); conti++){
			for(contj = 0; contj < this.getNumColunas(); contj++){
				this.setElemento(conti,contj,valor);
				valor++;
			}
		}
	}
	
	public void shuffle(){
		int indi1,indj1,indi2,indj2,tamanhoLinha,tamanhoColuna,conti,contj;
		tamanhoLinha = this.getNumLinhas();
		tamanhoColuna = this.getNumColunas();
		Random randomGenerator = new Random();
		for(conti = 0; conti < tamanhoLinha; conti++){
			for(contj = 0; contj < tamanhoColuna; contj++){
				indi1 = randomGenerator.nextInt(tamanhoLinha);
				indj1 = randomGenerator.nextInt(tamanhoColuna);
				indi2 = randomGenerator.nextInt(tamanhoLinha);
				indj2 = randomGenerator.nextInt(tamanhoColuna);
				this.troca(indi1,indj1,indi2,indj2);
			}
		}

	}
	
	public int retornaMaiorElemento(){
		int conti,contj,maior, temp;

		maior = this.getElemento(0,0);	
		for(conti = 0; conti < this.getNumLinhas(); conti++){		
			for(contj = 0; contj < this.getNumColunas(); contj++){
				temp = this.getElemento(conti,contj);
				if (temp > maior){
					maior = temp;
				}
			}
		}
		return maior;	
	}

	public int contaMaiores(int valor){
		int conti,contj,contMaiores,temp;

		contMaiores = 0;
		for(conti = 0; conti < this.getNumLinhas(); conti++){		
			for(contj = 0; contj < this.getNumColunas(); contj++){
				temp = this.getElemento(conti,contj);
				if (temp > valor){
					contMaiores++;
				}
			}
		}
		return contMaiores;	
	}	

	// caso matriz nao quadrada, retorna -1
	public int retorneOrdem(){
		int numL, numC, ordem;

		numL = this.getNumLinhas();
		numC = this.getNumColunas();
		ordem = -1;
		if(numL == numC){
			ordem = numL;
		}

		return ordem;
	}
	
	
	public void ordena(){
		Vetor vet;
		int conti,contj,indVet,valor;
		vet = new Vetor(this.getNumLinhas() * this.getNumColunas());
		
		this.copiaVet2Mat(vet, this);
		vet.insertionSort();	
		this.copiaMat2Vet(this, vet);		

		
	}
	
	public void copiaVet2Mat(Vetor vet, Matriz mtrz){
		int conti,contj,indVet,valor;
		indVet = 0;
		for(conti = 0; conti < mtrz.getNumLinhas(); conti++){
			for(contj = 0; contj < mtrz.getNumColunas(); contj++){
				valor = mtrz.getElemento(conti,contj);
				vet.setElemento(indVet,valor);
				indVet++;
			}
		}
	}
	
	public void copiaMat2Vet(Matriz mtrz, Vetor vet){
		int conti,contj,indVet,valor;
		indVet = 0;
		for(conti = 0; conti < mtrz.getNumLinhas(); conti++){
			for(contj = 0; contj < mtrz.getNumColunas(); contj++){
				valor = vet.getElemento(indVet);
				indVet++;
				this.setElemento(conti,contj,valor);
			}
		}
	}	
	
	
}	

