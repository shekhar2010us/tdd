package shekhar.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegrationTestBase {
    @Before
    public final void setUp() {
        System.out.println("before in base class");
    }
    @After
    public final void tearDown() {
        System.out.println("after in base class");
    }
}

