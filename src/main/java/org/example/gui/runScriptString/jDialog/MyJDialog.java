package org.example.gui.runScriptString.jDialog;

import org.example.backend.BackEnd;
import org.example.gui.Window;

import javax.swing.*;

public class MyJDialog extends JDialog {
    public MyJDialog(Window parent, String title, boolean modal, BackEnd backEnd) {
        super(parent, title, modal);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setSize(350,400);
        setLocationRelativeTo(parent);
        setLayout(null);

        MyJTextArea area = new MyJTextArea();
        JScrollPane pane = new JScrollPane(area);
        pane.setBounds(10,10,getWidth()-37,getHeight()-100);
        pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        OkButton okButton = new OkButton(40, pane.getHeight() + 20, 100, 30, "OK", area, backEnd, parent);
        CancelButton cancelButton = new CancelButton(okButton.getX()+150,pane.getHeight() + 20, 100, 30, "Cancel", this);

        add(pane);
        add(okButton);
        add(cancelButton);

        setVisible(true);
    }
}
