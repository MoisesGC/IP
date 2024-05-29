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

}
