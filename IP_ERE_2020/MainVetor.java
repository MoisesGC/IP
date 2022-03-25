import java.util.Scanner;

public class MainVetor{

	public static void main(String[] args) {	
		    
		int cont, temp;
		Scanner ler = new Scanner(System.in);
		
		Vetor vetObj,vetObj2;
		vetObj = new Vetor(10);

		System.out.println("------------------");
		//vetObj.inicializaManual();
		vetObj.inicializaRandomico();
		vetObj.imprimir();
		vetObj.selectionSort();
		vetObj.imprimir();

		



		/*System.out.println("------------------");
		vetObj.somaComVetor(vetObj2);
		vetObj.imprimir();
		vetObj2.imprimir();
		vetObj.produtoComVetor(vetObj2);
		vetObj.imprimir();
		vetObj2.imprimir(); 

                temp = vetObj.produtoComVetor(vetObj2);
		System.out.println(temp);
                */   

	

			
	}
}
