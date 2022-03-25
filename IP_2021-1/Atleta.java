import java.util.Scanner;

public class Atleta{

	private float peso;
	private float altura;
	
	
	Atleta(float pesoIni, float alturaIni){
		this.setPeso(pesoIni);
		this.setAltura(alturaIni);
	}	
			
	public float getPeso(){
		return this.peso;
	}
	
	public void setPeso(float novoPeso){
		this.peso = novoPeso;
	}
	
	public float getAltura(){
		return this.altura;
	}
	
	private void setAltura(float novoAltura){
		this.altura = novoAltura;
	}
	
	public void comparaAltura(Atleta outro){
		if(this.getAltura() > outro.getAltura()){
			System.out.println("O atleta mais alto tem " + this.getAltura());
					
		}
		else{
			System.out.println("O atleta mais alto tem " + outro.getAltura());
		}	
	}

	public float IMC() {
    		return (this.getPeso() / (this.getAltura() * this.getAltura()));
  	}
  	
  	public void imprimeIMC(){
  		System.out.println(this.IMC());
  	}
  	


	public static void main(String[] args){
		System.out.println("Sistema Olimpico");
		
		Atleta runner1, runner2;
		Scanner ler = new Scanner(System.in);
		float peso1,peso2,altura1,altura2;
		
		peso1 = ler.nextFloat();
		altura1 = ler.nextFloat();
		peso2 = ler.nextFloat();
		altura2 = ler.nextFloat();
					
		runner1 = new Atleta(peso1,altura1);
		runner2 = new Atleta(peso2,altura2);
		
		runner1.comparaAltura(runner2);
		runner2.comparaAltura(runner1);	
		
		runner1.imprimeIMC();
		runner2.imprimeIMC();
	}
	
	

}
