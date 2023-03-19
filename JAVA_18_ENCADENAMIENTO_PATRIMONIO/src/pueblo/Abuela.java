package pueblo;


public class Abuela {

	// "PRIVADO QUE SE HEREDA"
	protected int precioTierras;
	
	
 	// ESTE CONSTRUCTOR NO PUEDE SER UTILIZADO PARA INSTANCIACIÓN FUERA DEL PAQUETE, PERO SI PARA
	//		ENCADENAMIENTO POR PARTE DE LAS POSIBLES CLASES HIJAS (no importa en que paquete hayan
	//			sido estas ultimas difinidas).
	
	protected Abuela(int precioTierras) {		
		
		this.precioTierras = precioTierras;
		
		System.out.println("\n\n 1 >>> SE LLAMA AL CONSTRUCTOR DE LA ABUELA ... " + precioTierras);
		
	}
	
	
	/*
	public static void main(String[] args) {		
		
		// STACK-OVERFLOW-ERROR
		new Abuela(8);
	}
	*/
}
