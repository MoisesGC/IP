import java.util.Scanner; 

public class Math{

	public void conversaoC2F(){
		float tempC,tempF;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius!");		
		tempC = ler.nextFloat();
		tempF = ((tempC * (9.0f/5.0f)) + 32.0f);
		System.out.println("A resposta eh");	
		System.out.println(tempF);		
	}
	

}
