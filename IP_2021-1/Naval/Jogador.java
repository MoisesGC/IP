public class Jogador{

        private String nome;
        private int acertos;
        
        Jogador(){
        	this.zerarAcertos();
        }

        public String getNome(){
		return this.nome;	
	}
		
	public void setNome(String novoNome){
		this.nome = novoNome;	
	}
	
	public void zerarAcertos(){
		this.setAcertos(0);
	}
	
	private void setAcertos(int valor){
		this.acertos = valor;
	}
	
	public void incrementaAcerto(){
		this.setAcertos(this.getAcertos()+1);
	}
	
	public int getAcertos(){
		return acertos;
	}
			
}

