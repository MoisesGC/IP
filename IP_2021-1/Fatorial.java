public class Fatorial{

	public long fatorial(int index){
		long resp;
		
		if(index > 0){
			resp = index * fatorial(index-1);
		}
		else{
			resp = 1;	
		}	
		return resp;	
	}
	
	public long fatorialIterativo(int index){
		long resp;
		int cont;
		
		resp = 1;
		for (cont=2; cont <= index; cont++){
			resp = resp*cont;
			//System.out.print(resp +  " ");	
		}
	
		return resp;
	
	}
	
	public void imprime(int index){
		long resp;
		long start, delay;
		
		start = System.nanoTime();
		resp = this.fatorial(index);
		delay = System.nanoTime()- start;
		
		System.out.print(resp);
		System.out.print(" - ");
		System.out.println(delay);
		
		start = System.nanoTime();
		resp = this.fatorialIterativo(index);
		delay = System.nanoTime()- start;
		
		System.out.print(resp);
		System.out.print(" - ");
		System.out.println(delay);
		
	
	}

}
