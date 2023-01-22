package pract_5;
import java.util.*;

public class Recursion {
    static String reverse(String s){
        if (s.length() > 1){
            return s.substring(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
        }
        else return s;
    }

    static int oneInNumber(String number){
        if (Objects.equals(number, "")) return 0;
        if (Objects.equals(number.substring(number.length()-1), "1")){
            return (oneInNumber(number.substring(0, number.length() - 1)) + 1);
        }
        else return oneInNumber(number.substring(0, number.length() - 1));
    }

    static int countOne(){
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        if (Objects.equals(number,"00")) return 0;

        return (oneInNumber(number) > 0) ? countOne() + oneInNumber(number): countOne();
    }

        public static void odd1() {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            if (n > 0) {
                if (n % 2 == 1) {
                    System.out.println(n);
                    odd1();
                } else {
                    odd1();
                }
            }
        }


    public static void main(String[] args) {

        System.out.println("Task 10");
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        System.out.println(reverse(number));



        System.out.println("Task 11");
        System.out.println(countOne());


        System.out.println("Task 12");
        odd1();

    }
}
