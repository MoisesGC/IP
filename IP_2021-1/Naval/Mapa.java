public class Mapa{

	private char[][] mat;
	private int numLinhas;
	private int numColunas;
	private char[] codigoMapa;  //Ocean, Hit, Fail, Navy
	

	Mapa(){
		this.setNumLinhas(10);
		this.setNumColunas(10);
		mat = new char[this.getNumLinhas()][this.getNumColunas()];
		codigoMapa = new char[4];
		this.setCodigoMapa(0,'O');
		this.setCodigoMapa(1,'H');
		this.setCodigoMapa(2,'F');
		this.setCodigoMapa(3,'N');
		this.inicializa(this.getCodigoMapa(0));
	
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
	
	public char getCodigoMapa(int index){
		return this.codigoMapa[index];
	}

	public void setCodigoMapa(int index, char valor){
		this.codigoMapa[index]= valor;
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
		this.imprime(false);
	}
	
	public void imprime(boolean adversario){
		int contLinhas, contColunas;
		char valor;
		System.out.println("X- 0 1 2 3 4 5 6 7 8 9");
		System.out.println("-");
		for(contLinhas = 0; contLinhas < this.getNumLinhas(); contLinhas++){
			System.out.print(contLinhas + " ");
			for(contColunas = 0; contColunas < this.getNumColunas(); contColunas++){
				valor = this.getElemento(contLinhas,contColunas);
				if (adversario && (valor == this.getCodigoMapa(3))){
			         	valor = this.getCodigoMapa(0);
				}
			        System.out.print(" " + valor);
			}
			System.out.println();
        	}
	}
	
	public boolean tiro(int linha, int coluna){
		boolean acertou;
		char valorPosicao;
		String message;	
		acertou = true;
		valorPosicao = this.getElemento(linha,coluna);
		if (valorPosicao == this.getCodigoMapa(0)){
			message = "---- Agua!--------";
			this.setElemento(linha,coluna,this.getCodigoMapa(2));
			acertou = false;
		}
		else if (valorPosicao == this.getCodigoMapa(1)){
			message = "---- Posicao Repetida - Acerto Anterior --------";
			acertou = false;
		}
		else if (valorPosicao == this.getCodigoMapa(2)){
			message = "---- Posicao Repetida - Agua Anterior --------";
			acertou = false;
		} 
		else {
			message = "---  Acertou! ---- ";
			this.setElemento(linha,coluna,this.getCodigoMapa(1));
        	}
        	System.out.println(message);	
		return acertou;
	
	}
	
	
	
}	
