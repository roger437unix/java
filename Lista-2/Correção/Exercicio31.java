// Para dois números, determinar qual é o maior entre eles
// imprimindo na tela (“O primeiro é o maior” ou “O segundo é o maior”).
// Caso sejam iguais, deve ser informado

import javax.swing.JOptionPane;

class Exercicio31 {
  public static void main(String[] args) {
    double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um numero: "));
    double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Informe outro numero: "));

    if(numero1 > numero2) {
      JOptionPane.showMessageDialog(null, "O primeiro eh o maior.");
    }
    else if (numero1 < numero2){
      JOptionPane.showMessageDialog(null, "O primeiro eh o maior.");
    }
    else {
      JOptionPane.showMessageDialog(null, "Sao iguais.");
    }
  }
}
