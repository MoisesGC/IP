public class MotorEletrico implements Motorizavel{

	private boolean state;
	private float potencia;
	private String serial;
		
	MotorEletrico(String serialNovo){
		this(0.0f, serialNovo);
	}
	
	MotorEletrico(float valorPor, String novoSerial){
		this.setSerial(novoSerial);
		this.setState(false);
		this.setPotencia(valorPor);
	}
	
	
	public void setSerial(String valor){
		this.serial = valor;
	}
	
	public String getSerial(){
		return this.serial;
	}
	
	private void setState(boolean valor){
		this.state = valor;
	}
	
	public boolean getState(){
		return this.state;
	}
	
	private void setPotencia(float valor){
		this.potencia = valor;
	}
	
	public float getPotencia(){
		return this.potencia;
	}
	
	public void ativar(){
		this.setState(true);
	}
	
	public void desativar(){
		this.setState(false);
	}
	
	public void ligar(){
		this.ativar();
	}
	
	public void desligar(){
		this.desativar();
	}


}
