// Criando a primeira Janela (JFrame)

import javax.swing.JFrame;

/***********************************************************************************************

// Versão I - Instanciando um objeto JFrame

public class Janela {

  public Janela() {
    JFrame jf = new JFrame();
    jf.setTitle("Primeira Janela");                     // String para título da Janela
    jf.setSize(500, 400);                               // Largura x Altura da Janela [Pixel]
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Constante da Classe JFrame
    jf.setLocationRelativeTo(null);                     // Deixar Janela centralizada
    jf.setResizable(false);                             // Não permitir redimensionar Janela
    jf.setVisible(true);                                // Recebe boolean
  }

***********************************************************************************************/

// Versão II - Herdando a classe JFrame

public class Janela extends JFrame {

    public Janela() {
      setTitle("Primeira Janela");                     // String para título da Janela
      setSize(500, 400);                               // Largura x Altura da Janela [Pixel]
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Constante da Classe JFrame
      setLocationRelativeTo(null);                     // Deixar Janela centralizada
      setResizable(false);                             // Não permitir redimensionar Janela
      setVisible(true);                                // Recebe boolean
    }

  public static void main(String[] args) {
    new Janela();
  }
}
