
// Soma os elementos de duas matrizes 2x2

public class SomaMatriz {
	
	public static void main(String[] args) {
	    int m1[][] = new int[][] {{5,8}, {2,0}};
	    int m2[][] = new int[][] {{1,4}, {3,6}};
	  	int m3[][] = new int[2][2];
	  	
	  	for (int i=0 ; i<m1.length ; i++) {
	  		for (int j=0 ; j<m1[0].length ; j++) {
	  			m3[i][j] = m1[i][j] + m2[i][j];	  			
	  		}
	  	}
	  	
	  	for (int i=0 ; i<m1.length; i++) {
	  		for (int j=0 ; j<m1[0].length ; j++) {
	  			System.out.print(m3[i][j] + "  ");
	  		}
	  		System.out.println();
	  	}
	}
}