//file Shape.java
package lab_5;

public abstract class Shape {
    private String color;
    private boolean filled;
    public Shape(){}
    public Shape(String color, boolean filled){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
    public abstract String toString();
}
