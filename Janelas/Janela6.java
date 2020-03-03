package org.com.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class Janela6 extends JFrame implements ActionListener {
	
	Calendar calendario = Calendar.getInstance();
	
	// Objetos botão
	JButton btnMensagem = new JButton("Mensagem");
	JButton btnLimparNome = new JButton("Limpar nome");
	JButton btnSair = new JButton("Sair");
	
	// Objeto Label [texto]
	JLabel lblNome = new JLabel("Nome");
	JLabel lblAnoDeNascimeto = new JLabel("Ano de nascimento");
	
	// Objeto Campo de texto
	JTextField txtNome = new JTextField();
	JTextField txtAnoDeNascimento = new JTextField(Integer.toString(calendario.get(Calendar.YEAR)));
	
	public Janela6() {
		
		btnMensagem.addActionListener(this);
		btnLimparNome.addActionListener(this);
		btnSair.addActionListener(this);
		
		// Botões [JButton]
		setLayout(null);
		btnMensagem.setBounds(50, 300, 120, 30);
		btnLimparNome.setBounds(200, 300, 110, 30);
		btnSair.setBounds(340, 300, 100, 30);
		add(btnMensagem);
		add(btnLimparNome);
		add(btnSair);
		
		// Label [JLabel]
		lblNome.setBounds(100, 50, 100, 20);
		lblAnoDeNascimeto.setBounds(100, 100, 110, 20);
		add(lblNome);
		add(lblAnoDeNascimeto);
		
		// Campo de texto [JTextField]
		txtNome.setBounds(220, 50, 200, 30);
		txtAnoDeNascimento.setBounds(220, 100, 100, 30);
		add(txtNome);
		add(txtAnoDeNascimento);
		
		// Janela [JFrame]
		setTitle("Cadastro de Produto");
		setSize(500, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnMensagem) {
			if (!txtNome.getText().equals("")) {
				String nome = txtNome.getText().trim();
				int anoDeNascimento = Integer.parseInt(txtAnoDeNascimento.getText());
				int anoAtual = calendario.get(Calendar.YEAR);
				int idade = anoAtual - anoDeNascimento;
				JOptionPane.showMessageDialog(null, "Seja bem-vindo Sr(a) " + nome + "\nVocê tem " + idade + " anos de vida");
			}
			
		}
		else if (e.getSource() == btnLimparNome) {
			txtNome.setText("");			
		}
		else if (e.getSource() == btnSair) {
			System.exit(0);			
		}		
	}	
	
	
	public static void main(String[] args) {
		new Janela6();
	}

}
