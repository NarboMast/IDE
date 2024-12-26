package org.example.backend;

import java.util.ArrayList;

public class DataHandler {
    public static int[] parseToInt(String[] input){
        int[] output = new int[input.length - 1];
        for(int i = 1; i < input.length; i++){
            output[i - 1] = Integer.parseInt(input[i]);
        }
        return output;
    }

    public static double[] parseDoubleWithDefinedSize(String[] input, int size){
        ArrayList<Double> output = new ArrayList<>();
        for(int i = 1; i < input.length; i++){
            output.add(Double.parseDouble(input[i]));
        }
        if(output.indexOf(output.getLast()) != size){
            int diff = size - output.size();
            for(int i = 0; i < diff; i++){
                output.add(output.getLast());
            }
        }

        double[] result = new double[output.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = output.get(i);
        }

        return result;
    }
}
