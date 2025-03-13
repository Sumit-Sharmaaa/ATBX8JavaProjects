package CORE_JAVA.JAVA24_Exception_Handling;

import java.util.Scanner;

public class Lab93_try_catch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the divide by no");
        int n = sc.nextInt();
        System.out.println("Enter the String");
        String s1= sc.next();

        try{
           n=10/n;
            System.out.println(n); // iske neeche ka will not work in try block // to run use different try
           s1.trim();
            System.out.println(s1);
        }
        catch (ArithmeticException | NullPointerException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
