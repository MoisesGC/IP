import java.util.Scanner;

public class MainVetor{

	public static void main(String[] args) {	
		    
		int cont, temp;
		Scanner ler = new Scanner(System.in);
	
		Vetor vetObj;
		vetObj = new Vetor(10);
		System.out.println("------------------");
		vetObj.imprimir();
		
		//vetObj.inicializaManual();
		vetObj.inicializaRandomico();
		
		vetObj.imprimir();
		vetObj.insertionSortBeta();
		vetObj.imprimir();

			
	}
}
