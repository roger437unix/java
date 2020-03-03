// A partir de um valor em metros, converta para km, hm, dam, dm, cm e mm.

import javax.swing.JOptionPane;

class Exercicio71 {
  public static void main(String[] args) {
    double metro = Double.parseDouble(JOptionPane.showInputDialog("Informe a medidade em metro: "));

    double km  = metro / 1000;
    double hm  = metro / 100;
    double dam = metro / 10;
    double dm  = metro / 0.1;
    double cm  = metro / 0.01;
    double mm  = metro / 0.001;

    String medida = metro + " m corresponde " + km + " km\n" +
                 metro + " m corresponde " + hm + " hm\n" +
                 metro + " m corresponde " + dam + " dam\n" +
                 metro + " m corresponde " + cm + " cm\n" +
                 metro + " m corresponde " + dm + " dm\n" +
                 metro + " m corresponde " + cm + " cm\n";

    JOptionPane.showMessageDialog(null, medida);
  }
}
