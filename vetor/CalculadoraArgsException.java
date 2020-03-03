
// Soma dois valores passados via linha de comando
// Usa tratamento de exceção

public class CalculadoraArgsException {
	public static void main(String[] args) {

	    double soma = 0;

	    for (int i=0 ; i<args.length ; i++) {
	      try {
	        soma += Double.parseDouble(args[i]);
	      }
	      catch(NumberFormatException e) {
	        System.out.println("\nErro na entrada de dados!!!");
	      }
	      catch(Exception e) {
	    	  System.out.println("\nErro desconhecido.");
	    	  
	      }
	    }
	    System.out.println("\nSoma dos valores da entrada: " + soma);
	  }
}
