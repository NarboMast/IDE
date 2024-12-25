import org.example.backend.Controller;
import org.example.backend.FileReader;
import org.example.backend.ScriptRunner;
import org.example.models.Model;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

public class ScriptRunnerTest {
//    @Test
//    public void testRun() {
//        Controller controller = new Controller("org.example.models.Model1");
//        controller.readDataFrom("src//main//resources//data//data2.txt").runModel();
//        String result = controller.getResultAsTsv();
//        System.out.println(result);
//
//        double[] d = controller.runScriptFromFile("src//main//resources//scripts//script1.groovy");
//
//        System.out.println(Arrays.toString(d));
//    }

//    @Test
//    public void testGetBindings() {
//        Controller controller = new Controller("org.example.models.Model1");
//        controller.readDataFrom("src//main//resources//data//data1.txt").runModel();
//        String result = controller.getResultAsTsv();
//        System.out.println(result);
//
//        System.out.println(controller.getModel().getLL());
//        System.out.println(Arrays.toString(controller.getModel().getTWKI()));
//
//        Model model = controller.getModel();
//
//        System.out.println(model.getLL());
//        System.out.println(Arrays.toString(model.getTWKI()));
//
//        ScriptRunner scriptRunner = new ScriptRunner(model);
//        Map<String, Object> bindings = scriptRunner.getBindings(controller.getModel());
//        System.out.println(bindings);
//    }

    @Test
    public void testBindings() {
        Model model = new Model();
        model.setLL(5);
        model.setTWKI(new double[]{1.5,1.3});

        ScriptRunner scriptRunner = new ScriptRunner(model);
        Map<String, Object> bindings = scriptRunner.getBindings(model);
        System.out.println(bindings);
    }
}
