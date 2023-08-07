public class Carro{

	private String placa;
	private boolean motor;
	private int velocidade;
	
	
	public String getPlaca(){
		return this.placa;
	}
	
	public void setPlaca(String novoValor){
		this.placa = novoValor;
	}
		
	public boolean getMotor(){
		return this.motor;
	}
	public void setMotor(boolean novoValor){
		this.motor = novoValor;
	}
	
	public int getVelocidade(){
		return this.velocidade;
	}
	public void setVelocidade(int novoValor){
		this.velocidade = novoValor;
	}
	
	public void acelera(){
		int temp;
		
		temp = this.getVelocidade();
		this.setVelocidade(temp + 10);	
		System.out.println("shhhhhhhhh");	
	
	}
	
	public void freia(){
		int temp;
		
		temp = this.getVelocidade();
		this.setVelocidade(temp - 10);	
		System.out.println("trtrsstrsrr");	
	
	}
	
	public void ignicao(){
		this.setMotor(true);
		System.out.println("VRRRUUUuuummmm");	
	}
	
}










