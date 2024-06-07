public class Main{

	public static void main(String[] args){
		System.out.println("Aula de Comandos de Repeticao");
		
		Numero num1;		
		num1 = new Numero();		
		num1.somaPrimos();
			
	}
}

/*
Somando5Leituras(): vazio
Inicio
	int entrada,cont,acumulador;	
	acumulador = 0;
	cont = 0;
	enquanto(cont < 5){
		leia(entrada);
		acumulador = acumulador + entrada;
		cont++;
	}	
	imprima(acumulador);
Fim.

Somando5Leiturasv2(): vazio
Inicio
	int entrada,cont,acumulador;	
	acumulador = 0;
	para (cont = 0 ate 5){
		leia(entrada);
		acumulador = acumulador + entrada;
	}	
	imprima(acumulador);
Fim.

Somando5Leiturasv3(): vazio
Inicio
	int entrada,cont,acumulador;
	boolean numPositivo;	
	acumulador = 0;
	numPositivo = true;
	cont = 0;
	enquanto((cont < 5) && numPositivo){
		leia(entrada);
		se(entrada >=0){
			acumulador = acumulador + entrada;
		}
		senao{
			numPositivo = false;
		}
		cont++;
	}	
	imprima(acumulador);
Fim.




*/
