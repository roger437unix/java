/**************************************************************************
1.	Calcular a potência para base e expoente qualquer inteiro positivo.

* Não usar Math.pow()
* Esse programa deve conseguir calcular 10 = 10.000.000.000
* x ^ 0 = 1 , sendo x != 0
* 0 ^ 0 é uma indeterminação e por convenção igual a um [usar a convenção]

***************************************************************************/

import java.util.Scanner;

public class Potencia {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("\nInforme o valor da base: ");
    int base = ler.nextInt();
    System.out.print("Informe o valor do expoente: ");
    int expoente = ler.nextInt();

    long potencia = 1;
    for (int i = 0 ; i < expoente ; i++) {
      potencia *= base;
    }

    System.out.print("\n" + base + " ^ " + expoente + " = " + potencia + "\n");
  }
}
