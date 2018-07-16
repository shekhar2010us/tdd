package shekhar.tdd.dummies;

public class UserLocationDummy implements UserLocation {
    private static String MESSAGE = "Dummy method must never be called.";
    @Override
    public String getCurrentLocation( ) {
        System.out.println(MESSAGE);
        throw new UnsupportedOperationException( MESSAGE );
    }
}
