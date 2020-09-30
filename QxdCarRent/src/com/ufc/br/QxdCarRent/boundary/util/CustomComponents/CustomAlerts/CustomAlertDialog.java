package com.ufc.br.QxdCarRent.boundary.util.CustomComponents.CustomAlerts;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomAlertDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the dialog.
	 */
	public CustomAlertDialog() {
		setTitle("Alert");
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModal(true);
		setBounds(100, 100, 442, 120);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(240, 255, 240));
		
		JLabel labelMsgErrorAlertDialog = new JLabel("Verifique se os campos est\u00E3o preenchidos corretamente!");
		labelMsgErrorAlertDialog.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelMsgErrorAlertDialog.setBounds(55, 24, 347, 14);
		contentPane.add(labelMsgErrorAlertDialog);
		
		JLabel labelIconAlertDialog = new JLabel("");
		labelIconAlertDialog.setIcon(new ImageIcon(CustomAlertDialog.class.getResource("/com/ufc/br/QxdCarRent/boundary/assets/icons/warning.png")));
		labelIconAlertDialog.setBounds(12, 11, 46, 43);
		contentPane.add(labelIconAlertDialog);
		
		JButton buttonOkAlertDialog = new JButton("OK");
		buttonOkAlertDialog.setBounds(352, 49, 62, 23);
		contentPane.add(buttonOkAlertDialog);
		
		buttonOkAlertDialog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
