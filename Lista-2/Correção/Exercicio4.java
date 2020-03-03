// A partir de um número inteiro, informar se este é par ou ímpar.

import java.util.Scanner;

class Exercicio4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("\nInforme um numero: ");
    int numero = scan.nextInt();

    if (numero % 2 == 0) {
      System.out.println("\n" + numero + " eh par.\n");
    }
    else {
      System.out.println("\n" + numero + " eh impar.\n");
    }
  }
}
