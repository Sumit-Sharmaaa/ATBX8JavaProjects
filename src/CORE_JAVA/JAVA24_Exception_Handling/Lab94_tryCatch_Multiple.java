package CORE_JAVA.JAVA24_Exception_Handling;

import java.util.Scanner;

public class Lab94_tryCatch_Multiple {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the divide by no");  // input by Scanner
        int n = sc.nextInt();

        try {
            n = 10 / n;
            System.out.println(n);
        }
        catch (ArithmeticException | NullPointerException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        try{
            String s1 = args[0];
            s1.trim();
            System.out.println(s1);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        catch (Exception e){ // catch to catch all
            System.out.println(e);
        }
    }
}
