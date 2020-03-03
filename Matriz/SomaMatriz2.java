
public class SomaMatriz2 {

	public static void main(String[] args) {
		int matrizA [][] = {{8, -5 , 3}, {0, 1, 9}, {-4, 7, 0}};
		int matrizB [][] = new int[3][3];
		int matrizC [][] = new int[3][3];
		
		matrizB[0][0] = 5;
		matrizB[0][1] = 7;
		matrizB[0][2] = 9;
		matrizB[1][0] = -5;
		matrizB[1][1] = 0;
		matrizB[1][2] = 3;
		matrizB[2][0] = 1;
		matrizB[2][1] = -3;
		matrizB[2][2] = 0;
		
		matrizC = somaMatriz(matrizA, matrizB);
		
    exibeMatriz(matrizA);
		exibeMatriz(matrizB);
		exibeMatriz(matrizC);		
	}	
	
	
	public static int[][] somaMatriz(int m1[][], int m2[][]) {
		int m3[][] = new int[m1.length][m1[0].length];
		
		for (int linha=0 ; linha<m3.length ; linha++) {
			for (int coluna=0 ; coluna<m3[0].length ; coluna++) {
				m3[linha][coluna] = m1[linha][coluna] + m2[linha][coluna];
			}
		}		
		return m3;
	}
		
		
	public static void exibeMatriz(int matriz[][]) {
		System.out.println();
		for (int linha=0 ; linha<matriz.length ; linha++) {
			for (int coluna=0 ; coluna<matriz[0].length ; coluna++) {
				System.out.print(matriz[linha][coluna] + "\t");
			}
			System.out.println();
		}	
	}
}
