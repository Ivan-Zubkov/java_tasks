package lab_3;

public class Pot extends Dish{
    private double radius;
    private double volume;

    public Pot() {
    }

    public Pot(double radius) {
        this.radius = radius;
    }

    public Pot(double radius, double volume) {
        this.radius = radius;
        this.volume = volume;
    }

    public Pot(String material, String color) {
        super(material, color);
    }

    public Pot(String material, String color, double radius) {
        super(material, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
