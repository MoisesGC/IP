public class Eletrico implements Motorizavel{

	private String zunido;
	
	Eletrico(){
		this.setZunido("... <silencio>...");
	}

	public String getZunido(){
		return this.zunido;
	}
	
	private void setZunido(String valor){
		this.zunido = valor;
	}
	
	
	public void ligar(){
		System.out.println(this.getZunido());
	}
	
	public void desligar(){
		;
	}
	
}	
