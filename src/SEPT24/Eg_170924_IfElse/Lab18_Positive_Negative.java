package SEPT24.Eg_170924_IfElse;

import java.util.Scanner;

public class Lab18_Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num = sc.nextInt();
        if (num>0){
            System.out.println("No is Positive");
        }else if (num<0){
            System.out.println("No is Negative");
        }
        else
            System.out.println("Entered no is Zero");

        sc.close();
    }
}
