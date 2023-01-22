//file TestComplex.java
package pract_10;

public class TestComplex {
    public static void main(String[] args){
        ConcreteFactory cf = new ConcreteFactory();
        cf.createComplex(12,3);
        System.out.println("real: " + cf.getC().getReal() + "; image: " + cf.getC().getImage());
    }
}
