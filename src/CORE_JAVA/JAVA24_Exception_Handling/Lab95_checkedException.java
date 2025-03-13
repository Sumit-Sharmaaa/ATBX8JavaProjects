package CORE_JAVA.JAVA24_Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab95_checkedException {
    public static void main(String[] args) throws FileNotFoundException {

        int a=10;
        //int c = a/0; // Unchecked Exception -->JVM not knows during compile time but will give error during RunTime

        FileInputStream file = new FileInputStream("C://abc.txt");  // Checked Exception
        // In above File JVM knows that file may not exist that's y asking for handling --> Checked Exception
        // Hover over it and click on Add exception to method signature --> throws will be added automatically



    }
}
