import org.example.backend.FileReader;
import org.junit.jupiter.api.Test;

public class FileReaderTest {
    @Test
    public void testDataReader() {
        String[][] list = FileReader.dataReader("src//main//resources//data//data1.txt");
        assert list.length == 11;
    }

    @Test
    public void testModelReader() {
        FileReader.modelReader("org.example.models.Model1");
    }

    @Test
    public void testScriptReader() {
        System.out.println(FileReader.scriptReader("src//main//resources//scripts//script1.groovy"));
    }
}
