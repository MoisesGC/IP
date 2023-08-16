public class Quadrado{

	private int lado;
	
	public int getLado(){
		return this.lado;
	}
	
	public void setLado(int novoValor){
		this.lado = novoValor;
	}
	
	public int retornaArea(){
		int temp;
		temp = this.getLado() * this.getLado();
		return temp;	
	}
	
}
