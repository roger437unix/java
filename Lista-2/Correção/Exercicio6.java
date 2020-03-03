// Informe se usuário é menor ou maior de idade, porém, valide a idade, 
// sendo que esta deve ser maior que zero e menor ou igual a 150.

import java.util.Scanner;

class Exercicio6 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("\nInforme sua idade: ");
    int idade = scan.nextInt();

    if (idade > 0 && idade <= 150) {
      if (idade < 18) {
        System.out.println("\nVoce eh menor de idade.\n");
      }
      else {
        System.out.println("\nVoce eh maior de idade.\n");
      }
    }
    else {
      System.out.println("\nIdade invalida.\n");
    }
  }
}
