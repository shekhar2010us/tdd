package shekhar.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BasicAnnotationTestBetter {

    @After
    public void tearDown() throws Exception {
        aftermethod1();
        aftermethod2();
    }

    private void aftermethod2() {
        System.out.println("AFTER method 2 IN BASE CLASS");
    }

    private void aftermethod1() {
        System.out.println("AFTER method 1 IN BASE CLASS");
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
    public void setUp2() throws Exception {
        beforemethod1();
        beforemethod2();
    }

    private void beforemethod1() {
        System.out.println("BEFORE method 1 IN BASE CLASS");
    }

    private void beforemethod2() {
        System.out.println("BEFORE method 2 IN BASE CLASS");
    }


}
