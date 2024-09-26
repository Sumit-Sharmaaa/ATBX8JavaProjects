package SEPT24.Eg_Loops_190924;

import java.util.Scanner;

public class Lab43_SimpleInterest {
    // Note - for float and double both %f is used , for int %d is used.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle.");
        double p = sc.nextDouble();
        System.out.println("Enter the Rate.");
        double r = sc.nextDouble();
        System.out.println("Enter the Time.");
        double t = sc.nextDouble();
        double SI = (p*r*t)/100;
        System.out.printf("The Simple interest of Principal %f , Rate %f , Time %f is %f",p,r,t,SI);
    }
}
