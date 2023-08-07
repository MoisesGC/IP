public class Calculo{
	
	public void imprimeSoma(int a, int b){
		int temp;
		temp = a + b;
	
		System.out.println(temp);
	}
	
	public void imprimeMultiplicacao(int a, int b){
		int temp;
		temp = a * b;
	
		System.out.println(temp);
	}
	
	public void imprimeDivisao(int a, int b){
		int temp;
		temp = a / b;
	
		System.out.println(temp);
	}
	
	public void imprimeConversaoCelToFareh(float tempCelsius){
		float tempFareh;
		tempFareh = (tempCelsius * 1.8f) + 32.0f;
	
		System.out.println(tempFareh);
	}

}
