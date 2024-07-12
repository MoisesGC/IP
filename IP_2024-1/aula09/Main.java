public class Main{
	
	public static void main(String[] args){
	
		System.out.println("Aula sobre Heranca e Interfaces");
		
		
		DuckEngine pato21 = new DuckEngine(5.0f);
		MotorEletrico byd222 = new MotorEletrico(20.0f, "XZAFA");
		Motor ea111= new Motor(10.0f, "12341","vrimmmmmmmm");
		Carro fuscao = new Carro("BLACK-01",pato21);
		fuscao.imprime();
	
		fuscao.ignicao();
		fuscao.acelerar();
		fuscao.acelerar();
		fuscao.freiar();
		fuscao.desliga();
		fuscao.freiar();
		fuscao.freiar();
	
	}


}
