public class Main{

	public static void main(String[] args){
		System.out.println("Teste de criacao de alunos");
		Aluno aluno01;
		int anoAtual, limiteIdadeCrianca, idadeDoAluno;;

	
		anoAtual= 2020;
		limiteIdadeCrianca = 10;	
		aluno01 = new Aluno("Luciano", 2016);	
		aluno01.print();
		//aluno01.setAnoNascimento(2015);
		aluno01.print();
	
		idadeDoAluno = (anoAtual - aluno01.getAnoNascimento());

		if(idadeDoAluno <= limiteIdadeCrianca){
			System.out.println("Olá " + aluno01.getNome() + ", como vc está? Espero que tudo bem, viu?");
		}
		else{
			System.out.println("Olá " + aluno01.getNome() + ", o ERE ainda não acabou! Use sempre a sua mascara");
		}

		System.out.println("Bem vind(@) a escola!!");


	}


}
