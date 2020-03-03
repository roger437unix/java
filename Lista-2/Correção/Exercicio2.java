// Para um número qualquer, informar se este é maior ou menor 
// que dez, ou o próprio dez.

import java.util.Scanner;

class Exercicio2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("\nInforme um numero: ");
    double numero = scan.nextDouble();

    if (numero > 10) {
      System.out.println("\n" + numero + " eh maior que 10.\n");
    }
    else if (numero < 10){
      System.out.println("\n" + numero + " eh menor que 10.\n");
    }
    else {
      System.out.println("\nEh o 10.\n");
    }
  }
}
