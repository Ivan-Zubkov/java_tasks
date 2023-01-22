package lab_12;

import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {
    public static void main(String[] args) {
        String s1 = "name 12.32 USD qwer 2.1 EU wkf 12.022 RUB wek 1,23 RUB lef 234 EU klf 12.2 USA";
        String regex = "(\\w+ \\d+)[.,]?(\\d){0,2} *(USD|EU|RUB)";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(s1);
        System.out.println("List of prices: ");
        while (m1.find()) {
            System.out.println(m1.group());
        }
    }
}