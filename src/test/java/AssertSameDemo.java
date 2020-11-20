import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

public class AssertSameDemo {
    @Test
    public void testAssertSameWithSameObject() {
        String actual = "hello";
        String expected = "hello";
        assertSame(expected, actual);
    }

    @Test
    public void testAssertSameWithDifferentObject() {
        String actual = "hello";
        String expected = "hell";
        assertNotSame(expected, actual);
    }

    @Test
    public void testAssertSameWithDifferentObjectAndMessage() {
        String actual = "hello";
        String expected = "hell";
        assertNotSame(expected, actual, "The actual value is not same as expected value");
    }

    @Test
    public void testAssertSameWithDifferentObjectAndMessageSupplier() {
        String actual = "hello";
        String expected = "hell";
        assertNotSame(expected, actual, "The actual value is not same as expected value");
    }
}
