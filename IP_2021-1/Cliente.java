public class Cliente extends Pessoa{

	private int idade;

	Cliente(String valorN, int valorI){
		this.setNome(valorN);
		this.setIdade(valorI);
	}
	
	
	public int getIdade(){
		return this.idade;
	}
	
	public void setIdade(int nova){
		this.idade = nova;
	}
	
	public void imprimeNomeClienteMaisVelho(Cliente outro){
	
		if (this.getIdade() >  outro.getIdade()){
			System.out.println(this.getNome());
		}
		else{
			System.out.println(outro.getNome());
		}
	
	}
	
	public void imprimeClassificacaoPorIdade(){
		
		int myIdade;
		myIdade = this.getIdade();
		
		System.out.print(this.getNome() +" eh "); 
		
		if (myIdade <= 10){
			System.out.println("Gen Alpha");
		}
		else {
			if(myIdade <= 25){
				System.out.println("Gen Z");
			}
			else{
				if (myIdade <= 40) {
					System.out.println("Gen Y");	
				}
				else {
					System.out.println("gente boa..");
				}
			}				
		}		
	}
	
		
	public void imprime(){
		System.out.println(this.getNome()+" "+ this.getIdade());
	}


	public void digaSeuNome(){
		System.out.println(" Bom dia, eu sou "  +  this.getNome());	
	}	

}
