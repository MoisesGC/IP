public class Aluno{
	private String nome;
	private int nota;
	
	Aluno(String novoNome){
		this.setNome(novoNome);
		this.setNota(0);
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String novoNome){
		this.nome = novoNome;
	}
	
	public int getNota(){
		return this.nota;
	}

	public void setNota(int novaNota){
		this.nota = novaNota;
	}
	
	public void imprime(){
		System.out.println(
			"Nome: "+this.getNome() +
		        "\nNota: "+ this.getNota()
		);
	}
	
	public void comparaNotaCom(Aluno outro){
		String nomeVencedor;
		if(outro.getNota() >= this.getNota()){
			nomeVencedor = outro.getNome();
		}
		else{
			nomeVencedor = this.getNome();	
		}
		System.out.println("A maior nota e do:" + nomeVencedor);	
	}
	
	public int retornaMaiorNota(Aluno outro){
		int notaMaior;
		if(outro.getNota() >= this.getNota()){
			notaMaior = outro.getNota();
		}
		else{
			notaMaior = this.getNota();
		}
		return notaMaior;
	}
	
	public boolean validaNota(int notaTemp){
		boolean resp = true;
		if((nota > 10) || (nota < 0)){
			resp = false;
		}
		return resp;
		
	}
	

}
