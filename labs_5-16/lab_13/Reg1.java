package lab_13;

import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1 {
    public static void main(String[] args) {
        String s1 = " food 5,76 RUB house 20004999.1 EU none 12.022 RUB phone 145.32 USD cat 140 EU klf 12.2 USA";
        //"([ ]\\d+)[.,]?(\\d){0,2}(\\W|^)(USD|EU|RUB)(\\W|$)"
        String regex = "(\\w+ \\d+)[.,]?(\\d){0,2} *(USD|EU|RUB)";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(s1);
        System.out.println("List of prices: ");
        while (m1.find()) {
            System.out.println(m1.group());
        }
    }
}