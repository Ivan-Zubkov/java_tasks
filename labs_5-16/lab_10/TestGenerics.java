//file TestGenerics.java
package lab_10;

import java.io.File;
import java.util.*;


public class TestGenerics<E> {

    public static <T> ArrayList<T> ConvertArrayToList(T[] a){
        ArrayList<T> temp = new ArrayList<T>();
        for(T t:a)
            temp.add(t);
        return temp;

    }

    public static void Filelist(String path){
        File f = new File(path);
        String[] fArray = null;
        if (f.exists()||f.isDirectory()){  //существует и является каталогом
            fArray = f.list();
        }
        else {
            System.out.print("Папка не найдена");
        }
        ArrayList<String> list = new ArrayList(Arrays.asList(fArray));

        for (int i =0; i<list.size();i++) {
            if(i<5) System.out.println(list.get(i));
        }
    }

    public static void main(String [] args){

        System.out.println("----------Task 2 and 3----------");

        MyGenericArrayList<String> listString = new MyGenericArrayList<String>();
        MyGenericArrayList<Integer> listInt = new MyGenericArrayList<Integer>();
        MyGenericArrayList<Long> listLong = new MyGenericArrayList<Long>();

        listString.add("name1");
        listString.add("name2");
        listString.add("name3");
        listString.add("name4");
        listString.add("name5");
        listString.add("name6");
        listString.add("name7");
        listString.add("name8");
        listString.add("name9");
        listString.add("name10");
        listString.add("name11");
        listString.add("name12");

        System.out.println(listString.get(1)); //name2

        listInt.add(1);
        listInt.add(2);
        listInt.add(3);

        System.out.println(listInt.get(1)); //2

        listLong.add(12345678912L);
        listLong.add(22345678912L);
        listLong.add(32345678912L);

        System.out.println(listLong.get(1)); //22345678912L

        System.out.println("----------Task 1----------");

        //Array to ArrayList
        String[] mas1 = new String[]{"a","b","c","d","e"};
        ArrayList<String> l3 = ConvertArrayToList(mas1);
        System.out.println(l3);

        Integer[] mas2 = new Integer[]{1,2,3,4,5};
        ArrayList<Integer> l4 = ConvertArrayToList(mas2);
        System.out.println(l4);

        //MyGenericArrayList to LinkedList
        LinkedList<String> l1 = new LinkedList<String>(listString.arrayToList());
        LinkedList<Integer> l2 = new LinkedList<Integer>(listInt.arrayToList());

        System.out.println(l1);
        System.out.println(l2);

        System.out.println("----------Task 4----------");
        Filelist("C:\\Users\\Иван");

    }
}
