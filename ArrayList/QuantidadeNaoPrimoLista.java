

// Informa todos os número que são divisíveis por uma número não primo *
// Usa ArrayList
// Usa tratamento de exceção

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class QuantidadeNaoPrimoLista {
	
	public static void main(String[] args) {		
		Scanner ler = new Scanner(System.in);
		System.out.println();
		long numero = 2L;	
		System.out.println();
		try {
			while (true) {
				System.out.print("Informe um inteiro positivo >=2 : ");
				numero = ler.nextLong();
				if (numero >= 2) {
					break;
				}				
			}						
		}		
		catch(InputMismatchException erro){  
			System.out.println("\nOops, isso não é um número inteiro!!!\n");	
			System.exit(0);
        }		
		catch (Exception erro) {
			System.out.println("\nErro indefinido\n");		
			System.exit(0);
		}
		primo(numero);
		ler.close();					
	}
	
	
	public static void primo(long num) {	
		
		ArrayList <Long> lista = new ArrayList<Long>();		
		boolean ref = true;
		
		for (long i=2L ; i<=num/2 ; i++) {
			if (num % i == 0) {
				if (ref) {
					System.out.println("\n" + num + " não é primo pois é divisível por:\n");
					ref = !ref;					
				}
				lista.add(i);				
			}
		}
		
		if (ref) {
			System.out.println("\n" + num + " é primo.\n");			
		}	
		else {
			for (int i=0 ; i< lista.size() ; i++) {
				System.out.print(lista.get(i) + "  ");
			}			
		}
	}
	
}
