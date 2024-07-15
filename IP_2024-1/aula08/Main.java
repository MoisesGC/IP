import java.util.Scanner; 

public class Main{

	public static void main(String[] args){
		
		System.out.println("Usando o objeto matriz!");
		int cont,chave;
		int chaveInd;
		
		Scanner entrada = new Scanner(System.in);
			
		//Matriz matAlunos = new Matriz(2,2);
		//Matriz mat01 = new Matriz(2,10);
		//Matriz mat02 = new Matriz(10,2);
		//Matriz mat03 = new Matriz(2,2);
		MatrizQuadrada matQuad = new MatrizQuadrada(5);
		//MatrizQuadrada matQuadpPequena = new MatrizQuadrada(2);
		
		matQuad.inicializaRandomico();
		matQuad.imprime();
		System.out.println("O determinante eh " + matQuad.detLaPlace());
		//matQuad.copiaMatrizGrandeParaMatrizPequena(matQuad,matQuadpPequena,0,1);
		//matQuadpPequena.imprime();
		
		//System.out.println(matQuad.detLaPlace());
		
		
		//mat01.inicializaRandomico();
		//mat01.imprime();
		//mat02.inicializaRandomico();
		//mat02.imprime();
		//mat02.multiplicaMatriz(mat01,mat02,mat03);
		//mat03.imprime();
		
		
		//matAlunos.inicializaRandomico();
		//matAlunos.imprime();
		//matAlunos.imprimeTransposta();
		/*System.out.println(matAlunos.busca(20));
		matAlunos.multiplicaPorEscalar(2);
		matAlunos.imprime();	*/
		
		//matQuad.imprime();
		//matQuad.inicializaRandomico();
		//matQuad.imprime();
		//matQuad.imprimeTransposta();
		//matQuad.setIdentidade();
		//matQuad.imprime();
		//System.out.println(matQuad.checkIdentidade());
		
		
		
		
	}

}

















