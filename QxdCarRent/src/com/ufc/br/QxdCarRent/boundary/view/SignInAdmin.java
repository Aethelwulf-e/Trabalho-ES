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

import com.ufc.br.QxdCarRent.boundary.util.CustomComponents.CustomAlertDialog;
import com.ufc.br.QxdCarRent.boundary.util.CustomComponents.CustomPasswordField;
import com.ufc.br.QxdCarRent.boundary.util.CustomComponents.CustomTextField;
import com.ufc.br.QxdCarRent.control.AdminController;

public class SignInAdmin extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelSignInAdminScreenBackground;
	private JButton buttonSignInAdminScreenFinish;
	private JButton buttonSignInAdminScreenCancel;
	private CustomTextField textFieldSignInAdminScreenName;
	private CustomPasswordField passwordFieldSignInAdminScreenPassword;
	private AdminController adminController;
	
	/**
	 * Create the dialog.
	 */
	public SignInAdmin() {
		adminController = new AdminController();
		initialize();
	}
	
	private void initialize() {
		createSignInAdminFrame();
		loadBackground();
		loadForm();
	}
	
	private void createSignInAdminFrame() {
		setTitle("Sign In Admin");
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
		JLabel labelSignInAdminScreenBackground = new JLabel("");
		labelSignInAdminScreenBackground.setIcon(new ImageIcon(SignUp.class.getResource("/com/ufc/br/QxdCarRent/boundary/assets/images/sign_in_admin_background.png")));
		labelSignInAdminScreenBackground.setBounds(0, 0, 304, 242);
		contentPane.add(labelSignInAdminScreenBackground);
		
		panelSignInAdminScreenBackground = new JPanel();
		panelSignInAdminScreenBackground.setBackground(new Color(240, 255, 240));
		panelSignInAdminScreenBackground.setBounds(0, 242, 304, 255);
		contentPane.add(panelSignInAdminScreenBackground);
		panelSignInAdminScreenBackground.setLayout(null);
	}
	
	private void loadForm() {
		textFieldSignInAdminScreenName = new CustomTextField();
		textFieldSignInAdminScreenName.setBounds(41, 0, 219, 40);
		textFieldSignInAdminScreenName.setBackground(new Color(240, 255, 240));
		textFieldSignInAdminScreenName.setBorder(
	            BorderFactory.createTitledBorder(
	                    BorderFactory.createEtchedBorder(
	                            EtchedBorder.RAISED, Color.GRAY
	                            , Color.DARK_GRAY), "Login Admin"));
		panelSignInAdminScreenBackground.add(textFieldSignInAdminScreenName);
		textFieldSignInAdminScreenName.setColumns(10);
		textFieldSignInAdminScreenName.setIcon(new ImageIcon(SignUp.class.getResource("/com/ufc/br/QxdCarRent/boundary/assets/icons/name.png")));
		
		passwordFieldSignInAdminScreenPassword = new CustomPasswordField();
		passwordFieldSignInAdminScreenPassword.setBounds(41, 51, 219, 40);
		passwordFieldSignInAdminScreenPassword.setBackground(new Color(240, 255, 240));
		passwordFieldSignInAdminScreenPassword.setBorder(
	            BorderFactory.createTitledBorder(
	                    BorderFactory.createEtchedBorder(
	                            EtchedBorder.RAISED, Color.GRAY
	                            , Color.DARK_GRAY), "Senha Admin"));
		passwordFieldSignInAdminScreenPassword.setIcon(new ImageIcon(SignUp.class.getResource("/com/ufc/br/QxdCarRent/boundary/assets/icons/password.png")));
		panelSignInAdminScreenBackground.add(passwordFieldSignInAdminScreenPassword);
		
		buttonSignInAdminScreenFinish = new JButton("Concluir");
		buttonSignInAdminScreenFinish.setBounds(171, 125, 89, 23);
		panelSignInAdminScreenBackground.add(buttonSignInAdminScreenFinish);
		setFinishButtonAction();
		
		buttonSignInAdminScreenCancel = new JButton("Cancelar");
		buttonSignInAdminScreenCancel.setBounds(41, 125, 89, 23);
		panelSignInAdminScreenBackground.add(buttonSignInAdminScreenCancel);
		setCancelButtonAction();
	}
	
	private void setFinishButtonAction() {
		buttonSignInAdminScreenFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String login = textFieldSignInAdminScreenName.getText();
				String password = passwordFieldSignInAdminScreenPassword.getText();
				
				if(login.equals("") || password.equals("")) {
					CustomAlertDialog alertDialog = new CustomAlertDialog();
					alertDialog.setVisible(true);
				} else {
					// TODO: AUTH
				}
			}
		});
	}
	
	private void setCancelButtonAction() {
		buttonSignInAdminScreenCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
