package urbanizacion;


import pueblo.Abuela;


public class Madre extends Abuela {

	protected int precioChalet;

	
	protected Madre(int precioTierras, int precioChalet) {
		
		super(precioTierras);
		
		this.precioChalet = precioChalet;
		
		System.out.println("\n\n 2 >>> SE LLAMA AL CONSTRUCTOR DE LA MADRE ... " + precioChalet);
		
	}
	
}
