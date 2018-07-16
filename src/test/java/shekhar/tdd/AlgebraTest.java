package shekhar.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlgebraTest {

    protected double A, B;

    @Before
    public void setUp() throws Exception {
        A = 10.2;
        B = 12.3;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sum() {
        Algebra tester = new Algebra();
        assertEquals(A + " + " + B + " must be 22.5 ", 22.6, tester.sum(10.2, 12.3), 0.15);
    }

    @Test
    public void multiply() {
        Algebra tester = new Algebra();
        assertEquals("10 * 12 must be 120", 120.0, tester.multiply(10.0, 12.0), 0.0);
    }

    @Test
    public void concat() {
        Algebra tester = new Algebra();
        assertEquals("shekhar | agrawal", tester.concat("shekhar", "agrawal", "|"));
    }
}