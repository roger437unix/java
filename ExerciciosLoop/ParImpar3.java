import java.util.Scanner;

class ParImpar3 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    while (true) {
      System.out.print("\nInforme um n\u00famero: ");
      int numero = ler.nextInt();

      if (numero % 2 == 0) {
        System.out.println("\n" + numero + " \u00e9 par.\n");
      }
      else {
        System.out.println("\n" + numero + " \u00e9 impar.\n");
      }

      // Tipos primitivos se compara com "=="

      /**********************************************
      System.out.print("Continuar? [s/n]: ");
      // Lendo apenas o primeiro caractere
      char op = ler.next().charAt(0);
      if (op != 's' && op != 'S') {
        break;
      }
      ***********************************************/

      // Tipos complexos como String se compara com "equals()"

      System.out.print("Continuar? [sim/n\u00e3o]: ");
      String op = ler.next();
      if (!(op.equals("sim"))) {
        break;
      }
    }
  }
}
