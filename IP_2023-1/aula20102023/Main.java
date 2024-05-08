class Main{

	public static void main(String[] args){
		System.out.println("Aula de Matrizes");
		
		
		Matriz m1 = new Matriz(4,3);
		Matriz m2 = new Matriz(3,4);
		Matriz resp;
		m1.inicializaRandomico();
		m2.inicializaRandomico();
		m1.imprime();
		m2.imprime();
		System.out.println();
		resp = m1.multiplicaMatriz(m1,m2);
		if (resp != null){
			resp.imprime();
		}
		else{
			System.out.println("Nao rolou....");
		}
		
		
		
		
	}


}
