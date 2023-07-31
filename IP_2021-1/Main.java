public class Main{

	public static void main(String args[]){	
	
		Pessoa fulano = new Pessoa();
		Aluno beltrano = new Aluno();
		Cliente cicrano = new Cliente("Cicrano", 23);
		RelaxId relaxName = new RelaxID();
		
		
		fulano.setNome("Fulano");
		beltrano.setNome("Beltrano");
		System.out.println(fulano.getNome());
		System.out.println(beltrano.getNome());
		beltrano.digaSeuNome();
		cicrano.digaSeuNome();
		
	
		
		//Matriz mat1,mat2;
		//int detResposta;
		
		//mat1 = new Matriz(6,6);
		
		//mat1.inicializaRandomico();
		//mat1.imprime();
		//detResposta = mat1.determinante();
		//System.out.println(detResposta);
		
	

				
	}		

}
