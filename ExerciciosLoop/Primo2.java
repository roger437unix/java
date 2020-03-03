/**********************************************************************************************
Usuário digita um número inteiro maior que dois e programa informa se é ou não um número primo.
Se o número não for primo, indicar o primeiro número (exceção do número 1) que este é divisível
**********************************************************************************************/

import javax.swing.JOptionPane;

class Primo2 {
  public static void main(String[] args) {
    long numero = 2;

    while (true) {
      numero = Long.parseLong(JOptionPane.showInputDialog("Digite um n\u00famero inteiro >= 2: "));
      if (numero >= 2) {
        break;
      }
    }
    boolean referencia = true;
    long i;
    for (i = 2 ; i <= numero / 2 ; i++) {
      if (numero % i == 0) {
        referencia = false;
        break;
      }
    }
    if (referencia) {
      JOptionPane.showMessageDialog(null, numero + " \u00e9 primo.");
    }
    else {
      JOptionPane.showMessageDialog(null, numero + " n\u00e3o \u00e9 primo pois \u00e9 divis\u00edvel por " + i);
    }
  }
}
