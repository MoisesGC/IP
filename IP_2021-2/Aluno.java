public class Aluno{

	private String nome;
	private int idade;
	
	
	Aluno(){
		this.setNome("Fulano");
		this.setIdade(18);	
	}
	
	Aluno(String novoNome, int novaIdade){
		this.setNome(novoNome);
		this.setIdade(novaIdade);	
	}
	
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String novoValor){
		this.nome = novoValor;
	}
	
	
	public int getIdade(){
		return this.idade;
	}
	
	public void setIdade(int novoValor){
		this.idade = novoValor;
	}
	
	public void digaSeuNome(){
		System.out.println(this.getNome());
	}
	
	
	public void classificaPorIdade(){
		int idadeClasse = this.getIdade();
		
		System.out.print("A minha idade eh " + idadeClasse + " - "); 
		
		if(idadeClasse < 12 ){
			System.out.println("Sou infantil"); 			
		
		}
		else {
			if (idade < 19){
				System.out.println("Sou adolescente"); 			
			
			}
			else{
				if (idade < 30){
					System.out.println("Sou jovem pagador de boletos"); 			
				
				}
				else{
					System.out.println("Sou pagador de boletos senior"); 			
				}
			}
		}
	
	}
	
	
}
