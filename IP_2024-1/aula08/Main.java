import java.util.Scanner; 

public class Main{

	public static void main(String[] args){
		
		System.out.println("Usando o objeto matriz!");
		int cont,chave;
		int chaveInd;
		
		Scanner entrada = new Scanner(System.in);
			
		Matriz matAlunos = new Matriz(5,2);
		MatrizQuadrada matQuad = new MatrizQuadrada(3);
		
		matAlunos.inicializaRandomico();
		matAlunos.imprime();
		matAlunos.imprimeTransposta();
		/*System.out.println(matAlunos.busca(20));
		matAlunos.multiplicaPorEscalar(2);
		matAlunos.imprime();	*/
		
		matQuad.imprime();
		matQuad.inicializaRandomico();
		matQuad.imprime();
		matQuad.imprimeTransposta();
		//matQuad.setIdentidade();
		//matQuad.imprime();
		//System.out.println(matQuad.checkIdentidade());
		
	}

}

















