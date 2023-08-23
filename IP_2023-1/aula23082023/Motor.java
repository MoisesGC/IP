public class Motor{
	
	private String modelo;
	private int potencia;
	private boolean estado;	
	
	Motor(String novoModelo, int novaPotencia){
		this.setModelo(novoModelo);
		this.setPotencia(novaPotencia);
		this.setEstado(false);
	}

	public String getModelo(){
		return this.modelo;
	}
	
	private void setModelo(String novoValor){
		this.modelo = novoValor;
	}

	public int getPotencia(){
		return this.potencia;
	}
	
	public void setPotencia(int novoValor){
		this.potencia = novoValor;
	}
	
	public boolean getEstado(){
		return this.estado;
	}
	
	public void setEstado(boolean novoValor){
		this.estado = novoValor;
		if (this.getEstado()){
			System.out.println("VRRRRUUUMMMM");
		}
		else{
			System.out.println("vrimm.......");
		}
	}	
	
}
