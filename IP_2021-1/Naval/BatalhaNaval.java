import java.io.IOException;
import java.io.InputStreamReader; 
import java.util.Scanner;


public class BatalhaNaval{

	private Jogador player1;
	private Jogador player2;
	private Mapa 	mapaP1;
	private Mapa 	mapaP2;
	private boolean mapasInicializados;
	
	
	BatalhaNaval(Jogador playerP1, Mapa mapaPly1, Jogador playerP2, Mapa mapaPly2){
		this.setPlayer1(playerP1);
		this.setMapaP1(mapaPly1);
		this.setPlayer2(playerP2);
		this.setMapaP2(mapaPly2);
	}
	
	public void setPlayer1(Jogador play){
		this.player1 = play;
	}
	
	public Jogador getPlayer1(){
		return this.player1;
	}
	
	public void setPlayer2(Jogador play){
		this.player2 = play;
	}
	
	public Jogador getPlayer2(){
		return this.player2;
	}
	
	public void setMapaP1(Mapa map){
		this.mapaP1 = map;
	}
	
	public Mapa getMapaP1(){
		return this.mapaP1;
	}
	
	public void setMapaP2(Mapa map){
		this.mapaP2 = map;
	}
	public Mapa getMapaP2(){
		return this.mapaP2;
	}
	
	private void setMapasInicializados(boolean state){
		this.mapasInicializados = state;		
	}
	
	private boolean getMapasInicializados(){
		return this.mapasInicializados;	
	}
	
	public void inicializarMapas(){
		boolean initOk1, initOk2;
		System.out.println("Inicializando os mapas..");
		initOk1 = this.inicializaMapaJogador(this.getPlayer1(),this.getMapaP1());
		initOk2 = this.inicializaMapaJogador(this.getPlayer2(),this.getMapaP2());
		this.setMapasInicializados((initOk1 && initOk2));
		if (this.getMapasInicializados()){
			System.out.println("Mapas incializados, pronto para inicio de jogo..");
		}
		else{
			System.out.println("Falha na inicialização dos mapas..");
		}	
	}
	
	private boolean inicializaMapaJogador(Jogador player, Mapa mapa){
		System.out.println("Inicializando o mapa do jogador: " + player.getNome());	
		return true;
	}
	
	//// nova versao
	public void iniciaBatalha(){
		boolean continuaBatalha;
		System.out.println("Iniciando a batalha..");
		continuaBatalha = true;
		
		while(continuaBatalha){

			continuaBatalha = this.executarJogada(this.getPlayer1(), this.getMapaP1(), this.getPlayer2(), this.getMapaP2());
			if(continuaBatalha) {
				continuaBatalha = this.executarJogada(this.getPlayer2(), this.getMapaP2(), this.getPlayer1(), this.getMapaP1());
			}
			// ideia - contar a quantidade de rodadas
			continuaBatalha = false;
		}
		System.out.println("Batalha Finalizada..");			
	}
	
	// nova versao
	public boolean executarJogada(Jogador player, Mapa mapaPlayer, Jogador adversario, Mapa mapaAdversario){
		boolean statusJogo,acertou;
		int linha,coluna;
		Scanner ler = new Scanner(System.in);
		
		acertou = true;
		while(acertou){
			this.atualizaTela(player, mapaPlayer, adversario, mapaAdversario);
			System.out.println();
			System.out.print("Digite a coordenada da linha:");
			linha = ler.nextInt();
			System.out.print("Digite a coordenada da coluna:");
			coluna = ler.nextInt();	
			switch(mapaAdversario.getElemento(linha,coluna)){
            			case 'O':
					System.out.println("---- Agua!--------");
					mapaAdversario.setElemento(linha,coluna,'F');
					acertou = false;
					break;
				default:
					System.out.println("---  Acertou! ---- ");
					mapaAdversario.setElemento(linha,coluna,'H');
					break;

        		}
			this.atualizaTela(player, mapaPlayer, adversario, mapaAdversario);
		}	
		statusJogo = true;	
		return statusJogo;

	}
	

	
	// nova versao
	private void limpaTela(){
		try {
                	new ProcessBuilder("clear").inheritIO().start().waitFor();      // Para linux
        	} 
        	catch(Exception e) {
            		e.printStackTrace();
        	}
	}
	
	// nova versao
	public void atualizaTela(Jogador player, Mapa mapaPlayer, Jogador adversario, Mapa mapaAdversario){
		int cont;
		this.limpaTela();
		System.out.println("Status Adversario: " + adversario.getNome());
		mapaAdversario.imprime();
		System.out.println();
		System.out.println("Status Jogador: " + player.getNome());
		mapaPlayer.imprime();
	}
	
	
	public void imprimeResultado(){
		System.out.println("O resultado da Batalha:");
	
	}
	
	


}
