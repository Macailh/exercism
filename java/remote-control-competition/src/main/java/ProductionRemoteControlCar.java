class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{
    private int distanceTravel;
    private int numberOfVictories;
    public void drive() {
        distanceTravel += 10;
    }

    public int getDistanceTravelled() {
        return this.distanceTravel;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        this.numberOfVictories = numberofVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return this.numberOfVictories - o.getNumberOfVictories();
    }
}
