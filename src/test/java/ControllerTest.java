import org.example.backend.Controller;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ControllerTest {
    @Test
    public void testControllerRun() {
        Controller controller = new Controller("org.example.models.Model1");
        controller.readDataFrom("src//main//resources//data//data1.txt").runModel();
        String result = controller.getResultAsTsv();
        System.out.println(result);
    }

    @Test
    public void testControllerRunData2() {
        Controller controller = new Controller("org.example.models.Model1");
        controller.readDataFrom("src//main//resources//data//data2.txt").runModel();
        String result = controller.getResultAsTsv();
        System.out.println(result);
    }

//    @Test
//    public void testControllerRunScript() {
//        Controller controller = new Controller("org.example.models.Model1");
//        double[] d = controller.readDataFrom("src//main//resources//data//data2.txt").runModel().runScriptFromFile("src//main//resources//scripts//script1.groovy");
//        System.out.println(Arrays.toString(d));
//    }
}
