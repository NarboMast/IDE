package org.example;

import org.example.backend.Controller;
import org.example.gui.Window;

public class Application {
    public static void main(String[] args) {
        new Window();

        String dataDir = "src//main//resources//data//";
        String scriptDir = "src//main//resources//scripts//";

        Controller ctl = new Controller("org.example.models.Model1");
        ctl.readDataFrom(dataDir + "data1.txt")
                .runModel();
        String res = ctl.getResultAsTsv();
        System.out.println(res);

        ctl.readDataFrom(dataDir + "data1.txt")
                .runModel()
                .runScriptFromFile(scriptDir + "script1.groovy");
        System.out.println(ctl.getResultAsTsv());
    }
}