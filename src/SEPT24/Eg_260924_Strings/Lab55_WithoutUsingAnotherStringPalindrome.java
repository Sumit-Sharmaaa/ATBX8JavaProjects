package SEPT24.Eg_260924_Strings;

import java.util.Scanner;

public class Lab55_WithoutUsingAnotherStringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int flag=0;
        for(int i=0;i<str.length()/2;i++)
        {
            for(int j=str.length()-1-i;j>str.length()/2;j--)
            {
                if(str.charAt(i)!=str.charAt(j))
                {
                    flag++;
                    break;
                }
                else
                    break;
            }
            if(flag!=0)
                break;
        }
        if(flag==0)
        {
            System.out.println("String is Palindrome");
        }
        else
            System.out.println("Not Palindrome");
    }
}
