public class ExperimentalRemoteControlCar implements RemoteControlCar{
    private int distanceTravel;
    public void drive() {
        distanceTravel += 20;
    }

    public int getDistanceTravelled() {
        return distanceTravel;
    }
}
