package pract_3;

public class Circle extends Shape{
    protected double radius;
    public Circle(){
        this.setFilled(false);
        this.setColor("blue");
        radius = 1;
    }
    public Circle(double radius){
        this.setFilled(false);
        this.setColor("blue");
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.setFilled(filled);
        this.setColor(color);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString() {
        return "Shape: circle, radius: "+this.radius+", color: "+this.getColor();
    }
}

