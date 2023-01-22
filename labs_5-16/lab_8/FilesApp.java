package lab_8;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FilesApp {
    public static void main(String[] args) throws Exception{

        /*
        try(FileReader reader = new FileReader("C:\\testfile.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
         */

        FileReader fr= new FileReader("C:\\testfile.txt");
        Scanner scan = new Scanner(fr);

        int i = 1;

        while (scan.hasNextLine()) {
            System.out.println(i + " : " + scan.nextLine());
            i++;
        }

        fr.close();
    }
}

