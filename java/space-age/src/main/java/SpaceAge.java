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
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onMars() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onJupiter() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onSaturn() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onUranus() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onNeptune() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
