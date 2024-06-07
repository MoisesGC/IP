import java.util.Scanner; 

public class Numero{

	public void somaLeituras(){
		int entrada,cont,acumulador;	
		Scanner ler = new Scanner(System.in);
				
		acumulador = 0;
		cont = 0;	
		while(cont < 5){
			entrada = ler.nextInt();
			acumulador = acumulador + entrada;
			cont++;
		}
		System.out.println(acumulador);
	}

	public void somaLeiturasV2(){
		int entrada,cont,acumulador;	
		Scanner ler = new Scanner(System.in);			
		acumulador = 0;
		for(cont = 0; cont < 5; cont++){
			entrada = ler.nextInt();
			acumulador = acumulador + entrada;
		}
		System.out.println(acumulador);
	}
	
	public void somaLeiturasV3(){
		int entrada,cont,acumulador;
		boolean numPositivo;	
		Scanner ler = new Scanner(System.in);			
		acumulador = 0;
		numPositivo = true;
		cont = 0;	
		while((cont < 5) && numPositivo){
			entrada = ler.nextInt();
			if(entrada >= 0){
				acumulador = acumulador + entrada;
			}
			else{
				numPositivo = false;
			}
			cont++;
		}
		System.out.println(acumulador);
	}
	
	
	public void somaPrimos(){
		int numero,somaPrimos;
		boolean leituraOk;
		Scanner ler = new Scanner(System.in);	
		somaPrimos = 0;
		leituraOk = true;	
		while(leituraOk){
			numero = ler.nextInt();
			if(numero > 0){
				if(ehPrimo(numero)){		
					somaPrimos = somaPrimos + numero;			
				}
			}
			else{
				leituraOk = false;			
			}
		}
		System.out.println(somaPrimos);
	}	
	
	public boolean ehPrimo(int numeroCandidato){
		boolean flagPrimo;
		int restoDiv,divisor;		
		flagPrimo = true;		
		divisor = 2;
		if(numeroCandidato != 1){
			while((divisor < numeroCandidato) && (flagPrimo)){
				restoDiv = numeroCandidato % divisor;
				if(restoDiv == 0){
					flagPrimo = false;
				}
				divisor++;
			}
		}	
		else{
			flagPrimo = false;
		}	
		return flagPrimo;
	}

}	
	
/*	
	somaPrimos(): void
	inicio
		int numero,somaPrimos;
		boolean leituraOk;
		somaPrimos = 0;
		leituraOk = true;	
		enquanto(leituraOk){
			ler(numero);
			se(numero > 0){
				se(ehPrimo(numero)){		
					somaPrimos = somaPrimos + numero;			
				}
			}
			senao{
				leituraOk = false;			
			}
		}
		imprima(somaPrimos);
	fim	
	
	ehPrimo(int numeroCandidato): boolean
	inicio
		boolean flagPrimo;
		int restoDiv,divisor;		
		flagPrimo = true;		
		divisor = 2;
		
		se(numeroCandidato != 1){
			enquanto ((divisor < numeroCandidato) E (flagPrimo)){
				restoDiv = resto(numeroCandidato,divisor);
				se(restoDiv == 0){
					flagPrimo = false;
				}
				divisor++;
			}
		}	
		else{
			flagPrimo = false;
		}	
		retorne flagPrimo;
	fim.
	
*/
	


