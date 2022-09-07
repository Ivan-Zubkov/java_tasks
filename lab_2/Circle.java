package lab_2;

public class Circle {
    private double x; // абсцисса центра
    private double y; // ордината центра
    private double r; // радиус

    public Circle() {
        x = 0.0;
        y = 0.0;
        r = 1.0;
    }
    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setR(double r){
        if (r <= 0) {
            return;
        }
        this.r = r;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
    public double getR(){
        return r;
    }

    public String toString() {
        return "Окружность с центром (" + x + ";" + y + ") и радиусом " + r;
    }

    public double lengthCircle() {
        double l = 2 * Math.PI * r;
        return l;
    }

    public double squareCircle() {
        double s = Math.PI * r * r;
        return s;
    }
}
