package lab_9;

import java.util.Scanner;

public class Exception1 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();

        //int i = Integer.parseInt(intString);
        //System.out.println( 2 / i );

        try{
            int i = Integer.parseInt(intString);
            System.out.println( 2 / i );
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch (NumberFormatException e){
            System.out.println("NumberFormatException Exception");
        }
        catch(Throwable e){ // ignore

        }


    }
    public static void main(String[] args){
        Exception1 e = new Exception1();
        e.exceptionDemo();
    }
}
