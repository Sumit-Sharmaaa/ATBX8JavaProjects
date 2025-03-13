package CORE_JAVA.JAVA14_Encapsulation.BestExample;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab72_BestMain {
    public static void main(String[] args) {
        boolean IsAdmin= false;
        Scanner sc = new Scanner(System.in);

        BestVWOLogin bestVWOLogin = new BestVWOLogin("Sumit","Pass@123");
// For eg :- Admin have a particular code or key :- say 007


        System.out.println("Enter the Key");
        int key = sc.nextInt();
        if(key==007)
        {
            IsAdmin=true;
        }
        else
            IsAdmin=false;


        bestVWOLogin.setUsername("hacker",IsAdmin);
        bestVWOLogin.setPassword("newUsername",IsAdmin);

        System.out.print("UserName :-");
        System.out.println(bestVWOLogin.getUsername());
        System.out.println();
        System.out.print("Password :-");
        System.out.println(bestVWOLogin.getPassword());

    }
}
