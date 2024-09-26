package SEPT24.Eg_260924_Strings;

import java.util.Scanner;

public class Lab56_PalindromeUsingStringBuilder {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str=str.toLowerCase();

        StringBuilder sb= new StringBuilder(str);
        String rev = sb.reverse().toString();
        if(str.equals(rev))
        {
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
