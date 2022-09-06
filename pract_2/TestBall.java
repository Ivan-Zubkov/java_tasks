package pract_2;

public class TestBall {
    public static void main(String[] args) {
        Ball b2 = new Ball();
        System.out.println(b2);

        Ball b1 = new Ball(100, 100);
        System.out.println(b1);

        b1.move(30, 15);
        System.out.println(b1);

        b1.setX(20);

        System.out.println(b1.getX());

        b1.setXY(12,82);
        System.out.println(b1);

    }
}
