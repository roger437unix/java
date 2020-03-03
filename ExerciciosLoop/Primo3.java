/**********************************************************************************************
Usuário digita um número inteiro maior que dois e programa informa se é ou não um número primo.
Se o número não for primo, indicar todos os números (exceção do número 1) que este é divisível.
**********************************************************************************************/

import java.util.Scanner;

class Primo3 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    long numero = 2;

    System.out.println();
    while (true) {
      System.out.print("Digite um n\u00famero inteiro >= 2: ");
      numero = ler.nextLong();
      if (numero >= 2) {
        break;
      }
    }
    boolean referencia = true;
    long i;
    System.out.println();
    for (i = 2 ; i <= numero / 2 ; i++) {
      if (numero % i == 0) {
        if (referencia == true) {
          System.out.print(numero + " n\u00e3o \u00e9 primo, \u00e9 divis\u00edvel por:  ");
        }
        System.out.print(i + "  ");
        referencia = false;
      }
    }
    if (referencia) {
      System.out.print(numero + " \u00e9 primo.");
    }
    System.out.println();
  }
}
