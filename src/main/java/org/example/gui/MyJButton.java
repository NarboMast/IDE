package org.example.gui;

import org.example.backend.BackEnd;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJButton extends JButton implements ActionListener {
    public MyJButton(String text) {
        super(text);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Default button is clicked");
    }
}
