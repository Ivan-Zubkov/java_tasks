package lab_14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[\\w]{8,}$";
        String s = "Fjhjgg_as";
        //Scanner scan = new Scanner(System.in);
        //String s = scan.nextLine();
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(s);
        boolean b = m1.matches();
        if (b){
            System.out.println("Password '" + s + "' is correct");
        }
        else {
            System.out.println("Password '" + s + "' is incorrect");
        }

    }
}