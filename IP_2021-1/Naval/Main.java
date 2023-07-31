import java.io.IOException;
public class Main{

	public static void main(String[] args){
	
		System.out.println("Batalha Naval");
		
		BatalhaNaval jogo1;
		Jogador player1, player2;
		Mapa mapa1,mapa2;
		
		player1 = new Jogador();
		player1.setNome("Fulano");
		player2 = new Jogador();
		player2.setNome("Beltrano");
		
		mapa1 = new Mapa();
		mapa2 = new Mapa();
		
		
		jogo1 = new BatalhaNaval(player1, mapa1, player2, mapa2,5);
		
		jogo1.inicializarMapas();
		jogo1.iniciaBatalha();
		jogo1.imprimeResultado();

      
	
	}


}
