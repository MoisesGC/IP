import java.util.Scanner; 
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
	
	public void setTamanho(int novoTam){
		this.tamanho = novoTam;
	}
	
	
	public int getElemento(int index){
		return this.vet[index];
	}
	
	public void setElemento(int index, int novoValor){
		this.vet[index] = novoValor;
		this.imprime();
	}
	
	public boolean busca(int chave){
		boolean achou;
		int cont;
		achou = false;
		for(cont = 0;cont < this.getTamanho(); cont++){	
			if (this.getElemento(cont) == chave){
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
			if (this.getElemento(cont) == chave){
				achou = true;
			}		
			cont++;
		}
		
		return achou;
	}
	
	public void inicializaComValor(int valor){
		int cont;
		for(cont = 0; cont < this.getTamanho(); cont++){
			this.setElemento(cont,valor);
		}
	}
	
	public void inicializaManual(){
		int cont,entrada;
		Scanner ler = new Scanner(System.in);
		for(cont = 0; cont < this.getTamanho(); cont++){
			entrada = ler.nextInt();
			this.setElemento(cont,entrada);
		}
		ler.close();
	}
	
	public void inicializaRandomico(){
		int cont,entrada;
		Random gerador = new Random();
		for(cont = 0; cont < this.getTamanho(); cont++){
			entrada = gerador.nextInt(this.getTamanho() * 2);
			this.setElemento(cont,entrada);
		}
	}
	
	
	public void imprime(){
		int cont;
		//System.out.println();
		for(cont = 0; cont < this.getTamanho(); cont++){
			System.out.print(" "+this.getElemento(cont));
		}
		System.out.println();
	}
		
}	
