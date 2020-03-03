
import java.util.Scanner;

public class Moldura {
	
	static char bloco = '\u2588';
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("\nEscreva uma frase:\n");
		String texto = ler.nextLine();
		moldura(texto);	
		ler.close();
	}
	
	// Emoldura uma frase qualquer
	public static void moldura(String frase) {
		int tamanho = frase.length();
		System.out.println();
		barra(tamanho + 4);
		System.out.println(bloco + " " + frase + " " + bloco);
		barra(tamanho + 4);				
	}
	
	// Cria parte superior e inferior da moldura
	public static void barra(int quantidade) {		
		for (int i=0 ; i < quantidade ; i++) {
			System.out.print(bloco);
		}
		System.out.println();
	}
}
