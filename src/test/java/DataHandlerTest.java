import org.example.backend.DataHandler;
import org.junit.jupiter.api.Test;

public class DataHandlerTest {
    @Test
    public void testParseDouble() {
        String[] str = {"INW","1.2","811108.6"};
        double[] d = DataHandler.parseDoubleWithDefinedSize(str, 5);
        for (double d1 : d) {
            System.out.println(d1);
        }
    }
}
