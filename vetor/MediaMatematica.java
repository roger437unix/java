
// Exemplo de uso vetor[]
// Calcula a média aritmética entre notas
// Informa a maior e menor nota

import java.util.Scanner;

public class MediaMatematica {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double nota[] = new double[6];
		
		for (int i=0 ; i < nota.length ; i++) {
			System.out.print("Digite a " + (i+1) + "ª nota: ");
			nota[i] = ler.nextDouble();			
		}		
		
		double soma = 0;
		
		for (int i=0 ; i < nota.length ; i++) {
			soma += nota[i];
		}
		
		double media = soma / nota.length;
		System.out.println("\nMédia = " + media);


		// Encontra a maior e menor nota		
		double maior = nota[0];
		double menor = nota[0];
		
		for (int i=0 ; i < nota.length ; i++) {
			if (maior < nota[i]) {
				maior = nota[i];
			}
			if (menor > nota[i]) {
				menor = nota[i];
			}			
		}
		
		System.out.println("\nMaior valor: " + maior);
		System.out.println("Menor valor: " + menor);
		
		ler.close();		
	}
}
