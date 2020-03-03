/*** Lista 2 - Estrutura de decisão ***/
// A partir de um número inteiro, informar se este é positivo, negativo ou zero.

import javax.swing.JOptionPane;

class Exercicio11 {
  public static void main(String[] args) {
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero inteiro: "));

    if (numero < 0) {
      JOptionPane.showMessageDialog(null, numero + " Eh negativo.");
    }
    else if (numero > 0) {
      JOptionPane.showMessageDialog(null, numero + " Eh positivo.");
    }
    else {
      JOptionPane.showMessageDialog(null, "Eh zero.");
    }
  }
}
