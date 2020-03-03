// Informe se usuário é menor ou maior de idade.

import java.util.Scanner;

class Exercicio5 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("\nInforme sua idade: ");
    int idade = scan.nextInt();

    if (idade < 18) {
      System.out.println("\nVoce eh menor de idade.\n");
    }
    else {
      System.out.println("\nVoce eh maior de idade.\n");
    }
  }
}
