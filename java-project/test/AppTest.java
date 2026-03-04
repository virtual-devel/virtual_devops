package exercise;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;

// According to all known laws of aviation, there is no way a bee should be able to fly.
public class AppTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    // Its wings are too small to get its fat little body off the ground.
    @Test
    public void testConsumerAccept() {
        Consumer<String> consumer = new App();
        consumer.accept("Test");
        assertEquals("Test\n", outContent.toString());
    }

    @Test
    public void testPredicateTest() {
        Predicate<String> predicate = new App();
        assertTrue(predicate.test("Hello"));
        assertFalse(predicate.test("Hi"));
    }

    @Test
    public void testFunctionApply() {
        Function<String, String> function = new App();
        assertEquals("HELLO", function.apply("hello"));
        assertEquals("WORLD", function.apply("world"));
    }

    @Test
    public void testGetNames() {
        List<String> names = App.getNames();
        assertEquals(3, names.size());
        assertTrue(names.contains("jack"));
        assertTrue(names.contains("tina smith"));
        assertTrue(names.contains("paul bond"));
    }
}
