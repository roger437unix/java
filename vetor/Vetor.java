
// Exemplo de utilização de vetores

public class Vetor {
	
	public static void main(String[] args) {
		
		// Declaração de vetor e alocação de memória em instruções separadas
		int n1[];
		n1 = new int[5];
		
		// Declaração de vetor e alocação de memória na mesma instrução		
		int n2[] = new int[10];
		
		// Declaração de vetor, alocação de memória e inicialização
		double n3[] = new double[] {0,1,2,3,4,5};
		
		// Declaração de vetor, alocação de memória e inicialização [forma simplificada]		
		int n4[] = {10,20,30,40,50};
		
		
/****** Atribuição de valores ******/  
		
		n1[0] = 100;
		n2[1] = 200;
		n3[2] = 20;		
		n4[0] = 10;	
		
		
/****** Laço for e for each ******/	
		
		for (int i=0 ; i<n3.length ; i++) {
			System.out.print(n3[i] + "  ");
		}

		System.out.println();
		
		// For each [para cada] inicia com o tipo do vetor
		for (double i: n3) {
			System.out.print(i + "  ");
		}
		
		System.out.println();
		

/****** Tratando  exceção ******/
		
		int vet[] = {100, 200, 300, 400, 500};
		
		try {
			System.out.println(vet[vet.length]);
		}
		catch (ArrayIndexOutOfBoundsException erro) {
			System.out.println("\nOoops... índice do vetor acima do limite!!!\n");
			System.out.println("Erro do sistema: " + erro);
		}
		
		
/****** Pesquisa em vetor e identificação de maior e menor número ******/
		
		int vetor[] = {1, 8, 9, 0, 5, 4, 7, 12, -3, 2, 6};
		
		int maior = vetor[0];
		int menor = vetor[0];
		
		for (int i=0 ; i<vetor.length ; i++) {
			if (maior < vetor[i]) {
				maior = vetor[i];
			}
			if (menor > vetor[i]) {
				menor = vetor[i];
			}
		}
		
		System.out.println();
		for (int i=0 ; i<vetor.length ; i++) {
			System.out.print(vetor[i] + "  ");
		}
		
		System.out.println("\n");
		System.out.println("Maior nº: " + maior);
		System.out.println("Menor nº: " + menor);		
	}
}
