package Setting_Junit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Assertions {

    @Test
     void testAssertions() {
        assertEquals(10, 4 + 6);

        assertTrue(5 > 3);

        assertFalse(5 < 3);

        assertNull(null);

        assertNotNull(new Object());
    }
}

