class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceDrive;
    private int battery;

    // TODO: define the constructor for the 'NeedForSpeed' class
    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distanceDrive = 0;
        this.battery = 100;
    }

    public boolean batteryDrained() {
        return battery <= 0;
    }

    public int distanceDriven() {
        return distanceDrive;
    }

    public void drive() {
        if(!batteryDrained()) {
            distanceDrive += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    // TODO: define the constructor for the 'RaceTrack' class
    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while(!car.batteryDrained()) {
            car.drive();
        }
        return car.distanceDriven() >= this.distance;
    }
}
