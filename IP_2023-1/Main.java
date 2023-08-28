import java.util.Scanner;

public class Main{

        public static void main(String[] args){
        
        	System.out.println("Teste de Objetos - Contasss");
        	Scanner ler = new Scanner(System.in);
		
		Calculo calc = new Calculo();
		/*int a,b;
		
		a = ler.nextInt();
		b = ler.nextInt();
		
		
		calc.imprimeSoma(a,b);
		calc.imprimeMultiplicacao(a,b);
		calc.imprimeDivisao(a,b);
		calc.imprimeConversaoCelToFareh(30.0f);
		*/
		
		calc.fazendoEstatisticasToya();
        
        }

	public static void main01(String[] args){
		
		System.out.println("Teste de Objetos");
		
		Aluno aluno01;
		Aluno aluno02;
		Aluno aluno03;
		Aluno aluno04;
		
		
		aluno01 = new Aluno();
		
		aluno01.digaOi();
		aluno01.digaBomDia();
		aluno01.setNome("Fulano");
		aluno01.digaSeuNome();		
		
		aluno02 = new Aluno();
		
		aluno02.digaOi();
		aluno02.digaBomDia();
		aluno02.setNome("Cicrano");
		aluno02.digaSeuNome();
		
		aluno03 = new Aluno();
		
		aluno03.digaOi();
		aluno03.digaBomDia();
		aluno03.setNome("Beltrano");
		aluno03.digaSeuNome();
			
		
		aluno04 = new Aluno();
		
		aluno04.digaOi();
		aluno04.digaBomDia();
		aluno04.setNome("Ken");
		aluno04.digaSeuNome();
		
		
		aluno01.setMelhorAmigo(aluno04);
		aluno01.digaONomeDoSeuMelhorAmigo();
		
		aluno04.setMelhorAmigo(aluno01);
		aluno04.digaONomeDoSeuMelhorAmigo();		
		aluno04.digaONomeDoSeuMelhorAmigo(aluno03);
		
		aluno04.contasAleatorias();	
		
	}
	
	
	

}
