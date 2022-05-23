public enum Planet_end {
    MERCURY(0.38),
    VENUS(0.91),
    EARTH(1.0),
    MARS(0.38),
    JUPITER(2.34),
    SATURN(0.93),
    URANUS(0.92),
    NEPTUNE(1.12);

    private final double surfaceGravity;

    Planet_end(double surfaceGravity) {
        this.surfaceGravity = surfaceGravity;
    }

    public double getSurfaceWeight(double earthWeightInPounds) {
        return earthWeightInPounds * this.surfaceGravity;
    }
}

