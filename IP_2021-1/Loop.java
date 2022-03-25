import java.util.Scanner;

public class Loop {

	public void imprimeAlgumasVezes(){
		
		boolean bandeira;
		int cont,fat;
		
		bandeira = true;
		cont = 0;
		
		/*while((cont < 10) ){	
			System.out.print(cont);	
			System.out.println(" - Dentro do loooppp...");		
			cont = cont + 1;
		} */
		
		fat = 1;
		for(cont =5; cont > 1; cont--){
			System.out.print(cont);	
			System.out.println(" - Dentro do loooppp...");	
			fat = fat * cont;
				
		}	
		System.out.println(fat);		 
				
	}
	
	
	
	public void contaVaquinhas(){
		Scanner teclado = new Scanner(System.in);
		int cont,peso,somaPeso;
		boolean balancaOk;
		
		
		System.out.println("Analisador de Peso de Bovinos!");
		System.out.println("Entre com o peso de 5 vaquinhas: "); 
		
		balancaOk = true;
		somaPeso = 0;
		cont = 0;
		while(((cont < 5) && balancaOk)){
			System.out.print("Entre com o peso " + cont + ":"); 
			peso = teclado.nextInt();
			if (peso > 400){
				balancaOk = false;
			}
			else{
				System.out.println(peso);
				somaPeso = somaPeso + peso;
			}	
			cont++;
		}
		if (balancaOk){
			System.out.println("O peso total foi:" + somaPeso);
		}
		else{ 	
			System.out.println("Balanca com defeito - leituras descartadas!!");
		}	 

	}

}
