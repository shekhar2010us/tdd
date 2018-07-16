package shekhar.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import shekhar.tdd.stubs.DeviceLocationInfoStub;
import static org.junit.Assert.assertTrue;

public class Stub_TimelineTest {
    protected DeviceLocationInfoStub deviceLocationInfoStub = null;

    @Before
    public void setup() throws Exception {
        deviceLocationInfoStub = new DeviceLocationInfoStub(); }
    @Test
    public void initializeWithStubUserLocation() throws Exception {
        assertTrue(deviceLocationInfoStub.isLocationEnabled() ); }
    @After
    public void tearDown() throws Exception {
        deviceLocationInfoStub = null; }
}
