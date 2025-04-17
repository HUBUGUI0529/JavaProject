import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

public class HelloTest {

    @Test
    public void testMainOutput() {
        
        System.err.println("调试内容：xxx"); // 这样更容易在 VS Code 控制台看到
        
    }
}
