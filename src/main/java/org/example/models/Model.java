package org.example.models;

import org.example.annotations.Bind;

import java.util.LinkedHashMap;
import java.util.Map;

public class Model {
    private final Map<String, Object> parameters;

    public int[] LATA;
    @Bind public int LL; // number of years
    @Bind public double[] twKI; // the growth rate of private consumption
    @Bind public double[] twKS; // the growth rate of public consumption
    @Bind public double[] twINW; // investment growth
    @Bind public double[] twEKS; // export growth
    @Bind public double[] twIMP; // import growth
    @Bind public double[] KI; // private consumption
    @Bind public double[] KS; // public consumption
    @Bind public double[] INW; // investments
    @Bind public double[] EKS; // export
    @Bind public double[] IMP; // import
    @Bind public double[] PKB; // GDP
    public double temp; // this field is not associated with the data model or with the results

    public Model(){
        parameters = new LinkedHashMap<>();
    }

    public void refreshParameters() {
        parameters.put("twKI", twKI);
        parameters.put("twKS", twKS);
        parameters.put("twINW", twINW);
        parameters.put("twEKS", twEKS);
        parameters.put("twIMP", twIMP);
        parameters.put("KI", KI);
        parameters.put("KS", KS);
        parameters.put("INW", INW);
        parameters.put("EKS", EKS);
        parameters.put("IMP", IMP);
        parameters.put("PKB", PKB);
    }

    public void run(){
        System.out.println("I am just a model class");
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        parameters.forEach((key, value) -> {
            sb.append(key).append(" ");
            if(value instanceof double[] ds){
                for(double d : ds){
                    sb.append(d).append(" ");
                }
            } else {
                sb.append(value.toString());
            }
            sb.append("\n");
        });

        return sb.toString();
    }

    public void addToParameters(String param, Object value){
        parameters.put(param, value);
    }

    public int[] getLATA(){
        return LATA;
    }

    public void setLATA(int[] LATA){
        this.LATA = LATA;
    }
    public void setLL(int LL) {
        this.LL = LL;
    }
    public void setTWKI(double[] twKI) {
        this.twKI = twKI;
    }
    public void setTWKS(double[] twKS) {
        this.twKS = twKS;
    }
    public void setTWINW(double[] twINW) {
        this.twINW = twINW;
    }
    public void setTWEKS(double[] twEKS) {
        this.twEKS = twEKS;
    }
    public void setTWIMP(double[] twIMP) {
        this.twIMP = twIMP;
    }
    public void setKI(double[] KI) {
        this.KI = KI;
    }
    public void setKS(double[] KS) {
        this.KS = KS;
    }
    public void setINW(double[] INW) {
        this.INW = INW;
    }
    public void setEKS(double[] EKS) {
        this.EKS = EKS;
    }
    public void setIMP(double[] IMP) {
        this.IMP = IMP;
    }
}
