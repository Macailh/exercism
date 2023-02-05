public class CarsAssemble {
    private final int CARS_PER_HOUR = 221;
    private final int MINUTES_IN_HOUR = 60;

    public double productionRatePerHour(int speed) {
        return CARS_PER_HOUR * speed * successRate(speed);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed)/MINUTES_IN_HOUR;
    }

    public double successRate(int speed) {
        if(speed == 10) {
            return 0.77;
        }
        if(speed == 9) {
            return 0.8;
        }
        if(speed >= 5) {
            return  0.9;
        }
        return 1;
    }
}
