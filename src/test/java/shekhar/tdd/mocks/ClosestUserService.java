package shekhar.tdd.mocks;

public class ClosestUserService {
    ClosestUsers closestUsers;

    // Note that "ClosestUsers" interface has no implementation;
        // the mock of the same will be created in the test class
    public double closenessOfTwoUsers(double lat1, double lng1, double lat2, double lng2) {
        return closestUsers.distanceBetweenTwoUsers(lat1, lng1, lat2, lng2);
    }

    public ClosestUsers getClosestUsers() { return closestUsers; }
    public void setClosestUsers(ClosestUsers _closestUsers) { this.closestUsers = _closestUsers; }

}
