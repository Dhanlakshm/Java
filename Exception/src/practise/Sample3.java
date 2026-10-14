package practise;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Sample3 {
    public static void main(String[] args) {

        try{
            FileReader f=new FileReader("abc.txt");
            System.out.println("found");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        }


    }
}
