// Para um número qualquer, informar se este é maior ou menor
// que dez, ou o próprio dez.

import javax.swing.JOptionPane;

class Exercicio21 {
  public static void main(String[] args) {
    double numero = Double.parseDouble(JOptionPane.showInputDialog("Informe um numero: "));

    if (numero > 10) {
      JOptionPane.showMessageDialog(null, numero + " eh maior que 10.");
    }
    else if (numero < 10){
      JOptionPane.showMessageDialog(null, numero + " eh menor que 10.");
    }
    else {
      JOptionPane.showMessageDialog(null, "Eh o dez.");
    }
  }
}
