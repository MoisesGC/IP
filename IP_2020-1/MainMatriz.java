public class MainMatriz{

	public static void main(String[] args) {
	

		Matriz matObj;
		matObj = new Matriz(4,4);

		//System.out.println(matObj.getElemento(0,0));
		//System.out.println(matObj.getElemento(0,1));
		//System.out.println(matObj.getElemento(1,0));
		//System.out.println(matObj.getElemento(1,1));
		matObj.imprimir();
		matObj.inicializaRandomico();
		matObj.imprimir();
		matObj.multiplicaPorValor(2);
		matObj.imprimir();

	}

}	
		    
