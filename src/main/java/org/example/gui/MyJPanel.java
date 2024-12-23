package org.example.gui;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.*;

public class MyJPanel extends JPanel {
    public MyJPanel() {
    }

    protected void setPanelBorder() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }
}
