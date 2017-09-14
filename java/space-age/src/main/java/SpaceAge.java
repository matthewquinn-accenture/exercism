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
        double ageOnEarth = seconds / EARTH_SECONDS_PER_YEAR;
        return ageOnEarth;
    }

    double onMercury() {
        double ageOnMercury = seconds / (MERCURY_TIME_PER_EARTH_YEAR * EARTH_SECONDS_PER_YEAR);
        return ageOnMercury;
    }

    double onVenus() {
        double ageOnVenus = seconds / (VENUS_TIME_PER_EARTH_YEAR * EARTH_SECONDS_PER_YEAR);
        return ageOnVenus;
    }

    double onMars() {
        double ageOnMars = seconds / (MARS_TIME_PER_EARTH_YEAR * EARTH_SECONDS_PER_YEAR);
        return ageOnMars;
    }

    double onJupiter() {
        double ageOnJupiter = seconds / (JUPITER_TIME_PER_EARTH_YEAR * EARTH_SECONDS_PER_YEAR);
        return ageOnJupiter;
    }

    double onSaturn() {
        double ageOnSaturn = seconds / (SATURN_TIME_PER_EARTH_YEAR * EARTH_SECONDS_PER_YEAR);
        return ageOnSaturn;
    }

    double onUranus() {
        double ageOnUranus = seconds / (URANUS_TIME_PER_EARTH_YEAR * EARTH_SECONDS_PER_YEAR);
        return ageOnUranus;
    }

    double onNeptune() {
        double ageOnNeptune = seconds / (NEPTUNE_TIME_PER_EARTH_YEAR * EARTH_SECONDS_PER_YEAR);
        return ageOnNeptune;
    }

}
