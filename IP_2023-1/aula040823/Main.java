public class Main{
	
	public static void main(String[] args){

		System.out.println("Ola pessoal!");
		
		Carro carro01;
		
		carro01 = new Carro();
		
		carro01.setPlaca("XXX-9999");
		carro01.setMotor(false);
		carro01.setVelocidade(0);
		
		System.out.println(carro01.getVelocidade());
		
		carro01.acelera();
		carro01.ignicao();
		
		System.out.println(carro01.getVelocidade());
		
		carro01.freia();
		
		
		System.out.println(carro01.getVelocidade());
		
		
		
		
	}

}
