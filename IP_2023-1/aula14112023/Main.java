import java.util.Scanner;
public class Main{

	public static void main(String[] args){
		System.out.println("Sistema do Detran-AM");
		Scanner ler = new Scanner(System.in);
		float leituraMotora;
		
		CurujaDetran curuja01 = new CurujaDetran();
		
		curuja01.setVelocidadeMaxima(60.0f);
		System.out.println("Digite a velocidade aferida:");
		leituraMotora = ler.nextFloat();
		curuja01.setVelocidadeAferida(leituraMotora);
		
		curuja01.avaliaLeitura();
	
	}

}
