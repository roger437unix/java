/********************************************************************************
A partir do peso e altura de uma pessoa, calcule o IMC (Índice de massa corpóreo)
indicando o estado dessa pessoa baseado na tabela abaixo.

Resultado [IMC]             Situação
Abaixo de 17                Muito abaixo do peso
Entre 17 e 18,49            Abaixo do peso
Entre 18,5 e 24,99          Peso normal
Entre 25 e 29,99            Acima do peso
Entre 30 e 34,99            Obesidade I
Entre 35 e 39,99            Obesidade II (severa)
Acima de 40                 Obesidade III (mórbida)
********************************************************************************/

import java.util.Scanner;

class Exercicio8 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("\nInforme seu peso: ");
    double peso = scan.nextDouble();
    System.out.print("Informe sua altura: ");
    double altura = scan.nextDouble();

    double imc = peso / Math.pow(altura, 2);
    System.out.println("\nIMC = " + imc);

    if (imc < 17) {
      System.out.println("\nMuito abaixo do peso.\n");
    }
    else if (imc >= 17 && imc < 18.5) {
      System.out.println("\nAbaixo do peso.\n");
    }
    else if (imc >= 18.5 && imc < 25) {
      System.out.println("\nPeso normal.\n");
    }
    else if (imc >= 25 && imc < 30) {
      System.out.println("\nAcima do peso.\n");
    }
    else if (imc >= 30  && imc < 35) {
      System.out.println("\nObesidade I.\n");
    }
    else if (imc >= 35 && imc < 40) {
      System.out.println("\nObesidade II (Severa).\n");
    }
    else {
      System.out.println("\nObesidade III (Morbida).\n");
    }
  }
}
