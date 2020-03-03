import java.util.Scanner;

class Euler {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("\nInforme o valor de 'x' para determinar 'e': ");
    double x = ler.nextDouble();

    double e = Math.pow(1+1/x, x);
    System.out.println("\ne = " + e);
  }
}
