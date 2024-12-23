package org.example.gui.leftPanel;

import org.example.gui.MyJList;

import java.nio.file.Path;

public class DataList extends MyJList {
    public DataList(int x, int y, int width, int height){
        PackageClassLister packageClassLister = new PackageClassLister(Path.of("src//main//resources//data"));
        super(packageClassLister.getClassNames());

        setBounds(x, y, width, height);
    }
}
