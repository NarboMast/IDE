package org.example.gui.runScriptString;

import org.example.backend.BackEnd;
import org.example.gui.MyJButton;
import org.example.gui.Window;
import org.example.gui.runScriptString.jDialog.MyJDialog;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class RunScriptStringButton extends MyJButton {
    private final BackEnd backEnd;
    public RunScriptStringButton(int x, int y, int width, int height, String text, BackEnd backEnd) {
        super(text);
        setBounds(x, y, width, height);
        this.backEnd = backEnd;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new MyJDialog((Window)SwingUtilities.getWindowAncestor(this), "GG", true, backEnd);
    }
}
