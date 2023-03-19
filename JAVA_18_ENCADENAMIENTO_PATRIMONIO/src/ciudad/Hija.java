package ciudad;


import urbanizacion.Madre;


public final class Hija extends Madre {

	private static final int DEUDAS = 0;
	
	// EN EL OBJETO FANTASMA ... EN EL CLASS ... LA NUBE ... LA DEFINICIÓN DE LA CLASE ---> SON ESTÁTICOS.
	
	// LAS CONSTANTES HAN DE SER OBLIGATORIAMENTE ESTÁTICAS SI LAS UTILIZAMOS COMO VALORES EN EL ENCADENAMIENTO
	//	HACIA EL CONSTRUCTOR DE LA CLASE MADRE (el objeto Hija aún no se ha creado)
	private static final int PRECIO_VENTA_TIERRAS 	= 150000;
	private static final int PRECIO_VENTA_CHALET 	= 400000;
	private static final int PRECIO_VENTA_PISO		= 180000 - DEUDAS; // MUCHAS PENDIENTES ... 10000.
		
	
	private final int precioPiso;
	
	private int patrimonio;
	
		
	
	public Hija() {

		/*
		this(0,0,0); 	// ME TOCA DEJARLO PARA NO DESTROZAR EL CÓDIGO DE CONSTRUCTORES DE MADRE Y ABUELA
						// ... NO LO NECESITO SI QUIERO HACER ASIGNACIÓN DIRECTA (DEJA LOS IMPLÍCITOS EN
						//		MADRE Y ABUELA ... NO LOS PARAMETRICES NI ENCADENES POR TU CUENTA.

		
		// ASIGNACIÓN DIRECTA:
		precioTierras	= PRECIO_VENTA_TIERRAS;
		precioChalet 	= PRECIO_VENTA_CHALET;
		precioPiso 		= PRECIO_VENTA_PISO;
		*/
		
		
		// ASIGNACIÓN POR ENCADENAMIENTO VERTICAL SUCESIVO DE CONSTRUCTORES:
		
		//this(1,2,3);
		
		
		
		////////// ORDEN DE VENTA POR ENCADENAMIENTO ////////////
		
		this(PRECIO_VENTA_TIERRAS, PRECIO_VENTA_CHALET, PRECIO_VENTA_PISO);

				
		////////// CALCULAR PATRIMONIO ////////////
		
		patrimonio = precioTierras + precioChalet + precioPiso;

		
		///////// SOLICITAR CASAMIENTO ////////////
		
		System.out.println("\n\n\t\t\tMI NOVIO DICE ... " + Novio.casarseSINO(patrimonio));		
		
	}
	
	
	private Hija(int precioTierras, int precioChalet, int precioPiso) {

		super(precioTierras, precioChalet);
		
		this.precioPiso = precioPiso;
		
		System.out.println("\n\n 3 >>> SE LLAMA AL CONSTRUCTOR DE LA HIJA ... " + precioPiso);
		
		
	}
	
}