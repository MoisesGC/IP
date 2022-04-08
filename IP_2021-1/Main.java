public class Main{

	public static void main(String args[]){	
	
		Matriz mat1,mat2;
		int detResposta;
		
		mat1 = new Matriz(6,6);
		
		mat1.inicializaRandomico();
		mat1.imprime();
		detResposta = mat1.determinante();
		System.out.println(detResposta);
		
	

				
	}		

}
