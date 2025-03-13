package CORE_JAVA.JAVA24_Exception_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab97_MultiCatch_Good {
    public static void main(String[] args) {
        try
        {
            String s1="Sumit";
            String a1=args[0]; // First exception -- > program will terminate here
            int a= 10/0; // if argument is given above --> then program will terminate here due to exception
            s1=null;
            System.out.println(s1.trim()); // third exception
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e){
            System.out.println("There is some problem with the code-Unchecked Exception");
            System.out.println(e.getMessage());
        }

        try {
            FileReader f = new FileReader(new File("C://abc.txt")); // select this complete Line-->Surround-->try/catch/finally
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Checked Exception");
        }


        System.out.println("End of Program");
    }
}
