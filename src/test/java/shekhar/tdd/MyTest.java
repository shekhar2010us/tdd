package shekhar.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyTest extends IntegrationTestBase {
    @Before
    public final void before() {
        System.out.println("before in implemented class");
    }
    @Test
    public void test() {
        System.out.println("test in implemented class");
    }
    @After
    public final void after() {
        System.out.println("after in implemented class");
    }
}

