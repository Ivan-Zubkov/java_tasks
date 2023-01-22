//file WaitList.java
package pract_8;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class WaitList<E> implements IWaitList<E>{

    protected Deque<E> deque = new ConcurrentLinkedDeque<>();

    public void add(E e){
        deque.add(e);
    }
    public E remove(){
        return deque.remove();
    }
    public boolean contains(E e){
        return deque.contains(e);
    }
    public boolean containsAll(Collection<E> c){
        return deque.containsAll(c);
    }
    public boolean isEmpty(){
        return deque.isEmpty();
    }

    public WaitList(Collection<E> c) {
        deque.addAll(c);
    }

    public WaitList(){}

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (E e: deque){
            sb.append(" ").append(e);
        }
        return sb.toString();
    }
}
