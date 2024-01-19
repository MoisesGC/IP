public class Main{

	public static void main(String[] args){
	
	
		System.out.println("Aula de Revisao - O2");
		
		Vetor vet01;
		
		vet01 = new Vetor(15);
		
		/*
		System.out.println(vet01.getElemento(0));
		System.out.println(vet01.getElemento(1));
		System.out.println(vet01.getElemento(2));
		System.out.println(vet01.getElemento(3));
		System.out.println(vet01.getElemento(4));
		*/
		//vet01.imprime();
		vet01.inicializaRandom();
		vet01.imprime();
		System.out.println(vet01.busca(10));
		System.out.println(vet01.buscaV2(10));
		vet01.imprimeMaiorMenor();
		/*vet01.setElemento(0,200);
		vet01.setElemento(1,202);
		vet01.setElemento(2,204);
		vet01.setElemento(3,206);
		vet01.setElemento(4,208);
		System.out.println(vet01.getElemento(0));
		System.out.println(vet01.getElemento(1));
		System.out.println(vet01.getElemento(2));
		System.out.println(vet01.getElemento(3));
		System.out.println(vet01.getElemento(4));
		*/
		
	
		
	}


}
