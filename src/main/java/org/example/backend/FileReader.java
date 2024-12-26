package org.example.backend;

import org.example.models.Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public static String[][] dataReader(String filename) {
        ArrayList<String[]> list = new ArrayList<String[]>();
        try {
            File file = new File(filename);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                list.add(sc.nextLine().split("\\s+"));
            }
            sc.close();
            return list.toArray(new String[0][0]);
        } catch (FileNotFoundException e) {
            System.out.println("Data file not found");
        }
        return null;
    }

    public static Model modelReader(String modelName) {
        Model model = null;
        try{
            Class<?> clazz = Class.forName(modelName);

            model = (Model)clazz.getConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println("Model not found");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return model;
    }

    public static String scriptReader(String filename) {
        StringBuilder result = new StringBuilder();

        try{
            File file = new File(filename);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                result.append(sc.nextLine()).append(System.lineSeparator());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Script file not found");
        }

        return result.toString().trim();
    }
}
