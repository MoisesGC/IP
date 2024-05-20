public class Main{

	public static void main(String[] args){
	
		System.out.println("Ola Tartaruga!");
		
		Tartaruga tt1;
		Tartaruga tt2;
		
		tt1 = new Tartaruga(2.0f,2.0f);
		tt2 = new Tartaruga(3.0f,0.5f);
		
		tt1.calculaTempoParaTamanhoIgual(tt2);
			
	}
	

}
