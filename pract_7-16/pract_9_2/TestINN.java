//file TestINN.java
package pract_9_2;

import java.util.Arrays;

public class TestINN {

    public static boolean contains(int mas[], int n){
        for (int i = 0; i < mas.length; i++){
            if (mas[i] == n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] trueInn = new int[]{123456,234567,345678,456789};

        int inn1 = 123456;
        int inn2 = 129456;

        try {
            if (!contains(trueInn, inn2)) {
                throw new InnException("INN '" + inn2 + "' is false");
            }
        } catch (InnException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("INN is true");

    }
}
