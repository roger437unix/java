/**********************************************
Usuário digita um número inteiro maior que dois
e programa informa se é ou não um número primo.
**********************************************/

import javax.swing.JOptionPane;

class Primo {
  public static void main(String[] args) {
    long numero = 2;

    while (true) {
      numero = Long.parseLong(JOptionPane.showInputDialog("Digite um n\u00famero inteiro >= 2: "));
      if (numero >= 2) {
        break;
      }
    }
    boolean referencia = true;
    for (long i = 2 ; i <= numero / 2 ; i++) {
      if (numero % i == 0) {
        referencia = false;
        break;
      }
    }
    if (referencia) {
      JOptionPane.showMessageDialog(null, numero + " \u00e9 primo.");
    }
    else {
      JOptionPane.showMessageDialog(null, numero + " n\u00e3o \u00e9 primo.");
    }
  }
}
