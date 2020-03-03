import java.util.Scanner;

class Login {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String loginCadastrado = "tux";
    String senhaCadastrada = "123";

    System.out.println("\nAutentica\u00e7\u00e3o no Sistema\n");

    int i = 0;
    while(i < 3) {
      System.out.print("Usu\u00e1rio: ");
      String login = ler.next();
      System.out.print("Senha: ");
      String senha = ler.next();

      if (loginCadastrado.equals(login) && senhaCadastrada.equals(senha)) {
        System.out.println("\nSeja bem-vindo " + login);
        break;
      }
      else {
        switch(i) {
          case 0: System.out.println("\nPrimeira tentativa, faltam duas.\n");   i++; break;
          case 1: System.out.println("\nSegunda tentativa, falta uma.\n");      i++; break;
          case 2: System.out.println("\nExcedido o n\u00famero de tentativas. SENHA BLOQUEADA.\n"); i++;
        }
      }
    }
  }
}
