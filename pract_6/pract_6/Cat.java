package pract_6;

public class Cat {

    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("tom");
        cats[1] = new Cat("begemot");
        cats[2] = new Cat("philipp");

        System.out.println(cats[0].name);
    }
}