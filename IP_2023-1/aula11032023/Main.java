import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		boolean condicao;
		int temp;
		
		Scanner ler = new Scanner(System.in);
		
		Triangulo myTrian = new Triangulo();
		
		System.out.print("Digite o tamanho do primeiro lado: " );
		temp = ler.nextInt();
		myTrian.setLadoA(temp);
		System.out.println();
		
		System.out.print("Digite o tamanho do segundo lado: " );
		temp = ler.nextInt();
		myTrian.setLadoB(temp);
		System.out.println();
		
		System.out.print("Digite o tamanho do terceiro lado: " );
		temp = ler.nextInt();
		myTrian.setLadoC(temp);
		System.out.println();
		
		myTrian.identificaTriangulo();

		
	}
	
	
	

}
