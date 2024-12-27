package org.example.gui.runScriptString.jDialog;

import org.example.gui.MyJButton;

import java.awt.event.ActionEvent;

public class CancelButton extends MyJButton {
    public CancelButton(int x, int y, int width, int height, String text) {
        super(text);
        setBounds(x, y, width, height);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
