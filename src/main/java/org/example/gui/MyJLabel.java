package org.example.gui;

import javax.swing.JLabel;
import java.awt.*;

public class MyJLabel extends JLabel {
    public MyJLabel(int x, int y, int width, int height, String text) {
        super(text);
        setFont(new Font("Arial", Font.PLAIN, 15));
        setBounds(x,y,width,height);
    }
}
