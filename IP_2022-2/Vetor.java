import java.util.Random;
public class Vetor{

	private int[] vet;
	private int tamanho;
	
	Vetor(){
		this.setTamanho(5);
		vet = new int[this.getTamanho()];
	}
	
	Vetor(int novoTamanho){
		this.setTamanho(novoTamanho);
		vet = new int[this.getTamanho()];
	}
	
	
	public int getTamanho(){
		return this.tamanho;
	}


	private void setTamanho(int novoTamanho){
		 this.tamanho = novoTamanho;
	}
	
	public int getElemento(int index){
		return this.vet[index];
	}


	public void setElemento(int index, int novoValor){
		 this.vet[index] = novoValor;
	}
	
	public void inicializaComValor(int valor){
		int cont;
		for(cont = 0;cont < this.getTamanho(); cont++){
			this.setElemento(cont,valor);
		}	
	}
	
	public void inicializaRandomico(){
		int cont,numRandomico;
		Random gerador = new Random();
		for(cont = 0;cont < this.getTamanho(); cont++){
			numRandomico = gerador.nextInt(this.getTamanho()*2);
			this.setElemento(cont,numRandomico);
		}	
	}
	
	public void inicializaCrescente(){
		int cont;
		for(cont = 0;cont < this.getTamanho(); cont++){
			this.setElemento(cont,cont);
		}	
	}
	
	public void shuffle(){
		int numRand1, numRand2,cont;
		Random gerador = new Random();
		for(cont = 0;cont < this.getTamanho(); cont++){
			numRand1 = gerador.nextInt(this.getTamanho());
			numRand2 = gerador.nextInt(this.getTamanho());
			this.trocaValores(numRand1,numRand2);
		}
	}
	
	public void trocaValores(int index1, int index2){
		int temp;
		temp = this.getElemento(index1);
		this.setElemento(index1, this.getElemento(index2));
		this.setElemento(index2, temp);
	}


	public int contaNumerosPrimos(boolean otimiza){
		int cont,contNumPrimos;
		
		contNumPrimos = 0;	
		for(cont = 0;cont < this.getTamanho(); cont++){
			if (otimiza){
				if(this.ehPrimoOptimal(this.getElemento(cont))){
					contNumPrimos++;
				}
			}
			else{
				if(this.ehPrimoNaive(this.getElemento(cont))){
					contNumPrimos++;
				}
			}	
		}			
		return contNumPrimos;
	}

	public boolean ehPrimoNaive(int num){
		boolean primo;
		int cont;
		if (num < 2){
			primo = false;
		}	
		else{
			primo = true;
			cont = 2;
			while(cont < num){
				if ((num % cont) == 0){
			     		primo = false;
				}  
				cont++;
			}
		}
		
		//if(primo){
		//	System.out.println(num);
		//}			 
		return primo;
	}
	
	public boolean ehPrimoOptimal(int num){
		boolean primo;
		int cont;
		if (num < 2){
			primo = false;
		}	
		else{
			primo = true;
			cont = 2;
			while((cont < num)&& primo){
				if ((num % cont) == 0){
			     		primo = false;
				}  
				cont++;
			}
		}
		
		//if(primo){
		//	System.out.println(num);
		//}			 
		return primo;
	}


	public void comparaValores(Vetor outro){
		int contOutro, contEste;
		int cont;
		
		contOutro = 0;
		contEste = 0;
		for(cont = 0;cont < this.getTamanho(); cont++){
			if (this.getElemento(cont) > outro.getElemento(cont)){
				contEste++;
			}
			else{
				contOutro++;
			}
		}
		System.out.println("Este vetor venceu " + contEste + " vezes e perdeu "+ contOutro + " vezes");	
			
	}


	public void imprime(){
		int cont;
		
		for(cont = 0;cont < this.getTamanho(); cont++){
			System.out.print(this.getElemento(cont)+" ");
		}
		System.out.println();		
	}


}
