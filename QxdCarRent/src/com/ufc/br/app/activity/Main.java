package com.ufc.br.app.activity;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Cursor;

import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frameMainScreen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frameMainScreen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		createMainFrame();
		loadLeftPanel();
		loadRightPanel();
	}
	
	private void createMainFrame() {
		frameMainScreen = new JFrame();
		frameMainScreen.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 12));
		frameMainScreen.setTitle("Bem-vindo(a)!");
		frameMainScreen.setBounds(100, 100, 800, 500);
		frameMainScreen.setResizable(false);
		frameMainScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMainScreen.getContentPane().setLayout(null);
	}
	
	private void loadLeftPanel() {
		JPanel panelMainScreenLogo = new JPanel();
		panelMainScreenLogo.setBackground(Color.ORANGE);
		panelMainScreenLogo.setBounds(0, 0, 344, 571);
		frameMainScreen.getContentPane().add(panelMainScreenLogo);
		panelMainScreenLogo.setLayout(null);
		
		JLabel labelMainScreenIcon = new JLabel("");
		labelMainScreenIcon.setIcon(new ImageIcon(Main.class.getResource("/com/ufc/br/app/assets/icons/logo.png")));
		labelMainScreenIcon.setBounds(70, 64, 194, 174);
		panelMainScreenLogo.add(labelMainScreenIcon);
		
		JLabel labelMainScreenUpperText = new JLabel("Controle e gerenciamento de ve\u00EDculos");
		labelMainScreenUpperText.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelMainScreenUpperText.setBounds(29, 278, 285, 38);
		panelMainScreenLogo.add(labelMainScreenUpperText);
		
		JLabel labelMainScreenBottomText = new JLabel("A melhor locadora em Quixad\u00E1!");
		labelMainScreenBottomText.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelMainScreenBottomText.setBounds(70, 327, 194, 14);
		panelMainScreenLogo.add(labelMainScreenBottomText);
		
		JLabel labelMainScreenAccount = new JLabel("N\u00E3o possui uma conta?");
		labelMainScreenAccount.setBounds(39, 414, 140, 19);
		panelMainScreenLogo.add(labelMainScreenAccount);
		
		JLabel labelMainScreenSignUp = new JLabel("<html><u>Cadastre-se aqui!</u></html>");
		labelMainScreenSignUp.setBounds(189, 411, 100, 24);
		panelMainScreenLogo.add(labelMainScreenSignUp);
		labelMainScreenSignUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	
	private void loadRightPanel() {
		JPanel panelMainScreenSignIn = new JPanel();
		panelMainScreenSignIn.setBackground(new Color(240, 255, 240));
		panelMainScreenSignIn.setBounds(342, 0, 452, 471);
		frameMainScreen.getContentPane().add(panelMainScreenSignIn);
		panelMainScreenSignIn.setLayout(null);
		
		JLabel labelMainScreenLogin = new JLabel("Login");
		labelMainScreenLogin.setFont(new Font("Tahoma", Font.BOLD, 25));
		labelMainScreenLogin.setBounds(190, 44, 69, 52);
		panelMainScreenSignIn.add(labelMainScreenLogin);
		
		JButton buttonMainScreenUser = new JButton("Entrar como cliente");
		buttonMainScreenUser.setIcon(new ImageIcon(Main.class.getResource("/com/ufc/br/app/assets/icons/user.png")));
		buttonMainScreenUser.setBackground(Color.WHITE);
		buttonMainScreenUser.setVerticalTextPosition(SwingConstants.BOTTOM);
	    buttonMainScreenUser.setHorizontalTextPosition(SwingConstants.CENTER);
		buttonMainScreenUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonMainScreenUser.setBounds(51, 190, 150, 150);
		panelMainScreenSignIn.add(buttonMainScreenUser);
		
		JButton buttonMainScreenAdmin = new JButton("Entrar como admin");
		buttonMainScreenAdmin.setIcon(new ImageIcon(Main.class.getResource("/com/ufc/br/app/assets/icons/admin.png")));
		buttonMainScreenAdmin.setBackground(Color.WHITE);
		buttonMainScreenAdmin.setVerticalTextPosition(SwingConstants.BOTTOM);
	    buttonMainScreenAdmin.setHorizontalTextPosition(SwingConstants.CENTER);
		buttonMainScreenAdmin.setBounds(253, 190, 150, 150);
		panelMainScreenSignIn.add(buttonMainScreenAdmin);
	}
}
