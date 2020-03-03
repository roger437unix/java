// A partir de um número inteiro, informar se este é par ou ímpar.

import javax.swing.JOptionPane;

class Exercicio41 {
  public static void main(String[] args) {
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero inteiro: "));

    if (numero % 2 == 0) {
      JOptionPane.showMessageDialog(null, numero + " eh par.");
    }
    else {
      JOptionPane.showMessageDialog(null, numero + " eh impar.");
    }
  }
}
