
/****************************************************
 * Janela com elementos gráficos
 * Label, Campo de texto, CheckBox,Botão Radio, Botão 
 ***************************************************/

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.util.Calendar;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela5 extends JFrame implements ActionListener {
	
	Calendar calendario = Calendar.getInstance();
	
	JLabel lblNome = new JLabel("Nome");
	JLabel lblIdade = new JLabel("Idade");
	
	JTextField txtNome = new JTextField();
	JTextField txtIdade = new JTextField();
	
	JButton btnSaudacao = new JButton("Saudação");
	JButton btnAnoNascimento = new JButton("Ano Nascimento");
	JButton btnSair = new JButton("Sair");
	
	// JCheckBox cbxAluno = new JCheckBox("Aluno");	
	JCheckBox cbxAluno = new JCheckBox("Aluno", true);		// Para deixar checkbox marcado por default
	
	// RadioButton
	JRadioButton jrbMasculino = new JRadioButton("Masculino");
	JRadioButton jrbFeminino = new JRadioButton("Feminino");
	
	// Grupo para RadioButton [Necessário para ficar um ou outro]
	ButtonGroup btgSexo = new ButtonGroup();
	
	
	public Janela5() {
		
		setLayout(null);
		
		btnSaudacao.addActionListener(this);
		btnAnoNascimento.addActionListener(this);
		btnSair.addActionListener(this);		
		
		lblNome.setBounds(100, 50, 100, 20);
		lblIdade.setBounds(100, 100, 100, 20);
		add(lblNome);
		add(lblIdade);
		
		txtNome.setBounds(200, 50, 200, 30);
		txtIdade.setBounds(200, 100, 100, 30);
		add(txtNome);
		add(txtIdade);
		
		btnSaudacao.setBounds(50, 300, 100, 30);
		btnAnoNascimento.setBounds(185, 300, 130, 30);
		btnSair.setBounds(350, 300, 100, 30);
		add(btnSaudacao);
		add(btnAnoNascimento);
		add(btnSair);
		
		cbxAluno.setBounds(150, 160, 100, 30);
		add(cbxAluno);
		
		// RadioButton
		jrbMasculino.setBounds(150, 205, 100, 30);
		jrbFeminino.setBounds(150, 230, 100, 30);
		add(jrbMasculino);
		add(jrbFeminino);
		
		// Adicionando RadioButton ao Grupo ButtonGroup
		btgSexo.add(jrbMasculino);
		btgSexo.add(jrbFeminino);
						
		setTitle("Janela Teste");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSaudacao) {
			String mensagem = "Seja bem-vindo ";
			
			// Se é aluno e homem
			if (cbxAluno.isSelected() && jrbMasculino.isSelected()) {
				mensagem = "Seja bem-vindo aluno ";
			}
			
			// Se é aluno e mulher
			else if (cbxAluno.isSelected() && jrbFeminino.isSelected()) {
				mensagem = "Seja bem-vinda aluna ";
			}
			else {
				mensagem = "Seja bem-vindo aluno ";
			}
			
			// Lendo o campo nome e eliminado espaços vazios no começo e final do texto
			String nome = txtNome.getText().trim();
			
			// Se é homem e não é aluno
			if (jrbMasculino.isSelected() && !(cbxAluno.isSelected())) {
				mensagem = "Seja bem-vindo senhor ";
			}
			// Se é mulher e não é aluna
			else if (jrbFeminino.isSelected() && !(cbxAluno.isSelected())) {
				mensagem = "Seja bem-vinda senhora ";
			}
			
			JOptionPane.showMessageDialog(null, mensagem + nome);			
		}
		else if (e.getSource() == btnAnoNascimento) {
			// Se campo idade não estiver vazio
			if (!("".equals(txtIdade.getText()))) {
				// Recebendo o ano atual
				int anoAtual = calendario.get(Calendar.YEAR);
				
				// Recebendo a idade e eliminado espaços vazios no começo e final do texto
				int anoNascimento = anoAtual - Integer.parseInt(txtIdade.getText().trim());
				JOptionPane.showMessageDialog(null, "Você nasceu em " + anoNascimento);					
			}					
		}
		else if (e.getSource() == btnSair){
			System.exit(0);
		}		
	}	
}
