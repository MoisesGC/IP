public class Fatorial{

	private int numero;
	
	Fatorial(){
	   this.setNumero(0);
	}
	
	Fatorial(int novoNumero){
		this.setNumero(novoNumero);		
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public void setNumero(int novoNumero){
		this.numero = novoNumero;
	}
	
	public int getFatorial(){
		int numFatorial;
			
		numFatorial = this.fatorialIterativo(this.getNumero());
	
		return numFatorial;
	}
	
	private int fatorialRecursivo(int num){
		int resp = 0;
		if((num == 0) || (num == 1)){
			resp = 1;
		}
		else{
			resp = num * fatorialRecursivo(num -1);
	
		}
	
		return resp;
	}
	
	private int fatorialIterativo(int num){
		int produto = num;
		int cont;
		
		if((num == 0) || (num == 1)){
			produto = 1;
		}
		else{
			for(cont = num-1; cont > 1; cont--){
				produto = produto * cont;
			}
		}				
		return produto;
	}
	
	
	public void calculaNumero(int num){
		int cont,temp;
		boolean flagMaior;
		
		for(cont = 0; cont < 10; cont++ ){
			if (cont*10 > num){
				cont = 10;
			}
		
			System.out.println(cont*10);
		}
		
		flagMaior = false;
		cont = 0;
		while((cont < 10) && !flagMaior){
			temp = cont*10;
			if(temp < num){		
			 	System.out.println(temp);
			}
			else{
				flagMaior = true;
			} 	
			cont++;
		}
		
	
	}
	
	


}
