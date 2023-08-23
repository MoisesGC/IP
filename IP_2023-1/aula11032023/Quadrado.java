public class Quadrado{

	private int lado;
	
	
	Quadrado(int novoValor){
		this.setLado(novoValor);
	}
	
	public int getLado(){
		return this.lado;
	}
	
	private void setLado(int novoValor){
		this.lado = novoValor;
	}
	
	public int retornaArea(){
		int temp;
		temp = this.getLado() * this.getLado();
		return temp;	
	}
	
}
