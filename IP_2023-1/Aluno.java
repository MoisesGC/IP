public class Aluno{

	private String nome;
	
	public void setNome(String novoNome){
		this.nome = novoNome;
	}

	public String getNome(){
		return this.nome;
	}

	public void digaOi(){
		System.out.println("Oi!");
	
	}
	
	public void digaBomDia(){
		System.out.println("Bom dia!");
	}
	
	public void digaSeuNome(){
		System.out.println("Meu nome eh " + this.getNome());
	}
	
	

}
