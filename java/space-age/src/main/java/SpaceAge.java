class SpaceAge {

    public static final int earthSeconds = 31_557_600;
    private double seconds;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return seconds / earthSeconds;
    }

    double onMercury() {
        return seconds / (0.2408467 * earthSeconds);
    }

    double onVenus() {
        return seconds / (0.61519726 * earthSeconds);
    }

    double onMars() {
        return seconds / (1.8808158 * earthSeconds);
    }

    double onJupiter() {
        return seconds / (11.862615 * earthSeconds);
    }

    double onSaturn() {
        return seconds / (29.447498 * earthSeconds);
    }

    double onUranus() {
        return seconds / (84.016846 * earthSeconds);
    }

    double onNeptune() {
        return seconds / (164.79132 * earthSeconds);
    }

}
