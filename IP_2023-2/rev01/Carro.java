public class Carro{
	
	private String modelo;
	private int anoFabricacao;
	private char cor;
	
	Carro(String novoModelo, int anoFab, char novaCor){
		this.setModelo(novoModelo);
		this.setAnoFabricacao(anoFab);
		this.setCor(novaCor);
	}
	
	
	public String getModelo(){
		return this.modelo;
	}
	
	private void setModelo(String novoValor){
		 this.modelo = novoValor;
	}
	
	public int getAnoFabricacao(){
		return this.anoFabricacao;
	}
	
	private void setAnoFabricacao(int novoValor){
		 this.anoFabricacao = novoValor;
	}
	
	public char getCor(){
		return this.cor;
	}
	
	public void setCor(char novoValor){
		 this.cor = novoValor;
	}
	
	public void imprime(){
		System.out.println(this.getModelo() + " " + this.getAnoFabricacao() + " " + this.getCor());
	}
	
	public void comparaCarro(Carro car01, Carro car02){
	
		System.out.print("O carro mais novo tem os seguintes atributos:");
		if(car01.getAnoFabricacao() > car02.getAnoFabricacao()){
			System.out.println(car01.getModelo() + " " + car01.getCor());
		}
		else{
			System.out.println(car02.getModelo() + " " + car02.getCor());
		}
		
	
	}


}

