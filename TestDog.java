package pract__1;

import java.lang.*;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog(12);
        Dog d3 = new Dog("sharik");
        Dog d4 = new Dog(3,"Vasya");
        Dog d5 = new Dog("Vasya",7);

        System.out.println(d1);

        d1.setAge(1);
        d1.setName("Alex");

        System.out.println(d1);
        System.out.println(d4);
        System.out.println(d5);

        d2.intoHumanAge();
        d3.intoHumanAge();
        d5.intoHumanAge();

    }
}