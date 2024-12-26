package org.example.backend;

import java.text.DecimalFormat;
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

    public static String[][] parseStringTo2DArray(String input) {
        String[] lines = input.split("\n");
        int columns = lines[0].split(" ").length;
        String[][] result = new String[lines.length][columns];

        for (int i = 0; i < lines.length; i++) {
            String[] row = lines[i].split(" ");
            char firstChar = row[0].charAt(0);

            for (int j = 0; j < columns; j++) {
                if ("KIEGP".indexOf(firstChar) != -1) {
                    result[i][j] = oneDecimal(row[j]);
                } else if (firstChar == 't') {
                    result[i][j] = twoDecimal(row[j]);
                } else {
                    result[i][j] = threeDecimal(row[j]);
                }
            }
        }

        return result;
    }

    public static String threeDecimal(String text) {
        return formatDecimal(text, 3);
    }

    public static String twoDecimal(String text) {
        return formatDecimal(text, 2);
    }

    public static String oneDecimal(String text) {
        return formatDecimal(text, 1);
    }

    private static String formatDecimal(String text, int decimalPlaces) {
        try {
            double value = Double.parseDouble(text);
            String pattern = "# ##0." + "0".repeat(decimalPlaces);
            DecimalFormat df = new DecimalFormat(pattern);
            df.setGroupingSize(3);
            df.setGroupingUsed(true);
            return df.format(value).replace(",", " ");
        } catch (NumberFormatException e) {
            return text;
        }
    }

    public static String[] parseToString(int[] o){
        String[] result = new String[o.length + 1];
        result[0] = " ";
        for(int i = 0; i < o.length; i++){
            result[i+1] = String.valueOf(o[i]);
        }
        return result;
    }
}

















