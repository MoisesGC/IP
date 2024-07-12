public class Carro{

	private String placa;
	//private boolean motor;
	private Motorizavel motor;
	private float velocidade;
	private float aceleracao;
	
	
	
	Carro(Motorizavel novoMotor){
		this("0000-00", novoMotor, 0.0f);
	}
	
	Carro(String novaPlaca, Motorizavel novoMotor){
		this(novaPlaca, novoMotor, 0.0f);
	}
	
	Carro(String novaPlaca, Motorizavel novoMotor, float valorVel){
		this.setPlaca(novaPlaca);
		this.setMotor(novoMotor);
		this.setVelocidade(valorVel);
		this.setAceleracao(this.getMotor().getPotencia());
	}
	
	
	public void setPlaca(String valor){
		this.placa = valor;
	}
	
	public String getPlaca(){
		return this.placa;
	}
	
	private void setMotor(Motorizavel motorNovo){
		this.motor = motorNovo;
	}
	
	public Motorizavel getMotor(){
		return this.motor;
	}
	
	private void setVelocidade(float valor){
		this.velocidade = valor;
	}
	
	public float getVelocidade(){
		return this.velocidade;
	}
	
	private void setAceleracao(float valor){
		this.aceleracao = valor;
	}
	
	public float getAceleracao(){
		return this.aceleracao;
	}
	
	public void ignicao(){
		this.getMotor().ligar();	
	}
	
	public void desliga(){
		this.getMotor().desligar();
	}
	
	public void acelerar(){
		if(this.getMotor().getState()){
			this.setVelocidade(this.getVelocidade() + this.getAceleracao());	
		}
		System.out.println(this.getVelocidade());
	}
	
	public void freiar(){
		if(this.getVelocidade() > 0.0f){
		
			if(this.getVelocidade() < this.getAceleracao()){
				this.setVelocidade(0.0f);	
			}
			else{
				this.setVelocidade(this.getVelocidade() - this.getAceleracao());
			}	
		}
		System.out.println(this.getVelocidade());
	}
	
	
	
	
	public void imprime(){
		System.out.println(this.getPlaca() + " " 
		                  +this.getMotor().getState() + " " 
		                  +this.getVelocidade() + " " 
		                  +this.getAceleracao() );
	}


}
