public class Carro{

	private String modelo;
	private Motor meuMotor;	
	
	Carro(String novoModelo, Motor novoMotor){
		this.setModelo(novoModelo);
		this.setMotor(novoMotor);
	}

	public String getModelo(){
		return this.modelo;
	}
	
	private void setModelo(String novoValor){
		this.modelo = novoValor;
	}

	public Motor getMotor(){
		return this.meuMotor;
	}
	
	public void setMotor(Motor novoMotor){
		this.meuMotor = novoMotor;
	}
	
	public void ignicao(){
		if(!this.getMotor().getEstado()){
			this.getMotor().setEstado(true);
		}
	}
	
	public void desligar(){
		if(this.getMotor().getEstado()){
			this.getMotor().setEstado(false);
		}	
	}
	
	public static void main(String[] args){
		System.out.println("Simulador de Carro!");
		//Scanner ler = new Scanner(System.in);
		
		Motor diablito = new Motor("V8",250);
		Carro fuscao = new Carro("Fusca 78", diablito);
		
		fuscao.ignicao();
		fuscao.ignicao();
		fuscao.ignicao();
		fuscao.desligar();
		fuscao.desligar();
		fuscao.desligar();
		
	}
	
			
}

class Motor{
	
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
