/**************************************************************************
1.	Calcular a potência para base e expoente qualquer inteiro positivo.

* Não usar Math.pow()
* Esse programa deve conseguir calcular 10 = 10.000.000.000
* x ^ 0 = 1 , sendo x != 0
* 0 ^ 0 é uma indeterminação e por convenção igual a um [usar a convenção]

***************************************************************************/

import java.io.IOException;
import java.util.Scanner;

public class Potencia2 {
  public static void main(String[] args) throws IOException, InterruptedException {
    limpaTela();
    int base = entrada("N\u00famero \"inteiro positivo\" para a BASE: ");
    int expoente = entrada("N\u00famero \"inteiro positivo\" para o EXPOENTE: ");
    long potencia = calculaPotencia(base, expoente);
    System.out.println("\n" + base + " ^ " + expoente + " = " + potencia);
  }

/***************************************************************************/
// Limpa a tela no windows, no linux e no MacOS

  public static void limpaTela() throws IOException, InterruptedException {
    if (System.getProperty("os.name").contains("Windows"))
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    else
        Runtime.getRuntime().exec("clear");
  }

/***************************************************************************/
// Enquanto usuário não digitar número inteiro, fica em loop

  public static int entrada(String str) {
    Scanner ler = new Scanner(System.in);
    String strNumero;
    int numero = 0;
    int i = 0;
    System.out.println();
    while (true) {
      System.out.print(str);
      strNumero = ler.nextLine();
      while (i < strNumero.length()) {
        if (strNumero.charAt(i) >= '0' && strNumero.charAt(i) <= '9') {
          i++;
          continue;
        }
        else {
          break;
        }
      }
      if (i >= strNumero.length()) {
        break;
      }
    }
    numero = Integer.parseInt(strNumero);
    return numero;
  }

/***************************************************************************/
// Calcula a potencia de base e expoente qualquer inteiro positivo

  public static long calculaPotencia(int base, int expoente) {
    long potencia = 1;

    for (int i = 0 ; i < expoente ; i++) {
      potencia *= base;
    }
    return potencia;
  }
}
