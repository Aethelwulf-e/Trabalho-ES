package com.ufc.br.QxdCarRent.boundary.util.CustomComponents.CustomAlerts;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CustomErrorAlertDialog extends JDialog {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	/**
	 * Create the dialog.
	 */
	public CustomErrorAlertDialog() {
		setTitle("Error");
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModal(true);
		setBounds(100, 100, 270, 120);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(240, 255, 240));
		
		JLabel labelMsgErrorAlertDialog = new JLabel("Erro: dados inv\u00E1lidos!");
		labelMsgErrorAlertDialog.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelMsgErrorAlertDialog.setBounds(55, 24, 347, 14);
		contentPane.add(labelMsgErrorAlertDialog);
		
		JLabel labelIconErrorAlertDialog = new JLabel("");
		labelIconErrorAlertDialog.setIcon(new ImageIcon(CustomWarningAlertDialog.class.getResource("/com/ufc/br/QxdCarRent/boundary/assets/icons/error.png")));
		labelIconErrorAlertDialog.setBounds(12, 11, 46, 43);
		contentPane.add(labelIconErrorAlertDialog);
		
		JButton buttonOkErrorAlertDialog = new JButton("OK");
		buttonOkErrorAlertDialog.setBounds(183, 49, 62, 23);
		contentPane.add(buttonOkErrorAlertDialog);
		
		buttonOkErrorAlertDialog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
