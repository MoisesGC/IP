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
		this.setMapaP1(mapaPly2);
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
	
	
	public void iniciaBatalha(){
		boolean continuaBatalha;
		System.out.println("Iniciando a batalha..");
		continuaBatalha = true;
		
		while(continuaBatalha){

			continuaBatalha = this.executarJogada(this.getPlayer1(), this.getMapaP1(), this.getMapaP2());
			if(continuaBatalha) {
				continuaBatalha = this.executarJogada(this.getPlayer2(), this.getMapaP2(), this.getMapaP1());
			}
			// ideia - contar a quantidade de rodadas
		}
		System.out.println("Batalha Finalizada..");			
	}
	
	public boolean executarJogada(Jogador player, Mapa mapaPlayer, Mapa mapaAdversary){
		boolean statusJogo;
		// atualizar a tela
		// le a jogada do player
		// atualiza a tela
		// avaliar a jogada encerrou o vez do jogador ou se encerrou o jogo
		statusJogo = false;
		
		return statusJogo;

	}
	
	
	public void imprimeResultado(){
		System.out.println("O resultado da Batalha:");
	
	}
	
	


}
