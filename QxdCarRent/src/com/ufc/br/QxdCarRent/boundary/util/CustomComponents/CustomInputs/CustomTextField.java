package com.ufc.br.QxdCarRent.boundary.util.CustomComponents.CustomInputs;

import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class CustomTextField extends JTextField {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CustomTextFieldHelper mHelper = new CustomTextFieldHelper(this);

	public CustomTextField() {
		super();
	}

	public CustomTextField(int cols) {
		super(cols);
	}

	private CustomTextFieldHelper getHelper() {
		if (mHelper == null)
			mHelper = new CustomTextFieldHelper(this);

		return mHelper;
	}

	@Override
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		getHelper().onPaintComponent(graphics);
	}

	public void setIcon(Icon icon) {
		getHelper().onSetIcon(icon);
	}

	public void setIconSpacing(int spacing) {
		getHelper().onSetIconSpacing(spacing);
	}

	@Override
	public void setBorder(Border border) {
		getHelper().onSetBorder(border);
		super.setBorder(getHelper().getBorder());
	}
}