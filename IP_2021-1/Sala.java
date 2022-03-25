import java.util.Scanner;
public class Sala{

	private int contFazNada;

        private String salaID;

        public String getSalaID(){
		return this.salaID;	
	}
	
	public void setSalaID(String novoID){
		this.salaID = salaID;			
	}
	
	
	public void verificaFaixa(int idadeP, Mensagem contFaixa1, Mensagem contFaixa2, Mensagem contFaixa3, Mensagem contFaixa4){
		if(idadeP >= 20 && idadeP <= 29){
		    contFaixa1.setValor(contFaixa1.getValor()+1);
		} else{
		    if(idadeP >= 30 && idadeP <= 39){
		        contFaixa2.setValor(contFaixa2.getValor()+1);
		    } else {
		        if(idadeP >= 40 && idadeP <= 49){
		            contFaixa3.setValor(contFaixa3.getValor()+1);
		        } else{ 
		            if(idadeP >=50){
		                contFaixa4.setValor(contFaixa4.getValor()+1);
		            }
		          }
		     }
		}
    	}
	
	
	public void estatisticaIdadeAlunos(){
		boolean leituraPositiva;
		int idade,somaIdade,contAlunos,menorIdade,maiorIdade,indiceMaior,indiceMenor;
		Mensagem faixa20,faixa30,faixa40,faixa50;
		float mediaIdade;
		Scanner ler;
		
		ler = new Scanner(System.in);
		System.out.print("Entre com a idade de um aluno (-1 para sair): ");
		idade = ler.nextInt();
		menorIdade = idade;
		maiorIdade = idade;
		indiceMaior = 0;
		indiceMenor = 0;
		contAlunos = 1;
		somaIdade = idade;
		faixa20 = new Mensagem(0);
		faixa30 = new Mensagem(0);
		faixa40 = new Mensagem(0);
		faixa50 = new Mensagem(0);
		this.verificaFaixa(idade,faixa20,faixa30,faixa40,faixa50);
		leituraPositiva = true;
		while(leituraPositiva){	
			System.out.print("Entre com a idade de um aluno (-1 para sair): ");
			idade = ler.nextInt();			
			if (idade < 0){
				System.out.println("Leitura terminada - imprimindo estatisticas..");
				leituraPositiva = false;
			}
			else{
				this.verificaFaixa(idade,faixa20,faixa30,faixa40,faixa50);
				somaIdade = somaIdade + idade;
				if (idade < menorIdade){
					menorIdade = idade;
					indiceMenor = contAlunos;
				}
				else{
					if (idade > maiorIdade){
						maiorIdade = idade;
						indiceMaior = contAlunos;
					}	
				}
				contAlunos++;		
			}
		}
		mediaIdade = (float)somaIdade/contAlunos;
		System.out.println("A media de idade da turma eh: "+ mediaIdade);		
		System.out.println("A quantidade de alunos na turma eh: "+ contAlunos);	
		System.out.println("A idade do aluno mais novo eh " + menorIdade + " e estava no indice " + indiceMenor);	
		System.out.println("A idade do aluno mais velho eh " + maiorIdade + " e estava no indice " + indiceMaior);
		System.out.println("De 20 a 29 anos: " + faixa20.getValor());
         	System.out.println("De 30 a 39 anos: " + faixa30.getValor());
         	System.out.println("De 40 a 49 anos: " + faixa40.getValor());
         	System.out.println("Maior ou igual a 50 anos: " + faixa50.getValor());   	
		
	}

			
}




