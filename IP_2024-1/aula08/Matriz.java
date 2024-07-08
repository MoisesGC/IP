import java.util.Scanner; 
import java.util.Random;

public class Matriz{

	private int[][]mat;
	private int numLinhas;
	private int numColunas;
	
	Matriz(){
		this(5,5);
	}
	
	Matriz(int numeroLinhas, int numeroColunas){
		this.setNumLinhas(numeroLinhas);
		this.setNumColunas(numeroColunas);
		mat = new int[this.getNumLinhas()][this.getNumColunas()];
	}que recebe como parâmetro outro objeto do tipo Vetor.
	
	
	public int getNumLinhas(){
		return this.numLinhas;
	}
	
	public void setNumLinhas(int novoTam){
		this.numLinhas = novoTam;
	}
	
	public int getNumColunas(){
		return this.numColunas;
	}
	
	public void setNumColunas(int novoTam){
		this.numColunas = novoTam;
	}
	
	
	public int getElemento(int indLinha, int indColuna){
		return this.mat[indLinha][indColuna];
	}
	
	public void setElemento(int indLinha, int indColuna, int novoValor){
		this.mat[indLinha][indColuna] = novoValor;
		//this.imprime();
	}
	
	
	public void inicializaRandomico(){
		int contC,contL,entrada;
		Random gerador = new Random();
		for(contL = 0; contL < this.getNumLinhas(); contL++){
			for(contC = 0; contC < this.getNumColunas(); contC++){
				entrada = gerador.nextInt((this.getNumLinhas() * this.getNumColunas()) * 2);
				this.setElemento(contL,contC,entrada);
			}
		}
	}
	
	
	public void multiplicaPorEscalar(int valor){
		int contC,contL,entrada;
		for(contL = 0; contL < this.getNumLinhas(); contL++){
			for(contC = 0; contC < this.getNumColunas(); contC++){
				entrada = this.getElemento(contL,contC) * valor;
				this.setElemento(contL,contC,entrada);
			}
		}
	}
	
	
	public boolean busca(int chave){
		int contC,contL;
		boolean achou;
		
		achou = false;
		
		contL = 0;
		while((contL < this.getNumLinhas()) && !achou ){
			contC = 0;
			while((contC < this.getNumColunas()) && !achou ){
				if(this.getElemento(contL, contC) == chave){
					achou = true;			
				}
				contC++;
			}
			contL++;
		}
		
		return achou;	
	}
	
	public void setIdentidade(){
		int contC,contL,entrada;
		for(contL = 0; contL < this.getNumLinhas(); contL++){
			for(contC = 0; contC < this.getNumColunas(); contC++){
				entrada = 0;
				if(contC == contL){
					entrada = 1;
				}
				this.setElemento(contL,contC,entrada);
			}
		}
	}
	
	public boolean checkIdentidade(){
		int contC,contL;
		boolean ehIdent;	
		ehIdent = true;	
		contL = 0;
		while((contL < this.getNumLinhas()) && ehIdent ){
			contC = 0;
			while((contC < this.getNumColunas()) && ehIdent ){
				if(contC != contL){
					if(this.getElemento(contL,contC) != 0){
						ehIdent = false;
					}					
				}
				else{
					if(this.getElemento(contL,contC) != 1){
						ehIdent = false;
					}				
				}							
				contC++;
			}
			contL++;
		}		
		return ehIdent;	
	}
	
	
	public void imprime(){
		int contC,contL;
		for(contL = 0; contL < this.getNumLinhas(); contL++){
			for(contC = 0; contC < this.getNumColunas(); contC++){
				System.out.print(" "+this.getElemento(contL, contC));
			}
			System.out.println();
		}	
	}
	
	public void imprimeTransposta(){
		int contC,contL;
		for(contC = 0; contC < this.getNumColunas(); contC++){
			for(contL = 0; contL < this.getNumLinhas(); contL++){
				System.out.print(" "+this.getElemento(contL,contC));
			}
			System.out.println();
		}	
	}
	
	
	public void multiplicaMatriz(Matriz matA, Matriz matB, Matriz matResp){
		int contProdInt,contLinhaA,contColunaB;
		int acum = 0;
		for(contLinhaA = 0; contLinhaA < matA.getNumLinhas(); contLinhaA++){
			for(contColunaB = 0; contColunaB < matB.getNumColunas(); contColunaB++){	
				for(contProdInt = 0; contProdInt < matA.getNumColunas(); contProdInt++){
					acum = acum + matA.getElemento(contLinhaA,contProdInt) * matB.getElemento(contProdInt,contColunaB);
				}
				matResp.setElemento(contLinhaA,contColunaB,acum);
				acum = 0;
			}
		}			
	}
	
	
	
	
	
	

	
}	
