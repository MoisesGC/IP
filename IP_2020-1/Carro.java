public class Carro{

	private String modelo;
	private int velocidade;

	/* gets and sets */
	
	
	Carro(){
		this.setModelo("Gol");
		this.setVelocidade(0);	
	}	

	Carro(String modeloFab){
		this.setModelo(modeloFab);
		this.setVelocidade(0);
	}

	public String getModelo(){
		return this.modelo;
	}
	
	private void setModelo(String novoModelo){
		this.modelo = novoModelo;
	} 

	public int getVelocidade(){
		return this.velocidade;	
	}

	public void setVelocidade(int velocidadeAtual){
		this.velocidade = velocidadeAtual;
	}

	/* end of gets and sets */
		
}
