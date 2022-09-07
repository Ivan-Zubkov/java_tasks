package lab_2;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(1, 4, 3);
        c1.setX(8.8);
        c1.setY(4);
        c1.setR(10);

        System.out.println("length c2 = " + c2.lengthCircle());
        System.out.println("square c1 = " + c1.squareCircle());
        System.out.println("radius c2 = " + c2.getR());

    }
}
