
// Gera e exibe uma matriz quadrada de números aleatórios

import java.util.Random;

public class MatrizNumerosAleatorios {
	
	public static void main(String[] args) {
		Random numeros = new Random();
		int coordenadas = 8;
		
		int matriz[][] = new int[coordenadas][coordenadas];
		
		for (int i=0 ; i<matriz.length ; i++) {
			for (int j=0 ; j<matriz[0].length ; j++) {
				matriz[i][j] = numeros.nextInt(100);
			}			
		}
		
		for (int i=0 ; i< matriz.length ; i++) {
			for (int j=0 ; j<matriz[0].length ; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println("\n");
		}		
	}
}
