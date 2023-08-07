public class Aluno{

	private String nome;
	private Aluno melhorAmigo;
	
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
	
	public void setMelhorAmigo(Aluno novoAmigo){
		this.melhorAmigo = novoAmigo;
	}
	
	public Aluno getMelhorAmigo(){
		return this.melhorAmigo;
	}
	
	public void digaONomeDoSeuMelhorAmigo(){
		System.out.println(this.getNome()+": O nome do meu melhor amigo eh " + this.getMelhorAmigo().getNome());
	}
	
	public void digaONomeDoSeuMelhorAmigo(Aluno amigo){
		System.out.println(this.getNome()+": O nome do meu melhor amigo eh " + amigo.getNome());
	}
	
	public void contasAleatorias(){
	
		int cont = 10;
		String name = "Aluno Legal";
		float preco = 10.0f;
		boolean resultado = true;
		char flag = '0';
	
	
		System.out.println(cont * cont * cont);
		System.out.println(name);
		System.out.println(preco);
		System.out.println(resultado);
		System.out.println(name.length());
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
