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

	
}	
