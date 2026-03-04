import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    public void testAdditionOperation() {
        String simulatedInput = "5\n+\n3\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Main.main(new String[]{});

        String output = outputStream.toString();
        assertTrue(output.contains("Result: 8.0"));
    }

    @Test
    public void testDivisionByZero() {
        String simulatedInput = "5\n/\n0\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Main.main(new String[]{});

        String output = outputStream.toString();
        assertTrue(output.contains("Error: Division by zero is not allowed."));
    }

    @Test
    public void testInvalidOperator() {
        String simulatedInput = "5\nx\n3\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Main.main(new String[]{});

        String output = outputStream.toString();
        assertTrue(output.contains("Error: Invalid operator."));
    }

    @Test
    public void testSubtractionOperation() {
        String simulatedInput = "10\n-\n4\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Main.main(new String[]{});

        String output = outputStream.toString();
        assertTrue(output.contains("Result: 6.0"));
    }

}