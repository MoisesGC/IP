public class Fatorial{

	private int fat;
	private int input;
	
	Fatorial(int num){
		int temp;
	
		this.setInput(num);
		temp = this.fatorialRecursivo(this.getInput());
		this.setFat(temp);
	}
	
	public int getFat(){
		return this.fat;
	}
	
	public void setFat(int num){
		 this.fat = num;
	}
	
	public int getInput(){
		return this.input;
	}
	
	public void setInput(int num){
		 this.input = num;
	}
	
	public int fatorialRecursivo(int num){
		int resposta;
	
		if((num == 0) || (num == 1)){
			resposta = 1;
		}
		else{
			//System.out.println(num);
			resposta = this.fatorialRecursivo(num - 1) * num;
			System.out.println(num);
		}
		
		return resposta;
	}
	
	public void imprime(){
		System.out.println(this.getFat());
	}
	
}
