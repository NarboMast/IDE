package org.example.gui.leftPanel;

import org.example.backend.BackEnd;
import org.example.gui.MyJButton;
import org.example.gui.MyJList;
import org.example.gui.Window;
import org.example.gui.rightPanel.OutPutList;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class RunButton extends MyJButton {
    private final BackEnd backEnd;
    private final MyJList modelsList;
    private final MyJList dataList;

    public RunButton(int x, int y, int width, int height, String text, MyJList modelsList, MyJList dataList, BackEnd backEnd) {
        super(text);
        setBounds(x,y,width,height);
        this.modelsList = modelsList;
        this.dataList = dataList;
        this.backEnd = backEnd;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(modelsList.getSelectedIndex() != -1 && dataList.getSelectedIndex() != -1){
            String[][] str = backEnd.runActionPerformed(modelsList.getSelectedValue(), dataList.getSelectedValue());
            String[] columns = backEnd.getColumns(backEnd.getController());

            OutPutList newTable = new OutPutList(str, columns);
            JScrollPane jScrollPane = new JScrollPane(newTable);

            ((Window) SwingUtilities.getWindowAncestor(this)).getRightPanel().updateTable(jScrollPane);
        }
    }
}
