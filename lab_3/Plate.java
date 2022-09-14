package lab_3;

public class Plate extends Dish{
    private double radius;

    public Plate() {
    }

    public Plate(double radius) {
        this.radius = radius;
    }

    public Plate(String material, String color) {
        super(material, color);
    }

    public Plate(String material, String color, double radius) {
        super(material, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
