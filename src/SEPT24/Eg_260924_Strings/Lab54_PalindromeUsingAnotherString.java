package SEPT24.Eg_260924_Strings;

import java.util.Scanner;

public class Lab54_PalindromeUsingAnotherString {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        str1=str1.toLowerCase();
        String str2= "";

        for(int i=str1.length()-1;i>=0;i--)
        {
            str2=str2+str1.charAt(i);
        }
        if(str1.equals(str2))
            System.out.println("String is Palindrome-"+str2);
        else
            System.out.println("String is not Palindrome-"+str2);
    }
}
