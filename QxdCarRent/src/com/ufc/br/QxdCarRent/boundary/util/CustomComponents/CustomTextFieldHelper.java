package com.ufc.br.QxdCarRent.boundary.util.CustomComponents;

import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.border.Border;
import javax.swing.text.JTextComponent;

class CustomTextFieldHelper {
    private static int ICON_SPACING = 4;

    private Border mBorder;
    private Icon mIcon;
    private Border mOrigBorder;
    private JTextComponent mTextComponent;
    
    CustomTextFieldHelper(JTextComponent component) {
        mTextComponent = component;
        mOrigBorder = component.getBorder();
        mBorder = mOrigBorder;
    }

    Border getBorder() {
        return mBorder;
    }

    void onPaintComponent(Graphics g) {
        if (mIcon != null) {
            Insets iconInsets = mOrigBorder.getBorderInsets(mTextComponent);
            mIcon.paintIcon(mTextComponent, g, iconInsets.left, iconInsets.top);
        }
    }

    void onSetBorder(Border border) {
        mOrigBorder = border;

        if (mIcon == null) {
            mBorder = border;
        } else {
            Border margin = BorderFactory.createEmptyBorder(0, mIcon.getIconWidth() + ICON_SPACING, 0, 0);
            mBorder = BorderFactory.createCompoundBorder(border, margin);
        }
    }
    
    void onSetIconSpacing(int spacing) {
    	ICON_SPACING = spacing;
    }
    
    void onSetIcon(Icon icon) {
        mIcon = icon;
        resetBorder();
    }

    private void resetBorder() {
        mTextComponent.setBorder(mOrigBorder);
    }
}