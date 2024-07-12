public class DuckEngine implements Motorizavel{

	private boolean acordado;
	private float potencia;
	private String serial;
		
	DuckEngine(){
		this(0.0f);
	}
	
	DuckEngine(float valorPor){
		this.setAcordado(false);
		this.setPotencia(valorPor);
	}
		
	private void setAcordado(boolean valor){
		this.acordado = valor;
	}
	
	public boolean getAcordado(){
		return this.acordado;
	}
	
	private void setPotencia(float valor){
		this.potencia = valor;
	}
	
	public float getPotencia(){
		return this.potencia;
	}
	
	public boolean getState(){
		return this.getAcordado();
	}
	
	public void acordar(){
		this.setAcordado(true);
		System.out.println("QUACK, QUACK, QUACK....");
	}
	
	public void aMimir(){
		this.setAcordado(false);
		System.out.println("quack, squick, ..");
	}
	
	public void ligar(){
		this.acordar();
	}
	
	public void desligar(){
		this.aMimir();
	}


}
