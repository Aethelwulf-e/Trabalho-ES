package com.ufc.br.app.activity;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ufc.br.app.util.CustomComponents.CustomPasswordField;
import com.ufc.br.app.util.CustomComponents.CustomTextField;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;

public class SignUp extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp dialog = new SignUp();
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public SignUp() {
		setTitle("Criar conta");
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModal(true);
		setBounds(100, 100, 310, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelSignUpScreenBackground = new JLabel("");
		labelSignUpScreenBackground.setIcon(new ImageIcon(SignUp.class.getResource("/com/ufc/br/app/assets/images/sign_up_background.png")));
		labelSignUpScreenBackground.setBounds(0, 0, 304, 242);
		contentPane.add(labelSignUpScreenBackground);
		
		JPanel panelSignUpScreenBackground = new JPanel();
		panelSignUpScreenBackground.setBackground(new Color(240, 255, 240));
		panelSignUpScreenBackground.setBounds(0, 242, 304, 229);
		contentPane.add(panelSignUpScreenBackground);
		panelSignUpScreenBackground.setLayout(null);
		
		CustomTextField textFieldSignUpScreenName = new CustomTextField();
		textFieldSignUpScreenName.setBounds(41, 0, 219, 20);
		panelSignUpScreenBackground.add(textFieldSignUpScreenName);
		textFieldSignUpScreenName.setColumns(10);
		textFieldSignUpScreenName.setIcon(new ImageIcon(SignUp.class.getResource("/com/ufc/br/app/assets/icons/name.png")));
		
		CustomTextField textFieldSignUpScreenCPF = new CustomTextField();
		textFieldSignUpScreenCPF.setBounds(41, 42, 219, 20);
		panelSignUpScreenBackground.add(textFieldSignUpScreenCPF);
		textFieldSignUpScreenCPF.setIcon(new ImageIcon(SignUp.class.getResource("/com/ufc/br/app/assets/icons/cpf.png")));
		
		CustomTextField textFieldSignUpScreenEmail = new CustomTextField();
		textFieldSignUpScreenEmail.setBounds(41, 84, 219, 20);
		panelSignUpScreenBackground.add(textFieldSignUpScreenEmail);
		textFieldSignUpScreenEmail.setIcon(new ImageIcon(SignUp.class.getResource("/com/ufc/br/app/assets/icons/email.png")));
		
		CustomPasswordField passwordFieldSignUpScreenPassword = new CustomPasswordField();
		passwordFieldSignUpScreenPassword.setBounds(41, 129, 219, 20);
		passwordFieldSignUpScreenPassword.setIcon(new ImageIcon(SignUp.class.getResource("/com/ufc/br/app/assets/icons/password.png")));
		panelSignUpScreenBackground.add(passwordFieldSignUpScreenPassword);
		
		JButton buttonSignUpScreenFinish = new JButton("Concluir");
		buttonSignUpScreenFinish.setBounds(171, 173, 89, 23);
		panelSignUpScreenBackground.add(buttonSignUpScreenFinish);
		
		JButton buttonSignUpScreenCancel = new JButton("Cancelar");
		buttonSignUpScreenCancel.setBounds(41, 173, 89, 23);
		panelSignUpScreenBackground.add(buttonSignUpScreenCancel);
	}
}
