class SpaceAge {

    public static final int EARTH_SECONDS_PER_YEAR = 31_557_600;
    public static final double MERCURY_TIME_PER_EARTH_YEAR = 0.2408467;
    public static final double VENUS_TIME_PER_EARTH_YEAR = 0.61519726;
    public static final double MARS_TIME_PER_EARTH_YEAR = 1.8808158;
    public static final double JUPITER_TIME_PER_EARTH_YEAR = 11.862615;
    public static final double SATURN_TIME_PER_EARTH_YEAR = 29.447498;
    public static final double URANUS_TIME_PER_EARTH_YEAR = 84.016846;
    public static final double NEPTUNE_TIME_PER_EARTH_YEAR = 164.79132;
    private double seconds;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return seconds / EARTH_SECONDS_PER_YEAR;
    }

    double onMercury() {
        return seconds / (MERCURY_TIME_PER_EARTH_YEAR * EARTH_SECONDS_PER_YEAR);
    }

    double onVenus() {
        return seconds / (VENUS_TIME_PER_EARTH_YEAR * EARTH_SECONDS_PER_YEAR);
    }

    double onMars() {
        return seconds / (MARS_TIME_PER_EARTH_YEAR * EARTH_SECONDS_PER_YEAR);
    }

    double onJupiter() {
        return seconds / (JUPITER_TIME_PER_EARTH_YEAR * EARTH_SECONDS_PER_YEAR);
    }

    double onSaturn() {
        return seconds / (SATURN_TIME_PER_EARTH_YEAR * EARTH_SECONDS_PER_YEAR);
    }

    double onUranus() {
        return seconds / (URANUS_TIME_PER_EARTH_YEAR * EARTH_SECONDS_PER_YEAR);
    }

    double onNeptune() {
        return seconds / (NEPTUNE_TIME_PER_EARTH_YEAR * EARTH_SECONDS_PER_YEAR);
    }

}
