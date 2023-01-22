package pract_13;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestArrayLinkedListTime {
    public static void main(String[] args) {

        long startTime0 = System.currentTimeMillis();

        ArrayList<String> cities = new ArrayList<>();

        for (int i = 0; i < 100000;i++){
            cities.add("Moskau");
        }

        long timeAdd1 = System.currentTimeMillis() - startTime0;
        System.out.println("Add time ArrayList " + timeAdd1 + " ms");


        long startTime1 = System.currentTimeMillis();

        cities.indexOf("Moskau");

        long timeFind = System.currentTimeMillis() - startTime1;
        System.out.println("Find time ArrayList " + timeFind + " ms");

        long startTime2 = System.currentTimeMillis();

        for (int i = 0; i < 100000;i++) {
            cities.remove("Moskau");
        }

        long timeRemove = System.currentTimeMillis() - startTime2;
        System.out.println("Remove time ArrayList " + timeRemove + " ms");


        long startTime3 = System.currentTimeMillis();

        for (int i = 0; i < 100000;i++){
            cities.add(0,"Moskau");
        }

        long timeInsert = System.currentTimeMillis() - startTime3;
        System.out.println("Insert time ArrayList " + timeInsert + " ms");


        long estimatedTime = System.currentTimeMillis() - startTime0;
        System.out.println("Summary time ArrayList " + estimatedTime + " ms");




        //LinkedList



        long startTime01 = System.currentTimeMillis();

        LinkedList<String> cities1 = new LinkedList<String>();

        for (int i = 0; i < 100000;i++){
            cities1.add("Moskau");
        }

        long timeAdd11 = System.currentTimeMillis() - startTime01;
        System.out.println("Add time LinkedList " + timeAdd11 + " ms");


        long startTime11 = System.currentTimeMillis();

        cities1.indexOf("Moskau");

        long timeFind1 = System.currentTimeMillis() - startTime11;
        System.out.println("Find time LinkedList " + timeFind1 + " ms");

        long startTime21 = System.currentTimeMillis();

        for (int i = 0; i < 100000;i++) {
            cities1.remove("Moskau");
        }

        long timeRemove1 = System.currentTimeMillis() - startTime21;
        System.out.println("Remove time LinkedList " + timeRemove1 + " ms");


        long startTime31 = System.currentTimeMillis();

        for (int i = 0; i < 100000;i++){
            cities1.add(0,"Moskau");
        }

        long timeInsert1 = System.currentTimeMillis() - startTime31;
        System.out.println("Insert time LinkedList " + timeInsert1 + " ms");


        long estimatedTime1 = System.currentTimeMillis() - startTime01;
        System.out.println("Summary time LinkedList " + estimatedTime1 + " ms");


    }


}
