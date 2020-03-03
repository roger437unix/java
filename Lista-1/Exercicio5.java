// Fazer a conversão de um valor em
// Dólar [USA] para o seu equivalente em Real.

class Exercicio5 {
  public static void main(String[] args) {
    double valorEmDolar = 100.0;
    double taxaDoValor = 3.72;

    double valorEmReal = valorEmDolar * taxaDoValor;

    System.out.println("\nU$" + valorEmDolar + " corresponde R$" + valorEmReal);
  }
}
