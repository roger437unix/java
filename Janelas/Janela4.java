// Adicionando ação em botão

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JButton;

// Importando interface de tratamento de evento
// Ao implementar uma interface, deve-se sobrescrever todos seus métodos
// ActionListener possue apenas um método "actionPerformed()"
import java.awt.event.ActionListener;

// Parâmetro do método "actionPerformed()" da interface ActionListener
import java.awt.event.ActionEvent;
                                    // Implementação da interface ActionListener
public class Janela4 extends JFrame implements ActionListener {

  JButton botao1 = new JButton("Mensagem");
  JButton botao2 = new JButton("Mensagem");
  JButton botao3 = new JButton("Sair");

  public void actionPerformed(ActionEvent e) {       // Método recebe "ActionEvent"
    if (e.getSource() == botao1) {
      JOptionPane.showMessageDialog(null, "Mensagem 1: Tratando evento de bot\u00e3o !!!");
    }
    else if (e.getSource() == botao2) {
      JOptionPane.showMessageDialog(null, "Mensagem 2: Testando arquivo \"jar\".");
    }
    else if (e.getSource() == botao3) {
      System.exit(0);
    }
  }

  public Janela4() {

    // Informando à interface ActionListener qual classe irá tratar o evento, neste caso, a própria
    botao1.addActionListener(this);
    botao2.addActionListener(this);
    botao3.addActionListener(this);

    // Botão [JButton]
    setLayout(null);                                 // Desabilitar layout padrão do java
    botao1.setBounds(23, 120, 100, 30);              // (x, y, largura, altura)
    botao2.setBounds(147, 120, 100, 30);
    botao3.setBounds(271, 120, 100, 30);
    getContentPane().add(botao1);                    // add(botao1)   ->  mesma coisa
    //add(botao1);
    add(botao2);
    add(botao3);

    // JFrame
    setTitle("Segunda Janela");                     // String para título da Janela
    setSize(400, 250);                               // Largura x Altura da Janela [Pixel]
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Constante da Classe JFrame
    setLocationRelativeTo(null);                     // Deixar Janela centralizada
    setResizable(false);                             // Não permitir redimensionar Janela
    setVisible(true);                                // Recebe boolean
  }

  public static void main(String[] args) {
    new Janela4();
  }
}
