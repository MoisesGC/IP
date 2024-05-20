public class Tartaruga{

	private float tamanhoInicial;
	private float velocidadeCrescimento;
	
	Tartaruga(float tamInicial, float velCres){
		this.setTamanhoInicial(tamInicial);
		this.setVelocidadeCrescimento(velCres);
	}


	public float getTamanhoInicial(){
		return this.tamanhoInicial;		
	}
	
	
	public void setTamanhoInicial(float valorInicial){
		this.tamanhoInicial = valorInicial;
	}
	
	public float getVelocidadeCrescimento(){
		return this.velocidadeCrescimento;		
	}
	
	
	public void setVelocidadeCrescimento(float valorInicial){
		this.velocidadeCrescimento = valorInicial;
	}

	public void calculaTempoParaTamanhoIgual(Tartaruga outra){
		float tempo;
		
		tempo = (outra.getTamanhoInicial() - this.getTamanhoInicial()) / 
		        (this.getVelocidadeCrescimento() - outra.getVelocidadeCrescimento());
		        
		System.out.println(tempo);       
	
	}



}
