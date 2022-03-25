public class Mensagem{

        private int valor;
        
        Mensagem(int inicio){
        	this.setValor(inicio);
        }

        public int getValor(){
		return this.valor;	
	}
	
	public void setValor(int novo){
		this.valor = novo;			
	}
}
