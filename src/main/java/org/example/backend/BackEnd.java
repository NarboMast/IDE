package org.example.backend;

public class BackEnd {
    private final String dataDir = "src//main//resources//data//";
    private final String modelsPackage = "org.example.models.";

    private Controller ctl;

    public BackEnd(){}

    public String[][] runActionPerformed(String model, String data){
        ctl = new Controller(modelsPackage + model);
        ctl.readDataFrom(dataDir + data).runModel();
        return DataHandler.parseStringTo2DArray(ctl.getResultAsTsv());
    }

    public String[][] runScriptPerformed(){
        return DataHandler.parseStringTo2DArray(ctl.getResultAsTsv());
    }

    public String[] getColumns(Controller ctl){
        return DataHandler.parseToString(ctl.getModel().getLATA());
    }

    public Controller getController(){
        return ctl;
    }
}
