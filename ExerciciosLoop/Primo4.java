/**********************************************************************************************
Usuário informa um número inteiro que determina a quantidade de números primos
que devem ser listados a partir do primeiro número primo. Exemplo:

Informe um nº: 20

2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71

**********************************************************************************************/

import java.util.Scanner;

class Primo4 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("\nInforme a quantidade de n\u00fameros primos a exibir: ");
    int quantidade = ler.nextInt();

    long numero = 2;
    boolean referencia = true;
    int contador = 0;

    System.out.println();
    while (contador < quantidade) {
      for (int i = 2 ; i <= numero/2 ; i++) {
        if (numero % i == 0) {
          referencia = false;
          break;
        }
      }
      if (referencia) {
        System.out.print(numero + "  ");
        contador++;
      }
      else {
        referencia = true;
      }
      numero++;
    }
    System.out.println();
  }
}
