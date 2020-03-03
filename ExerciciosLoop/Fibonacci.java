/*************************************************************
Mostra a série de Fibonacci, sendo que o usuário determinado
a quantidade de números desta série que deve aparecer na tela.
*************************************************************/
import java.util.Scanner;

class Fibonacci {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("\nQuantidade de algarismos para s\u00e9rie de Fibonacci? ");
    int quantidade = ler.nextInt();

    if (quantidade == 0) {
      System.out.println();
      System.exit(0);
    }
    if (quantidade == 1) {
      System.out.println("\n1");
      System.exit(0);
    }

    long n1 = 1;
    long n2 = 1;

    System.out.print("\n" + n1 + "\t" + n2 + "\t");

    long n3 = 0;
    for (int i = 0 ; i < quantidade -2 ; i++) {
      n3 = n1 + n2;
      System.out.print(n3 + "\t");
      n1 = n2;
      n2 = n3;
    }
    System.out.println();
  }
}
