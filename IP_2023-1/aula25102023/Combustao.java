public class Combustao implements Motorizavel{

	private String som;
	
	Combustao(){
		this.setSom("VRUMMMMMMMM");
	}

	public String getSom(){
		return this.som;
	}
	
	private void setSom(String valor){
		this.som = valor;
	}
	
	
	public void ligar(){
		System.out.println(this.getSom());
	}
	
	public void desligar(){
		;
	}
	
}	
