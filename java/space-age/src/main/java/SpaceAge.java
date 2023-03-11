class SpaceAge {
    private final double seconds;
    private static final double EARTH_YEAR_IN_SECONDS = 31557600;
    private static final double MERCURY_YEAR_IN_EARTH_YEARS = 0.2408467;
    private static final double VENUS_YEAR_IN_EARTH_YEARS = 0.61519726;
    private static final double MARS_YEAR_IN_EARTH_YEARS = 1.8808158;
    private static final double JUPITER_YEAR_IN_EARTH_YEARS = 11.862615;
    private static final double SATURN_YEAR_IN_EARTH_YEARS = 29.447498;
    private static final double URANUS_YEAR_IN_EARTH_YEARS = 84.016846;
    private static final double NEPTUNE_YEAR_IN_EARTH_YEARS = 164.79132;
    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return getSeconds()/EARTH_YEAR_IN_SECONDS;
    }

    double onMercury() {
        return onEarth()/MERCURY_YEAR_IN_EARTH_YEARS;
    }

    double onVenus() {
        return onEarth()/VENUS_YEAR_IN_EARTH_YEARS;
    }

    double onMars() {
        return onEarth()/MARS_YEAR_IN_EARTH_YEARS;
    }

    double onJupiter() {
        return  onEarth()/JUPITER_YEAR_IN_EARTH_YEARS;
    }

    double onSaturn() {
        return onEarth()/SATURN_YEAR_IN_EARTH_YEARS;
    }

    double onUranus() {
        return onEarth()/URANUS_YEAR_IN_EARTH_YEARS;
    }

    double onNeptune() {
        return onEarth()/NEPTUNE_YEAR_IN_EARTH_YEARS;
    }
}
