package lab_4;

public class TestClass {
    public static void main(String[] args){
        Priceable phone = new Smartphone(100, 7,8, 256, 5000,359.9);
        Priceable earphones =new Earphones(200, 20, 2, 199.9);
        
        System.out.println("phone price is " + phone.getPrice());
        System.out.println("earphones price is " + earphones.getPrice());
    }
}
