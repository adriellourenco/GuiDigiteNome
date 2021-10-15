package br.senai.sp.jandira.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {

	public void criarTela() {
		
		JFrame minhaTela = new JFrame();
		minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minhaTela.setSize(500, 200);
		minhaTela.setTitle("Formulário");
		minhaTela.setLayout(null);
		
		JLabel lblDigiteSeuNome = new JLabel();
		lblDigiteSeuNome.setText("Digite seu Nome:");
		lblDigiteSeuNome.setBounds(20, 20, 120, 30);
		
		JTextField txtDigiteSeuNome = new JTextField();
		txtDigiteSeuNome.setBounds(20, 50, 80, 30);
		txtDigiteSeuNome.getText();
		
		JButton btnOk = new JButton();
		btnOk.setText("OK");
		btnOk.setBounds(105, 50, 55, 30);
		
		JLabel lblResultado = new JLabel();
		lblResultado.setBounds(20, 85, 120, 30);
		
		
		minhaTela.getContentPane().add(lblDigiteSeuNome);
		minhaTela.getContentPane().add(txtDigiteSeuNome);
		minhaTela.getContentPane().add(btnOk);
		minhaTela.getContentPane().add(lblResultado);
		
		minhaTela.setVisible(true);
		
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = txtDigiteSeuNome.getText();
				//lblResultado.setText("Olá, " +nome +"!");
				
				int valor = Integer.parseInt(nome);
				int resultado = valor * 15;
				lblResultado.setText(String.valueOf(resultado));
				
			}
		});
		
	}
}
