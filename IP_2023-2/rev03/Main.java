public class Main{

	public static void main(String[] args){
	
	
		System.out.println("Aula de Revisao - O3");
		
		Matriz mat = new Matriz(3,3);
		Matriz mat2 = new Matriz(3,3);
		//mat.imprime();
		//mat.inicializaComValor(1);
		//mat.imprime();
		mat.inicializaRandom();
		mat.imprime();
		//mat.dividePorNumero(2);
		//mat.multiplicaPorNumero(2);
		//mat.imprime();
		//mat.somaComNumero(5);
		//mat.imprime();
		//mat.subtracaoComNumero(5);
		//mat.imprime();
		//mat.dividePorNumero(2);
		//mat.multiplicaPorNumero(2);
		//mat.imprime();
		mat2.inicializaRandom();
		mat2.imprime();
		mat.somaComMatriz(mat2);
		mat.imprime();
	}


}
