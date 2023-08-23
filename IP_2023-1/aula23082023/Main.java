import java.util.Scanner;

public class Main{
	
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

