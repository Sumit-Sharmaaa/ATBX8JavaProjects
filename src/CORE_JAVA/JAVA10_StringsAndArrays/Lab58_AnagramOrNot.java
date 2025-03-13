package CORE_JAVA.JAVA10_StringsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab58_AnagramOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String s1=sc.nextLine();
        System.out.println("Enter the Second String");
        String s2= sc.nextLine();

        char[] charArray1= s1.toCharArray();
        char[] charArray2= s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        System.out.println(charArray1);
        System.out.println(charArray2);

        if(Arrays.equals(charArray1,charArray2))
        {
            System.out.println("Strings are anagram");
        }
        else
        {
            System.out.println("Strings are not Anagram");
        }

    }
}
