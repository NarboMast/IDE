package org.example.gui;

import javax.swing.JList;
import javax.swing.ListModel;

public class MyJList extends JList<String> {
    public MyJList(ListModel<String> model) {
        super(model);
    }
}
