public class ElonsToyCar {
    int totalDistance = 0;
    int battery = 100;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + totalDistance + " meters";
    }

    public String batteryDisplay() {
        return battery != 0 ? "Battery at " + battery + "%": "Battery empty";
    }

    public void drive() {
        if(battery != 0) {
            battery--;
            totalDistance += 20;
        }
    }
}
