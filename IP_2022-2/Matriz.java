import java.util.Random;
public class Matriz{

	private int[][] mat;
	private int numLinha;
	private int numColuna;
	
	Matriz(){
		this.setNumLinha(5);
		this.setNumColuna(5);
		mat = new int[this.getNumLinha()][this.getNumColuna()];
	}
	
	Matriz(int numL, int numC){
		this.setNumLinha(numL);
		this.setNumColuna(numC);
		mat = new int[this.getNumLinha()][this.getNumColuna()];
	}
	
	
	public int getNumLinha(){
		return this.numLinha;
	}


	private void setNumLinha(int novoValor){
		 this.numLinha = novoValor;
	}
	
	public int getNumColuna(){
		return this.numColuna;
	}


	private void setNumColuna(int novoValor){
		 this.numColuna = novoValor;
	}
	
	public int getElemento(int numL, int numC){
		return this.mat[numL][numC];
	}


	public void setElemento(int numL, int numC, int novoValor){
		 this.mat[numL][numC] = novoValor;
	}
	
	public void inicializaComValor(int valor){
		int contL,contC;	
		for(contL = 0;contL < this.getNumLinha(); contL++){
			for(contC = 0;contC < this.getNumColuna(); contC++){
				this.setElemento(contL,contC,valor);
			}	
		}				
	}
	
	
	public void multiplicaPorInteiro(int valor){
		int contL,contC,temp;	
		for(contL = 0;contL < this.getNumLinha(); contL++){
			for(contC = 0;contC < this.getNumColuna(); contC++){
				temp = valor * this.getElemento(contL,contC);
				this.setElemento(contL,contC,temp);
			}	
		}				
	}
	
	public void somaPorInteiro(int valor){
		int contL,contC,temp;	
		for(contL = 0;contL < this.getNumLinha(); contL++){
			for(contC = 0;contC < this.getNumColuna(); contC++){
				temp = valor + this.getElemento(contL,contC);
				this.setElemento(contL,contC,temp);
			}	
		}				
	}
	
	public void somaComMatriz(Matriz outra){
		int contL,contC,temp;	
		for(contL = 0;contL < this.getNumLinha(); contL++){
			for(contC = 0;contC < this.getNumColuna(); contC++){
				temp = outra.getElemento(contL,contC) + this.getElemento(contL,contC);
				this.setElemento(contL,contC,temp);
			}	
		}				
	}
	
	public Matriz somaComMatrizV2(Matriz outra){
		int contL,contC,temp;	
		Matriz resp = new Matriz(this.getNumLinha(),this.getNumColuna());
		for(contL = 0;contL < this.getNumLinha(); contL++){
			for(contC = 0;contC < this.getNumColuna(); contC++){
				temp = outra.getElemento(contL,contC) + this.getElemento(contL,contC);
				resp.setElemento(contL,contC,temp);
			}	
		}
		
		return resp;				
	}
	
	public void somaComMatrizV3(Matriz outra, Matriz resp){
		int contL,contC,temp;	
		for(contL = 0;contL < this.getNumLinha(); contL++){
			for(contC = 0;contC < this.getNumColuna(); contC++){
				temp = outra.getElemento(contL,contC) + this.getElemento(contL,contC);
				resp.setElemento(contL,contC,temp);
			}	
		}				
	}
	
	public void inicializaRandomico(){
		int contL,contC,numRandomico;
		Random gerador = new Random();
		for(contL = 0;contL < this.getNumLinha(); contL++){
			for(contC = 0;contC < this.getNumColuna(); contC++){
				numRandomico = gerador.nextInt(this.getNumLinha()*this.getNumColuna()*2);
				this.setElemento(contL,contC,numRandomico);
			}
		}	
	}
	
	public boolean busca(int chave){
		int contL,contC;
		boolean achou;
		achou = false;	
		for(contL = 0;contL < this.getNumLinha(); contL++){
			for(contC = 0;contC < this.getNumColuna(); contC++){
				if (chave == this.getElemento(contL,contC)){
					achou = true;
				}
			}	
		}
		
		return achou;				
	}
	
	public boolean buscaV2(int chave){
		int contL,contC;
		boolean achou;
		achou = false;
		contL = 0;	
		while((contL < this.getNumLinha())&& !achou){
			contC = 0;
			while((contC < this.getNumColuna()) && !achou){
				if (chave == this.getElemento(contL,contC)){
					achou = true;
				}
				contC++;
			}
			contL++;	
		}
		
		return achou;				
	}
	
	
	public void  multiplicaMatriz(Matriz mat1, Matriz mat2, Matriz mat3){
		int respProduto;	
		int i,j,t;
		
		respProduto = 0;
		
		for (i=0; i < mat1.getNumLinha(); i++){	
			for (t=0; t < mat2.getNumColuna(); t++){	
				for (j=0; j < mat1.getNumColuna(); j++){
					//System.out.print("respProduto:" + respProduto + " + Mat1:" + mat1.getElemento(i,j) +" * Mat2:"+ mat2.getElemento(j,t));
					respProduto = respProduto + (mat1.getElemento(i,j) * mat2.getElemento(j,t));
					//System.out.println(" = respProduto:" + respProduto);
				}
				mat3.setElemento(i,t,respProduto);
				respProduto = 0;
			}
		}	
	}
	
	public boolean identidade(){
		boolean ident;		
		int contL,contC;
		ident = true;
		contL = 0;	
		while((contL < this.getNumLinha()) && ident){
			contC = 0;
			while((contC < this.getNumColuna()) && ident){
				if ((contL == contC) && (1 != this.getElemento(contL,contC))){
					ident = false;
				}
				if ((contL != contC) && (0 != this.getElemento(contL,contC))){
					ident = false;
				}
				contC++;
			}
			contL++;	
		}		
		return ident;
	
	}
	
	
	
	
	
	/*
	public void inicializaCrescente(){
		int cont;
		for(cont = 0;cont < this.getTamanho(); cont++){
			this.setElemento(cont,cont);
		}	
	}
	
	public void shuffle(){
		int numRand1, numRand2,cont;
		Random gerador = new Random();
		for(cont = 0;cont < this.getTamanho(); cont++){
			numRand1 = gerador.nextInt(this.getTamanho());
			numRand2 = gerador.nextInt(this.getTamanho());
			this.trocaValores(numRand1,numRand2);
		}
	}
	
	public void trocaValores(int index1, int index2){
		int temp;
		temp = this.getElemento(index1);
		this.setElemento(index1, this.getElemento(index2));
		this.setElemento(index2, temp);
	}


        */
	public void imprime(){
		int contL,contC;
		
		for(contL = 0;contL < this.getNumLinha(); contL++){
			for(contC = 0;contC < this.getNumColuna(); contC++){
				System.out.print(this.getElemento(contL,contC)+" ");
			}
			System.out.println();		
		}			
		System.out.println();
	}
	
	public void imprimeTransposta(){
		int contL,contC;
		
		for(contL = 0;contL < this.getNumLinha(); contL++){
			for(contC = 0;contC < this.getNumColuna(); contC++){
				System.out.print(this.getElemento(contC,contL)+" ");
			}
			System.out.println();		
		}			
		System.out.println();
	}
	
	public void imprimeDiagonal(){
		int contL,contC;
		
		for(contL = 0;contL < this.getNumLinha(); contL++){
			for(contC = 0;contC < contL/*this.getNumColuna()*/; contC++){
					System.out.print(this.getElemento(contL,contC)+" ");
			}
			System.out.println();		
		}			
		System.out.println();
	}
	
	public void imprimeIndex(){
		int contL,contC;	
		for(contL = 0;contL < this.getNumLinha(); contL++){
			for(contC = 0;contC < this.getNumColuna(); contC++){
				System.out.print(contL+":"+contC+" ");
			}
			System.out.println();		
		}			
		System.out.println();
	}


}
