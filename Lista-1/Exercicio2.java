// A partir de dois valores inteiros:

class Exercicio2 {
  public static void main(String[] args) {
    int numero1 = 7;
    int numero2 = 4;

    // Calcular e exibir a potência de cada
    // um deles com expoente 5.

    double potencia1 = Math.pow(numero1, 5);
    double potencia2 = Math.pow(numero2, 5);

    System.out.println();
    System.out.println(numero1 + " ^ 5  = " + potencia1);
    System.out.println(numero2 + " ^ 5  = " + potencia2);

    // Calcular e exibir a divisão entre os inteiros
    // guardando em uma variável int.

    int divisao = numero1 / numero2;

    System.out.println(numero1 + " / " + numero2 + " = " + divisao);

    // Calcular e exibir o módulo [resto
    // da divisão entre dois inteiros].

    int modulo = numero1 % numero2;

    System.out.println(numero1 + " % " + numero2 + " = " + modulo);

    // Calcular e exibir a raiz quadrada
    // de cada um deles

    double raiz1 = Math.sqrt(numero1);
    double raiz2 = Math.sqrt(numero2);

    System.out.println("Raiz quadrada de " + numero1 + " = " + raiz1);
    System.out.println("Raiz quadrada de " + numero2 + " = " + raiz2);
  }
}
