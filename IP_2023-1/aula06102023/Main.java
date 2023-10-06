import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		System.out.println("Teste do Objeto Matriz");
        	//Scanner ler = new Scanner(System.in);
         	Matriz mat1 = new Matriz(6);
         	mat1.inicializa(2);
         	//mat1.imprime();
        	mat1.inicializaRandom();
        	mat1.imprime();
        	//mat1.imprimeTransposta();
        	System.out.println();
        	mat1.imprimeSetorSuperior();
        	System.out.println();
        	mat1.imprimeSetorInferior();
        	System.out.println();
        	mat1.imprimeDiagonalPrincipal();
        	mat1.imprimeDiagonalInvertida();
        	
        }
}        	
