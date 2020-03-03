
// Soma dois valores passados via linha de comando

public class CalculadoraArgs {
	public static void main(String[] args) {

	    double soma = 0;

	    for (int i=0 ; i<args.length ; i++) {
	      soma += Double.parseDouble(args[i]);
	    }
	    System.out.println("\nSoma dos valores da entrada: " + soma);
	  }
}
