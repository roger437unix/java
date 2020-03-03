/*********************************************************
1. A partir de dois números decimais e efetuar as quatros
operações matemáticas básicas, apresentando ao final os
resultados obtidos.
*********************************************************/

class Exercicio1 {
  public static void main(String[] args) {
    double numero1 = 7.0;
    double numero2 = 4.2;

    double soma = numero1 + numero2;
    double subtracao = numero1 - numero2;
    double multiplicacao = numero1 * numero2;
    double divisao = numero1 / numero2;

    System.out.println();
    System.out.println(numero1 + " + " + numero2 + " = " + soma);
    System.out.println(numero1 + " - " + numero2 + " = " + subtracao);
    System.out.println(numero1 + " * " + numero2 + " = " + multiplicacao);
    System.out.println(numero1 + " / " + numero2 + " = " + divisao);
  }
}
