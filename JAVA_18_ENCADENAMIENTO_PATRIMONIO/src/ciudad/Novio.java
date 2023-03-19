package ciudad;


public class Novio {

	private static final int  NIVEL_INTERES; 
	
	
	static {
		NIVEL_INTERES = 600000;
	}
	
	
	
	public static String casarseSINO (int patrimonio) {
		
		System.out.println("\n\n\t ''' ¿A VER CUANTA PASTA TIENE ESTA ? ... " + patrimonio + 
										" ... Y COMO YO QUIERO COMO MINIMO " + NIVEL_INTERES +
													" ''' ... \n\n");
		
		return NIVEL_INTERES <= patrimonio ? 
										"SI, ME CASO PORQUE NO PUEDO VIVIR SIN TI" 
											:
										"NO, QUIZAS SEA DEMASIADO PRONTO, LUEGO MEJOR ESPERAMOS UN TIEMPO";
		
	}

}
