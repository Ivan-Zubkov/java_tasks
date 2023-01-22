//file OrderAlreadyAddedException.java
package lab_16;

public class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException() {
        super("The order has already been created!");
    }
}
