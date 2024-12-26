package org.example.backend;

import groovy.lang.GroovyShell;
import org.example.annotations.Bind;
import org.example.models.Model;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ScriptRunner {
    private final Model model;

    public ScriptRunner(Model model){
        this.model = model;
    }

    public double[] run(String script) {
        Map<String, Object> bindings = getBindings(model);
        GroovyShell shell = getShell(bindings);
        Object result = shell.evaluate(script);
        return getDoubleArray(result);
    }

    public Map<String, Object> getBindings(Object object){
        Map<String, Object> bindings = new HashMap<String, Object>();

        Field[] fields = object.getClass().getSuperclass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(Bind.class)) {
                try{
                    field.setAccessible(true);
                    bindings.put(field.getName(), field.get(object));
                } catch (IllegalAccessException e) {
                    System.out.println("Error setting bindings");
                }
            }
        }

        return bindings;
    }

    public GroovyShell getShell(Map<String, Object> bindings) {
        GroovyShell shell = new GroovyShell();
        for (Map.Entry<String, Object> entry : bindings.entrySet()) {
            shell.setVariable(entry.getKey(), entry.getValue());
        }
        return shell;
    }

    public double[] getDoubleArray(Object result) {
        if (result instanceof double[]) {
            return (double[]) result;
        }
        return null;
    }
}
