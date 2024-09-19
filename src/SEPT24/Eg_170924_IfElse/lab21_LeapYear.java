package SEPT24.Eg_170924_IfElse;

import java.time.Year;
import java.util.Scanner;

public class lab21_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();

        if ((year%4 == 0 && year%100!=0) || (year%400==0)) {
            System.out.println(year+" - Year is Leap Year");
        }
        else
            System.out.println("Not a leap Year");

    }
}
