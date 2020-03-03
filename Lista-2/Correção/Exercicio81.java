/********************************************************************************
A partir do peso e altura de uma pessoa, calcule o IMC (Índice de massa corpóreo)
indicando o estado dessa pessoa baseado na tabela abaixo.

Resultado [IMC]             Situação
Abaixo de 17                Muito abaixo do peso
Entre 17 e 18,49            Abaixo do peso
Entre 18,5 e 24,99          Peso normal
Entre 25 e 29,99            Acima do peso
Entre 30 e 34,99            Obesidade I
Entre 35 e 39,99            Obesidade II (severa)
Acima de 40                 Obesidade III (mórbida)
********************************************************************************/

import javax.swing.JOptionPane;

class Exercicio81 {
  public static void main(String[] args) {
    double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso: "));
    double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura: "));

    double imc = peso / Math.pow(altura, 2);

    if (imc < 17) {
      JOptionPane.showMessageDialog(null, "IMC = " + imc + "\nMuito abaixo do peso.");
    }
    else if (imc >= 17 && imc < 18.5) {
      JOptionPane.showMessageDialog(null, "IMC = " + imc + "\nAbaixo do peso.");
    }
    else if (imc >= 18.5 && imc < 25) {
      JOptionPane.showMessageDialog(null, "IMC = " + imc + "\nPeso normal.");
    }
    else if (imc >= 25 && imc < 30) {
      JOptionPane.showMessageDialog(null, "IMC = " + imc + "\nAcima do peso.");
    }
    else if (imc >= 30  && imc < 35) {
      JOptionPane.showMessageDialog(null, "IMC = " + imc + "\nObesidade I.");
    }
    else if (imc >= 35 && imc < 40) {
      JOptionPane.showMessageDialog(null, "IMC = " + imc + "\nObesidade II (Severa).");
    }
    else {
      JOptionPane.showMessageDialog(null, "IMC = " + imc + "\nObesidade III (Morbida).");
    }
  }
}
