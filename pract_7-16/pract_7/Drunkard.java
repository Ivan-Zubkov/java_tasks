package pract_7;

import java.util.*;

public class Drunkard {
    public static void main(String[] args) {
        Queue<Integer> first = new LinkedList<>();
        Queue<Integer> second = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            first.add((int) (Math.random() * 10));
        }
        for (int i = 0; i < 5; i++) {
            second.add((int) (Math.random() * 10));
        }
        int card1;
        int card2;
        int count = 0;
        while ((first.size() != 0) && (second.size() != 0) && count < 106) {
            card1 = first.poll();
            card2 = second.poll();
            if (card1 > card2 || ((card1 == 0) && (card2 == 9))) {
                first.offer(card1);
                first.offer(card2);
            } else {
                second.offer(card2);
                second.offer(card1);
            }
            count++;
        }
        if (first.size() == 10) System.out.println("first " + count);
        else if (second.size() == 10) System.out.println("second " + count);
        else System.out.println("botva");
        /*
        for (int i = 0; i < 5;i++){
            System.out.println(first.poll());
        }
        for (int i = 0; i < 5;i++){
            System.out.println(second.poll());
        }
        */

    }
}
