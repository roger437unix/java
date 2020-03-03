// A partir de um valor em metros, converta para km, hm, dam, dm, cm e mm.

import java.util.Scanner;

class Exercicio7 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("\nInforme a medidade em metros: ");
    double metro = scan.nextDouble();

    System.out.printf("\n%.2f m equivale %.3f km\n", metro, metro  / 1000);
    System.out.printf("%.2f m equivale %.3f hm\n", metro, metro  / 100);
    System.out.printf("%.2f m equivale %.3f dam\n", metro, metro / 10);
    System.out.printf("%.2f m equivale %.3f dm\n", metro, metro  / 0.1);
    System.out.printf("%.2f m equivale %.3f cm\n", metro, metro  / 0.01);
    System.out.printf("%.2f m equivale %.3f mm\n\n", metro, metro  / 0.001);
  }
}
