package SEPT24.Eg_160924_SwitchCase;

import java.util.Scanner;

public class Lab14_SwitchCaseWay2 {
    public static void main(String[] args) {
        // Switch() bracket can only take byte,short,int,long,enums & Strings
        // Write a program to check vowel and Consonants.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char c = sc.next().charAt(0); // or sc.next().toCharArray()[0]
        c = Character.toLowerCase(c);

        switch (c){
            case 'a','e','i','o','u' : // allowed in jdk version greater than 13;
                System.out.println("vowels");
                break;
            default:
                System.out.println("Consonants");
                break;
        }
    }
}
