/*** Lista 2 - Estrutura de decisão ***/
// A partir de um número inteiro, informar se este é positivo, negativo ou zero.

import java.util.Scanner;

class Exercicio1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("\nInforme um numero inteiro: ");
    int numero = scan.nextInt();

    if (numero < 0 ) {
      System.out.println("\n" + numero + " eh negativo.\n");
    }
    else if (numero > 0 ) {
      System.out.println("\n" + numero + " eh positivo.\n");
    }
    else {
      System.out.println("\nEh zero.\n");
    }
  }
}
