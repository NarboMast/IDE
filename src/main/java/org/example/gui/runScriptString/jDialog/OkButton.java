package org.example.gui.runScriptString.jDialog;

import org.example.backend.BackEnd;
import org.example.gui.MyJButton;
import org.example.gui.Window;
import org.example.gui.rightPanel.OutPutList;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class OkButton extends MyJButton {
    private final Window window;
    private final BackEnd backEnd;
    private final MyJTextArea textArea;

    public OkButton(int x, int y, int width, int height, String text, MyJTextArea textArea, BackEnd backEnd, Window window) {
        super(text);
        setBounds(x, y, width, height);
        this.textArea = textArea;
        this.backEnd = backEnd;
        this.window = window;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText();
        backEnd.getController().runScript(text);
        String[][] str = backEnd.runScriptPerformed();
        String[] columns = backEnd.getColumns(backEnd.getController());

        OutPutList newTable = new OutPutList(str, columns);
        JScrollPane jScrollPane = new JScrollPane(newTable);

        window.getRightPanel().updateTable(jScrollPane);
    }
}
