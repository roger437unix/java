/***************************************
Calcular o valor final de uma compra,
com desconto percentual qualquer.
***************************************/

class Exercicio4 {
  public static void main(String[] args) {
    double valorDaCompra = 20.0;
    double descontoPercentual = 15.8;

    double valorDoDesconto = (valorDaCompra * descontoPercentual) / 100;
    double totalPagar = valorDaCompra - valorDoDesconto;

    System.out.println();
    System.out.println("Compra: R$" + valorDaCompra);
    System.out.println("Desconto: " + descontoPercentual + " %");
    System.out.println("Total : R$" + totalPagar);
  }
}
