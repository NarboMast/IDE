package org.example.backend;

import org.example.models.Model;

public class Controller {
    private final Model model;

    public Controller(String modelName){
        model = FileReader.modelReader(modelName);
    }

    public Controller readDataFrom(String fileName){
        String[][] data = FileReader.dataReader(fileName);
        if(data != null){
            int columnSize = data[0].length-1;
            model.setLATA(DataHandler.parseToInt(data[0]));
            model.setLL(columnSize);
            model.setTWKI(DataHandler.parseDoubleWithDefinedSize(data[1], columnSize));
            model.setTWKS(DataHandler.parseDoubleWithDefinedSize(data[2], columnSize));
            model.setTWINW(DataHandler.parseDoubleWithDefinedSize(data[3], columnSize));
            model.setTWEKS(DataHandler.parseDoubleWithDefinedSize(data[4], columnSize));
            model.setTWIMP(DataHandler.parseDoubleWithDefinedSize(data[5], columnSize));
            model.setKI(DataHandler.parseDoubleWithDefinedSize(data[6], columnSize));
            model.setKS(DataHandler.parseDoubleWithDefinedSize(data[7], columnSize));
            model.setINW(DataHandler.parseDoubleWithDefinedSize(data[8], columnSize));
            model.setEKS(DataHandler.parseDoubleWithDefinedSize(data[9], columnSize));
            model.setIMP(DataHandler.parseDoubleWithDefinedSize(data[10], columnSize));
        }
        return this;
    }

    public Controller runModel(){
        model.run();
        return this;
    }

    public void runScriptFromFile(String fileName){
        String str = FileReader.scriptReader(fileName);
        runScript(str);
    }

    public void runScript(String script){
        String firstWord = script.split(" ", 2)[0];
        System.out.println(firstWord);
        ScriptRunner scriptRunner = new ScriptRunner(model);
        double[] d = scriptRunner.run(script);
        for(double di : d){
            System.out.println(di);
        }
        model.addToParameters(firstWord, d);
    }

    public String getResultAsTsv(){
        return model.toString();
    }

    public Model getModel(){
        return model;
    }
}
