//file QueueNode.java
package lab_16;

public class QueueNode {
    Order value;
    QueueNode prev;
    QueueNode next;

    public QueueNode(Order value) {
        this.value = value;
    }

    public QueueNode(Order value, QueueNode prev) {
        this.value = value;
        this.prev = prev;
    }
}
