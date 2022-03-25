import java.util.Scanner;
public class Aluno{

        private String nome;

        public String getNome(){
		return this.nome;	
	}
	
	public void setNome(String novoNome){
		this.nome = novoNome;	
	}

	public void digaSeuNome(){
		System.out.println(this.getNome());	
	}
			
}




