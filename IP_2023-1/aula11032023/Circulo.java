import java.lang.Math.*; 

public class Circulo{

	private float raio;
	
	public float getRaio(){
		return this.raio;
	}
	
	public void setRaio(float novoValor){
		this.raio = novoValor;
	}
	
	public float retornaArea(){
		float temp;
		temp = (float)Math.PI * (this.getRaio() * this.getRaio());
		return temp;	
	}
	
	public float retornaCircunferencia(){
		float temp;
		temp = 2.0f * (float)Math.PI * this.getRaio();
		return temp;	
	}
	
}
