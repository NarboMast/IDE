package org.example.gui.runScriptFromFile;

import javax.swing.*;

public class FileChooser extends JFileChooser {
    public FileChooser() {
        super("D://ChessProjectUTP//IDE//src//main//resources//scripts");
    }

    public String chooseFile() {
        int ruta = this.showOpenDialog(null);
        if (ruta == JFileChooser.APPROVE_OPTION) {
            return this.getSelectedFile().getAbsolutePath();
        } else {
            return null;
        }
    }
}
