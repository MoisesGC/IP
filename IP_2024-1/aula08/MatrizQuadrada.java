public class MatrizQuadrada extends Matriz{

	
	MatrizQuadrada(){
		super(3,3);
	}
	
	MatrizQuadrada(int ordem){
		super(ordem,ordem);
	}
	
	
	public int getOrdem(){
		return this.getNumLinhas();
	}
	
	
	public void copiaMatrizGrandeParaMatrizPequena(MatrizQuadrada matGrande, MatrizQuadrada matPequena, int linhaProibida, int colunaProibida){

		int contLG,contCG,contLP,contCP;
		contLP = 0;	
		for(contLG =0; contLG < matGrande.getOrdem(); contLG++){
			if(contLG != linhaProibida){
				contCP = 0;
				for(contCG =0; contCG < matGrande.getOrdem(); contCG++){
					if(contCG != colunaProibida){	
								matPequena.setElemento(contLP,contCP,matGrande.getElemento(contLG, contCG));
						contCP++;
					}
				}
				contLP++;
			}
		}
	
	}
	
	public float detLaPlaceRecursivo(MatrizQuadrada mat){
		MatrizQuadrada matLinha = new MatrizQuadrada(mat.getOrdem()-1);	
		
		float acum = 0.0f;
		int linha = 0;
		int contColuna;
		for(contColuna = 0; contColuna < mat.getOrdem(); contColuna++){	
			matLinha.copiaMatrizGrandeParaMatrizPequena(mat,matLinha,linha,contColuna);
			System.out.println(linha + " , " + contColuna);
			matLinha.imprime();
			acum = acum +
			      (float)( mat.getElemento(linha,contColuna) *
			        Math.pow(-1, linha+contColuna) *
			        detLaPlace(matLinha));
		}	
		return acum;	
	}
	
	public float detLaPlace(MatrizQuadrada mat){
	
		int contOrdem;
		float resultado = 0;
	
		if(mat.getOrdem() == 1){
			resultado = mat.getElemento(0,0);
		}
		else{
			resultado = mat.detLaPlaceRecursivo(mat);
		}
		
		return resultado;
	}
	
	public float detLaPlace(){
		return this.detLaPlace(this);
	}



	
}	
