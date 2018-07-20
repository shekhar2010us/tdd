package shekhar.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BasicAnnotationTest {


    /**
     * Having multiple @before and @after doesn't guarantee the sequence, better to use just one annotation.
     * shown in the class BasicAnnotationTestBetter.java
     */

    @After
    public void tearDownfirst() throws Exception {
        System.out.println("AFTER first IN BASE CLASS");
    }

    @After
    public void tearDownsecond() throws Exception {
        System.out.println("AFTER second IN BASE CLASS");
    }

    @Test
    public void test() throws Exception {
        System.out.println("TEST IN BASE CLASS");
    }

    @Test
    public void test2() throws Exception {
        System.out.println("TEST 2 IN BASE CLASS");
    }

    @Before
    public void setUpfirst() throws Exception {
        System.out.println("BEFORE first IN BASE CLASS");
    }

    @Before
    public void setUpsecond() throws Exception {
        System.out.println("BEFORE second IN BASE CLASS");
    }

}