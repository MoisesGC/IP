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
	}
	
	
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
	
	public void imprime(){
		int contC,contL;
		for(contL = 0; contL < this.getNumLinhas(); contL++){
			for(contC = 0; contC < this.getNumColunas(); contC++){
				System.out.print(" "+this.getElemento(contL, contC));
			}
			System.out.println();
		}	
	}
	
}	
