package org.example.gui.runScriptString.jDialog;

import org.example.gui.MyJButton;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class CancelButton extends MyJButton {
    private final JDialog dialog;
    public CancelButton(int x, int y, int width, int height, String text, MyJDialog myJDialog) {
        super(text);
        setBounds(x, y, width, height);
        dialog = myJDialog;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dialog.dispose();
    }
}
