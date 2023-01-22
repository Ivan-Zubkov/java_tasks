//file IllegalTableNumber.java
package lab_16;

public class IllegalTableNumber extends Exception {
    public IllegalTableNumber() {
        super("There is no table with such a number");
    }
}
