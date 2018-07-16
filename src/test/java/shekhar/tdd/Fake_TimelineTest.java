package shekhar.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import shekhar.tdd.fakes.LocationDatabaseFake;
import static org.junit.Assert.assertEquals;

public class Fake_TimelineTest {
    protected LocationDatabaseFake locationDatabaseFake = null;
    @Before
    public void setup() throws Exception {
        locationDatabaseFake = new LocationDatabaseFake();
        locationDatabaseFake.save("home", "tv room");
    }
    @Test
    public void initializeWithFakeUserLocation() throws Exception {
        assertEquals("tv room", locationDatabaseFake.get("home") );
    }
    @After
    public void tearDown() throws Exception {
        locationDatabaseFake = null;
    }
}
