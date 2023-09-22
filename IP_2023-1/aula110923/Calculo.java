import java.util.Scanner;

public class Calculo{


	/*
	criar um metodo que 
	
	1 - le a quantidade de bois que passarao pela balanca
	2 - ao final da leitura
		- imprime o maior peso lido 
		- imprime o menor peso lido
		- imprime o somatorio dos pesos lidos
		- imprime a media aritmetica dos pesos lidos
		
	Todavia.... se for lido um peso maior que 800 ou menor que 500, 
		 - o peso lido nao deve ser contado
		 - imprimir as estatisticas que foram computadas ate o momento	
	
	*/
	
	
	public void fazendoEstatisticasToya(){
		int cont, pesoBoi, acumPeso, menorPeso, maiorPeso, numBois;
		boolean leituraInvalida;
		float mediaPeso;
		
		Scanner ler = new Scanner(System.in);	
		System.out.print("Digite a quantidade de bois a serem pesados: ");
		numBois = ler.nextInt();
		System.out.println();
		menorPeso = 0;
		maiorPeso = 0;
		acumPeso = 0;
		mediaPeso = 0.0f;
		
		leituraInvalida = false;
		cont = 0;
		while((cont < numBois)&&(!leituraInvalida)){
			pesoBoi = ler.nextInt();
			if((pesoBoi > 800)||(pesoBoi < 500)){
				leituraInvalida = true;
			}
			else{
				if(cont == 0){
					menorPeso = pesoBoi;
					maiorPeso = pesoBoi;
					acumPeso = pesoBoi;
				
				}
				else{	
					acumPeso = acumPeso + pesoBoi;		
					if(pesoBoi < menorPeso){
						menorPeso = pesoBoi;
					}
					else{
						if(pesoBoi > maiorPeso){
							maiorPeso = pesoBoi;
						}
					}
				}
				cont++;	
			}		
		}
		
		if(cont > 0){
			mediaPeso = ((float)acumPeso)/((float)numBois);
			System.out.println( "\nSomatorio: " + acumPeso  +
					    "\nMedia: " + mediaPeso  +
					    "\nMaior: " + maiorPeso  +
					    "\nMenor: " + menorPeso );
		}
		else{
			System.out.println("Nenhuma leitura valida foi feita!!");
		}			    
			
		ler.close();
	
	
	}
	
	
	public void fazendoEstatisticas(){
		int cont, num, acum, menor, maior;
		float media;
		
		Scanner ler = new Scanner(System.in);
		num = 0;	
		
		num = ler.nextInt();
		menor = num;
		maior = num;
		acum = num;
		
		for(cont = 1; cont < 10; cont++){	
			num = ler.nextInt();		
			acum = acum + num;		
			if(num < menor){
				menor = num;
			}
			else{
				if(num > maior){
					maior = num;
				}
			}			
		}
		
		media = ((float)acum)/10.0f;
		
		System.out.println( "\nSomatorio: " + acum  +
				    "\nMedia: " + media  +
				    "\nMaior: " + maior  +
				    "\nMenor: " + menor );
		
		ler.close();
	}
	
	public void imprimeSoma(int a, int b){
		int temp;
		temp = a + b;
	
		System.out.println(temp);
	}
	
	public void imprimeMultiplicacao(int a, int b){
		int temp;
		temp = a * b;
	
		System.out.println(temp);
	}
	
	public void imprimeDivisao(int a, int b){
		int temp;
		temp = a / b;
	
		System.out.println(temp);
	}
	
	public void imprimeConversaoCelToFareh(float tempCelsius){
		float tempFareh;
		tempFareh = (tempCelsius * 1.8f) + 32.0f;
	
		System.out.println(tempFareh);
	}
	
	
	public int fatorial(int n){
		int resp;
		/*
		fat(N)
		
		n = 0  - fat(0) = 1;	
		n = 1  - fat(1) = 1;		
		n = N  - fat(N) = N * fat(N-1);	
		*/	
		if((n == 0)||(n == 1)){
			System.out.println(n);
			resp = 1;
		}
		else{
			System.out.println(n);
			resp = n * fatorial(n-1);
		
		}	
		return resp;
	}
	
	
	
	
	
	






}
