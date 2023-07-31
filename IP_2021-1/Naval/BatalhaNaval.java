import java.io.IOException;
import java.io.InputStreamReader; 
import java.util.Scanner;


public class BatalhaNaval{

	private Jogador player1;
	private Jogador player2;
	private Mapa 	mapaP1;
	private Mapa 	mapaP2;
	private boolean mapasInicializados;
	private int numNavios;
	
	
	BatalhaNaval(Jogador playerP1, Mapa mapaPly1, Jogador playerP2, Mapa mapaPly2, int numPecasNavios){
		this.setPlayer1(playerP1);
		this.setMapaP1(mapaPly1);
		this.setPlayer2(playerP2);
		this.setMapaP2(mapaPly2);
		this.setNumNavios(numPecasNavios);
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
	
	private void setNumNavios(int valor) {
		this.numNavios = valor;
	}
	
	private int getNumNavios(){
		return this.numNavios;
	}
	
	private void setMapasInicializados(boolean state){
		this.mapasInicializados = state;		
	}
	
	private boolean getMapasInicializados(){
		return this.mapasInicializados;	
	}
	
	public void inicializarMapas(){
		boolean initOk1, initOk2;
		this.transicaoJogo("Inicializando os mapas..",3);
		this.transicaoJogador(this.getPlayer1());
		initOk1 = this.inicializaMapaJogador(this.getPlayer1(),this.getMapaP1());
		this.transicaoJogador(this.getPlayer2());
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
		Scanner ler = new Scanner(System.in);
		int linha,coluna;
		int contNavio;
				
		for(contNavio = 0; contNavio < this.getNumNavios(); contNavio++ ){
			this.atualizaTela(player, mapa);
			System.out.print("Insercao de Navio do Jogador " + player.getNome());
			System.out.println();
			System.out.print("Digite a coordenada da linha:");
			linha = this.leituraValida(ler,0,mapa.getNumLinhas()-1);
			System.out.print("Digite a coordenada da coluna:");
			coluna = this.leituraValida(ler,0,mapa.getNumLinhas()-1);
			mapa.setElemento(linha,coluna,mapa.getCodigoMapa(3));
			System.out.println();	
		}
		return true;
	}
	
	private int leituraValida(Scanner scan, int lowLimit, int highLimit){
		int entrada;
		entrada = scan.nextInt();
		while ((entrada < lowLimit) || (entrada > highLimit)) {
			System.out.print("Coordenada Invalida.. digite novamente: ");
			entrada = scan.nextInt();
		}
		return entrada;	
	}
	
	public void iniciaBatalha(){
		boolean continuaBatalha;
		this.transicaoJogo("Iniciando a batalha..",3);
		continuaBatalha = true;
		
		while(continuaBatalha){
			this.transicaoJogador(this.getPlayer1());
			continuaBatalha = this.executarJogada(this.getPlayer1(), this.getMapaP1(), this.getPlayer2(), this.getMapaP2());
			
			if(continuaBatalha) {
				this.transicaoJogador(this.getPlayer2());
				continuaBatalha = this.executarJogada(this.getPlayer2(), this.getMapaP2(), this.getPlayer1(), this.getMapaP1());
			}
		}
		System.out.println("Batalha Finalizada..");	
		this.delayTela(2);		
	}
	
	public boolean executarJogada(Jogador player, Mapa mapaPlayer, Jogador adversario, Mapa mapaAdversario){
		boolean statusJogo,acertou;
		int linha,coluna;
		String message;
		Scanner ler = new Scanner(System.in);
		statusJogo = true;	
		acertou = true;
		while(acertou && statusJogo){
			this.atualizaTela(player, mapaPlayer, adversario, mapaAdversario);
			System.out.println();
			System.out.print("Digite a coordenada da linha:");
			linha = this.leituraValida(ler,0,mapaPlayer.getNumLinhas()-1);
			System.out.print("Digite a coordenada da coluna:");
			coluna = this.leituraValida(ler,0,mapaPlayer.getNumLinhas()-1);
			acertou = mapaAdversario.tiro(linha,coluna);
			if (acertou){
				player.incrementaAcerto();
				if (player.getAcertos() >= this.getNumNavios()){
					statusJogo = false;
				}	
			}

			this.delayTela(2);
			this.atualizaTela(player, mapaPlayer, adversario, mapaAdversario);
			System.out.println();		
		}	
			
		return statusJogo;

	}
	
	private void limpaTela(){
		try {
                	new ProcessBuilder("clear").inheritIO().start().waitFor();      // Para linux
        	} 
        	catch(Exception e) {
            		e.printStackTrace();
        	}
	}
	
	private void transicaoJogo(String mensagem, int segundosDelay){
		int cont;
		this.limpaTela();
		for(cont=0; cont < 12; cont++){
			System.out.println();
		}
		System.out.println(mensagem);
		for(cont=0; cont < 12; cont++){
			System.out.println();
		}
		
		this.delayTela(segundosDelay);
	}
	
	private void delayTela(int segundos){
		try {
  			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
  			ex.printStackTrace();
		}
	}
	
	
	private void transicaoJogador(Jogador player){
		int cont;
		Scanner ler = new Scanner(System.in);
		this.limpaTela();
		for(cont=0; cont < 12; cont++){
			System.out.println();
		}
		System.out.println("Vez do jogador " + player.getNome());
		for(cont=0; cont < 12; cont++){
			System.out.println();
		}
		System.out.println("Aperte enter para confirmar:");
		ler.nextLine();
	}
	
	
	public void atualizaTela(Jogador player, Mapa mapaPlayer, Jogador adversario, Mapa mapaAdversario){
		int cont;
		this.limpaTela();
		System.out.println("Status Adversario: " + adversario.getNome());
		mapaAdversario.imprime(true);
		System.out.println();
		System.out.println("Status Jogador: " + player.getNome());
		mapaPlayer.imprime();
	}
	
	public void atualizaTela(Jogador player, Mapa mapaPlayer){
		int cont;
		this.limpaTela();
		System.out.println();
		System.out.println("Status Jogador: " + player.getNome());
		mapaPlayer.imprime();
	}
	
	public void imprimeResultado(){		
		this.limpaTela();
		
		System.out.println("O resultado da Batalha:");
		System.out.println("Status: " + this.getPlayer1().getNome() + "  - Acertos: " + this.getPlayer1().getAcertos());
		this.getMapaP1().imprime();
		System.out.println();
		System.out.println("Status: " + this.getPlayer2().getNome() + "  - Acertos: " + this.getPlayer2().getAcertos());
		this.getMapaP2().imprime();
		System.out.print("\nVENCEDOR: "); 
		if (this.getPlayer1().getAcertos() > this.getPlayer2().getAcertos()){
			System.out.println(this.getPlayer1().getNome());
		}
		else{
			System.out.println(this.getPlayer2().getNome());
		}
		
		
	}
	
	


}
