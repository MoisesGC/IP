public class Vetor{

	private int[] vet;
	private int tamanho;
	
	Vetor(){
		this.setTamanho(5);
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
		return this.vet[index];
	}
	
	public void setElemento(int index, int novoValor){
		this.vet[index] = novoValor;
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

}





