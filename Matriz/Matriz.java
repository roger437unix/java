
// Exemplo de utilização de matrizes

public class Matriz {
	public static void main(String[] args) {		
		
		int n[][];
		n = new int[2][2];
		
		n[0][0] = 1;
		n[0][1] = 2;
		n[1][0] = 3;
		n[1][1] = 4;
		
		for (int i=0 ; i<n.length ; i++) {
			for (int j=0 ; j<n[0].length ; j++) {
				System.out.print(n[i][j] + "  ");				
			}
			System.out.println();
		}		
		
		System.out.println();
		
		
//*************************************************************		
				
		int matriz[][] = {{1,2,3}, {4,5}, {7}};
		
		for (int vetor[] : matriz) {
			 for (int elemento : vetor) {
				 System.out.printf("%d ",elemento);
			 }
			 System.out.println();
		}
		
		// Exibe quantidade de linhas da matriz
		System.out.println("\nLinhas da matriz: " + matriz.length);
				
		// Exibe quantidade de colunas da primeira linha da matriz
		System.out.println("\nColunas da primeira linha: " + matriz[0].length);
		
		// Exibe quantidade de colunas da segunda linha da matriz
		System.out.println("Colunas da segunda  linha: " + matriz[1].length);
		
		// Exibe quantidade de colunas da terceira linha da matriz
		System.out.println("Colunas da terceira linha: " +matriz[2].length);
		
		System.out.println();
		
		
//*************************************************************
		
		int matrizA[][] = {{8, -3, 2}, {0, 7, -4}, {-2, 6, -7}};
		int matrizB[][] = {{-5, 5, 0}, {10, -3, -3}, {1, -5, 2}};
		int matrizC[][] = new int[3][3];
		
		// matrizC = matrizA + matrizB
		for (int i=0 ; i<matrizC.length ; i++) {
			for (int j=0 ; j<matrizC[0].length ; j++) {
				matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}
		
		// Exibe a matrizA
		for (int i=0 ; i < matrizA.length ; i++) {
			for (int j=0 ; j < matrizA[0].length ; j++) {
				System.out.print(matrizA[i][j] + "    ");				
			}
			System.out.println();
		}		
		System.out.println();
		
		// Exibe a matrizB
		for (int i=0 ; i < matrizB.length ; i++) {
			for (int j=0 ; j < matrizB[0].length ; j++) {
				System.out.print(matrizB[i][j] + "    ");				
			}
			System.out.println();
		}		
		System.out.println();
		
		// Exibe a matrizC
		for (int i=0 ; i < matrizC.length ; i++) {
			for (int j=0 ; j < matrizC[0].length ; j++) {
				System.out.print(matrizC[i][j] + "    ");				
			}
			System.out.println();
		}		
	}
}