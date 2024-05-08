public class Main{

	public static void main(String[] args){
		System.out.println("Teste de Heranca e Polimorfismo");
		
		Combustao v8 = new Combustao();
		Eletrico pwT = new Eletrico();
		Pato donald = new Pato();
		
		Carro car = new Carro("CVC2121","Fuscao", v8);
		Carro car2 = new Carro("TNT3030","Brasilia", donald);
		car.imprime();
		
		car.setKilometragem(150000);
		car2.setKilometragem(140000);
		
		Utilitario util  = new Utilitario("UTL0707","Jipe", pwT, 512);
		util.imprime();
		util.setKilometragem(100000);
		
		car.imprimeMenorKM(util,car2);
		
		car.darIgnicao();
		util.darIgnicao();
		car2.darIgnicao();
		
	
	}
}
