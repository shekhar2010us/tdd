package shekhar.tdd;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import shekhar.tdd.mocks.ClosestUserService;
import shekhar.tdd.mocks.ClosestUsers;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class Mock_TimelineTest {

    ClosestUserService closestUserService;

    @Before
    public void setup() {
        closestUserService = new ClosestUserService();

        ClosestUsers closestUsers = Mockito.mock(ClosestUsers.class);
        when(closestUsers.distanceBetweenTwoUsers(40.109166,
                -75.392951, 40.083297, -75.404281)).thenReturn(5.5);
        closestUserService.setClosestUsers(closestUsers);
    }

    // Note that "ClosestUsers" interface has no implementation;
    // the mock of the same will be created in the test class
    @Test
    public void testDistanceBetweenTwoUsers() {
        assertEquals(5.5, closestUserService.closenessOfTwoUsers(40.109166,
                -75.392951, 40.083297, -75.404281), 0.5);
    }

}
