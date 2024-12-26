package org.example.gui.runScriptFromFile;

import org.example.backend.BackEnd;
import org.example.gui.MyJButton;
import org.example.gui.Window;
import org.example.gui.rightPanel.OutPutList;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class RunScriptFileButton extends MyJButton {
    private final BackEnd backEnd;

    public RunScriptFileButton(int x, int y, int width, int height, String text, BackEnd backEnd) {
        super(text);
        setBounds(x, y, width, height);
        this.backEnd = backEnd;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String path = new FileChooser().chooseFile();
        if (path != null) {
            backEnd.getController().runScriptFromFile(path);
            String[][] str = backEnd.runScriptPerformed();
            String[] columns = backEnd.getColumns(backEnd.getController());

            OutPutList newTable = new OutPutList(str, columns);
            JScrollPane jScrollPane = new JScrollPane(newTable);

            ((Window) SwingUtilities.getWindowAncestor(this)).getRightPanel().updateTable(jScrollPane);
        }
    }
}
