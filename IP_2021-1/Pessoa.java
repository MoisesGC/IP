public class Pessoa{

	private String nome;
	private AutoIdentificavel dizerNome;
	
	Pessoa(Autoidentificavel novoComp){
	
		this.setAutoIdentificavel(novoComp);
	}
	

        public String getNome(){
		return this.nome;	
	}
	
	public void setNome(String novoNome){
		this.nome = novoNome;	
	}
	
	public void digaSeuNome(){
		this.getAutoIdentificavel().digaSeuNome();
	}
	

}
