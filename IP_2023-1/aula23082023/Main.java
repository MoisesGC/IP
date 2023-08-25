import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		System.out.println("Simulador de Carro!");
		Scanner ler = new Scanner(System.in);
		int cont, leitura;
		
		Motor diablito = new Motor("V8",250);
		Motor marceleto = new Motor("EA11",100);
		Carro fuscao = new Carro("Fusca 78", diablito);
		cont = 0;
		leitura = 0;
		while((cont < 10 )&&(leitura != 10)){
			System.out.println("no loop....digite um numero");
			leitura = ler.nextInt();
			cont = cont + 1;
		}
		System.out.println("Saiu do loop....");
		
		
		
		
		/*fuscao.ignicao();
		fuscao.acelera();
		fuscao.acelera();
		fuscao.acelera();
		fuscao.freia();
		fuscao.freia();
		fuscao.desligar();
		fuscao.acelera();
		fuscao.acelera();
		fuscao.freia();
		fuscao.freia();
		fuscao.freia();
		fuscao.freia();
		fuscao.freia();
		fuscao.freia();
		*/
		
		/*fuscao.ignicao();
		fuscao.acelera();
		fuscao.acelera();
		fuscao.acelera();
		fuscao.setMotor(marceleto);
		fuscao.ignicao();
		fuscao.acelera();
		fuscao.acelera();
		*/
		
	}

}

