package org.example.gui.leftPanel;

import io.github.classgraph.ClassGraph;
import io.github.classgraph.ScanResult;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class PackageClassLister {
    private List<String> classNames;

    public PackageClassLister(String packageName) {
        try (ScanResult scanResult = new ClassGraph()
                .acceptPackages(packageName)
                .scan()) {

            classNames = scanResult.getAllClasses().stream()
                    .map(classInfo -> classInfo.getName().substring(classInfo.getName().lastIndexOf('.') + 1))
                    .toList();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public PackageClassLister(Path packagePath) {
        try (Stream<Path> paths = Files.list(packagePath)) {
            classNames = paths
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".txt"))
                    .map(path -> path.getFileName().toString())
                    .toList();
        } catch (IOException e) {
            System.out.println("Error reading directory: " + e.getMessage());
        }
    }

    public ListModel<String> getClassNames() {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (String className : classNames) {
            listModel.addElement(className);
        }

        return listModel;
    }
}
