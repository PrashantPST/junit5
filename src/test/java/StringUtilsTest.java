import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StringUtilsTest {
    @Test
    void givenNullString_whenReverseIsCalled_thenNullIsReturned() {
        String actual = StringUtils.reverse((null));
        assertNull(actual);
    }

    @Test
    void givenEmptyString_whenReverseIsCalled_thenEmptyStringIsReturned1() {
        String actual = StringUtils.reverse((""));
        assertNotNull(actual);
    }

    @Test
    void givenNonNullString_whenReverseIsCalled_thenReversedStringIsReturned() {
        String actual = StringUtils.reverse(("ABCD"));
        assertNotNull(actual);
    }

    // ******** assertEquals Example - Start **********

    @Test
    void givenEmptyString_whenReverseIsCalled_thenEmptyStringIsReturned2() {
        String actual = StringUtils.reverse((""));
        String expected = "";

        // assertEquals without message
        assertEquals(expected, actual);
    }

    @Test
    void givenNonNullString_whenReverseIsCalled_thenReversedStringIsNotReturned() {
        String actual = StringUtils.reverse(("ABCD"));
        String expected = "DBCA";

        String message = "assertEquals failed";
        // assertEquals with message
        assertNotEquals(expected, actual, message);
    }

    @Test
    void givenNonNullString_whenReverseIsCalled_thenReversedStringIsReturned2() {
        String actual = StringUtils.reverse(("1234"));
        String expected = "2314";

        Supplier<String> messageSupplier = () -> "assertEquals failed";
        // assertEquals with Java 8 Supplier<String>
        assertNotEquals(expected, actual, messageSupplier);
    }
}
