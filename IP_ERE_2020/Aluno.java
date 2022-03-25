public class Aluno{

	private String nome;
	private int anoNascimento;

	/* gets and sets */

	Aluno(String primeiroNome, int anoNasc){
		this.setNome(primeiroNome);
		this.setAnoNascimento(anoNasc);
	}

	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String novoNome){
		this.nome = novoNome;
	} 

	public int getAnoNascimento(){
		return this.anoNascimento;	
	}

	public void setAnoNascimento(int novoAnoNasci){
		this.anoNascimento = novoAnoNasci;
	}

	/* end of gets and sets */

	public void print(){
		System.out.print("nome:" + this.getNome());
		System.out.println(" anoNascimento: " + this.getAnoNascimento());
	}


}
