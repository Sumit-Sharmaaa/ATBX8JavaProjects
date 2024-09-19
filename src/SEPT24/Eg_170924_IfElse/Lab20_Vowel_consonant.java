package SEPT24.Eg_170924_IfElse;

import java.util.Scanner;

public class Lab20_Vowel_consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character to check");
        char c = sc.nextLine().charAt(0);
        int no = c;

        if((no>= 65) && (no<=90) || (no>=97) && (no<=122) )
        {
            switch (c) {
                case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Entered character is Vowel");
                default -> System.out.println("Entered character is Consonant");
            }
        }
        else
            System.out.println("Please enter character b/w a-z or A-Z");
    }
}
