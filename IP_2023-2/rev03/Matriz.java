import java.util.Random;

public class Matriz{

	private int[][] mat;
	private int numeroLinhas;
	private int numeroColunas;
	
	Matriz(){
		this.setNumeroLinhas(5);
		this.setNumeroColunas(5);
		mat = new int[this.getNumeroLinhas()][this.getNumeroColunas()];
	}
	
	Matriz(int numLinhas, int numColunas){
		this.setNumeroLinhas(numLinhas);
		this.setNumeroColunas(numColunas);
		mat = new int[this.getNumeroLinhas()][this.getNumeroColunas()];
	}
	
	
	public int getNumeroLinhas(){
		return this.numeroLinhas;
	}
	
	public void setNumeroLinhas(int novoTam){
		this.numeroLinhas = novoTam;
	}
	
	public int getNumeroColunas(){
		return this.numeroColunas;
	}
	
	public void setNumeroColunas(int novoTam){
		this.numeroColunas = novoTam;
	}
	
	
	public int getElemento(int indexLinha, int indexColuna){
		return this.mat[indexLinha][indexColuna];
	}
	
	public void setElemento(int indexLinha, int indexColuna, int novoValor){
		this.mat[indexLinha][indexColuna] = novoValor;
	}
	
	public void inicializaComValor(int valor){
	
		int contColuna;
		int contLinha;
		for(contLinha = 0; contLinha < this.getNumeroLinhas(); contLinha++){
			for(contColuna = 0; contColuna < this.getNumeroColunas(); contColuna++){
				this.setElemento(contLinha,contColuna,valor);
			}
		}
		
		
	}
	
	public void inicializaRandom(){
		int contColuna;
		int contLinha;
		int randInt;
		Random gerador = new Random();
		for(contLinha = 0; contLinha < this.getNumeroLinhas(); contLinha++){
			for(contColuna = 0; contColuna < this.getNumeroColunas(); contColuna++){
				randInt = gerador.nextInt(this.getNumeroLinhas() *
							  this.getNumeroColunas() * 3);
				this.setElemento(contLinha,contColuna,randInt);
			}
		}
	}
	
	public void multiplicaPorNumero(int numero){
		int contColuna;
		int contLinha;
		int temp;
		for(contLinha = 0; contLinha < this.getNumeroLinhas(); contLinha++){
			for(contColuna = 0; contColuna < this.getNumeroColunas(); contColuna++){
				temp = this.getElemento(contLinha,contColuna) * numero;
				this.setElemento(contLinha,contColuna,temp);
			}
		}
	}
	
	public void divideMatPorNumero(int numero){
		int contColuna;
		int contLinha;
		int temp;
		for(contLinha = 0; contLinha < this.getNumeroLinhas(); contLinha++){
			for(contColuna = 0; contColuna < this.getNumeroColunas(); contColuna++){
				temp = this.getElemento(contLinha,contColuna) / numero;
				this.setElemento(contLinha,contColuna,temp);
			}
		}
	}
	
	/*public void dividePorNumero(int numero){
		this.multiplicaPorNumero(1/numero);
	}*/
	
	public void dividePorNumero(int numero){
		if (numero != 0){	
			this.divideMatPorNumero(numero);
		}
	}
	
	public void somaComNumero(int numero){
		int contColuna;
		int contLinha;
		int temp;
		for(contLinha = 0; contLinha < this.getNumeroLinhas(); contLinha++){
			for(contColuna = 0; contColuna < this.getNumeroColunas(); contColuna++){
				temp = this.getElemento(contLinha,contColuna) + numero;
				this.setElemento(contLinha,contColuna,temp);
			}
		}
	}
	
	
	public void somaComMatriz(Matriz outra){
		int contColuna;
		int contLinha;
		int temp;
		for(contLinha = 0; contLinha < this.getNumeroLinhas(); contLinha++){
			for(contColuna = 0; contColuna < this.getNumeroColunas(); contColuna++){
				temp = this.getElemento(contLinha,contColuna) + outra.getElemento(contLinha,contColuna);
				this.setElemento(contLinha,contColuna,temp);
			}
		}
	}

	public void subtracaoComNumero(int numero){
		this.somaComNumero(numero * -1);
	}
	
	
	public void imprime(){
		int contColuna;
		int contLinha;
		for(contLinha = 0; contLinha < this.getNumeroLinhas(); contLinha++){
			for(contColuna = 0; contColuna < this.getNumeroColunas(); contColuna++){
				System.out.print(this.getElemento(contLinha,contColuna) + " ");
			}
			System.out.println();	
		}
		System.out.println();	
	}




}

