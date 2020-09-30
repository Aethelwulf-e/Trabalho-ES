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

public class CustomSuccessAlertDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	/**
	 * Create the dialog.
	 */
	public CustomSuccessAlertDialog() {
		setTitle("Success");
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModal(true);
		setBounds(100, 100, 320, 120);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(240, 255, 240));
		
		JLabel labelMsgSuccessAlertDialog = new JLabel("Opera\u00E7\u00E3o realizada com sucesso!");
		labelMsgSuccessAlertDialog.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelMsgSuccessAlertDialog.setBounds(55, 24, 347, 14);
		contentPane.add(labelMsgSuccessAlertDialog);
		
		JLabel labelIconSuccessAlertDialog = new JLabel("");
		labelIconSuccessAlertDialog.setIcon(new ImageIcon(CustomWarningAlertDialog.class.getResource("/com/ufc/br/QxdCarRent/boundary/assets/icons/success.png")));
		labelIconSuccessAlertDialog.setBounds(12, 11, 46, 43);
		contentPane.add(labelIconSuccessAlertDialog);
		
		JButton buttonOkSuccessAlertDialog = new JButton("OK");
		buttonOkSuccessAlertDialog.setBounds(223, 49, 62, 23);
		contentPane.add(buttonOkSuccessAlertDialog);
		
		buttonOkSuccessAlertDialog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
