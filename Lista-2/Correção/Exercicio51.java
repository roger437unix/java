// Informe se usuário é menor ou maior de idade.

import javax.swing.JOptionPane;

class Exercicio51 {
  public static void main(String[] args) {
    int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));

    if (idade < 18) {
      JOptionPane.showMessageDialog(null, "Voce eh menor de idade.");
    }
    else {
      JOptionPane.showMessageDialog(null, "Voce eh maior de idade.");
    }
  }
}
