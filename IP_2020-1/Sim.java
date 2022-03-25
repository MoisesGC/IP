public class Sim{

	public static void main(String[] args){

		System.out.println("Simulador de Multas Detran");
		
		Carro carro01;		
		int limite, multa, condVeloc;

		limite = 60;
		multa = 0;

		carro01 = new Carro("Argo");
		
		carro01.setVelocidade(110);
		System.out.println(carro01.getVelocidade());

		/* Multa: Abaixo/Igual ao limite (60)  =  0;
			  acima de 60 a 80 = 100
			  acima de 80 a 100 = 200
			  acima de 100 = 500	
		*/
			
		condVeloc = carro01.getVelocidade();		
		if(condVeloc > limite){
			System.out.println("Condutor Infrator");		
			if (condVeloc <= 80){ 
				multa = 100;
			}
			else{
				if (condVeloc <= 100){
					multa = 200;
				}
				else{
					multa = 500;
				}
			}		
		}
		else{
			System.out.println("Condutor Ok!");
			multa = 0;
		}

		System.out.println("O valor da multa foi " + multa);

	}

}
