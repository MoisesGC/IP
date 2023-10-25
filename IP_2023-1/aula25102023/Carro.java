public class Carro{

	private String placa;
	private String modelo;
	private Motorizavel motor;
	private int kilometragem;
	
	
	Carro (String nPlaca, String nModelo, Motorizavel nMotor){
		this.setPlaca(nPlaca);
		this.setModelo(nModelo);
		this.setMotor(nMotor);
		this.setKilometragem(0);
	}
	

	public String getPlaca(){
		return this.placa;
	}
	
	public void setPlaca(String valor){
		this.placa = valor;
	}
	
	public String getModelo(){
		return this.modelo;
	}
	
	public void setModelo(String valor){
		this.modelo = valor;
	}
	
	
	public Motorizavel getMotor(){
		return this.motor;
	}
	
	public void setMotor(Motorizavel valor){
		this.motor = valor;
	}
	
	public int getKilometragem(){
		return this.kilometragem;
	}
	
	public void setKilometragem(int valor){
		this.kilometragem = valor;
	}
	
	public void imprimeMenorKM(Carro carro01, Carro carro02){
		if(carro01.getKilometragem() < carro02.getKilometragem()){
			System.out.println(carro01.getPlaca());
		}
		else{
			System.out.println(carro02.getPlaca());
		}	
	}
	
	public void darIgnicao(){
		getMotor().ligar();
	}
	
	public void imprime(){
		System.out.println("\n" +
			this.getPlaca() +"  "+ 
			this.getModelo() +"  "+ 
			this.getKilometragem()
		);
	}
	
	
	

}


