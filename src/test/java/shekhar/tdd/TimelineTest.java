package shekhar.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
     • Exercise 1: Create TimelineTest, Initialize the SUT
 Write test for following scenarios
     • Exercise 2: Timeline should be able to set fetchCount
     • Exercise 3: In Initial state when setFetchCount has not been invoked then fetchCount of timeline should be set to 10.
     • Exercise 4: Consumers should never be able to fetch more then 20 items. That means the fetchCount can never be greater then 20.
     • Exercise 5: Consumers should never be able to fetch less then 1 item. That means the fetchCount can never be less then 1
     • Exercise 6: Collaborate as a team to code review, demo and refactor each other’s code.
 */

public class TimelineTest {

    private final static int NEW_FETCH_COUNT = new Timeline().getFetchCount() + 1;

    private Timeline timeline;

    @Before
    public void setUp() {
        timeline = new Timeline();
    }

    @After
    public void tearDown() {
        timeline.dispose();
    }

    // Exercise 2
    @Test
    public void setFetchCount() {
        timeline.setFetchCount( NEW_FETCH_COUNT );
        System.out.println(timeline.getFetchCount());   // prints 11
        assertEquals( NEW_FETCH_COUNT, timeline.getFetchCount() );
    }

    // Exercise 3
    @Test
    public void initialState() {
        System.out.println("init: " + timeline.getFetchCount()); // prints 10
        //assertTrue( timeline.getFetchCount() > 0 );
        assertTrue( timeline.getFetchCount() == 10 );
    }

    // Exercise 4
    @Test
    public void setFetchCountExceedsUpperBound() {
        int originalFetchCount = timeline.getFetchCount();
        System.out.println("originalFetchCount: " + originalFetchCount );
        timeline.setFetchCount( Timeline.FETCH_COUNT_UPPER_BOUND + 1 );
        assertEquals( originalFetchCount, timeline.getFetchCount() );
    }

    // Exercise 5
    @Test
    public void setFetchCountExceedsLowerBound() {
        int originalFetchCount = timeline.getFetchCount();
        System.out.println(originalFetchCount);     // prints 10

        timeline.setFetchCount( Timeline.FETCH_COUNT_LOWER_BOUND - 1 );
        System.out.println(timeline.getFetchCount());       // prints 10
        assertEquals( originalFetchCount, timeline.getFetchCount() );
    }

}
