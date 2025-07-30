package Setting_Junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class Calc{
	
	int add(int a,int b) {
        int result = a + b;
        return result;
    }	
}


public class AAAtest {
	    Calc calculate;
	    @BeforeEach
	    public void setUp() {
	        calculate = new Calc();
	        System.out.println("Before Testing");
	    }

	    @AfterEach
	    public void tearDown() {
	        calculate = null;
	        System.out.println("After Testing ");
	    }

	    @Test
	    public void testAdd() {
	        int a = 10;
	        int b = 5;

	        int result = calculate.add(a, b);

	        assertEquals(15, result);
	    }
}
