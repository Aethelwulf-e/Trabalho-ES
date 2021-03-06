package com.ufc.br.QxdCarRent.boundary.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import com.ufc.br.QxdCarRent.boundary.util.CustomComponents.CustomInputs.CustomPasswordField;
import com.ufc.br.QxdCarRent.boundary.util.CustomComponents.CustomInputs.CustomTextField;

public class SignInUser extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelSignInUserScreenBackground;
	private JButton buttonSignInUserScreenFinish;
	private JButton buttonSignInUserScreenCancel;

	/**
	 * Create the dialog.
	 */
	public SignInUser() {
		initialize();
	}
	
	private void initialize() {
		createSignInUserFrame();
		loadBackground();
		loadForm();
	}
	
	private void createSignInUserFrame() {
		setTitle("Sign In User");
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModal(true);
		setBounds(100, 100, 310, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	private void loadBackground() {
		JLabel labelSignInUserScreenBackground = new JLabel("");
		labelSignInUserScreenBackground.setIcon(new ImageIcon(SignUp.class.getResource("/com/ufc/br/QxdCarRent/boundary/assets/images/sign_in_user_background.png")));
		labelSignInUserScreenBackground.setBounds(0, 0, 304, 242);
		contentPane.add(labelSignInUserScreenBackground);
		
		panelSignInUserScreenBackground = new JPanel();
		panelSignInUserScreenBackground.setBackground(new Color(240, 255, 240));
		panelSignInUserScreenBackground.setBounds(0, 242, 304, 255);
		contentPane.add(panelSignInUserScreenBackground);
		panelSignInUserScreenBackground.setLayout(null);
	}
	
	private void loadForm() {
		CustomTextField textFieldSignInUserScreenName = new CustomTextField();
		textFieldSignInUserScreenName.setBounds(41, 0, 219, 40);
		textFieldSignInUserScreenName.setBackground(new Color(240, 255, 240));
		textFieldSignInUserScreenName.setBorder(
	            BorderFactory.createTitledBorder(
	                    BorderFactory.createEtchedBorder(
	                            EtchedBorder.RAISED, Color.GRAY
	                            , Color.DARK_GRAY), "E-mail"));
		panelSignInUserScreenBackground.add(textFieldSignInUserScreenName);
		textFieldSignInUserScreenName.setColumns(10);
		textFieldSignInUserScreenName.setIcon(new ImageIcon(SignUp.class.getResource("/com/ufc/br/QxdCarRent/boundary/assets/icons/name.png")));
		
		CustomPasswordField passwordFieldSignInUserScreenPassword = new CustomPasswordField();
		passwordFieldSignInUserScreenPassword.setBounds(41, 51, 219, 40);
		passwordFieldSignInUserScreenPassword.setBackground(new Color(240, 255, 240));
		passwordFieldSignInUserScreenPassword.setBorder(
	            BorderFactory.createTitledBorder(
	                    BorderFactory.createEtchedBorder(
	                            EtchedBorder.RAISED, Color.GRAY
	                            , Color.DARK_GRAY), "Senha"));
		passwordFieldSignInUserScreenPassword.setIcon(new ImageIcon(SignUp.class.getResource("/com/ufc/br/QxdCarRent/boundary/assets/icons/password.png")));
		panelSignInUserScreenBackground.add(passwordFieldSignInUserScreenPassword);
		
		buttonSignInUserScreenFinish = new JButton("Concluir");
		buttonSignInUserScreenFinish.setBounds(171, 125, 89, 23);
		panelSignInUserScreenBackground.add(buttonSignInUserScreenFinish);
		setFinishButtonAction();
		
		buttonSignInUserScreenCancel = new JButton("Cancelar");
		buttonSignInUserScreenCancel.setBounds(41, 125, 89, 23);
		panelSignInUserScreenBackground.add(buttonSignInUserScreenCancel);
		setCancelButtonAction();
	}
	
	private void setFinishButtonAction() {
		
	}
	
	private void setCancelButtonAction() {
		buttonSignInUserScreenCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
