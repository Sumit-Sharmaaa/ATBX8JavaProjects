package SEPT24.Eg_260924_Strings;

import java.util.Scanner;

public class Lab53_StringContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        str=str.toLowerCase();
        int flag=0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    flag++;
                    System.out.println("Duplicate character - "+str.charAt(i));
                    break;
                }
            }
        }
        if(flag==0)
        {
            System.out.println("No duplicate Characters Found");
        }
    }
}
