public class Curuja{
	
	private float velocidadeMaxima;
	
	
	Curuja(float velMaxVia){
		this.setVelocidadeMaxima(velMaxVia);
	}

	public float getVelocidadeMaxima(){
		return this.velocidadeMaxima;	
	}
	
	public void setVelocidadeMaxima(float novoValor){
		this.velocidadeMaxima = novoValor;
	}
	
	public void imprimeRelatorio(float velMaxVia, float velVeiculo, float multa){
		System.out.println("A velocidade maxima da via eh " + velMaxVia +
	    	                   " a velocidade aferida foi : " + velVeiculo +
	    	                   " o valor de multa  foi : " + multa);
	}
	
	
	public float calculaMulta(float velocidadeAferida){
		float resposta;
		if(velocidadeAferida > 0.0f){
			resposta = this.calculaMultaV2(velocidadeAferida);	
		}
		else{
			resposta = -1.0f;
		}
		return resposta;
	}
	
	private float calculaMultaV1(float velocidadeAferida){
	
		float velMaxVia,velVeiculo,delta,multa;	    
	    	velMaxVia = this.getVelocidadeMaxima();
	    	velVeiculo = velocidadeAferida;
	    	
	    	delta = velVeiculo - velMaxVia;
	    	
	    	if(delta > 0.0f){
	    		if(delta <= velMaxVia*(0.2f)){
	    			multa = 200.0f;
	    		}
	    		else{
	    			if(delta <= velMaxVia*(0.5f)){
	    				multa = 500.0f;
	    			}
	    			else{
	    				multa = 2000.0f;
	    			}	
	    		}	
	    	}
	    	else{
	    		multa = 0.0f;
	    	}
	    	this.imprimeRelatorio(velMaxVia,velVeiculo,multa);
	    	return multa;
	}
	
	private float calculaMultaV2(float velocidadeAferida){
	
		float velMaxVia,velVeiculo,delta,multa;	    
	    	velMaxVia = this.getVelocidadeMaxima();
	    	velVeiculo = velocidadeAferida;
	    	
	    	delta = velVeiculo - velMaxVia;
	    	multa = 0.0f;
	    	
	    	if(delta > 0.0f){
	    		if (delta <= velMaxVia*(0.2f)) {
			    multa = 200.0f;
			} else if (delta <= velMaxVia*(0.5f)) {
			    multa = 500.0f;
			} else {
			    multa = 2000.0f;
			}
	    	}	
	    	this.imprimeRelatorio(velMaxVia,velVeiculo,multa);
	    	return multa;
	}
	
	public static void main(String[] args){
		System.out.println("Simulador do Detran");
		float resposta;
		
		
		Curuja curujinha01 = new Curuja(100.0f);
		
		resposta = curujinha01.calculaMulta(80.0f);
		resposta = curujinha01.calculaMulta(100.0f);
		resposta = curujinha01.calculaMulta(120.0f);
		resposta = curujinha01.calculaMulta(140.0f);
		resposta = curujinha01.calculaMulta(150.0f);
		//System.out.println(resposta);
		resposta = curujinha01.calculaMulta(0.0f);
		System.out.println(resposta);
	}
	
}	


