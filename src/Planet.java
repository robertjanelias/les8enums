public enum Planet {
    // Enumerations with fields and constructor in Java
    MERCURY(0.33, 0.39),
    VENUS(0.82, 0.72),
    EARTH(1.00, 1.00),
    MARS(0.11, 0.53),
    JUPITER(317.8, 11.21),
    SATURN(95.2, 9.41),
    URANUS(14.6, 4.32),
    NEPTUNE(17.2, 3.86);

    private final double mass; // in Earth masses
    private final double radius; // in Earth radii

    // Constructor for Planet enumeration
    private Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    // Getter methods
    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
}
