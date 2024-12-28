package org.example.gui.rightPanel;

import org.example.backend.BackEnd;
import org.example.gui.MyJPanel;
import org.example.gui.runScriptFromFile.RunScriptFileButton;
import org.example.gui.runScriptString.RunScriptStringButton;

import javax.swing.*;

public class RightPanel extends MyJPanel {
    private final BackEnd backEnd;
    private JScrollPane table;

    public RightPanel(int x, int y, int width, int height, BackEnd backEnd) {
        setLayout(null);
        setBounds(x,y,width, height);
        setPanelBorder();
        this.backEnd = backEnd;
    }

    public void updateTable(JScrollPane newTable) {
        if (table != null) {
            remove(table);
        }
        table = newTable;
        table.setBounds(0, 0, getWidth(), getHeight() - 50);
        add(table);
        revalidate();
        repaint();
        setBorder(null);
        add(new RunScriptFileButton(35,308,150,30,"Run script from file", backEnd));
        add(new RunScriptStringButton(227,308,200,30,"Create and run ad hoc script", backEnd));
    }
}
