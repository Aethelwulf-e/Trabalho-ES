package com.ufc.br.QxdCarRent.boundary.view;

import java.text.ParseException;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.text.MaskFormatter;

import com.ufc.br.QxdCarRent.boundary.util.CustomComponents.CustomInputs.CustomFormattedTextField;
import com.ufc.br.QxdCarRent.boundary.util.CustomComponents.CustomInputs.CustomPasswordField;
import com.ufc.br.QxdCarRent.boundary.util.CustomComponents.CustomInputs.CustomTextField;

import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class SignUp extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelSignUpScreenBackground;
	private JButton buttonSignUpScreenFinish;
	private JButton buttonSignUpScreenCancel;

	/**
	 * Create the dialog.
	 */
	public SignUp() {
		initialize();
	}
	
	private void initialize() {
		createSignUpFrame();
		loadBackground();
		loadSignUpForm();
	}
	
	private void createSignUpFrame() {
		setTitle("Criar conta");
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModal(true);
		setBounds(100, 100, 310, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	private void loadBackground() {
		JLabel labelSignUpScreenBackground = new JLabel("");
		labelSignUpScreenBackground.setIcon(new ImageIcon(SignUp.class.getResource("/com/ufc/br/QxdCarRent/boundary/assets/images/sign_up_background.png")));
		labelSignUpScreenBackground.setBounds(0, 0, 304, 242);
		contentPane.add(labelSignUpScreenBackground);
		
		panelSignUpScreenBackground = new JPanel();
		panelSignUpScreenBackground.setBackground(new Color(240, 255, 240));
		panelSignUpScreenBackground.setBounds(0, 242, 304, 255);
		contentPane.add(panelSignUpScreenBackground);
		panelSignUpScreenBackground.setLayout(null);
	}
	
	private void loadSignUpForm() {
		CustomTextField textFieldSignUpScreenName = new CustomTextField();
		textFieldSignUpScreenName.setBounds(41, 0, 219, 40);
		textFieldSignUpScreenName.setBackground(new Color(240, 255, 240));
		textFieldSignUpScreenName.setBorder(
	            BorderFactory.createTitledBorder(
	                    BorderFactory.createEtchedBorder(
	                            EtchedBorder.RAISED, Color.GRAY
	                            , Color.DARK_GRAY), "Nome Completo"));
		panelSignUpScreenBackground.add(textFieldSignUpScreenName);
		textFieldSignUpScreenName.setColumns(10);
		textFieldSignUpScreenName.setIcon(new ImageIcon(SignUp.class.getResource("/com/ufc/br/QxdCarRent/boundary/assets/icons/name.png")));
		
		MaskFormatter cpfMask = null;
		try {
			cpfMask = new MaskFormatter("###.###.###-##");
			cpfMask.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		CustomFormattedTextField textFieldSignUpScreenCPF = new CustomFormattedTextField(cpfMask);
		textFieldSignUpScreenCPF.setBounds(41, 51, 219, 40);
		textFieldSignUpScreenCPF.setBackground(new Color(240, 255, 240));
		textFieldSignUpScreenCPF.setBorder(
	            BorderFactory.createTitledBorder(
	                    BorderFactory.createEtchedBorder(
	                            EtchedBorder.RAISED, Color.GRAY
	                            , Color.DARK_GRAY), "CPF"));
		panelSignUpScreenBackground.add(textFieldSignUpScreenCPF);
		textFieldSignUpScreenCPF.setIcon(new ImageIcon(SignUp.class.getResource("/com/ufc/br/QxdCarRent/boundary/assets/icons/cpf.png")));
		
		CustomTextField textFieldSignUpScreenEmail = new CustomTextField();
		textFieldSignUpScreenEmail.setBounds(41, 105, 219, 40);
		textFieldSignUpScreenEmail.setBackground(new Color(240, 255, 240));
		textFieldSignUpScreenEmail.setBorder(
	            BorderFactory.createTitledBorder(
	                    BorderFactory.createEtchedBorder(
	                            EtchedBorder.RAISED, Color.GRAY
	                            , Color.DARK_GRAY), "Email"));
		panelSignUpScreenBackground.add(textFieldSignUpScreenEmail);
		textFieldSignUpScreenEmail.setIcon(new ImageIcon(SignUp.class.getResource("/com/ufc/br/QxdCarRent/boundary/assets/icons/email.png")));
		
		CustomPasswordField passwordFieldSignUpScreenPassword = new CustomPasswordField();
		passwordFieldSignUpScreenPassword.setBounds(41, 156, 219, 40);
		passwordFieldSignUpScreenPassword.setBackground(new Color(240, 255, 240));
		passwordFieldSignUpScreenPassword.setBorder(
	            BorderFactory.createTitledBorder(
	                    BorderFactory.createEtchedBorder(
	                            EtchedBorder.RAISED, Color.GRAY
	                            , Color.DARK_GRAY), "Senha"));
		passwordFieldSignUpScreenPassword.setIcon(new ImageIcon(SignUp.class.getResource("/com/ufc/br/QxdCarRent/boundary/assets/icons/password.png")));
		panelSignUpScreenBackground.add(passwordFieldSignUpScreenPassword);
		
		buttonSignUpScreenFinish = new JButton("Concluir");
		buttonSignUpScreenFinish.setBounds(171, 215, 89, 23);
		panelSignUpScreenBackground.add(buttonSignUpScreenFinish);
		setFinishButtonAction();
		
		buttonSignUpScreenCancel = new JButton("Cancelar");
		buttonSignUpScreenCancel.setBounds(41, 215, 89, 23);
		panelSignUpScreenBackground.add(buttonSignUpScreenCancel);
		setCancelButtonAction();
	}
	
	private void setFinishButtonAction() {
		
	}
	
	private void setCancelButtonAction() {
		buttonSignUpScreenCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}