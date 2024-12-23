package org.example.gui;

import org.example.gui.leftPanel.LeftPanel;
import org.example.gui.rightPanel.RightPanel;

import javax.swing.*;

public class Window extends JFrame {

    public Window(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        MyJLabel label = new MyJLabel(5,0,150,30,"Select model and data");
        MyJPanel leftPanel = new LeftPanel(5,30,200, 325);
        MyJPanel rightPanel = new RightPanel(215,5,462,350);

        add(label);
        add(leftPanel);
        add(rightPanel);

        setVisible(true);
    }
}
