import java.util.Scanner;

class Euler2 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("\nInforme o valor inicial de 'x' para calcular 'e': ");
    double x = ler.nextDouble();
    System.out.print("\nInforme a quantidade de repetições: ");
    int qtd = ler.nextInt();

    double e = 0;

    System.out.println("\n");
    for ( int i = 0  ; i < qtd ; x++, i++) {
      e = Math.pow(1+1/x, x);
      System.out.println(i+1 + ".  e = " + e);
    }
  }
}
