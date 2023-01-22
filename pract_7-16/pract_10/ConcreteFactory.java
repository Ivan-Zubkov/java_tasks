//file ConcreteFactory.java
package pract_10;

public class ConcreteFactory implements ComplexAbstractFactory{

    //public int real;
    //public int image;
    private Complex c;

    public ConcreteFactory() {

    }

    public Complex getC() {
        return c;
    }

    public Complex createComplex(){
        c = new Complex();
        return c;
    }

    public Complex createComplex(int real, int image){
        //this.real = real;
        //this.image = image;
        c = new Complex(real,image);
        return c;
    }
}
