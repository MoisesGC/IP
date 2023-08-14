public class CurujaDetran{
	private float velocidadeMaxima;
	private float velocidadeAferida;


	public float getVelocidadeMaxima(){
		return this.velocidadeMaxima;
	}
	
	public void setVelocidadeMaxima(float novoValor){
		this.velocidadeMaxima = novoValor;
	}
	
	public float getVelocidadeAferida(){
		return this.velocidadeAferida;
	}
	
	public void setVelocidadeAferida(float novoValor){
		this.velocidadeAferida = novoValor;
	}
	
	public void avaliaLeitura(){
		float deltaVel;
		
		deltaVel = this.getVelocidadeAferida() - this.getVelocidadeMaxima();
	
		if(deltaVel <= 0.0){
			System.out.println("Velocidade Ok!");
		}
		else{
			System.out.println("Velocidade nOk!");
		
		}
	
	}
	
}



/*
       velMaxima = lidoTeclado
       velAferida = lidoTeclado
       
       deltaVel = velAferida - velMaxima;
       
       se (deltaVel <= 0){
       		imprima("ta suave")
       }
       senao{
          se (deltaVel <= 20){
       		imprima("vacilou pensando na 10/10... paga 100 contos!")
       	  }
       	  senao{
       	  	se (deltaVel <= 40){
       			imprima("Calma garotao.. ja foi, nao volta mais.... pega 500 contos de multa!")
       	  	}
       	  	senao{
       	  		imprima("A vida nao eh Forza Motosport..  paga 1000.00 e entrega a CNH");
       	  	}
       	  } 	
       }
  */     
       
