// Informe se usuário é menor ou maior de idade, porém, valide a idade, 
// sendo que esta deve ser maior que zero e menor ou igual a 150.

import javax.swing.JOptionPane;

class Exercicio61 {
  public static void main(String[] args) {
    int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));

    if (idade > 0 && idade <= 150) {
      if (idade < 18) {
        JOptionPane.showMessageDialog(null, "Voce eh menor de idade");
      }
      else {
        JOptionPane.showMessageDialog(null, "Voce eh maior de idade");
      }
    }
    else {
      JOptionPane.showMessageDialog(null, "Idade invalida.");
    }
  }
}
