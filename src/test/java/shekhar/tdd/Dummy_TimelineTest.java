package shekhar.tdd;

import org.junit.Test;
import shekhar.tdd.dummies.UserLocationDummy;

public class Dummy_TimelineTest {
    @Test
    public void initializeWithDummyUserLocation() {
        UserLocationDummy userLocationDummy = new UserLocationDummy();
        Timeline timeline = new Timeline(userLocationDummy);
        userLocationDummy.getCurrentLocation();
    }
}
