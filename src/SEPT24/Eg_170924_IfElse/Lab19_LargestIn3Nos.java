package SEPT24.Eg_170924_IfElse;

import java.util.Scanner;

public class Lab19_LargestIn3Nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st No.");
        double no1 = sc.nextDouble();
        System.out.println("Enter the 2nd No.");
        double no2 = sc.nextDouble();
        System.out.println("Enter the 3rd No.");
        double no3 = sc.nextDouble();

        if ((no1>=no2) && no1>=no3)
        {
            System.out.println("The greatest No is "+no1);
        }

       else if ((no2>=no1)&&(no2>=no3))
        {
            System.out.printf("The greatest no is %d ",no2);
            System.out.println();
        }
        else
            System.out.println("The greatest no is "+no3);
    }
}
