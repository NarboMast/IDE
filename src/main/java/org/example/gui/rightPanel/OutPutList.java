package org.example.gui.rightPanel;

import javax.swing.*;

public class OutPutList extends JTable {
    public OutPutList(String[][] output, String[] column) {
        super(output, column);
        setColumnSelectionAllowed(false);
        setEnabled(false);
    }
}
