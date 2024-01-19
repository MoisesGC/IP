public class Main{

	public static void main(String[] args){
	
	
		System.out.println("Aula de Revisao - OO");
		
		Carro carro01, carro02, carro03;
		
		carro01 = new Carro("HB20", 2015,'V');
		carro02 = new Carro("POLO", 2019,'P');
		carro03 = new Carro("FIT", 2010,'A');
		
		/*carro01.setModelo("HB20");
		carro02.setModelo("POLO");
		carro03.setModelo("FIT");
		
		carro01.setAnoFabricacao(2015);
		carro02.setAnoFabricacao(2019);
		carro03.setAnoFabricacao(2010);
		
		carro01.setCor('V');
		carro02.setCor('P');
		carro03.setCor('A'); 
		*/
		
		/*System.out.println(carro01.getModelo());
		System.out.println(carro02.getModelo());
		System.out.println(carro03.getModelo());
		
		System.out.println(carro01.getAnoFabricacao());
		System.out.println(carro02.getAnoFabricacao());
		System.out.println(carro03.getAnoFabricacao());
		
		System.out.println(carro01.getCor());
		System.out.println(carro02.getCor());
		System.out.println(carro03.getCor());
		
		*/
		
		carro01.imprime();
		carro02.imprime();
		carro03.imprime();
		
		carro01.comparaCarro(carro02,carro03);
		
		
	}


}
