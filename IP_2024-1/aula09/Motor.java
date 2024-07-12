public class Motor implements Motorizavel{

	private boolean state;
	private float potencia;
	private String serial;
	private String ronco;
	
	
	Motor(String serialNovo){
		this(0.0f, serialNovo, "......");
	}
	
	Motor(float valorPor, String novoSerial, String ronco){
		this.setSerial(novoSerial);
		this.setState(false);
		this.setPotencia(valorPor);
		this.setRonco(ronco);
	}
	
	
	public void setSerial(String valor){
		this.serial = valor;
	}
	
	public String getSerial(){
		return this.serial;
	}
	
	
	public void setRonco(String valor){
		this.ronco = valor;
	}
	
	public String getRonco(){
		return this.ronco;
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
	
	public void ligar(){
		this.setState(true);
		System.out.println(this.getRonco());
	}
	
	public void desligar(){
		this.setState(false);
		System.out.println("..........");
	}


}
