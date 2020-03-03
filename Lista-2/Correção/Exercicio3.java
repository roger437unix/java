// Para dois números, determinar qual é o maior entre eles
// imprimindo na tela (“O primeiro é o maior” ou “O segundo é o maior”).

import java.util.Scanner;

class Exercicio3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("\nInforme um numero: ");
    double numero1 = scan.nextDouble();
    System.out.print("\nInforme outro numero: ");
    double numero2 = scan.nextDouble();

    if(numero1 > numero2) {
      System.out.println("\nO primeiro eh o maior.\n");
    }
    else if (numero1 < numero2){
      System.out.println("\nO segundo eh o maior.\n");
    }
    else {
      System.out.println("\nSao iguais.\n");
    }
  }
}
