package CORE_JAVA.JAVA10_StringsAndArrays;

import java.util.Scanner;

public class Lab57_PrintStringRemovingDuplicates {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str1= sc.nextLine();
        String str2 = "";

        for(int i=0;i<str1.length();i++)
        {
            char c = str1.charAt(i);
            if (str2.contains(Character.toString(c)))
            {
                continue;
            }
            else
            {
                str2=str2+str1.charAt(i);
            }

        }
        System.out.println(str2);
    }
}
