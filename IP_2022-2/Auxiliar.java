public class Auxiliar{

	private int valor;
	
	
	public int getValor(){
		return this.valor;
	}
	
	public void setValor(int novoValor){
		this.valor = novoValor;
	}
	
	
	public int multRecurs(int num, int multp){
		int resposta;
		if(multp == 0){
			resposta = 0;
		}	
		else{			
			resposta = num + multRecurs(num, multp-1);
			System.out.println("multRecurs("+num+", "+ (multp-1) +")");
			
		}
		System.out.println(resposta);
		return resposta;
	}
	
	public int fat(int num){
		int resposta;
		if((num == 0)||(num==1)){
			resposta = 1;
		}	
		else{
			resposta = num * fat(num-1);
			
		}
		return resposta;
	}

}
