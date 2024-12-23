package org.example.gui.leftPanel;

import org.example.gui.MyJList;

public class ModelsList extends MyJList {
    public ModelsList(int x, int y, int width, int height) {
        PackageClassLister packageClassLister = new PackageClassLister("org.example.models");
        super(packageClassLister.getClassNames());

        setBounds(x, y, width, height);
    }
}
