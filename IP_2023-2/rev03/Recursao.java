public class Recursao{


	public int multiplicacao(int base, int multiplicador){
		int resposta;
	
		if(multiplicador == 1){
			resposta = base;
		}
		else{
			resposta = base + this.multiplicacao(base, multiplicador - 1);	
		
		}
		
		return resposta;
	}

}
