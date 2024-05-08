import java.util.Scanner; 

public class Boneco{

	private String nome;
	private int preco;
	
	Boneco(String primeiroNome){
		this.setNome(primeiroNome);
		this.setPreco(-1);
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String novoValor){
		this.nome = novoValor;
	}
	
	public int getPreco(){
		return this.preco;
	}
	
	public void setPreco(int novoValor){
		this.preco = novoValor;
	}
	
	
	public void nomear(){
		String tempNome;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o meu nome, por gentileza!");		
		tempNome = ler.nextLine();
		this.setNome(tempNome);
	}
	
	
	public void precificar(){
		int tempPreco;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o meu preco, por gentileza!");		
		tempPreco = ler.nextInt();
		this.setPreco(tempPreco);
	}
	
	
	
	
	public void digaSeuNome(){
		System.out.println("Meu nome eh: " + this.getNome());
		
	}
	
}
