package org.example.gui.leftPanel;

import org.example.backend.BackEnd;
import org.example.gui.MyJButton;
import org.example.gui.MyJList;
import org.example.gui.MyJPanel;

public class LeftPanel extends MyJPanel {
    public LeftPanel(int x, int y, int width, int height, BackEnd backEnd) {
        setLayout(null);
        setBounds(x,y,width, height);
        setPanelBorder();

        MyJList modelsList = new ModelsList(10, 10, 87, 265);
        MyJList dataList = new DataList(102, 10, 87, 265);
        MyJButton runButton = new RunButton(50, 285, 100, 30, "Run model", modelsList, dataList, backEnd);

        add(modelsList);
        add(dataList);
        add(runButton);
    }
}
