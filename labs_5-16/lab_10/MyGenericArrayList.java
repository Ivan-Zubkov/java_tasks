//file MyGenericArrayList.java
package lab_10;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MyGenericArrayList<E> {
    private int size;
    private Object[] elements;

    public MyGenericArrayList() {
        elements = new Object[10];
        size = 0;
    }

    public void add(E e) {
        if (size < elements.length) {
            elements[size] = e;
            ++size;
            Object[] copiedArray = new Object[size*2];

            System.arraycopy(elements, 0, copiedArray, 0, size);
            elements = copiedArray;
        }
    }

    public E get(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return (E)elements[index];
    }

    public int size() {
        return size;
    }

    public LinkedList<E> arrayToList(){

        LinkedList<E> l = new LinkedList<E>();

        for (int i = 0; i < size; i++){
            l.add(get(i));
        }

        return l;
    }

    //second implementation
    /*
    public LinkedList<E> arrayToList(MyGenericArrayList<E> mas){
        //MyGenericArrayList<E> list = new MyGenericArrayList<E>();

        LinkedList<E> l = new LinkedList<E>();

        for (int i = 0; i < size; i++){
            l.add(get(i));
        }

        return l;
    }
     */

    //first implementation
    /*
    String [] str = {"1","2","3","4","5"};

        List<String> list = new LinkedList<String>();

        for(int i=0;i< str.length; i++){
            list.add(str[i]);
            System.out.print(list.get(i));
        }
     */

    public void  print(MyGenericArrayList<E> list){
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + "; ");
        }
    }
}