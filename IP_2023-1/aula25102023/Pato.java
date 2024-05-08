public class Pato implements Motorizavel{

	private String quack;
	
	Pato(){
		this.setQuack("Quack quack quack..");
	}

	public String getQuack(){
		return this.quack;
	}
	
	private void setQuack(String valor){
		this.quack = valor;
	}
	
	
	public void ligar(){
		System.out.println(this.getQuack());
	}
	
	public void desligar(){
		;
	}
	
}	
