package lab_1;

public class TestMath {
    public static void main(String[] args) {
        MyMath a1 = new MyMath();
        System.out.println("factorial a1 = "+a1.fact());
        MyMath a2 = new MyMath(5);
        System.out.println(a2.getA());
        a1.setA(3);
        System.out.println("factorial a1 = "+a1.fact());
        System.out.println("factorial a2 = "+a2.fact());


    }
}
