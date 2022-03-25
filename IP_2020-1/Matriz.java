import java.util.Scanner;
import java.util.Random;

public class Matriz {
	private int[][] mat;
	private int numLinha;
	private int numColuna;

	Matriz(int numL, int numC){
		this.setLinha(numL);
		this.setColuna(numC);
		this.mat = new int[this.getLinha()][this.getColuna()];
	}

	public int getElemento(int i, int j){
		return this.mat[i][j];
	}
	public void setElemento(int i, int j, int novoValor){
		this.mat[i][j] = novoValor;
	}

	public int getLinha(){
		return this.numLinha;
	}

	public void setLinha(int numLinhas){
		this.numLinha = numLinhas;
	}

	public int getColuna(){
		return this.numColuna;
	}

	public void setColuna(int numColunas){
		this.numColuna = numColunas;
	}

	public void imprimir(){
		int contI,contJ;
		for (contI=0; contI < this.getLinha(); contI++){
			System.out.println();
			for (contJ=0; contJ < this.getColuna(); contJ++){
				System.out.print(this.getElemento(contI,contJ) + " ");
			}			
		}	
		System.out.println();	
	}

	public void inicializaManual(){ 
		int contI,contJ,entrada;
		Scanner ler = new Scanner(System.in);
		System.out.println("Inicialização manual..");
		for (contI=0; contI < this.getLinha(); contI++){
			System.out.println();
			for (contJ=0; contJ < this.getColuna(); contJ++){
				entrada = ler.nextInt();
				this.setElemento(contI,contJ,entrada);
			}
		}

	}
	
	
	public void inicializaRandomico(){ 
		int contI,contJ,entrada;
		Random randomGenerator = new Random();
		System.out.println("Inicialização randomica..");
		for (contI=0; contI < this.getLinha(); contI++){
			for (contJ=0; contJ < this.getColuna(); contJ++){
				this.setElemento(contI,contJ,randomGenerator.nextInt(this.getLinha()*this.getColuna()));
			}
		}

	}
	
	public void multiplicaPorValor(int valor){
		int contI,contJ;
		for (contI=0; contI < this.getLinha(); contI++){
			for (contJ=0; contJ < this.getColuna(); contJ++){
				this.setElemento(contI,contJ, this.getElemento(contI, contJ) * valor);
			}			
		}	
		System.out.println();	
	}
	
	
	
	
	

}
