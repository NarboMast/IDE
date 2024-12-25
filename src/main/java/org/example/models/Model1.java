package org.example.models;

import java.util.Arrays;

public class Model1 extends Model{

    public Model1() {
        System.out.println("Model1 Constructor");
    }

    @Override
    public void run() {
        PKB = new double[LL];
        PKB[0] = KI[0] + KS[0] + INW[0] + EKS[0] - IMP[0];
        for (int t = 1; t < LL; t++) {
            KI[t] = twKI[t] * KI[t - 1];
            KS[t] = twKS[t] * KS[t - 1];
            INW[t] = twINW[t] * INW[t - 1];
            EKS[t] = twEKS[t] * EKS[t - 1];
            IMP[t] = twIMP[t] * IMP[t - 1];
            PKB[t] = KI[t] + KS[t] + INW[t] + EKS[t] - IMP[t];
        }
    }

    @Override
    public String toString() {
        return "LATA:" + Arrays.toString(lATA) + "\n"
                + "twKI:" + Arrays.toString(twKI) + "\n"
                + "twKS:" + Arrays.toString(twKS) + "\n"
                + "twINW:" + Arrays.toString(twINW) + "\n"
                + "twEKS:" + Arrays.toString(twEKS) + "\n"
                + "twIMP:" + Arrays.toString(twIMP) + "\n"
                + "KI:" + Arrays.toString(KI) + "\n"
                + "KS:" + Arrays.toString(KS) + "\n"
                + "INW:" + Arrays.toString(INW) + "\n"
                + "EKS:" + Arrays.toString(EKS) + "\n"
                + "IMP:" + Arrays.toString(IMP) + "\n"
                + "PKB:" + Arrays.toString(PKB) + "\n";
    }
}
