public class Utilitario extends Carro{

	private int carga;
	
	Utilitario(String nPlaca, String nModelo, Motorizavel nMotor, int nCarga){
		super(nPlaca, nModelo, nMotor);
		this.setCarga(nCarga);	
	}
		
	public int getCarga(){
		return this.carga;
	}
	
	public void setCarga(int valor){
		this.carga = valor;
	}
	
	public void imprime(){
		/*System.out.println("\n" +
			this.getPlaca() +"  "+ 
			this.getModelo() +"  "+ 
			this.getMotor() + "  "+
			this.getCarga()
		);*/
		super.imprime();
		System.out.println(this.getCarga());
	
	}
	
	

}
