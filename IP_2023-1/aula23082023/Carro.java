public class Carro{

	private String modelo;
	private Motor meuMotor;	
	private float velocidade;
	
	Carro(String novoModelo, Motor novoMotor){
		this.setModelo(novoModelo);
		this.setMotor(novoMotor);
		this.setVelocidade(0.0f);
	}

	public String getModelo(){
		return this.modelo;
	}
	
	private void setModelo(String novoValor){
		this.modelo = novoValor;
	}

	public float getVelocidade(){
		return this.velocidade;
	}
	
	private void setVelocidade(float novoValor){
		this.velocidade = novoValor;
	}

	public Motor getMotor(){
		return this.meuMotor;
	}
	
	public void setMotor(Motor novoMotor){
		this.meuMotor = novoMotor;
	}
	
	public void ignicao(){
		if(!this.getMotor().getEstado()){
			this.getMotor().setEstado(true);
		}
	}
	
	public void desligar(){
		if(this.getMotor().getEstado()){
			this.getMotor().setEstado(false);
		}	
	}
	
	public void acelera(){
		float temp;
		if(this.getMotor().getEstado()){
			temp = (float)this.getMotor().getPotencia()/(10.0f) + this.getVelocidade(); 
			this.setVelocidade(temp);
		}
		this.imprimeVelocidade();
	}

	public void freia(){
		float velAtual;
		float capFrenagem = 10.0f;
		velAtual = this.getVelocidade();
		if( velAtual > capFrenagem ){
			velAtual = velAtual - 10.0f;
			this.setVelocidade(velAtual);
		}
		else{
			this.setVelocidade(0.0f);
		}
		this.imprimeVelocidade();
	}
	
	
	public void imprimeVelocidade(){
		System.out.println("Velocidade Atual:\t " + this.getVelocidade());
	}
	
			
}
