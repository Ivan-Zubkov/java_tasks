package pract__1;
import java.lang.*;

public class Dog {
    private String name;
    private double age;

    public Dog (){
        name = "bob";
        age = 0.0;
    }

    public Dog (double age){
        name = "bob";
        this.age = age;
    }

    public Dog (String name){
        this.name = name;
        age = 0;
    }

    public Dog (String name, double age){
        this.name = name;
        this.age = age;
    }
    public Dog (double age, String name){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public double getAge() {
        return age;
    }
    @Override
    public String toString(){
        return this.name + ", age " + this.age;
    }
    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
}
