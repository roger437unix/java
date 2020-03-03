/************************************************************
7. Calcula e mostra o fatorial de um número inteiro positivo.
Obs.: Por definição o fatorial de '0' e '1' é igual a '1'.
0! = 1                    1! = 1                    5! = 120
*************************************************************/

import javax.swing.JOptionPane;

class Fatorial {
  public static void main(String[] args) {
    int numero = 0;
    while (true) {
      numero = Integer.parseInt(JOptionPane.showInputDialog("N\u00famero [inteiro e positivo] para fatorial: "));
      if (numero >= 0 ) {
        break;
      }
    }

    long fatorial = 1;
    for (int i = 2 ; i <= numero ; i++) {
      fatorial *= i;
    }
    JOptionPane.showMessageDialog(null, numero + " !  =  " + fatorial);
  }
}
