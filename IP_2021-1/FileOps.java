import java.io.File; 
import java.io.FileWriter; 
import java.util.Scanner;     
import java.io.IOException; 
import java.util.StringTokenizer; 

public class FileOps{


	private String nome;
	
	
	FileOps(String nomeNovo){
		this.setNome(nomeNovo);
	}
	
	public void setNome(String novoNome){
		this.nome = novoNome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void cria(){
		try{
			File arquivo = new File(this.getNome());   
        		if (arquivo.createNewFile()) {  
                          System.out.println("File " + arquivo.getName() + " is created successfully.");  
               		} 
               		else {  
                          System.out.println("File is already exist in the directory.");  
               		}  
             	} 
             	catch (IOException exception) {  
                      System.out.println("An unexpected error is occurred.");  
                      exception.printStackTrace();  
          	}   
	}
	
	public void escreve(String dados){	
		try {  
			FileWriter fwrite = new FileWriter(this.getNome());  
			fwrite.write(dados);   
			fwrite.close();   
			System.out.println("Content is successfully wrote to the file.");  
    		} 
    		catch (IOException e) {  
        		System.out.println("Unexpected error occurred");  
        		e.printStackTrace();  
        	}  
	
	}
	
	public String leitura(){
		String saida,fileData; 
		saida = "";
		try {  
		
            		File f1 = new File(this.getNome());    
            		Scanner dataReader = new Scanner(f1);  
				while (dataReader.hasNextLine()) {  
					fileData = dataReader.nextLine();  
					saida = saida + "\n" + fileData;
			   	}  
            		dataReader.close();  
        	} 
        	catch (IOException exception) {  
            		System.out.println("Unexcpected error occurred!");  
            		exception.printStackTrace();  
        	}  
        	return saida;
    	}  
    	
    	
    	public void imprimeTokens(String str, String token) {
	    StringTokenizer tokenizer = new StringTokenizer(str, token);
	    while (tokenizer.hasMoreElements()) {
		System.out.println(tokenizer.nextToken());
	    }
	}
    	


}
