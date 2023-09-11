import java.util.Random;

public class Vetor{

	private int[] vet;
	private int tamanho;
	
	Vetor(){
		this.setTamanho(5);
		vet = new int[this.getTamanho()];
		this.inicializa(-1);
	}
	
	Vetor(int tamInicial){
		this.setTamanho(tamInicial);
		vet = new int[this.getTamanho()];
		this.inicializa(-1);
	}
	
	
	public int getTamanho(){
		return this.tamanho;
	}
	
	private void setTamanho(int novoValor){
		this.tamanho = novoValor;
	}
	
	public int getElemento(int index){
		int resp;
		resp = -1;  //retorna -1 no caso de index invalido
		if((index < this.getTamanho()) && (index >=0)){
			resp = this.vet[index];
		}
		else{
			System.out.println("Get com index errado!");
		}	
		return resp;
	}
	
	public void setElemento(int index, int novoValor){
		if((index < this.getTamanho()) && (index >=0)){
			this.vet[index] = novoValor;
		}
		else{
			System.out.println("Set com index errado!");
		}	
	}
	
	public void imprime(){
		int cont;
		for(cont = 0; cont < this.getTamanho(); cont++){
			System.out.print(this.getElemento(cont)+" ");
		}
		System.out.println();
	}
	
	public void inicializa(int valor){
		int cont;
		for(cont = 0; cont < this.getTamanho(); cont++){	
			this.setElemento(cont, valor);
		}
	}
	
	public void inicializaRandom(){
		int cont;
		int valor;
		Random gerador = new Random();
		for(cont = 0; cont < this.getTamanho(); cont++){
			valor = gerador.nextInt(this.getTamanho() * 2);	
			this.setElemento(cont, valor);
		}
	}
	
	public boolean busca(int chave){
		boolean achou;
		int cont;
		
		achou = false;
		for(cont = 0; cont < this.getTamanho(); cont++){	
			if(chave == this.getElemento(cont)){
				achou = true;
			}
		}		
		return achou;
	}
	
	public boolean buscaV2(int chave){
		boolean achou;
		int cont;		
		achou = false;
		cont = 0;
		while((cont < this.getTamanho()) && !achou){	
			if(chave == this.getElemento(cont)){
				achou = true;
			}
			cont++;
		}		
		return achou;
	}

}





