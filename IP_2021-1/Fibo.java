public class Fibo{

	public long getElemento(int index){
		long resp;
		
		if(index > 2){
			resp = this.getElemento(index-1) + this.getElemento(index-2);	
		}
		else{
			resp = 1;	
		}	
		return resp;	
	}
	
	public long getElementoIterativo(int index){
		int cont;
		long resp,ultimo,penultimo;
		
		
		resp = 1;	
		if(index > 1){
			ultimo = 1;
			penultimo = ultimo;
			for (cont=2; cont <= index; cont++){
				resp = ultimo + penultimo;
				penultimo = ultimo;
				ultimo = resp;
			}
		}
		else{
			resp = 1;	
		}
			
		return resp;	
	}
	
	
	
	public void imprimeSequencia(int index){
		int cont;
		long start, delay, resp;
		
		start = System.nanoTime();
		for(cont = 0; cont <= index; cont++){
			System.out.print(this.getElemento(cont)+" ");
		}
		delay = System.nanoTime()- start;
		
		//System.out.print(resp);
		System.out.print(" - ");
		System.out.println(delay);
		
		start = System.nanoTime();
		for(cont = 0; cont <= index; cont++){
			System.out.print(this.getElementoIterativo(cont)+" ");
		}
		delay = System.nanoTime()- start;
		
		//System.out.print(resp);
		System.out.print(" - ");
		System.out.println(delay);
	
	}

}

