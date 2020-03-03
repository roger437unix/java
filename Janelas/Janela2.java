// Inserindo botões na Janela

import javax.swing.JFrame;
import javax.swing.JButton;

public class Janela2 extends JFrame {

  JButton botao1 = new JButton("Continuar");
  JButton botao2 = new JButton("Sair");

  public Janela2() {

    // Botão [JButton]
    setLayout(null);                                 // Desabilitar layout padrão do java
    botao1.setBounds(50, 300, 100, 30);              // (x, y, largura, altura)
    botao2.setBounds(340, 300, 100, 30);
    getContentPane().add(botao1);                    // add(botao1)   ->  mesma coisa
    //add(botao1);
    add(botao2);

    // JFrame
    setTitle("Segunda Janela");                     // String para título da Janela
    setSize(500, 400);                               // Largura x Altura da Janela [Pixel]
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Constante da Classe JFrame
    setLocationRelativeTo(null);                     // Deixar Janela centralizada
    setResizable(false);                             // Não permitir redimensionar Janela
    setVisible(true);                                // Recebe boolean
  }

  public static void main(String[] args) {
    new Janela2();
  }
}
