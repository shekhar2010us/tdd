package shekhar.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicAnnotationTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("BEFORE IN BASE CLASS");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("AFTER IN BASE CLASS");
    }

    @Test
    public void test() throws Exception {
        System.out.println("TEST IN BASE CLASS");
    }
}