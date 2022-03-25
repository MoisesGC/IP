public class Primo {

	
	public void imprimeSomaPrimosIntervalo(int inicio, int fim){
		int cont,acum;
	
		acum = 0;
		for(cont = inicio; cont <= fim; cont++){    // seleciona intervalo
			if (this.ehPrimo(cont)){            // indentifica o primo
				System.out.println(cont);
				acum = acum + cont;
			}			
		}
		System.out.println("A soma dos primos do intervalo eh " + acum);
	}
	
	

	public boolean ehPrimo(int numero){
		int cont, contDivInt;
		boolean ehPrimo;
		
		ehPrimo = true;
		contDivInt = 0;
	
		cont = 2;
		while((cont < numero) && ehPrimo) {
		    	if ((numero % cont) == 0){
		        	ehPrimo = false;        
		    	}	
			cont++;
		}
		
		return ehPrimo;	
	}
	
	
	public void imprimeSeEhPrimo(int numero){
	
		if(this.ehPrimo(numero)){
			System.out.println(numero + " eh numero primo!");
		}
		else{
			System.out.println(numero + " nao eh numero primo!");
		}	
	}
	
		
}
