import java.util.Random;

class Matriz{
	private int[][] mat;
	private int tamLinha;
	private int tamColuna;

	Matriz(){
		mat = new int[6][6];
		this.setTamanhoLinha(6);	
		this.setTamanhoColuna(6);
	}

	Matriz(int numLinhas, int numColunas){
		mat = new int[numLinhas][numColunas];
		this.setTamanhoLinha(numLinhas);	
		this.setTamanhoColuna(numColunas);
	}


	public int getValor(int indiceI,int indiceJ){
		return mat[indiceI][indiceJ];
	}	
	
	public void setValor(int indiceI,int indiceJ, int novoValor){
		mat[indiceI][indiceJ] = novoValor;
	}

	public int getTamanhoLinha(){
		return tamLinha;
	}	
	
	public int getTamanhoColuna(){
		return tamColuna;
	}	

	private void setTamanhoLinha(int novoValor){
		tamLinha = novoValor;
	}

	private void setTamanhoColuna(int novoValor){
		tamColuna = novoValor;
	}

	public void imprime(){
		int conti,contj;	
		for(conti = 0; conti < this.getTamanhoLinha(); conti++){
			System.out.println();
			for(contj = 0; contj < this.getTamanhoColuna(); contj++){
				System.out.print(this.getValor(conti,contj) + " ");
			}
		}
		System.out.println();	
	}
	
	public Matriz multiplicaMatriz(Matriz mat1, Matriz mat2){
		int numLinhasM1, numLinhasM2, numColunasM1, numColunasM2;
		int contLinhaM1, contColunaM2,contInterno,prodInterno;
	
		Matriz resposta = null;
		
		numLinhasM1 = mat1.getTamanhoLinha();
		numLinhasM2 = mat2.getTamanhoLinha();
	
		numColunasM1 = mat1.getTamanhoColuna();
		numColunasM2 = mat2.getTamanhoColuna();
		
		if(numColunasM1 == numLinhasM2){
			resposta = new Matriz(numLinhasM1,numColunasM2);		
			// caminhar pelas linhas da matriz mat1
			for(contLinhaM1 = 0; contLinhaM1 < numLinhasM1; contLinhaM1++){		
				//caminhar pelas colunas matriz mat2 
				for(contColunaM2 =0; contColunaM2 < numColunasM2; contColunaM2++){
					// produto interno dos vetores (linha e coluna)
					prodInterno = 0;
					for(contInterno =0; contInterno < numColunasM1; contInterno++){
						prodInterno = prodInterno + 
						mat1.getValor(contLinhaM1, contInterno) * 
						mat2.getValor(contInterno, contColunaM2);				
					}
					resposta.setValor(contLinhaM1,contColunaM2, prodInterno);		
				} //contColunaM2
			}//contLinhaM1	
				
		}
		else{
			System.out.println("Matrizes Incompativeis para Multiplicação");		
		}
		
		return resposta;
	}
	
	
	public Matriz  multiplicaMatriz(Matriz m2){
		return this.multiplicaMatriz(this, m2);
	}
	
	

	public void inicializaRandomico(){
		int conti,contj, novoValor;
		int ordem = this.getTamanhoLinha() + this.getTamanhoColuna();
		Random gerador = new Random();
		for(conti = 0; conti < this.getTamanhoLinha(); conti++){
			for(contj = 0; contj < this.getTamanhoColuna(); contj++){
				novoValor = gerador.nextInt(ordem);
				this.setValor(conti,contj,novoValor);
			}
		}
	}
	
	public void inicializaPadrao(){
		int conti,contj, novoValor,novoValorI,novoValorJ;
		int ordem = this.getTamanhoLinha();	
		int indexCentral = (ordem -1)/2;	
		for(conti = 0; conti < this.getTamanhoLinha(); conti++){
			for(contj = 0; contj < this.getTamanhoColuna(); contj++){	
				novoValorI = Math.abs(conti - indexCentral);
				novoValorJ = Math.abs(contj - indexCentral);
				
				novoValor = novoValorI;
				if(novoValorI < novoValorJ){
					novoValor = novoValorJ;
				}
				
				this.setValor(conti,contj,novoValor);
			}
		}
	}

	// caso matriz nao quadrada, retorna -1
	public int retorneOrdem(){
		int numL, numC, ordem;

		numL = this.getTamanhoLinha();
		numC = this.getTamanhoColuna();
		ordem = -1;
		if(numL == numC){
			ordem = numL;
		}

		return ordem;
	}	

	private int detOrdem1(Matriz mat){
		return mat.getValor(0,0);
	}
	
	private int detOrdem2(Matriz mat){
		int diagonalP, diagonalI;

		diagonalP = mat.getValor(0,0) * mat.getValor(1,1);		
		diagonalI = mat.getValor(1,0) * mat.getValor(0,1);		

		return (diagonalP - diagonalI);
	}

	private int calculaSinal(int indiceL, int indiceC){
		int sinal;

		sinal = -1;

		if( ((indiceL + indiceC)% 2) == 0 ){
			sinal = 1;
		}

		return sinal;		
	}

	public void copiaMatrizMaiorParaMenor(Matriz maior,Matriz menor,int isqn,int jsqn){
		int contAi,contAj,contBi,contBj,temp,numL,numC;
		numL = menor.getTamanhoLinha();
		numC = menor.getTamanhoColuna();

		contAi = 0;
		for(contBi = 0; contBi < numL; contBi++){
			if(contAi == isqn){
				contAi++;
			}
			contAj = 0;
			for(contBj = 0; contBj < numC; contBj++){
				if(contAj == jsqn){
					contAj++;
				}
				temp = maior.getValor(contAi,contAj);
				menor.setValor(contBi,contBj,temp);
				contAj++;
			}
			contAi++;
		}
	}

	private int detOrdemN(Matriz mat){
		int sinal,cofator,detTemp,resposta,contL,contC,numL,numC;
		Matriz matmenor;
		numL = this.getTamanhoLinha();
		numC = this.getTamanhoColuna();
		
		resposta = 0;
		contL = 0;
		for(contC = 0; contC < mat.getTamanhoColuna(); contC++){
			cofator = mat.getValor(contL,contC);
			sinal = this.calculaSinal(contL,contC);
			matmenor = new Matriz(numL-1,numC-1);
			this.copiaMatrizMaiorParaMenor(mat,matmenor,contL,contC);
			detTemp = matmenor.determinante();
			resposta = resposta + (cofator * sinal * detTemp);
		}
		return (resposta);
	}
	
	
	public int determinante(){
		int ordem,det;

		ordem = this.retorneOrdem();
		det = 0;

		if(ordem > 0){
			switch (ordem) {
			    case 1:  det = this.detOrdem1(this);
				     break;
			    case 2:  det = this.detOrdem2(this);;
				     break;
			    default: det = this.detOrdemN(this);;
				     break;
			}
			
		}
		else{
			System.out.println("Matriz nao eh quadrada!! retornando 0");
		}

		return det;
	}
	
}
