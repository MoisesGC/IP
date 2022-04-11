public class Mapa{

	private char[][] mat;
	private int numLinhas;
	private int numColunas;
	

	Mapa(){
		this.setNumLinhas(10);
		this.setNumColunas(10);
		mat = new char[this.getNumLinhas()][this.getNumColunas()];
		this.inicializa('O');
	}
	
	Mapa(int numLin , int numCol){
		this.setNumLinhas(numLin);
		this.setNumColunas(numCol);
		mat = new char[this.getNumLinhas()][this.getNumColunas()];
	}
		

	public char getElemento(int indexL, int indexC){
		return this.mat[indexL][indexC];
	}

	public void setElemento(int indexL, int indexC, char valor){
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
	
	
	public void inicializa(char valor){
		int contLinhas, contColunas;
		for(contLinhas = 0; contLinhas < this.getNumLinhas(); contLinhas++){
			for(contColunas = 0; contColunas < this.getNumColunas(); contColunas++){
            			this.setElemento(contLinhas, contColunas, valor);
			}
			
        	}
	}
	
	public void imprime(){
		int contLinhas, contColunas;
		System.out.println("X- 0 1 2 3 4 5 6 7 8 9");
		System.out.println("-");
		for(contLinhas = 0; contLinhas < this.getNumLinhas(); contLinhas++){
			System.out.print(contLinhas + " ");
			for(contColunas = 0; contColunas < this.getNumColunas(); contColunas++){
			         System.out.print(" " + this.getElemento(contLinhas,contColunas));
			}
			System.out.println();
        	}
	}
	
}	
