package Setting_Junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 class testCase {
    @Test
    void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result); 
    }
}
